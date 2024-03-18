package org.apache.spark.deploy.history;
/**
 * This class rejects events which are related to the finished jobs or dead executors,
 * based on the given information. The events which are not related to the job and executor
 * will be considered as "Don't mind".
 */
  class BasicEventFilter extends org.apache.spark.deploy.history.JobEventFilter implements org.apache.spark.internal.Logging {
  public   BasicEventFilter (org.apache.spark.deploy.history.EventFilter.FilterStatistics stats, scala.collection.immutable.Set<java.lang.Object> liveJobs, scala.collection.immutable.Set<java.lang.Object> liveStages, scala.collection.immutable.Set<java.lang.Object> liveTasks, scala.collection.immutable.Set<java.lang.Object> liveRDDs, scala.collection.immutable.Set<java.lang.String> liveExecutors)  { throw new RuntimeException(); }
  public  scala.PartialFunction<org.apache.spark.scheduler.SparkListenerEvent, java.lang.Object> acceptFn ()  { throw new RuntimeException(); }
}
