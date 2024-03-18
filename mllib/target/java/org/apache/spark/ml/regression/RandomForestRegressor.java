package org.apache.spark.ml.regression;
/**
 * <a href="http://en.wikipedia.org/wiki/Random_forest">Random Forest</a>
 * learning algorithm for regression.
 * It supports both continuous and categorical features.
 */
public  class RandomForestRegressor extends org.apache.spark.ml.regression.Regressor<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.RandomForestRegressor, org.apache.spark.ml.regression.RandomForestRegressionModel> implements org.apache.spark.ml.tree.RandomForestRegressorParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /** Accessor for supported impurity settings: variance */
  static public final  java.lang.String[] supportedImpurities ()  { throw new RuntimeException(); }
  /** Accessor for supported featureSubsetStrategy settings: auto, all, onethird, sqrt, log2 */
  static public final  java.lang.String[] supportedFeatureSubsetStrategies ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.RandomForestRegressor load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam numTrees ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam bootstrap ()  { throw new RuntimeException(); }
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
  public   RandomForestRegressor (java.lang.String uid)  { throw new RuntimeException(); }
  public   RandomForestRegressor ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMaxDepth (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMaxBins (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMinInstancesPerNode (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMinWeightFractionPerNode (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMinInfoGain (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMaxMemoryInMB (int value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setCacheNodeIds (boolean value)  { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.regression.RandomForestRegressor setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setImpurity (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setSubsamplingRate (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setSeed (long value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setNumTrees (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setBootstrap (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setFeatureSubsetStrategy (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * By default the weightCol is not set, so all instances have weight 1.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.RandomForestRegressor setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.RandomForestRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
