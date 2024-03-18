package org.apache.spark.sql.execution.datasources.parquet;
/**
 * A Parquet {@link ReadSupport} implementation for reading Parquet records as Catalyst
 * {@link InternalRow}s.
 * <p>
 * The API interface of {@link ReadSupport} is a little bit over complicated because of historical
 * reasons.  In older versions of parquet-mr (say 1.6.0rc3 and prior), {@link ReadSupport} need to be
 * instantiated and initialized twice on both driver side and executor side.  The {@link init()} method
 * is for driver side initialization, while {@link prepareForRead()} is for executor side.  However,
 * starting from parquet-mr 1.6.0, it's no longer the case, and {@link ReadSupport} is only instantiated
 * and initialized on executor side.  So, theoretically, now it's totally fine to combine these two
 * methods into a single initialization method.  The only reason (I could think of) to still have
 * them here is for parquet-mr API backwards-compatibility.
 * <p>
 * Due to this reason, we no longer rely on {@link ReadContext} to pass requested schema from {@link init()}
 * to {@link prepareForRead()}, but use a private <code>var</code> for simplicity.
 */
public  class ParquetReadSupport extends org.apache.parquet.hadoop.api.ReadSupport<org.apache.spark.sql.catalyst.InternalRow> implements org.apache.spark.internal.Logging {
  static public  java.lang.String SPARK_ROW_REQUESTED_SCHEMA ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_METADATA_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String generateFakeColumnName ()  { throw new RuntimeException(); }
  static public  org.apache.parquet.schema.MessageType getRequestedSchema (org.apache.parquet.schema.MessageType parquetFileSchema, org.apache.spark.sql.types.StructType catalystRequestedSchema, org.apache.hadoop.conf.Configuration conf, boolean enableVectorizedReader)  { throw new RuntimeException(); }
  /**
   * Overloaded method for backward compatibility with
   * <code>caseSensitive</code> default to <code>true</code> and <code>useFieldId</code> default to <code>false</code>
   * @param parquetSchema (undocumented)
   * @param catalystSchema (undocumented)
   * @param caseSensitive (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.parquet.schema.MessageType clipParquetSchema (org.apache.parquet.schema.MessageType parquetSchema, org.apache.spark.sql.types.StructType catalystSchema, boolean caseSensitive)  { throw new RuntimeException(); }
  /**
   * Tailors <code>parquetSchema</code> according to <code>catalystSchema</code> by removing column paths don't exist
   * in <code>catalystSchema</code>, and adding those only exist in <code>catalystSchema</code>.
   * @param parquetSchema (undocumented)
   * @param catalystSchema (undocumented)
   * @param caseSensitive (undocumented)
   * @param useFieldId (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.parquet.schema.MessageType clipParquetSchema (org.apache.parquet.schema.MessageType parquetSchema, org.apache.spark.sql.types.StructType catalystSchema, boolean caseSensitive, boolean useFieldId)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType expandUDT (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Whether the parquet schema contains any field IDs.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  static public  boolean containsFieldIds (org.apache.parquet.schema.Type schema)  { throw new RuntimeException(); }
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
  public  scala.Option<java.time.ZoneId> convertTz ()  { throw new RuntimeException(); }
  // not preceding
  public   ParquetReadSupport (scala.Option<java.time.ZoneId> convertTz, boolean enableVectorizedReader, org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec datetimeRebaseSpec, org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec int96RebaseSpec)  { throw new RuntimeException(); }
  public   ParquetReadSupport ()  { throw new RuntimeException(); }
  /**
   * Called on executor side before {@link prepareForRead()} and instantiating actual Parquet record
   * readers.  Responsible for figuring out Parquet requested schema used for column pruning.
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.hadoop.api.ReadSupport.ReadContext init (org.apache.parquet.hadoop.api.InitContext context)  { throw new RuntimeException(); }
  /**
   * Called on executor side after {@link init()}, before instantiating actual Parquet record readers.
   * Responsible for instantiating {@link RecordMaterializer}, which is used for converting Parquet
   * records to Catalyst {@link InternalRow}s.
   * @param conf (undocumented)
   * @param keyValueMetaData (undocumented)
   * @param fileSchema (undocumented)
   * @param readContext (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.io.api.RecordMaterializer<org.apache.spark.sql.catalyst.InternalRow> prepareForRead (org.apache.hadoop.conf.Configuration conf, java.util.Map<java.lang.String, java.lang.String> keyValueMetaData, org.apache.parquet.schema.MessageType fileSchema, org.apache.parquet.hadoop.api.ReadSupport.ReadContext readContext)  { throw new RuntimeException(); }
}
