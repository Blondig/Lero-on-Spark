package org.apache.spark.scheduler;
public  class SparkListenerStageCompleted implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.StageInfo stageInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerStageCompleted (org.apache.spark.scheduler.StageInfo stageInfo)  { throw new RuntimeException(); }
}
