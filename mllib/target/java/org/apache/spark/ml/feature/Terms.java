package org.apache.spark.ml.feature;
  class Terms implements org.apache.spark.ml.feature.Term, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ml.feature.Term> terms ()  { throw new RuntimeException(); }
  // not preceding
  public   Terms (scala.collection.Seq<org.apache.spark.ml.feature.Term> terms)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Terms asTerms ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Term interact (org.apache.spark.ml.feature.Term other)  { throw new RuntimeException(); }
}
