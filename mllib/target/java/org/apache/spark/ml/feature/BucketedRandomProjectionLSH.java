package org.apache.spark.ml.feature;
/**
 * This {@link BucketedRandomProjectionLSH} implements Locality Sensitive Hashing functions for
 * Euclidean distance metrics.
 * <p>
 * The input is dense or sparse vectors, each of which represents a point in the Euclidean
 * distance space. The output will be vectors of configurable dimension. Hash values in the
 * same dimension are calculated by the same hash function.
 * <p>
 * References:
 * <p>
 * 1. <a href="https://en.wikipedia.org/wiki/Locality-sensitive_hashing#Stable_distributions">
 * Wikipedia on Stable Distributions</a>
 * <p>
 * 2. Wang, Jingdong et al. "Hashing for similarity search: A survey." arXiv preprint
 * arXiv:1408.2927 (2014).
 */
public  class BucketedRandomProjectionLSH extends org.apache.spark.ml.feature.LSH<org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel> implements org.apache.spark.ml.feature.BucketedRandomProjectionLSHParams, org.apache.spark.ml.param.shared.HasSeed {
  static public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam bucketLength ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   BucketedRandomProjectionLSH (java.lang.String uid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setNumHashTables (int value)  { throw new RuntimeException(); }
  public   BucketedRandomProjectionLSH ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setBucketLength (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setSeed (long value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel createRawLSHModel (int inputDim)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
