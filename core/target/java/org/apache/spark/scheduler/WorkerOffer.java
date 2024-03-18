package org.apache.spark.scheduler;
/**
 * Represents free resources available on an executor.
 */
  class WorkerOffer implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> address ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, scala.collection.mutable.Buffer<java.lang.String>> resources ()  { throw new RuntimeException(); }
  public  int resourceProfileId ()  { throw new RuntimeException(); }
  // not preceding
  public   WorkerOffer (java.lang.String executorId, java.lang.String host, int cores, scala.Option<java.lang.String> address, scala.collection.immutable.Map<java.lang.String, scala.collection.mutable.Buffer<java.lang.String>> resources, int resourceProfileId)  { throw new RuntimeException(); }
}
