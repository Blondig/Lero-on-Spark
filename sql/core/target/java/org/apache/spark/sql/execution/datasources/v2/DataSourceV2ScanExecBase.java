package org.apache.spark.sql.execution.datasources.v2;
public  interface DataSourceV2ScanExecBase extends org.apache.spark.sql.execution.LeafExecNode {
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> customMetrics ()  ;
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  ;
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.vectorized.ColumnarBatch> doExecuteColumnar ()  ;
  /**
   * Group partition values for all the input partitions. This returns <code>Some</code> iff:
   *   - {@link SQLConf.V2_BUCKETING_ENABLED} is turned on
   *   - all input partitions implement {@link HasPartitionKey}
   *   - <code>keyGroupedPartitioning</code> is set
   * <p>
   * The result, if defined, is a list of tuples where the first element is a partition value,
   * and the second element is a list of input partitions that share the same partition value.
   * <p>
   * A non-empty result means each partition is clustered on a single key and therefore eligible
   * for further optimizations to eliminate shuffling in some operations such as join and aggregate.
   * @param inputPartitions (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.InternalRow, scala.collection.Seq<org.apache.spark.sql.connector.read.InputPartition>>>> groupPartitions (scala.collection.Seq<org.apache.spark.sql.connector.read.InputPartition> inputPartitions)  ;
  public  scala.Option<scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.InternalRow, scala.collection.Seq<org.apache.spark.sql.connector.read.InputPartition>>>> groupedPartitions ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.connector.read.InputPartition> inputPartitions ()  ;
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> inputRDD ()  ;
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> inputRDDs ()  ;
  /** Optional partitioning expressions provided by the V2 data sources, through
   * @return (undocumented)
   * <code>SupportsReportPartitioning</code> */
  public  scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> keyGroupedPartitioning ()  ;
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  ;
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  ;
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.connector.read.InputPartition>> partitions ()  ;
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory readerFactory ()  ;
  /**
   * Shorthand for calling redact() without specifying redacting rules
   * @param text (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String redact (java.lang.String text)  ;
  public  org.apache.spark.sql.connector.read.Scan scan ()  ;
  public  java.lang.String simpleString (int maxFields)  ;
  public  boolean supportsColumnar ()  ;
  public  java.lang.String verboseStringWithOperatorId ()  ;
}
