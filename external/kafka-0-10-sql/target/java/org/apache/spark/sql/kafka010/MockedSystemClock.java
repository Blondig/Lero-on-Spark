package org.apache.spark.sql.kafka010;
/**
 * To return a mocked system clock for testing purposes
 */
  class MockedSystemClock extends org.apache.spark.util.ManualClock {
  static public  long currentMockSystemTime ()  { throw new RuntimeException(); }
  static public  void advanceCurrentSystemTime (long advanceByMillis)  { throw new RuntimeException(); }
  static public  void reset ()  { throw new RuntimeException(); }
  public   MockedSystemClock ()  { throw new RuntimeException(); }
  public  long getTimeMillis ()  { throw new RuntimeException(); }
}
