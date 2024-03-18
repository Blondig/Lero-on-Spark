package org.apache.spark.scheduler;
/**
 * Set of pending tasks for various levels of locality: executor, host, rack,
 * noPrefs and anyPrefs. These collections are actually
 * treated as stacks, in which new tasks are added to the end of the
 * ArrayBuffer and removed from the end. This makes it faster to detect
 * tasks that repeatedly fail because whenever a task failed, it is put
 * back at the head of the stack. These collections may contain duplicates
 * for two reasons:
 * (1): Tasks are only removed lazily; when a task is launched, it remains
 * in all the pending lists except the one that it was launched from.
 * (2): Tasks may be re-added to these lists multiple times as a result
 * of failures.
 * Duplicates are handled in dequeueTaskFromList, which ensures that a
 * task hasn't already started running before launching it.
 */
  class PendingTasksByLocality {
  public   PendingTasksByLocality ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.lang.Object> all ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.ArrayBuffer<java.lang.Object>> forExecutor ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.ArrayBuffer<java.lang.Object>> forHost ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.ArrayBuffer<java.lang.Object>> forRack ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.lang.Object> noPrefs ()  { throw new RuntimeException(); }
}
