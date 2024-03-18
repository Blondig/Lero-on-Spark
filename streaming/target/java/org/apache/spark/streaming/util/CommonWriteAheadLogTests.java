package org.apache.spark.streaming.util;
/** Common tests for WriteAheadLogs that we would like to test with different configurations. */
public abstract class CommonWriteAheadLogTests extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter {
  public   CommonWriteAheadLogTests (boolean allowBatching, boolean closeFileAfterWrite, java.lang.String testTag)  { throw new RuntimeException(); }
  protected  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  protected  java.io.File tempDir ()  { throw new RuntimeException(); }
  protected  java.lang.String testDir ()  { throw new RuntimeException(); }
  protected  java.lang.String testFile ()  { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.util.WriteAheadLog writeAheadLog ()  { throw new RuntimeException(); }
  protected  java.lang.String testPrefix ()  { throw new RuntimeException(); }
}
