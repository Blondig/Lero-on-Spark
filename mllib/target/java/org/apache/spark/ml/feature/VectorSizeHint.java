package org.apache.spark.ml.feature;
/**
 * A feature transformer that adds size information to the metadata of a vector column.
 * VectorAssembler needs size information for its input columns and cannot be used on streaming
 * dataframes without this metadata.
 * <p>
 * Note: VectorSizeHint modifies <code>inputCol</code> to include size metadata and does not have an outputCol.
 */
public  class VectorSizeHint extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasHandleInvalid, org.apache.spark.ml.util.DefaultParamsWritable {
  static   java.lang.String OPTIMISTIC_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorSizeHint load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   VectorSizeHint (java.lang.String uid)  { throw new RuntimeException(); }
  public   VectorSizeHint ()  { throw new RuntimeException(); }
  /**
   * The size of Vectors in <code>inputCol</code>.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam size ()  { throw new RuntimeException(); }
  /** group getParam */
  public  int getSize ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSizeHint setSize (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSizeHint setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Param for how to handle invalid entries. Invalid vectors include nulls and vectors with the
   * wrong size. The options are <code>skip</code> (filter out rows with invalid vectors), <code>error</code> (throw an
   * error) and <code>optimistic</code> (do not check the vector size, and keep all rows). <code>error</code> by default.
   * <p>
   * Note: Users should take care when setting this param to <code>optimistic</code>. The use of the
   * <code>optimistic</code> option will prevent the transformer from validating the sizes of vectors in
   * <code>inputCol</code>. A mismatch between the metadata of a column and its contents could result in
   * unexpected behaviour or errors when using that column.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSizeHint setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorSizeHint copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
