package org.apache.spark.ml.linalg;
/**
 * A dense vector represented by a value array.
 */
public  class DenseVector implements org.apache.spark.ml.linalg.Vector {
  /** Extracts the value array from a dense vector. */
  static public  scala.Option<double[]> unapply (org.apache.spark.ml.linalg.DenseVector dv)  { throw new RuntimeException(); }
  public  double[] values ()  { throw new RuntimeException(); }
  // not preceding
  public   DenseVector (double[] values)  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  double[] toArray ()  { throw new RuntimeException(); }
    breeze.linalg.Vector<java.lang.Object> asBreeze ()  { throw new RuntimeException(); }
  public  double apply (int i)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector copy ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  int numActives ()  { throw new RuntimeException(); }
  public  int numNonzeros ()  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.SparseVector toSparseWithSize (int nnz)  { throw new RuntimeException(); }
  public  int argmax ()  { throw new RuntimeException(); }
    scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> iterator ()  { throw new RuntimeException(); }
    scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> activeIterator ()  { throw new RuntimeException(); }
}
