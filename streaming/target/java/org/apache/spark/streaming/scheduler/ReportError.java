package org.apache.spark.streaming.scheduler;
  class ReportError implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int streamId ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  public  java.lang.String error ()  { throw new RuntimeException(); }
  // not preceding
  public   ReportError (int streamId, java.lang.String message, java.lang.String error)  { throw new RuntimeException(); }
}
