package org.apache.spark.streaming.api.java;
/**
 * Class having information about a receiver
 */
  class JavaReceiverInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int streamId ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  boolean active ()  { throw new RuntimeException(); }
  public  java.lang.String location ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String lastErrorMessage ()  { throw new RuntimeException(); }
  public  java.lang.String lastError ()  { throw new RuntimeException(); }
  public  long lastErrorTime ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaReceiverInfo (int streamId, java.lang.String name, boolean active, java.lang.String location, java.lang.String executorId, java.lang.String lastErrorMessage, java.lang.String lastError, long lastErrorTime)  { throw new RuntimeException(); }
}
