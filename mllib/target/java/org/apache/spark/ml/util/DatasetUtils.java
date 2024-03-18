package org.apache.spark.ml.util;
public  class DatasetUtils {
  /**
   * Cast a column in a Dataset to Vector type.
   * <p>
   * The supported data types of the input column are
   * - Vector
   * - float/double type Array.
   * <p>
   * Note: The returned column does not have Metadata.
   * <p>
   * @param dataset input DataFrame
   * @param colName column name.
   * @return Vector column
   */
  static public  org.apache.spark.sql.Column columnToVector (org.apache.spark.sql.Dataset<?> dataset, java.lang.String colName)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> columnToOldVector (org.apache.spark.sql.Dataset<?> dataset, java.lang.String colName)  { throw new RuntimeException(); }
}
