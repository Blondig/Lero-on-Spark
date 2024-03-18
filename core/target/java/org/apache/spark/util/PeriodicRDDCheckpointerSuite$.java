package org.apache.spark.util;
public  class PeriodicRDDCheckpointerSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PeriodicRDDCheckpointerSuite$ MODULE$ = null;
  public   PeriodicRDDCheckpointerSuite$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object> createRDD (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  void checkPersistence (scala.collection.Seq<org.apache.spark.util.PeriodicRDDCheckpointerSuite.RDDToCheck> rdds, int iteration)  { throw new RuntimeException(); }
  /**
   * Check storage level of rdd.
   * @param gIndex  Index of rdd in order inserted into checkpointer (from 1).
   * @param iteration  Total number of rdds inserted into checkpointer.
   * @param rdd (undocumented)
   */
  public  void checkPersistence (org.apache.spark.rdd.RDD<?> rdd, int gIndex, int iteration)  { throw new RuntimeException(); }
  public  void checkCheckpoint (scala.collection.Seq<org.apache.spark.util.PeriodicRDDCheckpointerSuite.RDDToCheck> rdds, int iteration, int checkpointInterval)  { throw new RuntimeException(); }
  public  void confirmCheckpointRemoved (org.apache.spark.rdd.RDD<?> rdd)  { throw new RuntimeException(); }
  /**
   * Check checkpointed status of rdd.
   * @param gIndex  Index of rdd in order inserted into checkpointer (from 1).
   * @param iteration  Total number of rdds inserted into checkpointer.
   * @param rdd (undocumented)
   * @param checkpointInterval (undocumented)
   */
  public  void checkCheckpoint (org.apache.spark.rdd.RDD<?> rdd, int gIndex, int iteration, int checkpointInterval)  { throw new RuntimeException(); }
}
