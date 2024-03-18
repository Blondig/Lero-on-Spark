package org.apache.spark.ml.regression;
/**
 * Enable the ignored test to export the dataset into CSV format,
 * so we can validate the training accuracy compared with R's glm and glmnet package.
 */
public  class GeneralizedLinearRegressionSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GeneralizedLinearRegressionSuite$ MODULE$ = null;
  public   GeneralizedLinearRegressionSuite$ ()  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ml.feature.LabeledPoint> generateGeneralizedLinearRegressionInput (double intercept, double[] coefficients, double[] xMean, double[] xVariance, int nPoints, int seed, double noiseLevel, java.lang.String family, java.lang.String link)  { throw new RuntimeException(); }
}
