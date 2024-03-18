package org.apache.spark.storage;
public  class RandomBlockReplicationPolicy implements org.apache.spark.storage.BlockReplicationPolicy, org.apache.spark.internal.Logging {
  public   RandomBlockReplicationPolicy ()  { throw new RuntimeException(); }
  /**
   * Method to prioritize a bunch of candidate peers of a block. This is a basic implementation,
   * that just makes sure we put blocks on different hosts, if possible
   * <p>
   * @param blockManagerId Id of the current BlockManager for self identification
   * @param peers A list of peers of a BlockManager
   * @param peersReplicatedTo Set of peers already replicated to
   * @param blockId BlockId of the block being replicated. This can be used as a source of
   *                randomness if needed.
   * @param numReplicas Number of peers we need to replicate to
   * @return A prioritized list of peers. Lower the index of a peer, higher its priority
   */
  public  scala.collection.immutable.List<org.apache.spark.storage.BlockManagerId> prioritize (org.apache.spark.storage.BlockManagerId blockManagerId, scala.collection.Seq<org.apache.spark.storage.BlockManagerId> peers, scala.collection.mutable.HashSet<org.apache.spark.storage.BlockManagerId> peersReplicatedTo, org.apache.spark.storage.BlockId blockId, int numReplicas)  { throw new RuntimeException(); }
}
