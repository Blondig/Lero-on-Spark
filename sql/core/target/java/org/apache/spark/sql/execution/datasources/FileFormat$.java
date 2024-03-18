package org.apache.spark.sql.execution.datasources;
public  class FileFormat$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FileFormat$ MODULE$ = null;
  public   FileFormat$ ()  { throw new RuntimeException(); }
  public  java.lang.String FILE_PATH ()  { throw new RuntimeException(); }
  public  java.lang.String FILE_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String FILE_SIZE ()  { throw new RuntimeException(); }
  public  java.lang.String FILE_MODIFICATION_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String METADATA_NAME ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType METADATA_STRUCT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference createFileMetadataCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow createMetadataInternalRow (scala.collection.Seq<java.lang.String> fieldNames, org.apache.hadoop.fs.Path filePath, long fileSize, long fileModificationTime)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow updateMetadataInternalRow (org.apache.spark.sql.catalyst.InternalRow row, scala.collection.Seq<java.lang.String> fieldNames, org.apache.hadoop.fs.Path filePath, long fileSize, long fileModificationTime)  { throw new RuntimeException(); }
}
