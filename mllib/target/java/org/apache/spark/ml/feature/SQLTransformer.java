package org.apache.spark.ml.feature;
/**
 * Implements the transformations which are defined by SQL statement.
 * Currently we only support SQL syntax like 'SELECT ... FROM __THIS__ ...'
 * where '__THIS__' represents the underlying table of the input dataset.
 * The select clause specifies the fields, constants, and expressions to display in
 * the output, it can be any select clause that Spark SQL supports. Users can also
 * use Spark SQL built-in function and UDFs to operate on these selected columns.
 * For example, {@link SQLTransformer} supports statements like:
 * <pre><code>
 *  SELECT a, a + b AS a_b FROM __THIS__
 *  SELECT a, SQRT(b) AS b_sqrt FROM __THIS__ where a &gt; 5
 *  SELECT a, b, SUM(c) AS c_sum FROM __THIS__ GROUP BY a, b
 * </code></pre>
 */
public  class SQLTransformer extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.SQLTransformer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   SQLTransformer (java.lang.String uid)  { throw new RuntimeException(); }
  public   SQLTransformer ()  { throw new RuntimeException(); }
  /**
   * SQL statement parameter. The statement is provided in string form.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.Param<java.lang.String> statement ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.SQLTransformer setStatement (java.lang.String value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getStatement ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.SQLTransformer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
