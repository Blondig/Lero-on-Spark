package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link VarianceThresholdSelector}.
 */
public  class VarianceThresholdSelectorModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.VarianceThresholdSelectorModel> implements org.apache.spark.ml.feature.VarianceThresholdSelectorParams, org.apache.spark.ml.util.MLWritable {
  static   class VarianceThresholdSelectorWriter extends org.apache.spark.ml.util.MLWriter {
    public   VarianceThresholdSelectorWriter (org.apache.spark.ml.feature.VarianceThresholdSelectorModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.VarianceThresholdSelectorModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VarianceThresholdSelectorModel load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam varianceThreshold ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int[] selectedFeatures ()  { throw new RuntimeException(); }
  // not preceding
     VarianceThresholdSelectorModel (java.lang.String uid, int[] selectedFeatures)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VarianceThresholdSelectorModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VarianceThresholdSelectorModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VarianceThresholdSelectorModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
