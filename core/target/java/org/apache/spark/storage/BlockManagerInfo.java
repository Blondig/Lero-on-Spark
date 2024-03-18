package org.apache.spark.storage;
  class BlockManagerInfo implements org.apache.spark.internal.Logging {
  // not preceding
  public   BlockManagerInfo (org.apache.spark.storage.BlockManagerId blockManagerId, long timeMs, long maxOnHeapMem, long maxOffHeapMem, org.apache.spark.rpc.RpcEndpointRef storageEndpoint, scala.Option<org.apache.spark.storage.BlockStatusPerBlockId> externalShuffleServiceBlockStatus)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  public  java.util.HashMap<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> blocks ()  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.storage.BlockStatusPerBlockId> externalShuffleServiceBlockStatus ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.storage.BlockStatus> getStatus (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  long lastSeenMs ()  { throw new RuntimeException(); }
  public  long maxMem ()  { throw new RuntimeException(); }
  public  long maxOffHeapMem ()  { throw new RuntimeException(); }
  public  long maxOnHeapMem ()  { throw new RuntimeException(); }
  public  long remainingMem ()  { throw new RuntimeException(); }
  public  void removeBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef storageEndpoint ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  void updateBlockInfo (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize)  { throw new RuntimeException(); }
  public  void updateLastSeenMs ()  { throw new RuntimeException(); }
}
