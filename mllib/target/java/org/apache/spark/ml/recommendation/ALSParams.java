package org.apache.spark.ml.recommendation;
/**
 * Common params for ALS.
 */
public  interface ALSParams extends org.apache.spark.ml.recommendation.ALSModelParams, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasRegParam, org.apache.spark.ml.param.shared.HasCheckpointInterval, org.apache.spark.ml.param.shared.HasSeed {
  /**
   * Param for the alpha parameter in the implicit preference formulation (nonnegative).
   * Default: 1.0
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam alpha ()  ;
  /**
   * Param for StorageLevel for ALS model factors. Pass in a string representation of
   * <code>StorageLevel</code>.
   * Default: "MEMORY_AND_DISK".
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> finalStorageLevel ()  ;
  /** @group getParam */
  public  double getAlpha ()  ;
  /** @group expertGetParam */
  public  java.lang.String getFinalStorageLevel ()  ;
  /** @group getParam */
  public  boolean getImplicitPrefs ()  ;
  /** @group expertGetParam */
  public  java.lang.String getIntermediateStorageLevel ()  ;
  /** @group getParam */
  public  boolean getNonnegative ()  ;
  /** @group getParam */
  public  int getNumItemBlocks ()  ;
  /** @group getParam */
  public  int getNumUserBlocks ()  ;
  /** @group getParam */
  public  int getRank ()  ;
  /** @group getParam */
  public  java.lang.String getRatingCol ()  ;
  /**
   * Param to decide whether to use implicit preference.
   * Default: false
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam implicitPrefs ()  ;
  /**
   * Param for StorageLevel for intermediate datasets. Pass in a string representation of
   * <code>StorageLevel</code>. Cannot be "NONE".
   * Default: "MEMORY_AND_DISK".
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> intermediateStorageLevel ()  ;
  /**
   * Param for whether to apply nonnegativity constraints.
   * Default: false
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam nonnegative ()  ;
  /**
   * Param for number of item blocks (positive).
   * Default: 10
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numItemBlocks ()  ;
  /**
   * Param for number of user blocks (positive).
   * Default: 10
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numUserBlocks ()  ;
  /**
   * Param for rank of the matrix factorization (positive).
   * Default: 10
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam rank ()  ;
  /**
   * Param for the column name for ratings.
   * Default: "rating"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> ratingCol ()  ;
  /**
   * Validates and transforms the input schema.
   * <p>
   * @param schema input schema
   * @return output schema
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
