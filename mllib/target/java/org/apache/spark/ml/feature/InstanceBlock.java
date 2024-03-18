package org.apache.spark.ml.feature;
/**
 * Class that represents an block of instance.
 * If all weights are 1, then an empty array is stored.
 */
  class InstanceBlock implements scala.Product, scala.Serializable {
  /**
   * Suggested value for BlockSizeInMB in Level-2 routine cases.
   * According to performance tests of BLAS routine (see SPARK-31714) and
   * LinearSVC (see SPARK-32907), 1.0 MB should be an acceptable value for
   * linear models using Level-2 routine (GEMV) to perform prediction and
   * gradient computation.
   * @return (undocumented)
   */
  static public  double DefaultBlockSizeInMB ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.InstanceBlock fromInstances (scala.collection.Seq<org.apache.spark.ml.feature.Instance> instances)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.InstanceBlock> blokify (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, int blockSize)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<org.apache.spark.ml.feature.InstanceBlock> blokifyWithMaxMemUsage (scala.collection.Iterator<org.apache.spark.ml.feature.Instance> instanceIterator, long maxMemUsage)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.InstanceBlock> blokifyWithMaxMemUsage (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, long maxMemUsage)  { throw new RuntimeException(); }
  public  double[] labels ()  { throw new RuntimeException(); }
  public  double[] weights ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix matrix ()  { throw new RuntimeException(); }
  // not preceding
  public   InstanceBlock (double[] labels, double[] weights, org.apache.spark.ml.linalg.Matrix matrix)  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.ml.feature.Instance> instanceIterator ()  { throw new RuntimeException(); }
  public  double getLabel (int i)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> labelIter ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Function1<java.lang.Object, java.lang.Object> getWeight ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> weightIter ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Function1<java.lang.Object, scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>>> getNonZeroIter ()  { throw new RuntimeException(); }
}
