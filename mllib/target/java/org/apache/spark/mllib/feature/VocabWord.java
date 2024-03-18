package org.apache.spark.mllib.feature;
/**
 *  Entry in vocabulary
 */
public  class VocabWord implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String word ()  { throw new RuntimeException(); }
  public  long cn ()  { throw new RuntimeException(); }
  public  int[] point ()  { throw new RuntimeException(); }
  public  int[] code ()  { throw new RuntimeException(); }
  public  int codeLen ()  { throw new RuntimeException(); }
  // not preceding
  public   VocabWord (java.lang.String word, long cn, int[] point, int[] code, int codeLen)  { throw new RuntimeException(); }
}
