package org.apache.spark.sql.execution.streaming.state;
public  class AcquiredThreadInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  public   AcquiredThreadInfo ()  { throw new RuntimeException(); }
  public  scala.ref.WeakReference<java.lang.Thread> threadRef ()  { throw new RuntimeException(); }
  public  org.apache.spark.TaskContext tc ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
