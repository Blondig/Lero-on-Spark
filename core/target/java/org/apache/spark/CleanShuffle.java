package org.apache.spark;
public  class CleanShuffle implements org.apache.spark.CleanupTask, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  // not preceding
  public   CleanShuffle (int shuffleId)  { throw new RuntimeException(); }
}
