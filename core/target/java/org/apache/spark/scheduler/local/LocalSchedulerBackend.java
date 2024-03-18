package org.apache.spark.scheduler.local;
/**
 * Used when running a local version of Spark where the executor, backend, and master all run in
 * the same JVM. It sits behind a {@link TaskSchedulerImpl} and handles launching tasks on a single
 * Executor (created by the {@link LocalSchedulerBackend}) running locally.
 */
  class LocalSchedulerBackend implements org.apache.spark.scheduler.SchedulerBackend, org.apache.spark.executor.ExecutorBackend, org.apache.spark.internal.Logging {
  // not preceding
  public   LocalSchedulerBackend (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.TaskSchedulerImpl scheduler, int totalCores)  { throw new RuntimeException(); }
  public  java.lang.String applicationId ()  { throw new RuntimeException(); }
  public  int defaultParallelism ()  { throw new RuntimeException(); }
  /**
   * Returns a list of URLs representing the user classpath.
   * <p>
   * @param conf Spark configuration.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.net.URL> getUserClasspath (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void killTask (long taskId, java.lang.String executorId, boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  public  int maxNumConcurrentTasks (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  public  void reviveOffers ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void statusUpdate (long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer serializedData)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  int totalCores ()  { throw new RuntimeException(); }
}
