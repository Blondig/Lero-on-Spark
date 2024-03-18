package org.apache.spark.streaming.scheduler;
/**
 * This class schedules jobs to be run on Spark. It uses the JobGenerator to generate
 * the jobs and runs them using a thread pool.
 */
  class JobScheduler implements org.apache.spark.internal.Logging {
  static public  java.lang.String BATCH_TIME_PROPERTY_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String OUTPUT_OP_ID_PROPERTY_KEY ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  // not preceding
  public   JobScheduler (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
    org.apache.spark.streaming.scheduler.JobGenerator jobGenerator ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.StreamingListenerBus listenerBus ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.ReceiverTracker receiverTracker ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.InputInfoTracker inputInfoTracker ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop (boolean processAllReceivedData)  { throw new RuntimeException(); }
  public  void submitJobSet (org.apache.spark.streaming.scheduler.JobSet jobSet)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.Time> getPendingTimes ()  { throw new RuntimeException(); }
  public  void reportError (java.lang.String msg, java.lang.Throwable e)  { throw new RuntimeException(); }
  public  boolean isStarted ()  { throw new RuntimeException(); }
}
