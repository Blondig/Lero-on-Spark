package org.apache.spark;
/**
 * Class to test whether RDDs, shuffles, etc. have been successfully cleaned.
 * The checkpoint here refers only to normal (reliable) checkpoints, not local checkpoints.
 */
public  class CleanerTester implements org.apache.spark.internal.Logging {
  public   CleanerTester (org.apache.spark.SparkContext sc, scala.collection.Seq<java.lang.Object> rddIds, scala.collection.Seq<java.lang.Object> shuffleIds, scala.collection.Seq<java.lang.Object> broadcastIds, scala.collection.Seq<java.lang.Object> checkpointIds)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.Object> toBeCleanedRDDIds ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.Object> toBeCleanedShuffleIds ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.Object> toBeCleanedBroadcastIds ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.Object> toBeCheckpointIds ()  { throw new RuntimeException(); }
  public  boolean isDistributed ()  { throw new RuntimeException(); }
  public  java.lang.Object cleanerListener ()  { throw new RuntimeException(); }
  public  int MAX_VALIDATION_ATTEMPTS ()  { throw new RuntimeException(); }
  public  int VALIDATION_ATTEMPT_INTERVAL ()  { throw new RuntimeException(); }
  /** Assert that all the stuff has been cleaned up */
  public  void assertCleanup (org.scalatest.concurrent.PatienceConfiguration.Timeout waitTimeout)  { throw new RuntimeException(); }
}
