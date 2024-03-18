package org.apache.spark.sql.api.python;
public  class PythonSQLUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PythonSQLUtils$ MODULE$ = null;
  public   PythonSQLUtils$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType parseDataType (java.lang.String typeText)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ExpressionInfo[] listBuiltinFunctionInfos ()  { throw new RuntimeException(); }
  public  scala.Tuple4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>[] listRuntimeSQLConfigs ()  { throw new RuntimeException(); }
  public  scala.Tuple4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>[] listStaticSQLConfigs ()  { throw new RuntimeException(); }
  public  boolean isTimestampNTZPreferred ()  { throw new RuntimeException(); }
  /**
   * Python callable function to read a file in Arrow stream format and create a {@link RDD}
   * using each serialized ArrowRecordBatch as a partition.
   * @param session (undocumented)
   * @param filename (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> readArrowStreamFromFile (org.apache.spark.sql.SparkSession session, java.lang.String filename)  { throw new RuntimeException(); }
  /**
   * Python callable function to read a file in Arrow stream format and create a {@link DataFrame}
   * from an RDD.
   * @param arrowBatchRDD (undocumented)
   * @param schemaString (undocumented)
   * @param session (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDataFrame (org.apache.spark.api.java.JavaRDD<byte[]> arrowBatchRDD, java.lang.String schemaString, org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  public  java.lang.String explainString (org.apache.spark.sql.execution.QueryExecution queryExecution, java.lang.String mode)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column castTimestampNTZToLong (org.apache.spark.sql.Column c)  { throw new RuntimeException(); }
}
