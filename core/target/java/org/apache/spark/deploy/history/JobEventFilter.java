package org.apache.spark.deploy.history;
/**
 * This class provides the functionality to reject events which are related to the finished
 * jobs based on the given information. This class only deals with job related events, and provides
 * a PartialFunction which returns false for rejected events for finished jobs, returns true
 * otherwise.
 */
 abstract class JobEventFilter implements org.apache.spark.deploy.history.EventFilter, org.apache.spark.internal.Logging {
  public   JobEventFilter (scala.Option<org.apache.spark.deploy.history.EventFilter.FilterStatistics> stats, scala.collection.immutable.Set<java.lang.Object> liveJobs, scala.collection.immutable.Set<java.lang.Object> liveStages, scala.collection.immutable.Set<java.lang.Object> liveTasks, scala.collection.immutable.Set<java.lang.Object> liveRDDs)  { throw new RuntimeException(); }
  protected  scala.PartialFunction<org.apache.spark.scheduler.SparkListenerEvent, java.lang.Object> acceptFnForJobEvents ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.deploy.history.EventFilter.FilterStatistics> statistics ()  { throw new RuntimeException(); }
}
