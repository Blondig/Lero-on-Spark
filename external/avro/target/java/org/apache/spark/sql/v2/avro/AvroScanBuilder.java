package org.apache.spark.sql.v2.avro;
public  class AvroScanBuilder extends org.apache.spark.sql.execution.datasources.v2.FileScanBuilder {
  public   AvroScanBuilder (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex fileIndex, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.Scan build ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.Filter[] pushDataFilters (org.apache.spark.sql.sources.Filter[] dataFilters)  { throw new RuntimeException(); }
}
