package org.apache.spark.streaming.util;
public  class WriteAheadLogSuite$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WriteAheadLogSuite$ MODULE$ = null;
  public   WriteAheadLogSuite$ ()  { throw new RuntimeException(); }
  /** Write data to a file directly and return an array of the file segments written. */
  public  scala.collection.Seq<org.apache.spark.streaming.util.FileBasedWriteAheadLogSegment> writeDataManually (scala.collection.Seq<java.lang.String> data, java.lang.String file, boolean allowBatching)  { throw new RuntimeException(); }
  /**
   * Write data to a file using the writer class and return an array of the file segments written.
   * @param filePath (undocumented)
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.streaming.util.FileBasedWriteAheadLogSegment> writeDataUsingWriter (java.lang.String filePath, scala.collection.Seq<java.lang.String> data)  { throw new RuntimeException(); }
  /** Write data to rotating files in log directory using the WriteAheadLog class. */
  public  org.apache.spark.streaming.util.WriteAheadLog writeDataUsingWriteAheadLog (java.lang.String logDirectory, scala.collection.Seq<java.lang.String> data, boolean closeFileAfterWrite, boolean allowBatching, org.apache.spark.util.ManualClock manualClock, boolean closeLog, int clockAdvanceTime)  { throw new RuntimeException(); }
  /** Read data from a segments of a log file directly and return the list of byte buffers. */
  public  scala.collection.Seq<java.lang.String> readDataManually (scala.collection.Seq<org.apache.spark.streaming.util.FileBasedWriteAheadLogSegment> segments)  { throw new RuntimeException(); }
  /** Read all the data from a log file directly and return the list of byte buffers. */
  public <T extends java.lang.Object> scala.collection.Seq<T> readDataManually (java.lang.String file)  { throw new RuntimeException(); }
  /** Read all the data from a log file using reader class and return the list of byte buffers. */
  public  scala.collection.Seq<java.lang.String> readDataUsingReader (java.lang.String file)  { throw new RuntimeException(); }
  /** Read all the data in the log file in a directory using the WriteAheadLog class. */
  public  scala.collection.Seq<java.lang.String> readDataUsingWriteAheadLog (java.lang.String logDirectory, boolean closeFileAfterWrite, boolean allowBatching)  { throw new RuntimeException(); }
  /** Get the log files in a directory. */
  public  scala.collection.Seq<java.lang.String> getLogFilesInDirectory (java.lang.String directory)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.WriteAheadLog createWriteAheadLog (java.lang.String logDirectory, boolean closeFileAfterWrite, boolean allowBatching)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> generateRandomData ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> readAndDeserializeDataManually (scala.collection.Seq<java.lang.String> logFiles, boolean allowBatching)  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer stringToByteBuffer (java.lang.String str)  { throw new RuntimeException(); }
  public  java.lang.String byteBufferToString (java.nio.ByteBuffer byteBuffer)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> java.nio.ByteBuffer wrapArrayArrayByte (java.lang.Object records)  { throw new RuntimeException(); }
}
