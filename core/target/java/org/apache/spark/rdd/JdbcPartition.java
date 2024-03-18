package org.apache.spark.rdd;
  class JdbcPartition implements org.apache.spark.Partition {
  // not preceding
  public   JdbcPartition (int idx, long lower, long upper)  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  long lower ()  { throw new RuntimeException(); }
  public  long upper ()  { throw new RuntimeException(); }
}
