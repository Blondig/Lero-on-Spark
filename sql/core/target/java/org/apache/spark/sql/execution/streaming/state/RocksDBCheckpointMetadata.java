package org.apache.spark.sql.execution.streaming.state;
/**
 * Classes to represent metadata of checkpoints saved to DFS. Since this is converted to JSON, any
 * changes to this MUST be backward-compatible.
 */
public  class RocksDBCheckpointMetadata implements scala.Product, scala.Serializable {
  static public  int VERSION ()  { throw new RuntimeException(); }
  static public  java.lang.Object format ()  { throw new RuntimeException(); }
  // not preceding
  static public  com.fasterxml.jackson.databind.ObjectMapper mapper ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.RocksDBCheckpointMetadata readFromFile (java.io.File metadataFile)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.RocksDBCheckpointMetadata apply (scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.RocksDBImmutableFile> rocksDBFiles, long numKeys)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.RocksDBSstFile> sstFiles ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.RocksDBLogFile> logFiles ()  { throw new RuntimeException(); }
  public  long numKeys ()  { throw new RuntimeException(); }
  // not preceding
  public   RocksDBCheckpointMetadata (scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.RocksDBSstFile> sstFiles, scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.RocksDBLogFile> logFiles, long numKeys)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  public  void writeToFile (java.io.File metadataFile)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.RocksDBImmutableFile> immutableFiles ()  { throw new RuntimeException(); }
}
