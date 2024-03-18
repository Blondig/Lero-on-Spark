package org.apache.spark.streaming.util;
public  class WriteAheadLogUtilsSuite extends org.apache.spark.SparkFunSuite {
  static public  class MockWriteAheadLog0 extends org.apache.spark.streaming.util.WriteAheadLog {
    public   MockWriteAheadLog0 ()  { throw new RuntimeException(); }
    public  void clean (long threshTime, boolean waitForCompletion)  { throw new RuntimeException(); }
    public  void close ()  { throw new RuntimeException(); }
    public  java.nio.ByteBuffer read (org.apache.spark.streaming.util.WriteAheadLogRecordHandle handle)  { throw new RuntimeException(); }
    public  java.util.Iterator<java.nio.ByteBuffer> readAll ()  { throw new RuntimeException(); }
    public  org.apache.spark.streaming.util.WriteAheadLogRecordHandle write (java.nio.ByteBuffer record, long time)  { throw new RuntimeException(); }
  }
  static public  class MockWriteAheadLog1 extends org.apache.spark.streaming.util.WriteAheadLogUtilsSuite.MockWriteAheadLog0 {
    // not preceding
    public   MockWriteAheadLog1 (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  }
  static public  class MockWriteAheadLog2 extends org.apache.spark.streaming.util.WriteAheadLogUtilsSuite.MockWriteAheadLog0 {
    // not preceding
    public   MockWriteAheadLog2 (org.apache.spark.SparkConf conf, int x)  { throw new RuntimeException(); }
    public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  }
  public   WriteAheadLogUtilsSuite ()  { throw new RuntimeException(); }
  public <T extends org.apache.spark.streaming.util.WriteAheadLog> org.apache.spark.streaming.util.WriteAheadLog assertDriverLogClass (org.apache.spark.SparkConf conf, boolean isBatched, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public <T extends org.apache.spark.streaming.util.WriteAheadLog> org.apache.spark.streaming.util.WriteAheadLog assertReceiverLogClass (org.apache.spark.SparkConf conf, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
}
