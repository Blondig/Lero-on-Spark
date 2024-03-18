package org.apache.spark.ml.util;
/**
 * Utils for handling schemas.
 */
public  class SchemaUtils {
  /**
   * Check whether the given schema contains a column of the required data type.
   * @param colName  column name
   * @param dataType  required column data type
   * @param schema (undocumented)
   * @param msg (undocumented)
   */
  static public  void checkColumnType (org.apache.spark.sql.types.StructType schema, java.lang.String colName, org.apache.spark.sql.types.DataType dataType, java.lang.String msg)  { throw new RuntimeException(); }
  /**
   * Check whether the given schema contains a column of one of the require data types.
   * @param colName  column name
   * @param dataTypes  required column data types
   * @param schema (undocumented)
   * @param msg (undocumented)
   */
  static public  void checkColumnTypes (org.apache.spark.sql.types.StructType schema, java.lang.String colName, scala.collection.Seq<org.apache.spark.sql.types.DataType> dataTypes, java.lang.String msg)  { throw new RuntimeException(); }
  /**
   * Check whether the given schema contains a column of the numeric data type.
   * @param colName  column name
   * @param schema (undocumented)
   * @param msg (undocumented)
   */
  static public  void checkNumericType (org.apache.spark.sql.types.StructType schema, java.lang.String colName, java.lang.String msg)  { throw new RuntimeException(); }
  /**
   * Appends a new column to the input schema. This fails if the given output column already exists.
   * @param schema input schema
   * @param colName new column name. If this column name is an empty string "", this method returns
   *                the input schema unchanged. This allows users to disable output columns.
   * @param dataType new column data type
   * @return new schema with the input column appended
   * @param nullable (undocumented)
   */
  static public  org.apache.spark.sql.types.StructType appendColumn (org.apache.spark.sql.types.StructType schema, java.lang.String colName, org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
  /**
   * Appends a new column to the input schema. This fails if the given output column already exists.
   * @param schema input schema
   * @param col New column schema
   * @return new schema with the input column appended
   */
  static public  org.apache.spark.sql.types.StructType appendColumn (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.types.StructField col)  { throw new RuntimeException(); }
  /**
   * Update the size of a ML Vector column. If this column do not exist, append it.
   * @param schema input schema
   * @param colName column name
   * @param size number of features
   * @return new schema
   */
  static public  org.apache.spark.sql.types.StructType updateAttributeGroupSize (org.apache.spark.sql.types.StructType schema, java.lang.String colName, int size)  { throw new RuntimeException(); }
  /**
   * Update the number of values of an existing column. If this column do not exist, append it.
   * @param schema input schema
   * @param colName column name
   * @param numValues number of values.
   * @return new schema
   */
  static public  org.apache.spark.sql.types.StructType updateNumValues (org.apache.spark.sql.types.StructType schema, java.lang.String colName, int numValues)  { throw new RuntimeException(); }
  /**
   * Update the numeric meta of an existing column. If this column do not exist, append it.
   * @param schema input schema
   * @param colName column name
   * @return new schema
   */
  static public  org.apache.spark.sql.types.StructType updateNumeric (org.apache.spark.sql.types.StructType schema, java.lang.String colName)  { throw new RuntimeException(); }
  /**
   * Update the metadata of an existing column. If this column do not exist, append it.
   * @param schema input schema
   * @param field struct field
   * @param overwriteMetadata whether to overwrite the metadata. If true, the metadata in the
   *                          schema will be overwritten. If false, the metadata in <code>field</code>
   *                          and <code>schema</code> will be merged to generate output metadata.
   * @return new schema
   */
  static public  org.apache.spark.sql.types.StructType updateField (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.types.StructField field, boolean overwriteMetadata)  { throw new RuntimeException(); }
  /**
   * Check whether the given column in the schema is one of the supporting vector type: Vector,
   * Array[Float]. Array[Double]
   * @param schema input schema
   * @param colName column name
   */
  static public  void validateVectorCompatibleColumn (org.apache.spark.sql.types.StructType schema, java.lang.String colName)  { throw new RuntimeException(); }
}
