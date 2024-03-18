package org.apache.spark.ml;
/**
 * Event fired before <code>Transformer.transform</code>.
 */
public  class TransformStart implements org.apache.spark.ml.MLEvent, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public   TransformStart ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.Transformer transformer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<?> input ()  { throw new RuntimeException(); }
}
