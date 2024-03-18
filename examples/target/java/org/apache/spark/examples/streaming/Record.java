package org.apache.spark.examples.streaming;
/** Case class for converting RDD to DataFrame */
public  class Record implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String word ()  { throw new RuntimeException(); }
  // not preceding
  public   Record (java.lang.String word)  { throw new RuntimeException(); }
}
