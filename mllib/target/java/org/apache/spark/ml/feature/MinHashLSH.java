package org.apache.spark.ml.feature;
/**
 * LSH class for Jaccard distance.
 * <p>
 * The input can be dense or sparse vectors, but it is more efficient if it is sparse. For example,
 *    <code>Vectors.sparse(10, Array((2, 1.0), (3, 1.0), (5, 1.0)))</code>
 * means there are 10 elements in the space. This set contains elements 2, 3, and 5. Also, any
 * input vector must have at least 1 non-zero index, and all non-zero values are
 * treated as binary "1" values.
 * <p>
 * References:
 * <a href="https://en.wikipedia.org/wiki/MinHash">Wikipedia on MinHash</a>
 */
public  class MinHashLSH extends org.apache.spark.ml.feature.LSH<org.apache.spark.ml.feature.MinHashLSHModel> implements org.apache.spark.ml.param.shared.HasSeed {
  static   int HASH_PRIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.MinHashLSH load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MinHashLSH (java.lang.String uid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinHashLSH setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinHashLSH setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinHashLSH setNumHashTables (int value)  { throw new RuntimeException(); }
  public   MinHashLSH ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinHashLSH setSeed (long value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.feature.MinHashLSHModel createRawLSHModel (int inputDim)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinHashLSH copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
