package org.apache.spark.sql.execution.streaming;
/** Custom stateful operator metric for simple "count" gauge */
public  class StatefulOperatorCustomSumMetric implements org.apache.spark.sql.execution.streaming.StatefulOperatorCustomMetric, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String desc ()  { throw new RuntimeException(); }
  // not preceding
  public   StatefulOperatorCustomSumMetric (java.lang.String name, java.lang.String desc)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.metric.SQLMetric createSQLMetric (org.apache.spark.SparkContext sparkContext)  { throw new RuntimeException(); }
}
