package org.apache.spark.scheduler;
/**
 * Small helper for tracking failed tasks for exclusion purposes.  Info on all failures on one
 * executor, within one task set.
 */
  class ExecutorFailuresInTaskSet {
  // not preceding
  public   ExecutorFailuresInTaskSet (java.lang.String node)  { throw new RuntimeException(); }
  /**
   * Return the number of times this executor has failed on the given task index.
   * @param index (undocumented)
   * @return (undocumented)
   */
  public  int getNumTaskFailures (int index)  { throw new RuntimeException(); }
  public  java.lang.String node ()  { throw new RuntimeException(); }
  public  int numUniqueTasksWithFailures ()  { throw new RuntimeException(); }
  /**
   * Mapping from index of the tasks in the taskset, to the number of times it has failed on this
   * executor and the most recent failure time.
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<java.lang.Object, scala.Tuple2<java.lang.Object, java.lang.Object>> taskToFailureCountAndFailureTime ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  void updateWithFailure (int taskIndex, long failureTime)  { throw new RuntimeException(); }
}
