package org.apache.spark.ml.tuning;
/**
 * Validation for hyper-parameter tuning.
 * Randomly splits the input dataset into train and validation sets,
 * and uses evaluation metric on the validation set to select the best model.
 * Similar to {@link CrossValidator}, but only splits the set once.
 */
public  class TrainValidationSplit extends org.apache.spark.ml.Estimator<org.apache.spark.ml.tuning.TrainValidationSplitModel> implements org.apache.spark.ml.tuning.TrainValidationSplitParams, org.apache.spark.ml.param.shared.HasParallelism, org.apache.spark.ml.param.shared.HasCollectSubModels, org.apache.spark.ml.util.MLWritable, org.apache.spark.internal.Logging {
  static   class TrainValidationSplitWriter extends org.apache.spark.ml.util.MLWriter {
    public   TrainValidationSplitWriter (org.apache.spark.ml.tuning.TrainValidationSplit instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.TrainValidationSplit> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tuning.TrainValidationSplit load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam collectSubModels ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam parallelism ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam trainRatio ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Estimator<?>> estimator ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.param.ParamMap[]> estimatorParamMaps ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.evaluation.Evaluator> evaluator ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   TrainValidationSplit (java.lang.String uid)  { throw new RuntimeException(); }
  public   TrainValidationSplit ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setEstimator (org.apache.spark.ml.Estimator<?> value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setEstimatorParamMaps (org.apache.spark.ml.param.ParamMap[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setEvaluator (org.apache.spark.ml.evaluation.Evaluator value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setTrainRatio (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setSeed (long value)  { throw new RuntimeException(); }
  /**
   * Set the maximum level of parallelism to evaluate models in parallel.
   * Default is 1 for serial evaluation
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setParallelism (int value)  { throw new RuntimeException(); }
  /**
   * Whether to collect submodels when fitting. If set, we can get submodels from
   * the returned model.
   * <p>
   * Note: If set this param, when you save the returned model, you can set an option
   * "persistSubModels" to be "true" before saving, in order to save these submodels.
   * You can check documents of
   * {@link org.apache.spark.ml.tuning.TrainValidationSplitModel.TrainValidationSplitModelWriter}
   * for more information.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setCollectSubModels (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplitModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplit copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
