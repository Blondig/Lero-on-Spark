package org.apache.spark.util.collection;
/**
 * A dummy class that always returns the same hash code, to easily test hash collisions
 */
public  class FixedHashObject implements scala.Serializable, scala.Product {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int v ()  { throw new RuntimeException(); }
  public  int h ()  { throw new RuntimeException(); }
  // not preceding
  public   FixedHashObject (int v, int h)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
}
