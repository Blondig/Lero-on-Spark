package org.apache.spark.ml;
/**
 * Event fired before <code>MLReader.load</code>.
 */
public  class LoadInstanceStart<T extends java.lang.Object> implements org.apache.spark.ml.MLEvent, scala.Product, scala.Serializable {
  public  java.lang.String path ()  { throw new RuntimeException(); }
  // not preceding
  public   LoadInstanceStart (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<T> reader ()  { throw new RuntimeException(); }
}
