package org.apache.spark.scheduler;
/** Helper class used in SPARK-23626 test case */
public  class MockRDDWithSlowGetPartitions extends org.apache.spark.scheduler.MockRDD {
  static public  java.util.concurrent.CountDownLatch beginGetPartitionsLatch ()  { throw new RuntimeException(); }
  static public  java.util.concurrent.CountDownLatch endGetPartitionsLatch ()  { throw new RuntimeException(); }
  static public  java.util.concurrent.atomic.AtomicBoolean getPartitionsShouldNotHaveBeenCalledYet ()  { throw new RuntimeException(); }
  public   MockRDDWithSlowGetPartitions (org.apache.spark.SparkContext sc, int numPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
