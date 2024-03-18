package org.apache.spark.ml.classification;
/**
 * Gradient-Boosted Trees (GBTs) (http://en.wikipedia.org/wiki/Gradient_boosting)
 * learning algorithm for classification.
 * It supports binary labels, as well as both continuous and categorical features.
 * <p>
 * The implementation is based upon: J.H. Friedman. "Stochastic Gradient Boosting." 1999.
 * <p>
 * Notes on Gradient Boosting vs. TreeBoost:
 *  - This implementation is for Stochastic Gradient Boosting, not for TreeBoost.
 *  - Both algorithms learn tree ensembles by minimizing loss functions.
 *  - TreeBoost (Friedman, 1999) additionally modifies the outputs at tree leaf nodes
 *    based on the loss function, whereas the original gradient boosting method does not.
 *  - We expect to implement TreeBoost in the future:
 *    [https://issues.apache.org/jira/browse/SPARK-4240]
 * <p>
 * @note Multiclass labels are not currently supported.
 */
public  class GBTClassifier extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.GBTClassifier, org.apache.spark.ml.classification.GBTClassificationModel> implements org.apache.spark.ml.tree.GBTClassifierParams, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.internal.Logging {
  /** Accessor for supported loss settings: logistic */
  static public final  java.lang.String[] supportedLossTypes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.GBTClassifier load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> lossType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam validationTol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> validationIndicatorCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam subsamplingRate ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featureSubsetStrategy ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> leafCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxDepth ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxBins ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam minInstancesPerNode ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam minWeightFractionPerNode ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam minInfoGain ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxMemoryInMB ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam cacheNodeIds ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam checkpointInterval ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   GBTClassifier (java.lang.String uid)  { throw new RuntimeException(); }
  public   GBTClassifier ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setMaxDepth (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setMaxBins (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setMinInstancesPerNode (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setMinWeightFractionPerNode (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setMinInfoGain (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.classification.GBTClassifier setMaxMemoryInMB (int value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.classification.GBTClassifier setCacheNodeIds (boolean value)  { throw new RuntimeException(); }
  /**
   * Specifies how often to checkpoint the cached node IDs.
   * E.g. 10 means that the cache will get checkpointed every 10 iterations.
   * This is only used if cacheNodeIds is true and if the checkpoint directory is set in
   * {@link org.apache.spark.SparkContext}.
   * Must be at least 1.
   * (default = 10)
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.GBTClassifier setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /**
   * The impurity setting is ignored for GBT models.
   * Individual trees are built using impurity "Variance."
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.GBTClassifier setImpurity (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setSubsamplingRate (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setSeed (long value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setStepSize (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setFeatureSubsetStrategy (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setLossType (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setValidationIndicatorCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * By default the weightCol is not set, so all instances have weight 1.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.GBTClassifier setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.GBTClassificationModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
