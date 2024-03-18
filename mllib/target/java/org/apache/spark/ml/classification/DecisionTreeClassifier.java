package org.apache.spark.ml.classification;
/**
 * Decision tree learning algorithm (http://en.wikipedia.org/wiki/Decision_tree_learning)
 * for classification.
 * It supports both binary and multiclass labels, as well as both continuous and categorical
 * features.
 */
public  class DecisionTreeClassifier extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.DecisionTreeClassifier, org.apache.spark.ml.classification.DecisionTreeClassificationModel> implements org.apache.spark.ml.tree.DecisionTreeClassifierParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /** Accessor for supported impurities: entropy, gini */
  static public final  java.lang.String[] supportedImpurities ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.DecisionTreeClassifier load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
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
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   DecisionTreeClassifier (java.lang.String uid)  { throw new RuntimeException(); }
  public   DecisionTreeClassifier ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMaxDepth (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMaxBins (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMinInstancesPerNode (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMinWeightFractionPerNode (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMinInfoGain (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMaxMemoryInMB (int value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setCacheNodeIds (boolean value)  { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setImpurity (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setSeed (long value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.DecisionTreeClassificationModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /** (private[ml]) Create a Strategy instance to use with the old API. */
    org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
