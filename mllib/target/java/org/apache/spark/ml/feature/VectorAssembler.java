package org.apache.spark.ml.feature;
/**
 * A feature transformer that merges multiple columns into a vector column.
 * <p>
 * This requires one pass over the entire dataset. In case we need to infer column lengths from the
 * data we require an additional call to the 'first' Dataset method, see 'handleInvalid' parameter.
 */
public  class VectorAssembler extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasHandleInvalid, org.apache.spark.ml.util.DefaultParamsWritable {
  static   java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  /**
   * Infers lengths of vector columns from the first row of the dataset
   * @param dataset the dataset
   * @param columns name of vector columns whose lengths need to be inferred
   * @return map of column names to lengths
   */
  static   scala.collection.immutable.Map<java.lang.String, java.lang.Object> getVectorLengthsFromFirstRow (org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<java.lang.String> columns)  { throw new RuntimeException(); }
  static   scala.collection.immutable.Map<java.lang.String, java.lang.Object> getLengths (org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<java.lang.String> columns, java.lang.String handleInvalid)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorAssembler load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Returns a function that has the required information to assemble each row.
   * @param lengths an array of lengths of input columns, whose size should be equal to the number
   *                of cells in the row (vv)
   * @param keepInvalid indicate whether to throw an error or not on seeing a null in the rows
   * @return  a udf that can be applied on each row
   * @param vv (undocumented)
   */
  static   org.apache.spark.ml.linalg.Vector assemble (int[] lengths, boolean keepInvalid, scala.collection.Seq<java.lang.Object> vv)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   VectorAssembler (java.lang.String uid)  { throw new RuntimeException(); }
  public   VectorAssembler ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorAssembler setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorAssembler setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorAssembler setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Param for how to handle invalid data (NULL values). Options are 'skip' (filter out rows with
   * invalid data), 'error' (throw an error), or 'keep' (return relevant number of NaN in the
   * output). Column lengths are taken from the size of ML Attribute Group, which can be set using
   * <code>VectorSizeHint</code> in a pipeline before <code>VectorAssembler</code>. Column lengths can also be inferred
   * from first rows of the data since it is safe to do so but only in case of 'error' or 'skip'.
   * Default: "error"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorAssembler copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
