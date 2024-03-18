package org.apache.spark.rdd.util;
/**
 * This class helps with persisting and checkpointing RDDs.
 * Specifically, it automatically handles persisting and (optionally) checkpointing, as well as
 * unpersisting and removing checkpoint files.
 * <p>
 * Users should call update() when a new RDD has been created,
 * before the RDD has been materialized.  After updating {@link PeriodicRDDCheckpointer}, users are
 * responsible for materializing the RDD to ensure that persisting and checkpointing actually
 * occur.
 * <p>
 * When update() is called, this does the following:
 *  - Persist new RDD (if not yet persisted), and put in queue of persisted RDDs.
 *  - Unpersist RDDs from queue until there are at most 3 persisted RDDs.
 *  - If using checkpointing and the checkpoint interval has been reached,
 *     - Checkpoint the new RDD, and put in a queue of checkpointed RDDs.
 *     - Remove older checkpoints.
 * <p>
 * WARNINGS:
 *  - This class should NOT be copied (since copies may conflict on which RDDs should be
 *    checkpointed).
 *  - This class removes checkpoint files once later RDDs have been checkpointed.
 *    However, references to the older RDDs will still return isCheckpointed = true.
 * <p>
 * Example usage:
 * <pre><code>
 *  val (rdd1, rdd2, rdd3, ...) = ...
 *  val cp = new PeriodicRDDCheckpointer(2, sc)
 *  cp.update(rdd1)
 *  rdd1.count();
 *  // persisted: rdd1
 *  cp.update(rdd2)
 *  rdd2.count();
 *  // persisted: rdd1, rdd2
 *  // checkpointed: rdd2
 *  cp.update(rdd3)
 *  rdd3.count();
 *  // persisted: rdd1, rdd2, rdd3
 *  // checkpointed: rdd2
 *  cp.update(rdd4)
 *  rdd4.count();
 *  // persisted: rdd2, rdd3, rdd4
 *  // checkpointed: rdd4
 *  cp.update(rdd5)
 *  rdd5.count();
 *  // persisted: rdd3, rdd4, rdd5
 *  // checkpointed: rdd4
 * </code></pre>
 * <p>
 * param:  checkpointInterval  RDDs will be checkpointed at this interval
 * @param <T>   RDD element type
 */
  class PeriodicRDDCheckpointer<T extends java.lang.Object> extends org.apache.spark.util.PeriodicCheckpointer<org.apache.spark.rdd.RDD<T>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PeriodicRDDCheckpointer (int checkpointInterval, org.apache.spark.SparkContext sc, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  public   PeriodicRDDCheckpointer (int checkpointInterval, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  protected  void checkpoint (org.apache.spark.rdd.RDD<T> data)  { throw new RuntimeException(); }
  protected  scala.collection.Iterable<java.lang.String> getCheckpointFiles (org.apache.spark.rdd.RDD<T> data)  { throw new RuntimeException(); }
  protected  boolean isCheckpointed (org.apache.spark.rdd.RDD<T> data)  { throw new RuntimeException(); }
  protected  void persist (org.apache.spark.rdd.RDD<T> data)  { throw new RuntimeException(); }
  protected  void unpersist (org.apache.spark.rdd.RDD<T> data)  { throw new RuntimeException(); }
}
