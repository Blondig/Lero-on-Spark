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

package org.apache.spark.sql.errors

import org.apache.spark.sql.QueryTest
import org.apache.spark.sql.catalyst.parser.ParseException
import org.apache.spark.sql.test.SharedSparkSession

// Turn of the length check because most of the tests check entire error messages
// scalastyle:off line.size.limit
class QueryParsingErrorsSuite extends QueryTest with SharedSparkSession {
  def validateParsingError(
      sqlText: String,
      errorClass: String,
      sqlState: String,
      message: String): Unit = {
    val e = intercept[ParseException] {
      sql(sqlText)
    }
    assert(e.getErrorClass === errorClass)
    assert(e.getSqlState === sqlState)
    assert(e.getMessage === message)
  }

  test("UNSUPPORTED_FEATURE: LATERAL join with NATURAL join not supported") {
    validateParsingError(
      sqlText = "SELECT * FROM t1 NATURAL JOIN LATERAL (SELECT c1 + c2 AS c2)",
      errorClass = "UNSUPPORTED_FEATURE",
      sqlState = "0A000",
      message =
        """
          |The feature is not supported: LATERAL join with NATURAL join.(line 1, pos 14)
          |
          |== SQL ==
          |SELECT * FROM t1 NATURAL JOIN LATERAL (SELECT c1 + c2 AS c2)
          |--------------^^^
          |""".stripMargin)
  }

  test("UNSUPPORTED_FEATURE: LATERAL join with USING join not supported") {
    validateParsingError(
      sqlText = "SELECT * FROM t1 JOIN LATERAL (SELECT c1 + c2 AS c2) USING (c2)",
      errorClass = "UNSUPPORTED_FEATURE",
      sqlState = "0A000",
      message =
        """
          |The feature is not supported: LATERAL join with USING join.(line 1, pos 14)
          |
          |== SQL ==
          |SELECT * FROM t1 JOIN LATERAL (SELECT c1 + c2 AS c2) USING (c2)
          |--------------^^^
          |""".stripMargin)
  }

  test("UNSUPPORTED_FEATURE: Unsupported LATERAL join type") {
    Seq("RIGHT OUTER", "FULL OUTER", "LEFT SEMI", "LEFT ANTI").foreach { joinType =>
      validateParsingError(
        sqlText = s"SELECT * FROM t1 $joinType JOIN LATERAL (SELECT c1 + c2 AS c3) ON c2 = c3",
        errorClass = "UNSUPPORTED_FEATURE",
        sqlState = "0A000",
        message =
          s"""
            |The feature is not supported: LATERAL join type $joinType.(line 1, pos 14)
            |
            |== SQL ==
            |SELECT * FROM t1 $joinType JOIN LATERAL (SELECT c1 + c2 AS c3) ON c2 = c3
            |--------------^^^
            |""".stripMargin)
    }
  }

  test("INVALID_SQL_SYNTAX: LATERAL can only be used with subquery") {
    Seq(
      "SELECT * FROM t1, LATERAL t2" -> 26,
      "SELECT * FROM t1 JOIN LATERAL t2" -> 30,
      "SELECT * FROM t1, LATERAL (t2 JOIN t3)" -> 26,
      "SELECT * FROM t1, LATERAL (LATERAL t2)" -> 26,
      "SELECT * FROM t1, LATERAL VALUES (0, 1)" -> 26,
      "SELECT * FROM t1, LATERAL RANGE(0, 1)" -> 26
    ).foreach { case (sqlText, pos) =>
      validateParsingError(
        sqlText = sqlText,
        errorClass = "INVALID_SQL_SYNTAX",
        sqlState = "42000",
        message =
          s"""
            |Invalid SQL syntax: LATERAL can only be used with subquery.(line 1, pos $pos)
            |
            |== SQL ==
            |$sqlText
            |${"-" * pos}^^^
            |""".stripMargin)
    }
  }

  test("UNSUPPORTED_FEATURE: NATURAL CROSS JOIN is not supported") {
    validateParsingError(
      sqlText = "SELECT * FROM a NATURAL CROSS JOIN b",
      errorClass = "UNSUPPORTED_FEATURE",
      sqlState = "0A000",
      message =
        """
          |The feature is not supported: NATURAL CROSS JOIN.(line 1, pos 14)
          |
          |== SQL ==
          |SELECT * FROM a NATURAL CROSS JOIN b
          |--------------^^^
          |""".stripMargin)
  }

  test("INVALID_SQL_SYNTAX: redefine window") {
    validateParsingError(
      sqlText = "SELECT min(a) OVER win FROM t1 WINDOW win AS win, win AS win2",
      errorClass = "INVALID_SQL_SYNTAX",
      sqlState = "42000",
      message =
        """
          |Invalid SQL syntax: The definition of window `win` is repetitive.(line 1, pos 31)
          |
          |== SQL ==
          |SELECT min(a) OVER win FROM t1 WINDOW win AS win, win AS win2
          |-------------------------------^^^
          |""".stripMargin)
  }

  test("INVALID_SQL_SYNTAX: invalid window reference") {
    validateParsingError(
      sqlText = "SELECT min(a) OVER win FROM t1 WINDOW win AS win",
      errorClass = "INVALID_SQL_SYNTAX",
      sqlState = "42000",
      message =
        """
          |Invalid SQL syntax: Window reference `win` is not a window specification.(line 1, pos 31)
          |
          |== SQL ==
          |SELECT min(a) OVER win FROM t1 WINDOW win AS win
          |-------------------------------^^^
          |""".stripMargin)
  }

  test("INVALID_SQL_SYNTAX: window reference cannot be resolved") {
    validateParsingError(
      sqlText = "SELECT min(a) OVER win FROM t1 WINDOW win AS win2",
      errorClass = "INVALID_SQL_SYNTAX",
      sqlState = "42000",
      message =
        """
          |Invalid SQL syntax: Cannot resolve window reference `win2`.(line 1, pos 31)
          |
          |== SQL ==
          |SELECT min(a) OVER win FROM t1 WINDOW win AS win2
          |-------------------------------^^^
          |""".stripMargin)
  }

  test("UNSUPPORTED_FEATURE: TRANSFORM does not support DISTINCT/ALL") {
    validateParsingError(
      sqlText = "SELECT TRANSFORM(DISTINCT a) USING 'a' FROM t",
      errorClass = "UNSUPPORTED_FEATURE",
      sqlState = "0A000",
      message =
        """
          |The feature is not supported: TRANSFORM does not support DISTINCT/ALL in inputs(line 1, pos 17)
          |
          |== SQL ==
          |SELECT TRANSFORM(DISTINCT a) USING 'a' FROM t
          |-----------------^^^
          |""".stripMargin)
  }

  test("UNSUPPORTED_FEATURE: In-memory mode does not support TRANSFORM with serde") {
    validateParsingError(
      sqlText = "SELECT TRANSFORM(a) ROW FORMAT SERDE " +
        "'org.apache.hadoop.hive.serde2.OpenCSVSerde' USING 'a' FROM t",
      errorClass = "UNSUPPORTED_FEATURE",
      sqlState = "0A000",
      message =
        """
          |The feature is not supported: TRANSFORM with serde is only supported in hive mode(line 1, pos 0)
          |
          |== SQL ==
          |SELECT TRANSFORM(a) ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' USING 'a' FROM t
          |^^^
          |""".stripMargin)
  }

  test("INVALID_SQL_SYNTAX: Too many arguments for transform") {
    validateParsingError(
      sqlText = "CREATE TABLE table(col int) PARTITIONED BY (years(col,col))",
      errorClass = "INVALID_SQL_SYNTAX",
      sqlState = "42000",
      message =
        """
          |Invalid SQL syntax: Too many arguments for transform `years`(line 1, pos 44)
          |
          |== SQL ==
          |CREATE TABLE table(col int) PARTITIONED BY (years(col,col))
          |--------------------------------------------^^^
          |""".stripMargin)
  }
}
