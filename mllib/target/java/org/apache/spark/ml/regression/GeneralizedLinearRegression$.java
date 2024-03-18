package org.apache.spark.ml.regression;
public  class GeneralizedLinearRegression$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.regression.GeneralizedLinearRegression>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GeneralizedLinearRegression$ MODULE$ = null;
  public   GeneralizedLinearRegression$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
    scala.collection.immutable.Set<scala.Tuple2<org.apache.spark.ml.regression.GeneralizedLinearRegression.Family, org.apache.spark.ml.regression.GeneralizedLinearRegression.Link>> supportedFamilyAndLinkPairs ()  { throw new RuntimeException(); }
  /** String name for "irls" (iteratively reweighted least squares) solver. */
    java.lang.String IRLS ()  { throw new RuntimeException(); }
  /** Set of solvers that GeneralizedLinearRegression supports. */
    java.lang.String[] supportedSolvers ()  { throw new RuntimeException(); }
  // not preceding
    java.lang.String[] supportedFamilyNames ()  { throw new RuntimeException(); }
  // not preceding
    java.lang.String[] supportedLinkNames ()  { throw new RuntimeException(); }
    double epsilon ()  { throw new RuntimeException(); }
    double ylogy (double y, double mu)  { throw new RuntimeException(); }
}
