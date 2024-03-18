package org.apache.spark.scheduler;
public  class FakeTask$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FakeTask$ MODULE$ = null;
  public   FakeTask$ ()  { throw new RuntimeException(); }
  /**
   * Utility method to create a TaskSet, potentially setting a particular sequence of preferred
   * locations for each task (given as varargs) if this sequence is not empty.
   * @param numTasks (undocumented)
   * @param prefLocs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.scheduler.TaskSet createTaskSet (int numTasks, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet createTaskSet (int numTasks, int rpId, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet createTaskSet (int numTasks, int stageId, int stageAttemptId, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet createTaskSet (int numTasks, int stageId, int stageAttemptId, int priority, int rpId, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet createShuffleMapTaskSet (int numTasks, int stageId, int stageAttemptId, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet createShuffleMapTaskSet (int numTasks, int stageId, int stageAttemptId, int priority, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet createBarrierTaskSet (int numTasks, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet createBarrierTaskSet (int numTasks, int rpId, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet createBarrierTaskSet (int numTasks, int stageId, int stageAttemptId, int priority, int rpId, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
}
