package org.apache.spark.storage;
public  class TaskResultBlockId extends org.apache.spark.storage.BlockId implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long taskId ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskResultBlockId (long taskId)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
