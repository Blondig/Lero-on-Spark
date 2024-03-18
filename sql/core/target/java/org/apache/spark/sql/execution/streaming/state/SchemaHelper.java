package org.apache.spark.sql.execution.streaming.state;
/**
 * Helper classes for reading/writing state schema.
 */
public  class SchemaHelper {
  static public  interface SchemaReader {
    public  scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType> read (org.apache.hadoop.fs.FSDataInputStream inputStream)  ;
  }
  static public  class SchemaReader$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SchemaReader$ MODULE$ = null;
    public   SchemaReader$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.SchemaHelper.SchemaReader createSchemaReader (java.lang.String versionStr)  { throw new RuntimeException(); }
  }
  static public  interface SchemaWriter {
    public  int version ()  ;
    public  void write (org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, org.apache.hadoop.fs.FSDataOutputStream outputStream)  ;
    public  void writeVersion (org.apache.hadoop.fs.FSDataOutputStream outputStream)  ;
    public  void writeSchema (org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, org.apache.hadoop.fs.FSDataOutputStream outputStream)  ;
  }
  static public  class SchemaWriter$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SchemaWriter$ MODULE$ = null;
    public   SchemaWriter$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.SchemaHelper.SchemaWriter createSchemaWriter (int version)  { throw new RuntimeException(); }
  }
  static public  class SchemaV1Reader implements org.apache.spark.sql.execution.streaming.state.SchemaHelper.SchemaReader {
    public   SchemaV1Reader ()  { throw new RuntimeException(); }
    public  scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType> read (org.apache.hadoop.fs.FSDataInputStream inputStream)  { throw new RuntimeException(); }
  }
  static public  class SchemaV2Reader implements org.apache.spark.sql.execution.streaming.state.SchemaHelper.SchemaReader {
    public   SchemaV2Reader ()  { throw new RuntimeException(); }
    public  scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType> read (org.apache.hadoop.fs.FSDataInputStream inputStream)  { throw new RuntimeException(); }
  }
  static public  class SchemaV1Writer implements org.apache.spark.sql.execution.streaming.state.SchemaHelper.SchemaWriter {
    public   SchemaV1Writer ()  { throw new RuntimeException(); }
    public  int version ()  { throw new RuntimeException(); }
    public  void writeSchema (org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, org.apache.hadoop.fs.FSDataOutputStream outputStream)  { throw new RuntimeException(); }
  }
  static public  class SchemaV2Writer implements org.apache.spark.sql.execution.streaming.state.SchemaHelper.SchemaWriter {
    public final  int MAX_UTF_CHUNK_SIZE ()  { throw new RuntimeException(); }
    public   SchemaV2Writer ()  { throw new RuntimeException(); }
    public  int version ()  { throw new RuntimeException(); }
    public  void writeSchema (org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, org.apache.hadoop.fs.FSDataOutputStream outputStream)  { throw new RuntimeException(); }
  }
}
