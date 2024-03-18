package org.apache.spark.deploy.history;
/**
 * Tracking info for event logs detected in the configured log directory. Tracks both valid and
 * invalid logs (e.g. unparseable logs, recorded as logs with no app ID) so that the cleaner
 * can know what log files are safe to delete.
 */
  class LogInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String logPath ()  { throw new RuntimeException(); }
  public  long lastProcessed ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value logType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> attemptId ()  { throw new RuntimeException(); }
  public  long fileSize ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> lastIndex ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> lastEvaluatedForCompaction ()  { throw new RuntimeException(); }
  public  boolean isComplete ()  { throw new RuntimeException(); }
  // not preceding
  public   LogInfo (java.lang.String logPath, long lastProcessed, scala.Enumeration.Value logType, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> attemptId, long fileSize, scala.Option<java.lang.Object> lastIndex, scala.Option<java.lang.Object> lastEvaluatedForCompaction, boolean isComplete)  { throw new RuntimeException(); }
}
