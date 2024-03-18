package org.apache.spark.deploy;
public  class TestFileSystem extends org.apache.hadoop.fs.LocalFileSystem {
  public   TestFileSystem ()  { throw new RuntimeException(); }
  public  void copyToLocalFile (org.apache.hadoop.fs.Path src, org.apache.hadoop.fs.Path dst)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileStatus[] globStatus (org.apache.hadoop.fs.Path pathPattern)  { throw new RuntimeException(); }
  public  boolean isFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileStatus[] listStatus (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FSDataInputStream open (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
}
