package org.apache.spark.streaming.receiver;
/**
 * Implementation of {@link org.apache.spark.streaming.receiver.ReceivedBlockStoreResult}
 * that stores the metadata related to storage of blocks using
 * {@link org.apache.spark.streaming.receiver.WriteAheadLogBasedBlockHandler}
 */
  class WriteAheadLogBasedStoreResult implements org.apache.spark.streaming.receiver.ReceivedBlockStoreResult, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StreamBlockId blockId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numRecords ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.WriteAheadLogRecordHandle walRecordHandle ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteAheadLogBasedStoreResult (org.apache.spark.storage.StreamBlockId blockId, scala.Option<java.lang.Object> numRecords, org.apache.spark.streaming.util.WriteAheadLogRecordHandle walRecordHandle)  { throw new RuntimeException(); }
}
