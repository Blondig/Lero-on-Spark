package org.apache.spark.streaming;
public  class MasterFailureTest {
  static public  boolean killed ()  { throw new RuntimeException(); }
  static public  int killCount ()  { throw new RuntimeException(); }
  static public  boolean setupCalled ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void testMap (java.lang.String directory, int numBatches, org.apache.spark.streaming.Duration batchDuration)  { throw new RuntimeException(); }
  static public  void testUpdateStateByKey (java.lang.String directory, int numBatches, org.apache.spark.streaming.Duration batchDuration)  { throw new RuntimeException(); }
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
  static public <T extends java.lang.Object> scala.collection.Seq<T> testOperation (java.lang.String directory, org.apache.spark.streaming.Duration batchDuration, scala.collection.Seq<java.lang.String> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<java.lang.String>, org.apache.spark.streaming.dstream.DStream<T>> operation, scala.collection.Seq<T> expectedOutput, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
