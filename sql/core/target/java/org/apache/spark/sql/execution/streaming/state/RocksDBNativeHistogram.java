package org.apache.spark.sql.execution.streaming.state;
/** Class to wrap RocksDB's native histogram */
public  class RocksDBNativeHistogram implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.streaming.state.RocksDBNativeHistogram apply (org.rocksdb.HistogramData nativeHist)  { throw new RuntimeException(); }
  public  long sum ()  { throw new RuntimeException(); }
  public  double avg ()  { throw new RuntimeException(); }
  public  double stddev ()  { throw new RuntimeException(); }
  public  double median ()  { throw new RuntimeException(); }
  public  double p95 ()  { throw new RuntimeException(); }
  public  double p99 ()  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  // not preceding
  public   RocksDBNativeHistogram (long sum, double avg, double stddev, double median, double p95, double p99, long count)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
