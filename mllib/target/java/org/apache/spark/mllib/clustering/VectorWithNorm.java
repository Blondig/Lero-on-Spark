package org.apache.spark.mllib.clustering;
/**
 * A vector with its norm for fast distance computation.
 */
  class VectorWithNorm implements scala.Serializable {
  public  org.apache.spark.mllib.linalg.Vector vector ()  { throw new RuntimeException(); }
  public  double norm ()  { throw new RuntimeException(); }
  public  double weight ()  { throw new RuntimeException(); }
  // not preceding
  public   VectorWithNorm (org.apache.spark.mllib.linalg.Vector vector, double norm, double weight)  { throw new RuntimeException(); }
  public   VectorWithNorm (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
  public   VectorWithNorm (double[] array)  { throw new RuntimeException(); }
  /** Converts the vector to a dense vector. */
  public  org.apache.spark.mllib.clustering.VectorWithNorm toDense ()  { throw new RuntimeException(); }
}
