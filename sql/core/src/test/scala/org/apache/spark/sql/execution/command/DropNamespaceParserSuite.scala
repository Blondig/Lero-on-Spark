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

package org.apache.spark.sql.execution.command

import org.apache.spark.sql.catalyst.analysis.{AnalysisTest, UnresolvedNamespace}
import org.apache.spark.sql.catalyst.parser.CatalystSqlParser.parsePlan
import org.apache.spark.sql.catalyst.plans.logical.DropNamespace

class DropNamespaceParserSuite extends AnalysisTest {
  test("drop namespace") {
    comparePlans(
      parsePlan("DROP NAMESPACE a.b.c"),
      DropNamespace(
        UnresolvedNamespace(Seq("a", "b", "c")), ifExists = false, cascade = false))

    comparePlans(
      parsePlan("DROP NAMESPACE IF EXISTS a.b.c"),
      DropNamespace(
        UnresolvedNamespace(Seq("a", "b", "c")), ifExists = true, cascade = false))

    comparePlans(
      parsePlan("DROP NAMESPACE IF EXISTS a.b.c RESTRICT"),
      DropNamespace(
        UnresolvedNamespace(Seq("a", "b", "c")), ifExists = true, cascade = false))

    comparePlans(
      parsePlan("DROP NAMESPACE IF EXISTS a.b.c CASCADE"),
      DropNamespace(
        UnresolvedNamespace(Seq("a", "b", "c")), ifExists = true, cascade = true))

    comparePlans(
      parsePlan("DROP NAMESPACE a.b.c CASCADE"),
      DropNamespace(
        UnresolvedNamespace(Seq("a", "b", "c")), ifExists = false, cascade = true))
  }
}
