package org.apache.spark.ml.feature;
public  class SelectorModel$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SelectorModel$ MODULE$ = null;
  public   SelectorModel$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, int[] selectedFeatures, org.apache.spark.sql.types.StructType outputSchema, java.lang.String outputCol, java.lang.String featuresCol)  { throw new RuntimeException(); }
  /**
   * Prepare the output column field, including per-feature metadata.
   * @param schema (undocumented)
   * @param selectedFeatures (undocumented)
   * @param outputCol (undocumented)
   * @param featuresCol (undocumented)
   * @param isNumericAttribute (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructField prepOutputField (org.apache.spark.sql.types.StructType schema, int[] selectedFeatures, java.lang.String outputCol, java.lang.String featuresCol, boolean isNumericAttribute)  { throw new RuntimeException(); }
  public  scala.Tuple2<int[], double[]> compressSparse (int[] indices, double[] values, int[] selectedFeatures)  { throw new RuntimeException(); }
}
