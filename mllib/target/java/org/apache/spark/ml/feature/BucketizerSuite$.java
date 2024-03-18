package org.apache.spark.ml.feature;
public  class BucketizerSuite$ extends org.apache.spark.SparkFunSuite {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BucketizerSuite$ MODULE$ = null;
  public   BucketizerSuite$ ()  { throw new RuntimeException(); }
  /** Brute force search for buckets.  Bucket i is defined by the range [split(i), split(i+1)). */
  public  double linearSearchForBuckets (double[] splits, double feature)  { throw new RuntimeException(); }
  /** Check all values in splits, plus values between all splits. */
  public  void checkBinarySearch (double[] splits)  { throw new RuntimeException(); }
  /** Checks if bucketized results match expected ones. */
  public  void checkBucketResults (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> bucketResult, scala.collection.Seq<java.lang.String> resultColumns, scala.collection.Seq<java.lang.String> expectedColumns)  { throw new RuntimeException(); }
}
