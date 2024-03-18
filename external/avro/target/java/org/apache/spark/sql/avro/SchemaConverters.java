package org.apache.spark.sql.avro;
/**
 * This object contains method that are used to convert sparkSQL schemas to avro schemas and vice
 * versa.
 */
public  class SchemaConverters {
  /**
   * Internal wrapper for SQL data type and nullability.
   * <p>
   * @since 2.4.0
   */
  static public  class SchemaType implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
    public  boolean nullable ()  { throw new RuntimeException(); }
    // not preceding
    public   SchemaType (org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
  }
  static public  class SchemaType$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.types.DataType, java.lang.Object, org.apache.spark.sql.avro.SchemaConverters.SchemaType> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SchemaType$ MODULE$ = null;
    public   SchemaType$ ()  { throw new RuntimeException(); }
  }
  /**
   * Converts an Avro schema to a corresponding Spark SQL schema.
   * <p>
   * @since 2.4.0
   * @param avroSchema (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.avro.SchemaConverters.SchemaType toSqlType (org.apache.avro.Schema avroSchema)  { throw new RuntimeException(); }
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
  static public  org.apache.avro.Schema toAvroType (org.apache.spark.sql.types.DataType catalystType, boolean nullable, java.lang.String recordName, java.lang.String nameSpace)  { throw new RuntimeException(); }
}
