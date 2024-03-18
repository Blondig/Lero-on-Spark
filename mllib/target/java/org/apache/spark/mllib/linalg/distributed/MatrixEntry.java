package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents an entry in a distributed matrix.
 * param:  i row index
 * param:  j column index
 * param:  value value of the entry
 */
public  class MatrixEntry implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long i ()  { throw new RuntimeException(); }
  public  long j ()  { throw new RuntimeException(); }
  public  double value ()  { throw new RuntimeException(); }
  // not preceding
  public   MatrixEntry (long i, long j, double value)  { throw new RuntimeException(); }
}
