package org.apache.spark.scheduler;
/**
 * Test whether EventLoggingListener logs events properly.
 * <p>
 * This tests whether EventLoggingListener actually log files with expected name patterns while
 * logging events, whether the parsing of the file names is correct, and whether the logged events
 * can be read and deserialized into actual SparkListenerEvents.
 */
public  class EventLoggingListenerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfter, org.apache.spark.internal.Logging {
  public   EventLoggingListenerSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
