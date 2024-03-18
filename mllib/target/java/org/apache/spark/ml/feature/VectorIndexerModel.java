package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link VectorIndexer}. Transform categorical features to use 0-based indices
 * instead of their original values.
 *  - Categorical features are mapped to indices.
 *  - Continuous features (columns) are left unchanged.
 * This also appends metadata to the output column, marking features as Numeric (continuous),
 * Nominal (categorical), or Binary (either continuous or categorical).
 * Non-ML metadata is not carried over from the input to the output column.
 * <p>
 * This maintains vector sparsity.
 * <p>
 * param:  numFeatures  Number of features, i.e., length of Vectors which this transforms
 * param:  categoryMaps  Feature value index.  Keys are categorical feature indices (column indices).
 *                      Values are maps from original features values to 0-based category indices.
 *                      If a feature is not in this map, it is treated as continuous.
 */
public  class VectorIndexerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.VectorIndexerModel> implements org.apache.spark.ml.feature.VectorIndexerParams, org.apache.spark.ml.util.MLWritable {
  static   class VectorIndexerModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   VectorIndexerModelWriter (org.apache.spark.ml.feature.VectorIndexerModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.VectorIndexerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorIndexerModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam maxCategories ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> categoryMaps ()  { throw new RuntimeException(); }
  // not preceding
     VectorIndexerModel (java.lang.String uid, int numFeatures, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> categoryMaps)  { throw new RuntimeException(); }
  /** Java-friendly version of {@link categoryMaps} */
  public  java.util.Map<java.lang.Integer, java.util.Map<java.lang.Double, java.lang.Integer>> javaCategoryMaps ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorIndexerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
