package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link UnivariateFeatureSelectorModel}.
 */
public  class UnivariateFeatureSelectorModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.UnivariateFeatureSelectorModel> implements org.apache.spark.ml.feature.UnivariateFeatureSelectorParams, org.apache.spark.ml.util.MLWritable {
  static   class UnivariateFeatureSelectorModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   UnivariateFeatureSelectorModelWriter (org.apache.spark.ml.feature.UnivariateFeatureSelectorModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.UnivariateFeatureSelectorModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.UnivariateFeatureSelectorModel load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featureType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> selectionMode ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam selectionThreshold ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int[] selectedFeatures ()  { throw new RuntimeException(); }
  // not preceding
     UnivariateFeatureSelectorModel (java.lang.String uid, int[] selectedFeatures)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.UnivariateFeatureSelectorModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.UnivariateFeatureSelectorModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  boolean isNumericAttribute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.UnivariateFeatureSelectorModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
