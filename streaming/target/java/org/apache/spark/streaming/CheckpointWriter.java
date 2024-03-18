package org.apache.spark.streaming;
/**
 * Convenience class to handle the writing of graph checkpoint to file
 */
  class CheckpointWriter implements org.apache.spark.internal.Logging {
  public  class CheckpointWriteHandler implements java.lang.Runnable {
    public   CheckpointWriteHandler (org.apache.spark.streaming.Time checkpointTime, byte[] bytes, boolean clearCheckpointDataLater)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  public   CheckpointWriter (org.apache.spark.streaming.scheduler.JobGenerator jobGenerator, org.apache.spark.SparkConf conf, java.lang.String checkpointDir, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  int MAX_ATTEMPTS ()  { throw new RuntimeException(); }
  public  org.apache.spark.io.CompressionCodec compressionCodec ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ThreadPoolExecutor executor ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.streaming.Checkpoint checkpoint, boolean clearCheckpointDataLater)  { throw new RuntimeException(); }
}
