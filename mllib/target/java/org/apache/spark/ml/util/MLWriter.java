package org.apache.spark.ml.util;
/**
 * Abstract class for utility classes that can save ML instances in Spark's internal format.
 */
public abstract class MLWriter implements org.apache.spark.ml.util.BaseReadWrite, org.apache.spark.internal.Logging {
  public   MLWriter ()  { throw new RuntimeException(); }
  /**
   * Adds an option to the underlying MLWriter. See the documentation for the specific model's
   * writer for possible options. The option name (key) is case-insensitive.
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter option (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Map to store extra options for this writer.
   * @return (undocumented)
   */
  protected  scala.collection.mutable.Map<java.lang.String, java.lang.String> optionMap ()  { throw new RuntimeException(); }
  /**
   * Overwrites if the output path already exists.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter overwrite ()  { throw new RuntimeException(); }
  /**
   * Saves the ML instances to the input path.
   * @param path (undocumented)
   */
  public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  /**
   * <code>save()</code> handles overwriting and then calls this method.  Subclasses should override this
   * method to implement the actual saving of the instance.
   * @param path (undocumented)
   */
  protected abstract  void saveImpl (java.lang.String path)  ;
  public  org.apache.spark.ml.util.MLWriter session (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  protected  boolean shouldOverwrite ()  { throw new RuntimeException(); }
}
