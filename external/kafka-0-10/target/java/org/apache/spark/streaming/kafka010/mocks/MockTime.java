package org.apache.spark.streaming.kafka010.mocks;
/**
 * A class used for unit testing things which depend on the Time interface.
 * <p>
 * This class never manually advances the clock, it only does so when you call
 *   sleep(ms)
 * <p>
 * It also comes with an associated scheduler instance for managing background tasks in
 * a deterministic way.
 */
  class MockTime implements org.apache.kafka.common.utils.Time {
  // not preceding
  public   MockTime (long currentMs)  { throw new RuntimeException(); }
  public   MockTime ()  { throw new RuntimeException(); }
  public  long hiResClockMs ()  { throw new RuntimeException(); }
  public  long milliseconds ()  { throw new RuntimeException(); }
  public  long nanoseconds ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka010.mocks.MockScheduler scheduler ()  { throw new RuntimeException(); }
  public  void sleep (long ms)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  void waitObject (Object obj, java.util.function.Supplier<java.lang.Boolean> condition, long timeoutMs)  { throw new RuntimeException(); }
}
