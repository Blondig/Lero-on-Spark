package org.apache.spark.sql.execution;
public  interface LeafExecNode extends org.apache.spark.sql.catalyst.trees.LeafLike<org.apache.spark.sql.execution.SparkPlan> {
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  ;
  public  java.lang.String verboseStringWithOperatorId ()  ;
}
