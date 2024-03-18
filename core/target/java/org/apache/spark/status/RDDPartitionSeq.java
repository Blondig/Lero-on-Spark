package org.apache.spark.status;
/**
 * A custom sequence of partitions based on a mutable linked list.
 * <p>
 * The external interface is an immutable Seq, which is thread-safe for traversal. There are no
 * guarantees about consistency though - iteration might return elements that have been removed
 * or miss added elements.
 * <p>
 * Internally, the sequence is mutable, and elements can modify the data they expose. Additions and
 * removals are O(1). It is not safe to do multiple writes concurrently.
 */
public  class RDDPartitionSeq implements scala.collection.Seq<org.apache.spark.status.api.v1.RDDPartitionInfo> {
  public   RDDPartitionSeq ()  { throw new RuntimeException(); }
  public  void addPartition (org.apache.spark.status.LiveRDDPartition part)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.RDDPartitionInfo apply (int idx)  { throw new RuntimeException(); }
  public  int count ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.RDDPartitionInfo> iterator ()  { throw new RuntimeException(); }
  public  int length ()  { throw new RuntimeException(); }
  public  void removePartition (org.apache.spark.status.LiveRDDPartition part)  { throw new RuntimeException(); }
}
