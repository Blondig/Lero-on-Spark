package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link Selector}.
 */
 abstract class SelectorModel<T extends org.apache.spark.ml.feature.SelectorModel<T>> extends org.apache.spark.ml.Model<T> implements org.apache.spark.ml.feature.SelectorParams, org.apache.spark.ml.util.MLWritable {
  /**
   * Prepare the output column field, including per-feature metadata.
   * @param schema (undocumented)
   * @param selectedFeatures (undocumented)
   * @param outputCol (undocumented)
   * @param featuresCol (undocumented)
   * @param isNumericAttribute (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.StructField prepOutputField (org.apache.spark.sql.types.StructType schema, int[] selectedFeatures, java.lang.String outputCol, java.lang.String featuresCol, boolean isNumericAttribute)  { throw new RuntimeException(); }
  static public  scala.Tuple2<int[], double[]> compressSparse (int[] indices, double[] values, int[] selectedFeatures)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.feature.SelectorModel), List(TypeTree().setOriginal(Ident(TypeName("T"))))))))
  public final  org.apache.spark.ml.param.IntParam numTopFeatures ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam percentile ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam fpr ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam fdr ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam fwe ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> selectorType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int[] selectedFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public   SelectorModel (java.lang.String uid, int[] selectedFeatures)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.SelectorModel<T> setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.SelectorModel<T> setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  boolean isNumericAttribute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
