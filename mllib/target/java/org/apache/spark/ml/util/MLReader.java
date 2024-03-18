package org.apache.spark.ml.util;
/**
 * Abstract class for utility classes that can load ML instances.
 * <p>
 * @param <T>  ML instance type
 */
public abstract class MLReader<T extends java.lang.Object> implements org.apache.spark.ml.util.BaseReadWrite {
  public   MLReader ()  { throw new RuntimeException(); }
  /**
   * Loads the ML component from the input path.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public abstract  T load (java.lang.String path)  ;
  public  org.apache.spark.ml.util.MLReader<T> session (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
