package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link ChiSqSelector}.
 */
public final class ChiSqSelectorModel extends org.apache.spark.ml.feature.SelectorModel<org.apache.spark.ml.feature.ChiSqSelectorModel> {
  static public  class ChiSqSelectorModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   ChiSqSelectorModelWriter (org.apache.spark.ml.feature.ChiSqSelectorModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.ChiSqSelectorModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.ChiSqSelectorModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int[] selectedFeatures ()  { throw new RuntimeException(); }
  // not preceding
     ChiSqSelectorModel (java.lang.String uid, int[] selectedFeatures)  { throw new RuntimeException(); }
  protected  boolean isNumericAttribute ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelectorModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelectorModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelectorModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
