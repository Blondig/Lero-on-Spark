package org.apache.spark.sql.kafka010;
/**
 * The provider class for all Kafka readers and writers. It is designed such that it throws
 * IllegalArgumentException when the Kafka Dataset is created, so that it can catch
 * missing options even before the query is started.
 */
  class KafkaSourceProvider implements org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.sql.sources.StreamSourceProvider, org.apache.spark.sql.sources.StreamSinkProvider, org.apache.spark.sql.sources.RelationProvider, org.apache.spark.sql.sources.CreatableRelationProvider, org.apache.spark.sql.internal.connector.SimpleTableProvider, org.apache.spark.internal.Logging {
  public  class KafkaTable implements org.apache.spark.sql.connector.catalog.Table, org.apache.spark.sql.connector.catalog.SupportsRead, org.apache.spark.sql.connector.catalog.SupportsWrite {
    public   KafkaTable (boolean includeHeaders)  { throw new RuntimeException(); }
    public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.ScanBuilder newScanBuilder (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder (org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  }
  public  class KafkaScan implements org.apache.spark.sql.connector.read.Scan {
    public   KafkaScan (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
    public  boolean includeHeaders ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.metric.CustomMetric[] supportedCustomMetrics ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.Batch toBatch ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.streaming.ContinuousStream toContinuousStream (java.lang.String checkpointLocation)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.streaming.MicroBatchStream toMicroBatchStream (java.lang.String checkpointLocation)  { throw new RuntimeException(); }
  }
  static public  class StrategyOnNoMatchStartingOffset$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StrategyOnNoMatchStartingOffset$ MODULE$ = null;
    public   StrategyOnNoMatchStartingOffset$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value ERROR ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value LATEST ()  { throw new RuntimeException(); }
  }
  static   java.lang.String STARTING_OFFSETS_OPTION_KEY ()  { throw new RuntimeException(); }
  static   java.lang.String ENDING_OFFSETS_OPTION_KEY ()  { throw new RuntimeException(); }
  static   java.lang.String STARTING_OFFSETS_BY_TIMESTAMP_OPTION_KEY ()  { throw new RuntimeException(); }
  static   java.lang.String ENDING_OFFSETS_BY_TIMESTAMP_OPTION_KEY ()  { throw new RuntimeException(); }
  static   java.lang.String STARTING_TIMESTAMP_OPTION_KEY ()  { throw new RuntimeException(); }
  static   java.lang.String ENDING_TIMESTAMP_OPTION_KEY ()  { throw new RuntimeException(); }
  static   java.lang.String MIN_PARTITIONS_OPTION_KEY ()  { throw new RuntimeException(); }
  static   java.lang.String MAX_OFFSET_PER_TRIGGER ()  { throw new RuntimeException(); }
  static   java.lang.String MIN_OFFSET_PER_TRIGGER ()  { throw new RuntimeException(); }
  static   java.lang.String MAX_TRIGGER_DELAY ()  { throw new RuntimeException(); }
  static   java.lang.String DEFAULT_MAX_TRIGGER_DELAY ()  { throw new RuntimeException(); }
  static   java.lang.String FETCH_OFFSET_NUM_RETRY ()  { throw new RuntimeException(); }
  static   java.lang.String FETCH_OFFSET_RETRY_INTERVAL_MS ()  { throw new RuntimeException(); }
  static   java.lang.String CONSUMER_POLL_TIMEOUT ()  { throw new RuntimeException(); }
  static   java.lang.String STARTING_OFFSETS_BY_TIMESTAMP_STRATEGY_KEY ()  { throw new RuntimeException(); }
  static   java.lang.String INCLUDE_HEADERS ()  { throw new RuntimeException(); }
  static   java.lang.String MOCK_SYSTEM_TIME ()  { throw new RuntimeException(); }
  static public  java.lang.String TOPIC_OPTION_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String INSTRUCTION_FOR_FAIL_ON_DATA_LOSS_FALSE ()  { throw new RuntimeException(); }
  static public  java.lang.String INSTRUCTION_FOR_FAIL_ON_DATA_LOSS_TRUE ()  { throw new RuntimeException(); }
  static public  java.lang.String CUSTOM_GROUP_ID_ERROR_MESSAGE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit getKafkaOffsetRangeLimit (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> params, java.lang.String globalOffsetTimestampOptionKey, java.lang.String offsetByTimestampOptionKey, java.lang.String offsetOptionKey, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit defaultOffsets)  { throw new RuntimeException(); }
  static public  java.util.Map<java.lang.String, java.lang.Object> kafkaParamsForDriver (scala.collection.immutable.Map<java.lang.String, java.lang.String> specifiedKafkaParams)  { throw new RuntimeException(); }
  static public  java.util.Map<java.lang.String, java.lang.Object> kafkaParamsForExecutors (scala.collection.immutable.Map<java.lang.String, java.lang.String> specifiedKafkaParams, java.lang.String uniqueGroupId)  { throw new RuntimeException(); }
  /**
   * Returns a unique batch consumer group (group.id), allowing the user to set the prefix of
   * the consumer group
   * @param params (undocumented)
   * @return (undocumented)
   */
  static   java.lang.String batchUniqueGroupId (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> params)  { throw new RuntimeException(); }
  static   java.util.Map<java.lang.String, java.lang.Object> kafkaParamsForProducer (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> params)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public   KafkaSourceProvider ()  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
  /**
   * Returns the name and schema of the source. In addition, it also verifies whether the options
   * are correct and sufficient to create the {@link KafkaSource} when the query is started.
   * @param sqlContext (undocumented)
   * @param schema (undocumented)
   * @param providerName (undocumented)
   * @param parameters (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.String, org.apache.spark.sql.types.StructType> sourceSchema (org.apache.spark.sql.SQLContext sqlContext, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Source createSource (org.apache.spark.sql.SQLContext sqlContext, java.lang.String metadataPath, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceProvider.KafkaTable getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  /**
   * Returns a new base relation with the given parameters.
   * <p>
   * @note The parameters' keywords are case insensitive and this insensitivity is enforced
   *       by the Map that is passed to the function.
   * @param sqlContext (undocumented)
   * @param parameters (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Sink createSink (org.apache.spark.sql.SQLContext sqlContext, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.collection.Seq<java.lang.String> partitionColumns, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext outerSQLContext, org.apache.spark.sql.SaveMode mode, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}
