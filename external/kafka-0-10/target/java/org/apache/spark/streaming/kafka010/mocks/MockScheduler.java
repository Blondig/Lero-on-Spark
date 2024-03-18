package org.apache.spark.streaming.kafka010.mocks;
/**
 * A mock scheduler that executes tasks synchronously using a mock time instance.
 * Tasks are executed synchronously when the time is advanced.
 * This class is meant to be used in conjunction with MockTime.
 * <p>
 * Example usage
 * <code>
 *   val time = new MockTime
 *   time.scheduler.schedule("a task", println("hello world: " + time.milliseconds), delay = 1000)
 *   time.sleep(1001) // this should cause our scheduled task to fire
 * </code>
 * <p>
 * Incrementing the time to the exact next execution time of a task will result in that task
 * executing (it as if execution itself takes no time).
 */
  class MockScheduler implements kafka.utils.Scheduler {
  // not preceding
  public   MockScheduler (org.apache.kafka.common.utils.Time time)  { throw new RuntimeException(); }
  public  boolean isStarted ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ScheduledFuture<?> schedule (java.lang.String name, scala.Function0<scala.runtime.BoxedUnit> fun, long delay, long period, java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  public  org.jmock.lib.concurrent.DeterministicScheduler scheduler ()  { throw new RuntimeException(); }
  public  void shutdown ()  { throw new RuntimeException(); }
  public  void startup ()  { throw new RuntimeException(); }
  public  void tick (long duration, java.util.concurrent.TimeUnit timeUnit)  { throw new RuntimeException(); }
  public  org.apache.kafka.common.utils.Time time ()  { throw new RuntimeException(); }
}
