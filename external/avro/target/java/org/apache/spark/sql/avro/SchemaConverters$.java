package org.apache.spark.sql.avro;
/**
 * This object contains method that are used to convert sparkSQL schemas to avro schemas and vice
 * versa.
 */
public  class SchemaConverters$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SchemaConverters$ MODULE$ = null;
  public   SchemaConverters$ ()  { throw new RuntimeException(); }
  /**
   * Converts an Avro schema to a corresponding Spark SQL schema.
   * <p>
   * @since 2.4.0
   * @param avroSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.avro.SchemaConverters.SchemaType toSqlType (org.apache.avro.Schema avroSchema)  { throw new RuntimeException(); }
  /**
   * Converts a Spark SQL schema to a corresponding Avro schema.
   * <p>
   * @since 2.4.0
   * @param catalystType (undocumented)
   * @param nullable (undocumented)
   * @param recordName (undocumented)
   * @param nameSpace (undocumented)
   * @return (undocumented)
   */
  public  org.apache.avro.Schema toAvroType (org.apache.spark.sql.types.DataType catalystType, boolean nullable, java.lang.String recordName, java.lang.String nameSpace)  { throw new RuntimeException(); }
}
