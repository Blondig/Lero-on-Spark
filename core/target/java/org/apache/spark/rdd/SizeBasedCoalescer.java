package org.apache.spark.rdd;
/**
 * Coalesces partitions based on their size assuming that the parent RDD is a {@link HadoopRDD}.
 * Took this class out of the test suite to prevent "Task not serializable" exceptions.
 */
public  class SizeBasedCoalescer implements org.apache.spark.rdd.PartitionCoalescer, scala.Serializable {
  // not preceding
  public   SizeBasedCoalescer (int maxSize)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.PartitionGroup[] coalesce (int maxPartitions, org.apache.spark.rdd.RDD<?> parent)  { throw new RuntimeException(); }
  public  int maxSize ()  { throw new RuntimeException(); }
}
