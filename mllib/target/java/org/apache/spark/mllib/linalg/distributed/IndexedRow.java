package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents a row of {@link org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix}.
 */
public  class IndexedRow implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long index ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector vector ()  { throw new RuntimeException(); }
  // not preceding
  public   IndexedRow (long index, org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
}
