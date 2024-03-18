package org.apache.spark.ml.classification;
/**
 * Params for Naive Bayes Classifiers.
 */
public  interface NaiveBayesParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasWeightCol {
  /** @group getParam */
  public  java.lang.String getModelType ()  ;
  /** @group getParam */
  public  double getSmoothing ()  ;
  /**
   * The model type which is a string (case-sensitive).
   * Supported options: "multinomial", "complement", "bernoulli", "gaussian".
   * (default = multinomial)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> modelType ()  ;
  /**
   * The smoothing parameter.
   * (default = 1.0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam smoothing ()  ;
}
