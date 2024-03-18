package org.apache.spark.ml.regression;
/**
 * During training we standardize the dataset first, so no matter how we multiple
 * a scaling factor into the dataset, the convergence rate should be the same,
 * and the coefficients should equal to the original coefficients multiple by
 * the scaling factor. It will have no effect on the intercept and scale.
 */
public  class AFTSurvivalRegressionSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AFTSurvivalRegressionSuite$ MODULE$ = null;
  public   AFTSurvivalRegressionSuite$ ()  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
}
