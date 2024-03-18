package org.apache.spark.sql.execution.datasources;
/**
 * A part (i.e. "block") of a single file that should be read, along with partition column values
 * that need to be prepended to each row.
 * <p>
 * param:  partitionValues value of partition columns to be prepended to each row.
 * param:  filePath URI of the file to read
 * param:  start the beginning offset (in bytes) of the block.
 * param:  length number of bytes to read.
 * param:  modificationTime The modification time of the input file, in milliseconds.
 * param:  fileSize The length of the input file (not the block), in bytes.
 */
public  class PartitionedFile implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  public  org.apache.spark.sql.catalyst.InternalRow partitionValues ()  { throw new RuntimeException(); }
  public  java.lang.String filePath ()  { throw new RuntimeException(); }
  public  long start ()  { throw new RuntimeException(); }
  public  long length ()  { throw new RuntimeException(); }
  public  java.lang.String[] locations ()  { throw new RuntimeException(); }
  public  long modificationTime ()  { throw new RuntimeException(); }
  public  long fileSize ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitionedFile (org.apache.spark.sql.catalyst.InternalRow partitionValues, java.lang.String filePath, long start, long length, java.lang.String[] locations, long modificationTime, long fileSize)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
