package org.apache.spark.streaming.ui;
  class OutputOpIdAndSparkJobId implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int outputOpId ()  { throw new RuntimeException(); }
  public  int sparkJobId ()  { throw new RuntimeException(); }
  // not preceding
  public   OutputOpIdAndSparkJobId (int outputOpId, int sparkJobId)  { throw new RuntimeException(); }
}
