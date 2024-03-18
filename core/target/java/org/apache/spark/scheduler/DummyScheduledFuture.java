package org.apache.spark.scheduler;
public  class DummyScheduledFuture implements java.util.concurrent.ScheduledFuture<java.lang.Object> {
  // not preceding
  public   DummyScheduledFuture (long delay, boolean registerMergeResults)  { throw new RuntimeException(); }
  public  boolean cancel (boolean mayInterruptIfRunning)  { throw new RuntimeException(); }
  public  int compareTo (java.util.concurrent.Delayed o)  { throw new RuntimeException(); }
  public  long delay ()  { throw new RuntimeException(); }
  public  int get (long timeout, java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  public  int get ()  { throw new RuntimeException(); }
  public  long getDelay (java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  public  boolean isCancelled ()  { throw new RuntimeException(); }
  public  boolean isDone ()  { throw new RuntimeException(); }
  public  boolean registerMergeResults ()  { throw new RuntimeException(); }
}
