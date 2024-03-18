package org.apache.spark.ml.feature;
/**
 * Implements the feature interaction transform. This transformer takes in Double and Vector type
 * columns and outputs a flattened vector of their feature interactions. To handle interaction,
 * we first one-hot encode any nominal features. Then, a vector of the feature cross-products is
 * produced.
 * <p>
 * For example, given the input feature values <code>Double(2)</code> and <code>Vector(3, 4)</code>, the output would be
 * <code>Vector(6, 8)</code> if all input features were numeric. If the first feature was instead nominal
 * with four categories, the output would then be <code>Vector(0, 0, 0, 0, 3, 4, 0, 0)</code>.
 */
public  class Interaction extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.Interaction load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Interaction (java.lang.String uid)  { throw new RuntimeException(); }
  public   Interaction ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Interaction setInputCols (java.lang.String[] values)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Interaction setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Interaction copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
