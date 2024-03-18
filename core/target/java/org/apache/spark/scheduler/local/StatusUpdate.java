package org.apache.spark.scheduler.local;
public  class StatusUpdate implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long taskId ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer serializedData ()  { throw new RuntimeException(); }
  // not preceding
  public   StatusUpdate (long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer serializedData)  { throw new RuntimeException(); }
}
