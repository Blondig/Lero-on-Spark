package org.apache.spark.ml.feature;
/**
 * Base trait for {@link StringIndexer} and {@link StringIndexerModel}.
 */
public  interface StringIndexerBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasHandleInvalid, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCols {
  /** Returns the input and output column names corresponding in pair. */
    scala.Tuple2<java.lang.String[], java.lang.String[]> getInOutCols ()  ;
  /** @group getParam */
  public  java.lang.String getStringOrderType ()  ;
  /**
   * Param for how to handle invalid data (unseen labels or NULL values).
   * Options are 'skip' (filter out rows with invalid data),
   * 'error' (throw an error), or 'keep' (put invalid data in a special additional
   * bucket, at index numLabels).
   * Default: "error"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  ;
  /**
   * Param for how to order labels of string column. The first label after ordering is assigned
   * an index of 0.
   * Options are:
   *   - 'frequencyDesc': descending order by label frequency (most frequent label assigned 0)
   *   - 'frequencyAsc': ascending order by label frequency (least frequent label assigned 0)
   *   - 'alphabetDesc': descending alphabetical order
   *   - 'alphabetAsc': ascending alphabetical order
   * Default is 'frequencyDesc'.
   * <p>
   * Note: In case of equal frequency when under frequencyDesc/Asc, the strings are further sorted
   *       alphabetically.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> stringOrderType ()  ;
  public  org.apache.spark.sql.types.StructField validateAndTransformField (org.apache.spark.sql.types.StructType schema, java.lang.String inputColName, java.lang.String outputColName)  ;
  /** Validates and transforms the input schema. */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean skipNonExistsCol)  ;
}
