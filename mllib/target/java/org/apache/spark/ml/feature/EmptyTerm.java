package org.apache.spark.ml.feature;
/** Placeholder term for the result of undefined interactions, e.g. '1:1' or 'a:1' */
public  class EmptyTerm {
  static public  org.apache.spark.ml.feature.Terms asTerms ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Term add (org.apache.spark.ml.feature.Term other)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Term subtract (org.apache.spark.ml.feature.Term other)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Term interact (org.apache.spark.ml.feature.Term other)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
