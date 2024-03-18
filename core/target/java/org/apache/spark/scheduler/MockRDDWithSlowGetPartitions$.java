package org.apache.spark.scheduler;
/** Helper class used in SPARK-23626 test case */
public  class MockRDDWithSlowGetPartitions$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MockRDDWithSlowGetPartitions$ MODULE$ = null;
  public   MockRDDWithSlowGetPartitions$ ()  { throw new RuntimeException(); }
  public  java.util.concurrent.CountDownLatch beginGetPartitionsLatch ()  { throw new RuntimeException(); }
  public  java.util.concurrent.CountDownLatch endGetPartitionsLatch ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicBoolean getPartitionsShouldNotHaveBeenCalledYet ()  { throw new RuntimeException(); }
}
