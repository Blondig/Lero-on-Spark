/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql.catalyst.plans.logical.statsEstimation

import org.apache.spark.sql.catalyst.expressions.AttributeMap
import org.apache.spark.sql.catalyst.plans.logical._
import org.apache.spark.sql.internal.SQLConf.ITEM_SIZE_CURRENT
import org.apache.spark.sql.internal.SQLConf.JOIN_PLAN_SEQ

/**
 * A trait to add statistics propagation to [[LogicalPlan]].
 */
trait LogicalPlanStats { self: LogicalPlan =>

  /**
   * Returns the estimated statistics for the current logical plan node. Under the hood, this
   * method caches the return value, which is computed based on the configuration passed in the
   * first time. If the configuration changes, the cache can be invalidated by calling
   * [[invalidateStatsCache()]].
   */
  def stats: Statistics = statsCache.getOrElse {
    def countItemSize(p: LogicalPlan): Int = p match {
      case p: LeafNode => 1
      case _: LogicalPlan =>
        val countItemSizeSeq = p.children.map(x => countItemSize(x))
        countItemSizeSeq.sum
    }
    def reviseStatsCache(p: LogicalPlan, statsCache: Option[Statistics], currentItemSize: Int):
       Option[Statistics] =
      p match {
      case p: Join =>
        if (conf.varyCardLevel == currentItemSize && !statsCache.isEmpty) {
          val rowCount = if (statsCache.get.rowCount.isEmpty) {
            None
          } else {
            val tmpRowCount: Double = statsCache.get.rowCount.get.toDouble * conf.varyCardSwing
            Some(BigDecimal(tmpRowCount).setScale(0, BigDecimal.RoundingMode.HALF_UP).
            toBigInt.max(1))
          }
          val tmpSizeInBytes: Double = statsCache.get.sizeInBytes.toDouble * conf.varyCardSwing
          val sizeInBytes = BigDecimal(tmpSizeInBytes).setScale(0, BigDecimal.
            RoundingMode.HALF_UP)
          .toBigInt.max(1)
          var myAttributeStats = statsCache.get.attributeStats.map{
            case (localAttribute, localStats) =>
              val revisedColumnStats = ColumnStat(distinctCount = localStats.distinctCount,
                min = localStats.min,
                max = localStats.max,
                nullCount = localStats.nullCount,
                avgLen = localStats.avgLen,
                maxLen = localStats.maxLen,
                histogram = if (localStats.histogram.isEmpty) {
                  None
                }
                else {
                  Some(Histogram(height = localStats.histogram.get.height *
                 conf.varyCardSwing, bins = localStats.histogram.get.bins))
                },
                version = localStats.version)
                (localAttribute, revisedColumnStats)
          }
          // println(s"revisedAttributeStats ${myAttributeStats}")
          if (conf.varyCardSingleEnabled) {
            Some(Statistics(sizeInBytes = sizeInBytes, rowCount = rowCount, attributeStats
              = statsCache.get.attributeStats, isRuntime = statsCache.get.isRuntime))
          }
          else {
            Some(Statistics(sizeInBytes = sizeInBytes, rowCount = rowCount, attributeStats
              = AttributeMap(myAttributeStats), isRuntime = statsCache.get.isRuntime))
          }
        }
        else {statsCache}
      case _: LogicalPlan => statsCache
    }
    def reviseNodeStatsCache(p: LogicalPlan, statsCache: Option[Statistics]): Option[Statistics] =
      p match {
      case p: Join =>
        if (!statsCache.isEmpty) {
          val rowCount = if (statsCache.get.rowCount.isEmpty) {
            None
          } else {
            val tmpRowCount: Double = statsCache.get.rowCount.get.toDouble * conf.varyCardSwing
            Some(BigDecimal(tmpRowCount).setScale(0, BigDecimal.RoundingMode.HALF_UP).
            toBigInt.max(1))
          }
          val tmpSizeInBytes: Double = statsCache.get.sizeInBytes.toDouble * conf.varyCardSwing
          val sizeInBytes = BigDecimal(tmpSizeInBytes).setScale(0, BigDecimal.
            RoundingMode.HALF_UP)
          .toBigInt.max(1)
          Some(Statistics(sizeInBytes = sizeInBytes, rowCount = rowCount, attributeStats
            = statsCache.get.attributeStats, isRuntime = statsCache.get.isRuntime))
        }
        else {statsCache}
      case _: LogicalPlan => statsCache
    }
    this match {
      case p: Join =>
        if (conf.joinPlanSeqEnabled) {
          val originPlanString = self.treeString.trim()
          val trimPlanString =
            ",".r.replaceAllIn("#[0-9]+".r.replaceAllIn(originPlanString, ""), "_")
          val currentJoinPlanSet: Set[String] = conf.joinPlanSeq.toSet
          val currentItemSize = countItemSize(p)
          if (currentJoinPlanSet.contains(trimPlanString) == false &&
            currentItemSize >= conf.tableNumLow && currentItemSize <= conf.tableNumUp) {
            conf.setConf(JOIN_PLAN_SEQ, (currentJoinPlanSet + trimPlanString).toSeq)
            // println(s"originPlan ${originPlanString}")
            // println(s"trimPlan ${trimPlanString}")
            // println(s"oldSeq ${currentJoinPlanSet}")
            // for ((joinPlan, level) <- conf.joinPlanSeq.view.zipWithIndex) {
            //   println(s"Plan ${level}")
            //   println(s"${joinPlan}")
          }
        }
      case _: LogicalPlan =>
    }
    if (conf.cboEnabled) {
      statsCache = Option(BasicStatsPlanVisitor.visit(self))
      // logWarning{s"cboEnabled statsCache"}
      val currentItemSize = countItemSize(this)
      if (conf.itemSizeCurrentEnabled && conf.itemSizeCurrent < currentItemSize) {
        // logWarning(s"max item size ${conf.itemSizeCurrent} currentItemSize ${currentItemSize}" +
          // s" currentPlan is ${this}")
        conf.setConf(ITEM_SIZE_CURRENT, currentItemSize)
      }
      if (conf.varyCardNodeEnabled) {
        this match {
          case p: Join =>
            val trimPlanString =
              ",".r.replaceAllIn("#[0-9]+".r.replaceAllIn(self.treeString.trim(), ""), "_")
            if (trimPlanString == conf.varyNodeString) {
              // println(s"satisfy conditions")
              statsCache = reviseNodeStatsCache(p = this, statsCache = statsCache)
            }
          case _: LogicalPlan =>
        }
      }
      if (conf.varyCardEnabled) {
        statsCache = reviseStatsCache(p = this, statsCache = statsCache, currentItemSize
         = currentItemSize)
      }
    } else {
      logWarning{s"noCbo statsCache"}
      statsCache = Option(SizeInBytesOnlyStatsPlanVisitor.visit(self))
    }
    statsCache.get
  }

  /** A cache for the estimated statistics, such that it will only be computed once. */
  protected var statsCache: Option[Statistics] = None

  /** Invalidates the stats cache. See [[stats]] for more information. */
  final def invalidateStatsCache(): Unit = {
    statsCache = None
    children.foreach(_.invalidateStatsCache())
  }
}
