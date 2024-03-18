package org.apache.spark.ml;
/**
 * Event fired after <code>MLReader.load</code>.
 */
public  class LoadInstanceEnd<T extends java.lang.Object> implements org.apache.spark.ml.MLEvent, scala.Product, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LoadInstanceEnd ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<T> reader ()  { throw new RuntimeException(); }
  public  T instance ()  { throw new RuntimeException(); }
}
