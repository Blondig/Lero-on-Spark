package org.apache.spark.ml.util;
/**
 * Trait for <code>MLWriter</code> and <code>MLReader</code>.
 */
public  interface BaseReadWrite {
  /** Returns the underlying `SparkContext`. */
  public  org.apache.spark.SparkContext sc ()  ;
  /**
   * Sets the Spark Session to use for saving/loading.
   * @param sparkSession (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.BaseReadWrite session (org.apache.spark.sql.SparkSession sparkSession)  ;
  /**
   * Returns the user-specified Spark Session or the default.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SparkSession sparkSession ()  ;
  /**
   * Returns the user-specified SQL context or the default.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext sqlContext ()  ;
}
