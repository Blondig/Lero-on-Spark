package org.apache.spark.sql.execution.datasources.parquet;
public  class ParquetReadSupport$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParquetReadSupport$ MODULE$ = null;
  public   ParquetReadSupport$ ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_ROW_REQUESTED_SCHEMA ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_METADATA_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String generateFakeColumnName ()  { throw new RuntimeException(); }
  public  org.apache.parquet.schema.MessageType getRequestedSchema (org.apache.parquet.schema.MessageType parquetFileSchema, org.apache.spark.sql.types.StructType catalystRequestedSchema, org.apache.hadoop.conf.Configuration conf, boolean enableVectorizedReader)  { throw new RuntimeException(); }
  /**
   * Overloaded method for backward compatibility with
   * <code>caseSensitive</code> default to <code>true</code> and <code>useFieldId</code> default to <code>false</code>
   * @param parquetSchema (undocumented)
   * @param catalystSchema (undocumented)
   * @param caseSensitive (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.schema.MessageType clipParquetSchema (org.apache.parquet.schema.MessageType parquetSchema, org.apache.spark.sql.types.StructType catalystSchema, boolean caseSensitive)  { throw new RuntimeException(); }
  /**
   * Tailors <code>parquetSchema</code> according to <code>catalystSchema</code> by removing column paths don't exist
   * in <code>catalystSchema</code>, and adding those only exist in <code>catalystSchema</code>.
   * @param parquetSchema (undocumented)
   * @param catalystSchema (undocumented)
   * @param caseSensitive (undocumented)
   * @param useFieldId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.schema.MessageType clipParquetSchema (org.apache.parquet.schema.MessageType parquetSchema, org.apache.spark.sql.types.StructType catalystSchema, boolean caseSensitive, boolean useFieldId)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType expandUDT (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Whether the parquet schema contains any field IDs.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  boolean containsFieldIds (org.apache.parquet.schema.Type schema)  { throw new RuntimeException(); }
}
