package org.apache.spark.sql.execution;
public  class CoalescedPartitionSpec implements org.apache.spark.sql.execution.ShufflePartitionSpec, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.CoalescedPartitionSpec apply (int startReducerIndex, int endReducerIndex, long dataSize)  { throw new RuntimeException(); }
  public  int startReducerIndex ()  { throw new RuntimeException(); }
  public  int endReducerIndex ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> dataSize ()  { throw new RuntimeException(); }
  // not preceding
  public   CoalescedPartitionSpec (int startReducerIndex, int endReducerIndex, scala.Option<java.lang.Object> dataSize)  { throw new RuntimeException(); }
}
