package org.apache.spark.executor;
  class ProcfsMetrics implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long jvmVmemTotal ()  { throw new RuntimeException(); }
  public  long jvmRSSTotal ()  { throw new RuntimeException(); }
  public  long pythonVmemTotal ()  { throw new RuntimeException(); }
  public  long pythonRSSTotal ()  { throw new RuntimeException(); }
  public  long otherVmemTotal ()  { throw new RuntimeException(); }
  public  long otherRSSTotal ()  { throw new RuntimeException(); }
  // not preceding
  public   ProcfsMetrics (long jvmVmemTotal, long jvmRSSTotal, long pythonVmemTotal, long pythonRSSTotal, long otherVmemTotal, long otherRSSTotal)  { throw new RuntimeException(); }
}
