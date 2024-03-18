package org.apache.spark.shuffle;
/**
 * Failed to fetch a shuffle block. The executor catches this exception and propagates it
 * back to DAGScheduler (through TaskEndReason) so we'd resubmit the previous stage.
 * <p>
 * Note that bmAddress can be null.
 * <p>
 * To prevent user code from hiding this fetch failure, in the constructor we call
 * {@link TaskContext.setFetchFailed()}.  This means that you *must* throw this exception immediately
 * after creating it -- you cannot create it, check some condition, and then decide to ignore it
 * (or risk triggering any other exceptions).  See SPARK-19276.
 */
  class FetchFailedException extends java.lang.Exception {
  public   FetchFailedException (org.apache.spark.storage.BlockManagerId bmAddress, int shuffleId, long mapId, int mapIndex, int reduceId, java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public   FetchFailedException (org.apache.spark.storage.BlockManagerId bmAddress, int shuffleId, long mapTaskId, int mapIndex, int reduceId, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  org.apache.spark.TaskFailedReason toTaskFailedReason ()  { throw new RuntimeException(); }
}
