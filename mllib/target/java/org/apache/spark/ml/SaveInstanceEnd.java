package org.apache.spark.ml;
/**
 * Event fired after <code>MLWriter.save</code>.
 */
public  class SaveInstanceEnd implements org.apache.spark.ml.MLEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String path ()  { throw new RuntimeException(); }
  // not preceding
  public   SaveInstanceEnd (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter writer ()  { throw new RuntimeException(); }
}
