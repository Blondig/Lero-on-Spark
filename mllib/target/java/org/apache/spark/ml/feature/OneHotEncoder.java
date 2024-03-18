package org.apache.spark.ml.feature;
/**
 * A one-hot encoder that maps a column of category indices to a column of binary vectors, with
 * at most a single one-value per row that indicates the input category index.
 * For example with 5 categories, an input value of 2.0 would map to an output vector of
 * <code>[0.0, 0.0, 1.0, 0.0]</code>.
 * The last category is not included by default (configurable via <code>dropLast</code>),
 * because it makes the vector entries sum up to one, and hence linearly dependent.
 * So an input value of 4.0 maps to <code>[0.0, 0.0, 0.0, 0.0]</code>.
 * <p>
 * @note This is different from scikit-learn's OneHotEncoder, which keeps all categories.
 * The output vectors are sparse.
 * <p>
 * When <code>handleInvalid</code> is configured to 'keep', an extra "category" indicating invalid values is
 * added as last category. So when <code>dropLast</code> is true, invalid values are encoded as all-zeros
 * vector.
 * <p>
 * @note When encoding multi-column by using <code>inputCols</code> and <code>outputCols</code> params, input/output cols
 * come in pairs, specified by the order in the arrays, and each pair is treated independently.
 * <p>
 * @see <code>StringIndexer</code> for converting categorical values into category indices
 */
public  class OneHotEncoder extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.OneHotEncoderModel> implements org.apache.spark.ml.feature.OneHotEncoderBase, org.apache.spark.ml.util.DefaultParamsWritable {
  static   java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.OneHotEncoder load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam dropLast ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam outputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   OneHotEncoder (java.lang.String uid)  { throw new RuntimeException(); }
  public   OneHotEncoder ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoder setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoder setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoder setInputCols (java.lang.String[] values)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoder setOutputCols (java.lang.String[] values)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoder setDropLast (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoder setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.OneHotEncoderModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.OneHotEncoder copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
