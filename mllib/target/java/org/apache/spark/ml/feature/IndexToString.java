package org.apache.spark.ml.feature;
/**
 * A <code>Transformer</code> that maps a column of indices back to a new column of corresponding
 * string values.
 * The index-string mapping is either from the ML attributes of the input column,
 * or from user-supplied labels (which take precedence over ML attributes).
 * <p>
 * @see <code>StringIndexer</code> for converting strings into indices
 */
public  class IndexToString extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.IndexToString load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   IndexToString (java.lang.String uid)  { throw new RuntimeException(); }
  public   IndexToString ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.IndexToString setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.IndexToString setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.IndexToString setLabels (java.lang.String[] value)  { throw new RuntimeException(); }
  /**
   * Optional param for array of labels specifying index-string mapping.
   * <p>
   * Default: Not specified, in which case {@link inputCol} metadata is used for labels.
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.StringArrayParam labels ()  { throw new RuntimeException(); }
  /** @group getParam */
  public final  java.lang.String[] getLabels ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IndexToString copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
