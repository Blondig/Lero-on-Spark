package org.apache.spark.ml.feature;
public  class InstanceBlock$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InstanceBlock$ MODULE$ = null;
  public   InstanceBlock$ ()  { throw new RuntimeException(); }
  /**
   * Suggested value for BlockSizeInMB in Level-2 routine cases.
   * According to performance tests of BLAS routine (see SPARK-31714) and
   * LinearSVC (see SPARK-32907), 1.0 MB should be an acceptable value for
   * linear models using Level-2 routine (GEMV) to perform prediction and
   * gradient computation.
   * @return (undocumented)
   */
  public  double DefaultBlockSizeInMB ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.InstanceBlock fromInstances (scala.collection.Seq<org.apache.spark.ml.feature.Instance> instances)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.InstanceBlock> blokify (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, int blockSize)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.ml.feature.InstanceBlock> blokifyWithMaxMemUsage (scala.collection.Iterator<org.apache.spark.ml.feature.Instance> instanceIterator, long maxMemUsage)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.InstanceBlock> blokifyWithMaxMemUsage (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, long maxMemUsage)  { throw new RuntimeException(); }
}
