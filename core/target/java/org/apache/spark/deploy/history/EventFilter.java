package org.apache.spark.deploy.history;
/** {@link EventFilter} decides whether the given event should be accepted or rejected. */
public  interface EventFilter {
  static public  class FilterStatistics implements scala.Product, scala.Serializable {
    public  long totalJobs ()  { throw new RuntimeException(); }
    public  long liveJobs ()  { throw new RuntimeException(); }
    public  long totalStages ()  { throw new RuntimeException(); }
    public  long liveStages ()  { throw new RuntimeException(); }
    public  long totalTasks ()  { throw new RuntimeException(); }
    public  long liveTasks ()  { throw new RuntimeException(); }
    // not preceding
    public   FilterStatistics (long totalJobs, long liveJobs, long totalStages, long liveStages, long totalTasks, long liveTasks)  { throw new RuntimeException(); }
  }
  static public  class FilterStatistics$ extends scala.runtime.AbstractFunction6<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.deploy.history.EventFilter.FilterStatistics> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FilterStatistics$ MODULE$ = null;
    public   FilterStatistics$ ()  { throw new RuntimeException(); }
  }
  /**
   * Provide statistic information of event filter, which would be used for measuring the score
   * of compaction.
   * <p>
   * To simplify the condition, currently the fields of statistic are static, since major kinds of
   * events compaction would filter out are job related event types. If the filter doesn't track
   * with job related events, return None instead.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.deploy.history.EventFilter.FilterStatistics> statistics ()  ;
  /**
   * Classify whether the event is accepted or rejected by this filter.
   * <p>
   * The method should return the partial function which matches the events where the filter can
   * decide whether the event should be accepted or rejected. Otherwise it should leave the events
   * be unmatched.
   * @return (undocumented)
   */
  public  scala.PartialFunction<org.apache.spark.scheduler.SparkListenerEvent, java.lang.Object> acceptFn ()  ;
}
