package org.apache.spark.sql.execution;
public  class CoalescedMapperPartitionSpec implements org.apache.spark.sql.execution.ShufflePartitionSpec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int startMapIndex ()  { throw new RuntimeException(); }
  public  int endMapIndex ()  { throw new RuntimeException(); }
  public  int numReducers ()  { throw new RuntimeException(); }
  // not preceding
  public   CoalescedMapperPartitionSpec (int startMapIndex, int endMapIndex, int numReducers)  { throw new RuntimeException(); }
}
