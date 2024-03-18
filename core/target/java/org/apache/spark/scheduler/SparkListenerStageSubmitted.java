package org.apache.spark.scheduler;
public  class SparkListenerStageSubmitted implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.StageInfo stageInfo ()  { throw new RuntimeException(); }
  public  java.util.Properties properties ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerStageSubmitted (org.apache.spark.scheduler.StageInfo stageInfo, java.util.Properties properties)  { throw new RuntimeException(); }
}
