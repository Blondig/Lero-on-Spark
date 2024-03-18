package org.apache.spark.sql.avro;
public  class functions {
  /**
   * Converts a binary column of avro format into its corresponding catalyst value. The specified
   * schema must match the read data, otherwise the behavior is undefined: it may fail or return
   * arbitrary result.
   * <p>
   * @param data the binary column.
   * @param jsonFormatSchema the avro schema in JSON string format.
   * <p>
   * @since 3.0.0
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Column from_avro (org.apache.spark.sql.Column data, java.lang.String jsonFormatSchema)  { throw new RuntimeException(); }
  /**
   * Converts a binary column of Avro format into its corresponding catalyst value.
   * The specified schema must match actual schema of the read data, otherwise the behavior
   * is undefined: it may fail or return arbitrary result.
   * To deserialize the data with a compatible and evolved schema, the expected Avro schema can be
   * set via the option avroSchema.
   * <p>
   * @param data the binary column.
   * @param jsonFormatSchema the avro schema in JSON string format.
   * @param options options to control how the Avro record is parsed.
   * <p>
   * @since 3.0.0
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Column from_avro (org.apache.spark.sql.Column data, java.lang.String jsonFormatSchema, java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Converts a column into binary of avro format.
   * <p>
   * @param data the data column.
   * <p>
   * @since 3.0.0
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Column to_avro (org.apache.spark.sql.Column data)  { throw new RuntimeException(); }
  /**
   * Converts a column into binary of avro format.
   * <p>
   * @param data the data column.
   * @param jsonFormatSchema user-specified output avro schema in JSON string format.
   * <p>
   * @since 3.0.0
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Column to_avro (org.apache.spark.sql.Column data, java.lang.String jsonFormatSchema)  { throw new RuntimeException(); }
}
