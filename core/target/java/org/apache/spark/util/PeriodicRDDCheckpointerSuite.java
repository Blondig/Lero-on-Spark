package org.apache.spark.util;
public  class PeriodicRDDCheckpointerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.SharedSparkContext {
  static public  class RDDToCheck implements scala.Product, scala.Serializable {
    public  org.apache.spark.rdd.RDD<java.lang.Object> rdd ()  { throw new RuntimeException(); }
    public  int gIndex ()  { throw new RuntimeException(); }
    // not preceding
    public   RDDToCheck (org.apache.spark.rdd.RDD<java.lang.Object> rdd, int gIndex)  { throw new RuntimeException(); }
  }
  static public  class RDDToCheck$ extends scala.runtime.AbstractFunction2<org.apache.spark.rdd.RDD<java.lang.Object>, java.lang.Object, org.apache.spark.util.PeriodicRDDCheckpointerSuite.RDDToCheck> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RDDToCheck$ MODULE$ = null;
    public   RDDToCheck$ ()  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.rdd.RDD<java.lang.Object> createRDD (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  static public  void checkPersistence (scala.collection.Seq<org.apache.spark.util.PeriodicRDDCheckpointerSuite.RDDToCheck> rdds, int iteration)  { throw new RuntimeException(); }
  /**
   * Check storage level of rdd.
   * @param gIndex  Index of rdd in order inserted into checkpointer (from 1).
   * @param iteration  Total number of rdds inserted into checkpointer.
   * @param rdd (undocumented)
   */
  static public  void checkPersistence (org.apache.spark.rdd.RDD<?> rdd, int gIndex, int iteration)  { throw new RuntimeException(); }
  static public  void checkCheckpoint (scala.collection.Seq<org.apache.spark.util.PeriodicRDDCheckpointerSuite.RDDToCheck> rdds, int iteration, int checkpointInterval)  { throw new RuntimeException(); }
  static public  void confirmCheckpointRemoved (org.apache.spark.rdd.RDD<?> rdd)  { throw new RuntimeException(); }
  /**
   * Check checkpointed status of rdd.
   * @param gIndex  Index of rdd in order inserted into checkpointer (from 1).
   * @param iteration  Total number of rdds inserted into checkpointer.
   * @param rdd (undocumented)
   * @param checkpointInterval (undocumented)
   */
  static public  void checkCheckpoint (org.apache.spark.rdd.RDD<?> rdd, int gIndex, int iteration, int checkpointInterval)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public   PeriodicRDDCheckpointerSuite ()  { throw new RuntimeException(); }
}
