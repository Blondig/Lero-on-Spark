package org.apache.spark.storage;
/**
 * Stores block statuses for block IDs but removes the reference to the Map which used for storing
 * the data when all the blocks are removed to avoid keeping the memory when not needed.
 */
  class BlockStatusPerBlockId {
  public   BlockStatusPerBlockId ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.storage.BlockStatus> get (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  void put (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus blockStatus)  { throw new RuntimeException(); }
  public  void remove (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
}
