package org.apache.spark.ml.feature;
/**
 * Model produced by {@link BucketedRandomProjectionLSH}, where multiple random vectors are stored. The
 * vectors are normalized to be unit vectors and each vector is used in a hash function:
 *    <code>h_i(x) = floor(r_i.dot(x) / bucketLength)</code>
 * where <code>r_i</code> is the i-th random unit vector. The number of buckets will be <code>(max L2 norm of input
 * vectors) / bucketLength</code>.
 * <p>
 * param:  randMatrix A matrix with each row representing a hash function.
 */
public  class BucketedRandomProjectionLSHModel extends org.apache.spark.ml.feature.LSHModel<org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel> implements org.apache.spark.ml.feature.BucketedRandomProjectionLSHParams {
  static   class BucketedRandomProjectionLSHModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   BucketedRandomProjectionLSHModelWriter (org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam bucketLength ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.Matrix randMatrix ()  { throw new RuntimeException(); }
  // not preceding
     BucketedRandomProjectionLSHModel (java.lang.String uid, org.apache.spark.ml.linalg.Matrix randMatrix)  { throw new RuntimeException(); }
     BucketedRandomProjectionLSHModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector[] randUnitVectors)  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.Vector[] randUnitVectors ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector[] hashFunction (org.apache.spark.ml.linalg.Vector elems)  { throw new RuntimeException(); }
  protected  double keyDistance (org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.Vector y)  { throw new RuntimeException(); }
  protected  double hashDistance (org.apache.spark.ml.linalg.Vector[] x, org.apache.spark.ml.linalg.Vector[] y)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
