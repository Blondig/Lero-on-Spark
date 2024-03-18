package org.apache.spark.ml;
/**
 * Event fired after <code>Transformer.transform</code>.
 */
public  class TransformEnd implements org.apache.spark.ml.MLEvent, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public   TransformEnd ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.Transformer transformer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<?> output ()  { throw new RuntimeException(); }
}
