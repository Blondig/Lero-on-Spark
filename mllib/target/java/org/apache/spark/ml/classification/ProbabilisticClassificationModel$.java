package org.apache.spark.ml.classification;
public  class ProbabilisticClassificationModel$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ProbabilisticClassificationModel$ MODULE$ = null;
  public   ProbabilisticClassificationModel$ ()  { throw new RuntimeException(); }
  /**
   * Normalize a vector of raw predictions to be a multinomial probability vector, in place.
   * <p>
   * The input raw predictions should be nonnegative.
   * The output vector sums to 1.
   * <p>
   * NOTE: This is NOT applicable to all models, only ones which effectively use class
   *       instance counts for raw predictions.
   * <p>
   * @throws IllegalArgumentException if the input vector is all-0 or including negative values
   * @param v (undocumented)
   */
  public  void normalizeToProbabilitiesInPlace (org.apache.spark.ml.linalg.DenseVector v)  { throw new RuntimeException(); }
}
