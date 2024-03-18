package org.apache.spark.mllib.recommendation;
/**
 * A more compact class to represent a rating than Tuple3[Int, Int, Double].
 */
public  class Rating implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int user ()  { throw new RuntimeException(); }
  public  int product ()  { throw new RuntimeException(); }
  public  double rating ()  { throw new RuntimeException(); }
  // not preceding
  public   Rating (int user, int product, double rating)  { throw new RuntimeException(); }
}
