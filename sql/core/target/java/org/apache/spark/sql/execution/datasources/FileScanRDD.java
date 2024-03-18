package org.apache.spark.sql.execution.datasources;
/**
 * An RDD that scans a list of file partitions.
 */
public  class FileScanRDD extends org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> {
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.FilePartition> filePartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readDataSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> metadataColumns ()  { throw new RuntimeException(); }
  // not preceding
  public   FileScanRDD (org.apache.spark.sql.SparkSession sparkSession, scala.Function1<org.apache.spark.sql.execution.datasources.PartitionedFile, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> readFunction, scala.collection.Seq<org.apache.spark.sql.execution.datasources.FilePartition> filePartitions, org.apache.spark.sql.types.StructType readDataSchema, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> metadataColumns)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
}
