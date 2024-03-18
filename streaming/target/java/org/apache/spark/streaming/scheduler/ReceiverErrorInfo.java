package org.apache.spark.streaming.scheduler;
  class ReceiverErrorInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String lastErrorMessage ()  { throw new RuntimeException(); }
  public  java.lang.String lastError ()  { throw new RuntimeException(); }
  public  long lastErrorTime ()  { throw new RuntimeException(); }
  // not preceding
  public   ReceiverErrorInfo (java.lang.String lastErrorMessage, java.lang.String lastError, long lastErrorTime)  { throw new RuntimeException(); }
}
