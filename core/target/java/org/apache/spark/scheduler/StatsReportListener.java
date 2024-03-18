package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * Simple SparkListener that logs a few summary statistics when each stage completes.
 */
public  class StatsReportListener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.internal.Logging {
  static public  int[] percentiles ()  { throw new RuntimeException(); }
  static public  double[] probabilities ()  { throw new RuntimeException(); }
  static public  java.lang.String percentilesHeader ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.util.Distribution> extractDoubleDistribution (scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.util.Distribution> extractLongDistribution (scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric)  { throw new RuntimeException(); }
  static public  void showDistribution (java.lang.String heading, org.apache.spark.util.Distribution d, scala.Function1<java.lang.Object, java.lang.String> formatNumber)  { throw new RuntimeException(); }
  static public  void showDistribution (java.lang.String heading, scala.Option<org.apache.spark.util.Distribution> dOpt, scala.Function1<java.lang.Object, java.lang.String> formatNumber)  { throw new RuntimeException(); }
  static public  void showDistribution (java.lang.String heading, scala.Option<org.apache.spark.util.Distribution> dOpt, java.lang.String format)  { throw new RuntimeException(); }
  static public  void showDistribution (java.lang.String heading, java.lang.String format, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric, scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics)  { throw new RuntimeException(); }
  static public  void showBytesDistribution (java.lang.String heading, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric, scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics)  { throw new RuntimeException(); }
  static public  void showBytesDistribution (java.lang.String heading, scala.Option<org.apache.spark.util.Distribution> dOpt)  { throw new RuntimeException(); }
  static public  void showBytesDistribution (java.lang.String heading, org.apache.spark.util.Distribution dist)  { throw new RuntimeException(); }
  static public  void showMillisDistribution (java.lang.String heading, scala.Option<org.apache.spark.util.Distribution> dOpt)  { throw new RuntimeException(); }
  static public  void showMillisDistribution (java.lang.String heading, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric, scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics)  { throw new RuntimeException(); }
  static public  long seconds ()  { throw new RuntimeException(); }
  static public  long minutes ()  { throw new RuntimeException(); }
  static public  long hours ()  { throw new RuntimeException(); }
  /**
   * Reformat a time interval in milliseconds to a prettier format for output
   * @param ms (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String millisToString (long ms)  { throw new RuntimeException(); }
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
  public   StatsReportListener ()  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
}
