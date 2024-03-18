package org.apache.spark.sql.execution;
/**
 * Apply any user defined {@link ColumnarRule}s and find the correct place to insert transitions
 * to/from columnar formatted data.
 * <p>
 * param:  columnarRules custom columnar rules
 * param:  outputsColumnar whether or not the produced plan should output columnar format.
 */
public  class ApplyColumnarRulesAndInsertTransitions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.ColumnarRule> columnarRules ()  { throw new RuntimeException(); }
  public  boolean outputsColumnar ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplyColumnarRulesAndInsertTransitions (scala.collection.Seq<org.apache.spark.sql.execution.ColumnarRule> columnarRules, boolean outputsColumnar)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
