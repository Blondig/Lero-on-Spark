package org.apache.spark.scheduler.cluster;
public  class SchedulerBackendUtils {
  static public  int DEFAULT_NUMBER_EXECUTORS ()  { throw new RuntimeException(); }
  /**
   * Getting the initial target number of executors depends on whether dynamic allocation is
   * enabled.
   * If not using dynamic allocation it gets the number of executors requested by the user.
   * @param conf (undocumented)
   * @param numExecutors (undocumented)
   * @return (undocumented)
   */
  static public  int getInitialTargetExecutorNumber (org.apache.spark.SparkConf conf, int numExecutors)  { throw new RuntimeException(); }
}
