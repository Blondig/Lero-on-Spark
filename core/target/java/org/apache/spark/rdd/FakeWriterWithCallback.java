package org.apache.spark.rdd;
public  class FakeWriterWithCallback extends org.apache.spark.rdd.FakeWriter {
  static public  java.lang.String calledBy ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable exception ()  { throw new RuntimeException(); }
  static public  void onFailure (org.apache.spark.TaskContext ctx, java.lang.Throwable e)  { throw new RuntimeException(); }
  public   FakeWriterWithCallback ()  { throw new RuntimeException(); }
  public  void close (org.apache.hadoop.mapred.Reporter p1)  { throw new RuntimeException(); }
  public  void write (java.lang.Integer p1, java.lang.Integer p2)  { throw new RuntimeException(); }
}
