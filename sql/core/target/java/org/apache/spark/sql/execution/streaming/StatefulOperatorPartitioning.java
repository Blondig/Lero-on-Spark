package org.apache.spark.sql.execution.streaming;
/**
 * This object is to provide clustered distribution for stateful operator with ensuring backward
 * compatibility. Please read through the NOTE on the classdoc of
 * {@link StatefulOpClusteredDistribution} before making any changes. Please refer SPARK-38204
 * for details.
 * <p>
 * Do not use methods in this object for stateful operators which already uses
 * {@link StatefulOpClusteredDistribution} as its required child distribution.
 */
public  class StatefulOperatorPartitioning {
  static public  org.apache.spark.sql.catalyst.plans.physical.Distribution getCompatibleDistribution (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo stateInfo, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.physical.Distribution getCompatibleDistribution (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, int numPartitions, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
}
