package org.apache.spark.streaming.scheduler;
/**
 * Class that manages executors allocated to a StreamingContext, and dynamically requests or kills
 * executors based on the statistics of the streaming computation. This is different from the core
 * dynamic allocation policy; the core policy relies on executors being idle for a while, but the
 * micro-batch model of streaming prevents any particular executors from being idle for a long
 * time. Instead, the measure of "idle-ness" needs to be based on the time taken to process
 * each batch.
 * <p>
 * At a high level, the policy implemented by this class is as follows:
 * - Use StreamingListener interface get batch processing times of completed batches
 * - Periodically take the average batch completion times and compare with the batch interval
 * - If (avg. proc. time / batch interval) >= scaling up ratio, then request more executors.
 *   The number of executors requested is based on the ratio = (avg. proc. time / batch interval).
 * - If (avg. proc. time / batch interval) <= scaling down ratio, then try to kill an executor that
 *   is not running a receiver.
 * <p>
 * This features should ideally be used in conjunction with backpressure, as backpressure ensures
 * system stability, while executors are being readjusted.
 * <p>
 * Note that an initial set of executors (spark.executor.instances) was allocated when the
 * SparkContext was created. This class scales executors up/down after the StreamingContext
 * has started.
 */
  class ExecutorAllocationManager implements org.apache.spark.streaming.scheduler.StreamingListener, org.apache.spark.internal.Logging {
  static public  boolean isDynamicAllocationEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.streaming.scheduler.ExecutorAllocationManager> createIfEnabled (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.streaming.scheduler.ReceiverTracker receiverTracker, org.apache.spark.SparkConf conf, long batchDurationMs, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
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
  public   ExecutorAllocationManager (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.streaming.scheduler.ReceiverTracker receiverTracker, org.apache.spark.SparkConf conf, long batchDurationMs, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
}
