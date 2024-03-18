package org.apache.spark.ml;
public  class functions$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final functions$ MODULE$ = null;
  public   functions$ ()  { throw new RuntimeException(); }
  /**
   * Converts a column of MLlib sparse/dense vectors into a column of dense arrays.
   * @param v: the column of MLlib sparse/dense vectors
   * @param dtype: the desired underlying data type in the returned array
   * @return an array&amp;lt;float&amp;gt; if dtype is float32, or array&amp;lt;double&amp;gt; if dtype is float64
   * @since 3.0.0
   */
  public  org.apache.spark.sql.Column vector_to_array (org.apache.spark.sql.Column v, java.lang.String dtype)  { throw new RuntimeException(); }
  /**
   * Converts a column of array of numeric type into a column of dense vectors in MLlib.
   * @param v: the column of array&amp;lt;NumericType&amp;gt type
   * @return a column of type <code>org.apache.spark.ml.linalg.Vector</code>
   * @since 3.1.0
   */
  public  org.apache.spark.sql.Column array_to_vector (org.apache.spark.sql.Column v)  { throw new RuntimeException(); }
    org.apache.spark.sql.expressions.UserDefinedFunction checkNonNegativeWeight ()  { throw new RuntimeException(); }
}
