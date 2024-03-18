package org.apache.spark.sql.execution.streaming.state;
/** Helper class for {@link RocksDBCheckpointMetadata} */
public  class RocksDBCheckpointMetadata$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RocksDBCheckpointMetadata$ MODULE$ = null;
  public   RocksDBCheckpointMetadata$ ()  { throw new RuntimeException(); }
  public  int VERSION ()  { throw new RuntimeException(); }
  public  java.lang.Object format ()  { throw new RuntimeException(); }
  // not preceding
  public  com.fasterxml.jackson.databind.ObjectMapper mapper ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.RocksDBCheckpointMetadata readFromFile (java.io.File metadataFile)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.RocksDBCheckpointMetadata apply (scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.RocksDBImmutableFile> rocksDBFiles, long numKeys)  { throw new RuntimeException(); }
}
