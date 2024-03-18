package org.apache.spark.ml.feature;
/**
 * Outputs the Hadamard product (i.e., the element-wise product) of each input vector with a
 * provided "weight" vector.  In other words, it scales each column of the dataset by a scalar
 * multiplier.
 */
public  class ElementwiseProduct extends org.apache.spark.ml.UnaryTransformer<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.feature.ElementwiseProduct> implements org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.ElementwiseProduct load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   ElementwiseProduct (java.lang.String uid)  { throw new RuntimeException(); }
  public   ElementwiseProduct ()  { throw new RuntimeException(); }
  /**
   * the vector to multiply with input vectors
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> scalingVec ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ElementwiseProduct setScalingVec (org.apache.spark.ml.linalg.Vector value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  org.apache.spark.ml.linalg.Vector getScalingVec ()  { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> createTransformFunc ()  { throw new RuntimeException(); }
  protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
