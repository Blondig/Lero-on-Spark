package org.apache.spark.ml.feature;
public  class TokenizerTestData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String rawText ()  { throw new RuntimeException(); }
  public  java.lang.String[] wantedTokens ()  { throw new RuntimeException(); }
  // not preceding
  public   TokenizerTestData (java.lang.String rawText, java.lang.String[] wantedTokens)  { throw new RuntimeException(); }
  public  java.lang.String getRawText ()  { throw new RuntimeException(); }
  public  java.lang.String[] getWantedTokens ()  { throw new RuntimeException(); }
}
