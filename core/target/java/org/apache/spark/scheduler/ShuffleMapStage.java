package org.apache.spark.scheduler;
/**
 * ShuffleMapStages are intermediate stages in the execution DAG that produce data for a shuffle.
 * They occur right before each shuffle operation, and might contain multiple pipelined operations
 * before that (e.g. map and filter). When executed, they save map output files that can later be
 * fetched by reduce tasks. The <code>shuffleDep</code> field describes the shuffle each stage is part of,
 * and variables like <code>outputLocs</code> and <code>numAvailableOutputs</code> track how many map outputs are ready.
 * <p>
 * ShuffleMapStages can also be submitted independently as jobs with DAGScheduler.submitMapStage.
 * For such stages, the ActiveJobs that submitted them are tracked in <code>mapStageJobs</code>. Note that
 * there can be multiple ActiveJobs trying to compute the same shuffle map stage.
 */
  class ShuffleMapStage extends org.apache.spark.scheduler.Stage {
  // not preceding
  public   ShuffleMapStage (int id, org.apache.spark.rdd.RDD<?> rdd, int numTasks, scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents, int firstJobId, org.apache.spark.util.CallSite callSite, org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep, org.apache.spark.MapOutputTrackerMaster mapOutputTrackerMaster, int resourceProfileId)  { throw new RuntimeException(); }
  /** Adds the job to the active job list. */
  public  void addActiveJob (org.apache.spark.scheduler.ActiveJob job)  { throw new RuntimeException(); }
  /** Returns the sequence of partition ids that are missing (i.e. needs to be computed). */
  public  scala.collection.Seq<java.lang.Object> findMissingPartitions ()  { throw new RuntimeException(); }
  /**
   * Returns true if the map stage is ready, i.e. all partitions have shuffle outputs.
   * @return (undocumented)
   */
  public  boolean isAvailable ()  { throw new RuntimeException(); }
  /**
   * Returns the list of active jobs,
   * i.e. map-stage jobs that were submitted to execute this stage independently (if any).
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.scheduler.ActiveJob> mapStageJobs ()  { throw new RuntimeException(); }
  /**
   * Number of partitions that have shuffle outputs.
   * When this reaches {@link numPartitions}, this map stage is ready.
   * @return (undocumented)
   */
  public  int numAvailableOutputs ()  { throw new RuntimeException(); }
  /**
   * Partitions that either haven't yet been computed, or that were computed on an executor
   * that has since been lost, so should be re-computed.  This variable is used by the
   * DAGScheduler to determine when a stage has completed. Task successes in both the active
   * attempt for the stage or in earlier attempts for this stage can cause partition ids to get
   * removed from pendingPartitions. As a result, this variable may be inconsistent with the pending
   * tasks in the TaskSetManager for the active attempt for the stage (the partitions stored here
   * will always be a subset of the partitions that the TaskSetManager thinks are pending).
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashSet<java.lang.Object> pendingPartitions ()  { throw new RuntimeException(); }
  /** Removes the job from the active job list. */
  public  void removeActiveJob (org.apache.spark.scheduler.ActiveJob job)  { throw new RuntimeException(); }
  public  org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
