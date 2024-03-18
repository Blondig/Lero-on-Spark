package org.apache.spark.sql.execution.streaming.sources;
/**
 *  A source that generates increment long values with timestamps. Each generated row has two
 *  columns: a timestamp column for the generated time and an auto increment long column starting
 *  with 0L.
 * <p>
 *  This source supports the following options:
 *  - <code>rowsPerMicroBatch</code> (e.g. 100): How many rows should be generated per micro-batch.
 *  - <code>numPartitions</code> (e.g. 10, default: Spark's default parallelism): The partition number for the
 *    generated rows.
 *  - <code>startTimestamp</code> (e.g. 1000, default: 0): starting value of generated time
 *  - <code>advanceMillisPerMicroBatch</code> (e.g. 1000, default: 1000): the amount of time being advanced in
 *    generated time on each micro-batch.
 * <p>
 *  Unlike <code>rate</code> data source, this data source provides a consistent set of input rows per
 *  micro-batch regardless of query execution (configuration of trigger, query being lagging, etc.),
 *  say, batch 0 will produce 0~999 and batch 1 will produce 1000~1999, and so on. Same applies to
 *  the generated time.
 * <p>
 *  As the name represents, this data source only supports micro-batch read.
 */
public  class RatePerMicroBatchProvider implements org.apache.spark.sql.internal.connector.SimpleTableProvider, org.apache.spark.sql.sources.DataSourceRegister {
  static public  org.apache.spark.sql.types.StructType SCHEMA ()  { throw new RuntimeException(); }
  static public  int VERSION ()  { throw new RuntimeException(); }
  static public  java.lang.String NUM_PARTITIONS ()  { throw new RuntimeException(); }
  static public  java.lang.String ROWS_PER_BATCH ()  { throw new RuntimeException(); }
  static public  java.lang.String START_TIMESTAMP ()  { throw new RuntimeException(); }
  static public  java.lang.String ADVANCE_MILLIS_PER_BATCH ()  { throw new RuntimeException(); }
  public   RatePerMicroBatchProvider ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}
