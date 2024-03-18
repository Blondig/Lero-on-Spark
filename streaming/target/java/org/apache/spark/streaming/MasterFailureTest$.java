package org.apache.spark.streaming;
public  class MasterFailureTest$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MasterFailureTest$ MODULE$ = null;
  public   MasterFailureTest$ ()  { throw new RuntimeException(); }
  public  boolean killed ()  { throw new RuntimeException(); }
  public  int killCount ()  { throw new RuntimeException(); }
  public  boolean setupCalled ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  public  void testMap (java.lang.String directory, int numBatches, org.apache.spark.streaming.Duration batchDuration)  { throw new RuntimeException(); }
  public  void testUpdateStateByKey (java.lang.String directory, int numBatches, org.apache.spark.streaming.Duration batchDuration)  { throw new RuntimeException(); }
  /**
   * Tests stream operation with multiple master failures, and verifies whether the
   * final set of output values is as expected or not.
   * @param directory (undocumented)
   * @param batchDuration (undocumented)
   * @param input (undocumented)
   * @param operation (undocumented)
   * @param expectedOutput (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.Seq<T> testOperation (java.lang.String directory, org.apache.spark.streaming.Duration batchDuration, scala.collection.Seq<java.lang.String> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<java.lang.String>, org.apache.spark.streaming.dstream.DStream<T>> operation, scala.collection.Seq<T> expectedOutput, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
}
