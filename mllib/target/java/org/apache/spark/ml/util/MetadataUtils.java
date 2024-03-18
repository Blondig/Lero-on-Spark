package org.apache.spark.ml.util;
/**
 * Helper utilities for algorithms using ML metadata
 */
public  class MetadataUtils {
  /**
   * Examine a schema to identify the number of classes in a label column.
   * Returns None if the number of labels is not specified, or if the label column is continuous.
   * @param labelSchema (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.Object> getNumClasses (org.apache.spark.sql.types.StructField labelSchema)  { throw new RuntimeException(); }
  /**
   * Obtain the number of features in a vector column.
   * If no metadata is available, extract it from the dataset.
   * @param dataset (undocumented)
   * @param vectorCol (undocumented)
   * @return (undocumented)
   */
  static public  int getNumFeatures (org.apache.spark.sql.Dataset<?> dataset, java.lang.String vectorCol)  { throw new RuntimeException(); }
  /**
   * Examine a schema to identify the number of features in a vector column.
   * Returns None if the number of features is not specified.
   * @param vectorSchema (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.Object> getNumFeatures (org.apache.spark.sql.types.StructField vectorSchema)  { throw new RuntimeException(); }
  /**
   * Examine a schema to identify categorical (Binary and Nominal) features.
   * <p>
   * @param featuresSchema  Schema of the features column.
   *                        If a feature does not have metadata, it is assumed to be continuous.
   *                        If a feature is Nominal, then it must have the number of values
   *                        specified.
   * @return  Map: feature index to number of categories.
   *          The map's set of keys will be the set of categorical feature indices.
   */
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> getCategoricalFeatures (org.apache.spark.sql.types.StructField featuresSchema)  { throw new RuntimeException(); }
  /**
   * Takes a Vector column and a list of feature names, and returns the corresponding list of
   * feature indices in the column, in order.
   * @param col  Vector column which must have feature names specified via attributes
   * @param names  List of feature names
   * @return (undocumented)
   */
  static public  int[] getFeatureIndicesFromNames (org.apache.spark.sql.types.StructField col, java.lang.String[] names)  { throw new RuntimeException(); }
}
