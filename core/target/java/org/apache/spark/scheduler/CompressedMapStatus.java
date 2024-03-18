package org.apache.spark.scheduler;
/**
 * A {@link MapStatus} implementation that tracks the size of each block. Size for each block is
 * represented using a single byte.
 * <p>
 * param:  loc location where the task is being executed.
 * param:  compressedSizes size of the blocks, indexed by reduce partition id.
 * param:  _mapTaskId unique task id for the task
 */
  class CompressedMapStatus implements org.apache.spark.scheduler.MapStatus, java.io.Externalizable {
  public   CompressedMapStatus (org.apache.spark.storage.BlockManagerId loc, byte[] compressedSizes, long _mapTaskId)  { throw new RuntimeException(); }
  protected   CompressedMapStatus ()  { throw new RuntimeException(); }
  public   CompressedMapStatus (org.apache.spark.storage.BlockManagerId loc, long[] uncompressedSizes, long mapTaskId)  { throw new RuntimeException(); }
  public  long getSizeForBlock (int reduceId)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId location ()  { throw new RuntimeException(); }
  public  long mapId ()  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  public  void updateLocation (org.apache.spark.storage.BlockManagerId newLoc)  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
}
