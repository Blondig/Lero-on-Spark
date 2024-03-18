package org.apache.spark.ui.storage;
  class BlockTableRowData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String blockName ()  { throw new RuntimeException(); }
  public  java.lang.String storageLevel ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  public  java.lang.String executors ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockTableRowData (java.lang.String blockName, java.lang.String storageLevel, long memoryUsed, long diskUsed, java.lang.String executors)  { throw new RuntimeException(); }
}
