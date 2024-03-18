package org.apache.spark.sql.execution.datasources.v2;
public  interface FileWrite extends org.apache.spark.sql.connector.write.Write {
  public  org.apache.spark.sql.execution.datasources.WriteJobDescription createWriteJobDescription (org.apache.spark.sql.SparkSession sparkSession, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.mapreduce.Job job, java.lang.String pathName, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  ;
  public  java.lang.String description ()  ;
  public  java.lang.String formatName ()  ;
  public  org.apache.hadoop.mapreduce.Job getJobInstance (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.Path path)  ;
  public  org.apache.spark.sql.connector.write.LogicalWriteInfo info ()  ;
  public  scala.collection.Seq<java.lang.String> paths ()  ;
  /**
   * Prepares a write job and returns an {@link OutputWriterFactory}.  Client side job preparation can
   * be put here.  For example, user defined output committer can be configured here
   * by setting the output committer class in the conf of spark.sql.sources.outputCommitterClass.
   * @param sqlConf (undocumented)
   * @param job (undocumented)
   * @param options (undocumented)
   * @param dataSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.OutputWriterFactory prepareWrite (org.apache.spark.sql.internal.SQLConf sqlConf, org.apache.hadoop.mapreduce.Job job, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.types.StructType dataSchema)  ;
  public  scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> supportsDataType ()  ;
  public  org.apache.spark.sql.connector.write.BatchWrite toBatch ()  ;
  public  void validateInputs (boolean caseSensitiveAnalysis)  ;
}
