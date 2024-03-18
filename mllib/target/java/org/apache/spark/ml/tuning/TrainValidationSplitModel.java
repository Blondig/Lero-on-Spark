package org.apache.spark.ml.tuning;
/**
 * Model from train validation split.
 * <p>
 * param:  uid Id.
 * param:  bestModel Estimator determined best model.
 * param:  validationMetrics Evaluated validation metrics.
 */
public  class TrainValidationSplitModel extends org.apache.spark.ml.Model<org.apache.spark.ml.tuning.TrainValidationSplitModel> implements org.apache.spark.ml.tuning.TrainValidationSplitParams, org.apache.spark.ml.util.MLWritable {
  /**
   * Writer for TrainValidationSplitModel.
   * param:  instance TrainValidationSplitModel instance used to construct the writer
   * <p>
   * TrainValidationSplitModel supports an option "persistSubModels", with possible values
   * "true" or "false". If you set the collectSubModels Param before fitting, then you can
   * set "persistSubModels" to "true" in order to persist the subModels. By default,
   * "persistSubModels" will be "true" when subModels are available and "false" otherwise.
   * If subModels are not available, then setting "persistSubModels" to "true" will cause
   * an exception.
   */
  static public final class TrainValidationSplitModelWriter extends org.apache.spark.ml.util.MLWriter {
       TrainValidationSplitModelWriter (org.apache.spark.ml.tuning.TrainValidationSplitModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static   scala.Option<org.apache.spark.ml.Model<?>[]> copySubModels (scala.Option<org.apache.spark.ml.Model<?>[]> subModels)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.TrainValidationSplitModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tuning.TrainValidationSplitModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam trainRatio ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Estimator<?>> estimator ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.param.ParamMap[]> estimatorParamMaps ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.evaluation.Evaluator> evaluator ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.Model<?> bestModel ()  { throw new RuntimeException(); }
  public  double[] validationMetrics ()  { throw new RuntimeException(); }
  // not preceding
     TrainValidationSplitModel (java.lang.String uid, org.apache.spark.ml.Model<?> bestModel, double[] validationMetrics)  { throw new RuntimeException(); }
  /** A Python-friendly auxiliary constructor. */
     TrainValidationSplitModel (java.lang.String uid, org.apache.spark.ml.Model<?> bestModel, java.util.List<java.lang.Object> validationMetrics)  { throw new RuntimeException(); }
    org.apache.spark.ml.tuning.TrainValidationSplitModel setSubModels (scala.Option<org.apache.spark.ml.Model<?>[]> subModels)  { throw new RuntimeException(); }
    org.apache.spark.ml.tuning.TrainValidationSplitModel setSubModels (java.util.List<org.apache.spark.ml.Model<?>> subModels)  { throw new RuntimeException(); }
  /**
   * @return submodels represented in array. The index of array corresponds to the ordering of
   *         estimatorParamMaps
   * @throws IllegalArgumentException if subModels are not available. To retrieve subModels,
   *         make sure to set collectSubModels to true before fitting.
   */
  public  org.apache.spark.ml.Model<?>[] subModels ()  { throw new RuntimeException(); }
  public  boolean hasSubModels ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplitModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplitModel.TrainValidationSplitModelWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
