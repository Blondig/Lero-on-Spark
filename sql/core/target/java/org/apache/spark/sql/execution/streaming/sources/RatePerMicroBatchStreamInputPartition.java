package org.apache.spark.sql.execution.streaming.sources;
public  class RatePerMicroBatchStreamInputPartition implements org.apache.spark.sql.connector.read.InputPartition, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  long startOffset ()  { throw new RuntimeException(); }
  public  long startTimestamp ()  { throw new RuntimeException(); }
  public  long endOffset ()  { throw new RuntimeException(); }
  public  long endTimestamp ()  { throw new RuntimeException(); }
  // not preceding
  public   RatePerMicroBatchStreamInputPartition (int partitionId, int numPartitions, long startOffset, long startTimestamp, long endOffset, long endTimestamp)  { throw new RuntimeException(); }
}
