package org.apache.spark.ml.feature;
/**
 * Represents a fully evaluated and simplified R formula.
 * param:  label the column name of the R formula label (response variable).
 * param:  terms the simplified terms of the R formula. Interactions terms are represented as Seqs
 *              of column names; non-interaction terms as length 1 Seqs.
 * param:  hasIntercept whether the formula specifies fitting with an intercept.
 */
  class ResolvedRFormula implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  public  java.lang.String label ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<java.lang.String>> terms ()  { throw new RuntimeException(); }
  public  boolean hasIntercept ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolvedRFormula (java.lang.String label, scala.collection.Seq<scala.collection.Seq<java.lang.String>> terms, boolean hasIntercept)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
