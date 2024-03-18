package org.apache.spark.sql.execution.streaming.state;
/**
 * Class to represent a RocksDB SST file. Since this is converted to JSON,
 * any changes to these MUST be backward-compatible.
 */
  class RocksDBSstFile implements org.apache.spark.sql.execution.streaming.state.RocksDBImmutableFile, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String localFileName ()  { throw new RuntimeException(); }
  public  java.lang.String dfsSstFileName ()  { throw new RuntimeException(); }
  public  long sizeBytes ()  { throw new RuntimeException(); }
  // not preceding
  public   RocksDBSstFile (java.lang.String localFileName, java.lang.String dfsSstFileName, long sizeBytes)  { throw new RuntimeException(); }
  public  java.lang.String dfsFileName ()  { throw new RuntimeException(); }
}
