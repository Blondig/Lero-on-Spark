package org.apache.spark.sql.execution.datasources.parquet;
/**
 * This converter class is used to convert Parquet {@link MessageType} to Spark SQL {@link StructType}
 * (via the <code>convert</code> method) as well as {@link ParquetColumn} (via the <code>convertParquetColumn</code>
 * method). The latter contains richer information about the Parquet type, including its
 * associated repetition &amp; definition level, column path, column descriptor etc.
 * <p>
 * Parquet format backwards-compatibility rules are respected when converting Parquet
 * {@link MessageType} schemas.
 * <p>
 * @see https://github.com/apache/parquet-format/blob/master/LogicalTypes.md
 * <p>
 * param:  assumeBinaryIsString Whether unannotated BINARY fields should be assumed to be Spark SQL
 *        {@link StringType} fields.
 * param:  assumeInt96IsTimestamp Whether unannotated INT96 fields should be assumed to be Spark SQL
 *        {@link TimestampType} fields.
 * param:  caseSensitive Whether use case sensitive analysis when comparing Spark catalyst read
 *                      schema with Parquet schema
 */
public  class ParquetToSparkSchemaConverter {
  public   ParquetToSparkSchemaConverter (boolean assumeBinaryIsString, boolean assumeInt96IsTimestamp, boolean caseSensitive)  { throw new RuntimeException(); }
  public   ParquetToSparkSchemaConverter (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public   ParquetToSparkSchemaConverter (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Converts Parquet {@link MessageType} <code>parquetSchema</code> to a Spark SQL {@link StructType}.
   * @param parquetSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType convert (org.apache.parquet.schema.MessageType parquetSchema)  { throw new RuntimeException(); }
  /**
   * Convert <code>parquetSchema</code> into a {@link ParquetColumn} which contains its corresponding Spark
   * SQL {@link StructType} along with other information such as the maximum repetition and definition
   * level of each node, column descriptor for the leave nodes, etc.
   * <p>
   * If <code>sparkReadSchema</code> is not empty, when deriving Spark SQL type from a Parquet field this will
   * check if the same field also exists in the schema. If so, it will use the Spark SQL type.
   * This is necessary since conversion from Parquet to Spark could cause precision loss. For
   * instance, Spark read schema is smallint/tinyint but Parquet only support int.
   * @param parquetSchema (undocumented)
   * @param sparkReadSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.parquet.ParquetColumn convertParquetColumn (org.apache.parquet.schema.MessageType parquetSchema, scala.Option<org.apache.spark.sql.types.StructType> sparkReadSchema)  { throw new RuntimeException(); }
  /**
   * Converts a Parquet {@link Type} to a {@link ParquetColumn} which wraps a Spark SQL {@link DataType} with
   * additional information such as the Parquet column's repetition &amp; definition level, column
   * path, column descriptor etc.
   * @param field (undocumented)
   * @param sparkReadType (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.parquet.ParquetColumn convertField (org.apache.parquet.io.ColumnIO field, scala.Option<org.apache.spark.sql.types.DataType> sparkReadType)  { throw new RuntimeException(); }
    boolean isElementType (org.apache.parquet.schema.Type repeatedType, java.lang.String parentName)  { throw new RuntimeException(); }
}
