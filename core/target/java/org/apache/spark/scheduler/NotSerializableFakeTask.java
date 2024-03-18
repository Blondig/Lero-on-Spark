package org.apache.spark.scheduler;
/**
 * A Task implementation that fails to serialize.
 */
  class NotSerializableFakeTask extends org.apache.spark.scheduler.Task<byte[]> {
  public   NotSerializableFakeTask (int myId, int stageId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocations ()  { throw new RuntimeException(); }
  public  byte[] runTask (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
