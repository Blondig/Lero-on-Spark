package org.apache.spark.rdd;
  class BlockRDDPartition implements org.apache.spark.Partition {
  // not preceding
  public   BlockRDDPartition (org.apache.spark.storage.BlockId blockId, int idx)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
}
