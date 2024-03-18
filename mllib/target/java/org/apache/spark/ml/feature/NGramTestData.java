package org.apache.spark.ml.feature;
public  class NGramTestData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String[] inputTokens ()  { throw new RuntimeException(); }
  public  java.lang.String[] wantedNGrams ()  { throw new RuntimeException(); }
  // not preceding
  public   NGramTestData (java.lang.String[] inputTokens, java.lang.String[] wantedNGrams)  { throw new RuntimeException(); }
  public  java.lang.String[] getInputTokens ()  { throw new RuntimeException(); }
  public  java.lang.String[] getWantedNGrams ()  { throw new RuntimeException(); }
}
