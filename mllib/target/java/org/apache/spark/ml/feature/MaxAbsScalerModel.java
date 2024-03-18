package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link MaxAbsScaler}.
 * <p>
 */
public  class MaxAbsScalerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.MaxAbsScalerModel> implements org.apache.spark.ml.feature.MaxAbsScalerParams, org.apache.spark.ml.util.MLWritable {
  static   class MaxAbsScalerModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   MaxAbsScalerModelWriter (org.apache.spark.ml.feature.MaxAbsScalerModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.MaxAbsScalerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.MaxAbsScalerModel load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector maxAbs ()  { throw new RuntimeException(); }
  // not preceding
     MaxAbsScalerModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector maxAbs)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MaxAbsScalerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MaxAbsScalerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MaxAbsScalerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
