package org.apache.spark.ml.feature;
/**
 * A feature transformer that takes the 1D discrete cosine transform of a real vector. No zero
 * padding is performed on the input vector.
 * It returns a real vector of the same length representing the DCT. The return vector is scaled
 * such that the transform matrix is unitary (aka scaled DCT-II).
 * <p>
 * More information on <a href="https://en.wikipedia.org/wiki/Discrete_cosine_transform#DCT-II">
 * DCT-II in Discrete cosine transform (Wikipedia)</a>.
 */
public  class DCT extends org.apache.spark.ml.UnaryTransformer<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.feature.DCT> implements org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.DCT load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   DCT (java.lang.String uid)  { throw new RuntimeException(); }
  public   DCT ()  { throw new RuntimeException(); }
  /**
   * Indicates whether to perform the inverse DCT (true) or forward DCT (false).
   * Default: false
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam inverse ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.DCT setInverse (boolean value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  boolean getInverse ()  { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> createTransformFunc ()  { throw new RuntimeException(); }
  protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
