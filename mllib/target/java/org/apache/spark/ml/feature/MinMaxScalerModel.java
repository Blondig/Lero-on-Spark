package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link MinMaxScaler}.
 * <p>
 * param:  originalMin min value for each original column during fitting
 * param:  originalMax max value for each original column during fitting
 */
public  class MinMaxScalerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.MinMaxScalerModel> implements org.apache.spark.ml.feature.MinMaxScalerParams, org.apache.spark.ml.util.MLWritable {
  static   class MinMaxScalerModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   MinMaxScalerModelWriter (org.apache.spark.ml.feature.MinMaxScalerModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.MinMaxScalerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.MinMaxScalerModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam min ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam max ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector originalMin ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector originalMax ()  { throw new RuntimeException(); }
  // not preceding
     MinMaxScalerModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector originalMin, org.apache.spark.ml.linalg.Vector originalMax)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScalerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScalerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScalerModel setMin (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScalerModel setMax (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinMaxScalerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
