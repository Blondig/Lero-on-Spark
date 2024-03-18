package org.apache.spark.mllib.stat;
/**
 * Trait for multivariate statistical summary of a data matrix.
 */
public  interface MultivariateStatisticalSummary {
  /**
   * Sample size.
   * @return (undocumented)
   */
  public  long count ()  ;
  /**
   * Maximum value of each column.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector max ()  ;
  /**
   * Sample mean vector.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector mean ()  ;
  /**
   * Minimum value of each column.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector min ()  ;
  /**
   * L1 norm of each column
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector normL1 ()  ;
  /**
   * Euclidean magnitude of each column
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector normL2 ()  ;
  /**
   * Number of nonzero elements (including explicitly presented zero values) in each column.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector numNonzeros ()  ;
  /**
   * Sample variance vector. Should return a zero vector if the sample size is 1.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector variance ()  ;
  /**
   * Sum of weights.
   * @return (undocumented)
   */
  public  double weightSum ()  ;
}
