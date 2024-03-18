package org.apache.spark.storage;
public  interface BlockManagerReplicationBehavior extends org.scalatest.matchers.must.Matchers, org.scalatest.BeforeAndAfter, org.apache.spark.LocalSparkContext {
  public  org.apache.spark.storage.BlockId StringToBlockId (java.lang.String value)  ;
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.storage.BlockManager> allStores ()  ;
  public  org.apache.spark.broadcast.BroadcastManager bcastManager ()  ;
  public  org.apache.spark.SparkConf conf ()  ;
  public  org.apache.spark.storage.BlockManager makeBlockManager (long maxMem, java.lang.String name, scala.Option<org.apache.spark.memory.UnifiedMemoryManager> memoryManager)  ;
  public  org.apache.spark.MapOutputTrackerMaster mapOutputTracker ()  ;
  public  org.apache.spark.storage.BlockManagerMaster master ()  ;
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  ;
  public  org.apache.spark.SecurityManager securityMgr ()  ;
  public  org.apache.spark.serializer.KryoSerializer serializer ()  ;
  public  org.apache.spark.shuffle.sort.SortShuffleManager shuffleManager ()  ;
  /**
   * Test replication of blocks with different storage levels (various combinations of
   * memory, disk &amp; serialization). For each storage level, this function tests every store
   * whether the block is present and also tests the master whether its knowledge of blocks
   * is correct. Then it also drops the block from memory of each store (using LRU) and
   * again checks whether the master's knowledge gets updated.
   * @param maxReplication (undocumented)
   * @param storageLevels (undocumented)
   */
  public  void testReplication (int maxReplication, scala.collection.Seq<org.apache.spark.storage.StorageLevel> storageLevels)  ;
}
