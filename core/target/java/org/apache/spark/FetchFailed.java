package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Task failed to fetch shuffle data from a remote node. Probably means we have lost the remote
 * executors the task is trying to fetch from, and thus need to rerun the previous stage.
 */
public  class FetchFailed implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId bmAddress ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  long mapId ()  { throw new RuntimeException(); }
  public  int mapIndex ()  { throw new RuntimeException(); }
  public  int reduceId ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  // not preceding
  public   FetchFailed (org.apache.spark.storage.BlockManagerId bmAddress, int shuffleId, long mapId, int mapIndex, int reduceId, java.lang.String message)  { throw new RuntimeException(); }
  public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
  /**
   * Fetch failures lead to a different failure handling path: (1) we don't abort the stage after
   * 4 task failures, instead we immediately go back to the stage which generated the map output,
   * and regenerate the missing data. (2) we don't count fetch failures from executors excluded
   * due to too many task failures, since presumably its not the fault of the executor where
   * the task ran, but the executor which stored the data. This is especially important because
   * we might rack up a bunch of fetch-failures in rapid succession, on all nodes of the cluster,
   * due to one bad node.
   * @return (undocumented)
   */
  public  boolean countTowardsTaskFailures ()  { throw new RuntimeException(); }
}
