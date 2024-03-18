package org.apache.spark.streaming.ui;
  class SparkJobIdWithUIData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int sparkJobId ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.JobData> jobData ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkJobIdWithUIData (int sparkJobId, scala.Option<org.apache.spark.status.api.v1.JobData> jobData)  { throw new RuntimeException(); }
}
