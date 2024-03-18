package org.apache.spark.ml.classification;
public  class NaiveBayesSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NaiveBayesSuite$ MODULE$ = null;
  public   NaiveBayesSuite$ ()  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettingsForGaussian ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ml.feature.LabeledPoint> generateNaiveBayesInput (double[] pi, double[][] theta, int nPoints, int seed, java.lang.String modelType, int sample)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ml.feature.LabeledPoint> generateGaussianNaiveBayesInput (double[] pi, double[][] theta, double[][] sigma, int nPoints, int seed)  { throw new RuntimeException(); }
}
