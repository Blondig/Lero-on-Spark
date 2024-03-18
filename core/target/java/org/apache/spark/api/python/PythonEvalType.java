package org.apache.spark.api.python;
/**
 * Enumerate the type of command that will be sent to the Python worker
 */
public  class PythonEvalType {
  static public  int NON_UDF ()  { throw new RuntimeException(); }
  static public  int SQL_BATCHED_UDF ()  { throw new RuntimeException(); }
  static public  int SQL_SCALAR_PANDAS_UDF ()  { throw new RuntimeException(); }
  static public  int SQL_GROUPED_MAP_PANDAS_UDF ()  { throw new RuntimeException(); }
  static public  int SQL_GROUPED_AGG_PANDAS_UDF ()  { throw new RuntimeException(); }
  static public  int SQL_WINDOW_AGG_PANDAS_UDF ()  { throw new RuntimeException(); }
  static public  int SQL_SCALAR_PANDAS_ITER_UDF ()  { throw new RuntimeException(); }
  static public  int SQL_MAP_PANDAS_ITER_UDF ()  { throw new RuntimeException(); }
  static public  int SQL_COGROUPED_MAP_PANDAS_UDF ()  { throw new RuntimeException(); }
  static public  int SQL_MAP_ARROW_ITER_UDF ()  { throw new RuntimeException(); }
  static public  java.lang.String toString (int pythonEvalType)  { throw new RuntimeException(); }
}
