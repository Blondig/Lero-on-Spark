package org.apache.spark.ml.fpm;
/**
 * Common params for FPGrowth and FPGrowthModel
 */
public  interface FPGrowthParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasPredictionCol {
  /** @group getParam */
  public  java.lang.String getItemsCol ()  ;
  /** @group getParam */
  public  double getMinConfidence ()  ;
  /** @group getParam */
  public  double getMinSupport ()  ;
  /** @group expertGetParam */
  public  int getNumPartitions ()  ;
  /**
   * Items column name.
   * Default: "items"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> itemsCol ()  ;
  /**
   * Minimal confidence for generating Association Rule. minConfidence will not affect the mining
   * for frequent itemsets, but will affect the association rules generation.
   * Default: 0.8
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam minConfidence ()  ;
  /**
   * Minimal support level of the frequent pattern. [0.0, 1.0]. Any pattern that appears
   * more than (minSupport * size-of-the-dataset) times will be output in the frequent itemsets.
   * Default: 0.3
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam minSupport ()  ;
  /**
   * Number of partitions (at least 1) used by parallel FP-growth. By default the param is not
   * set, and partition number of the input dataset is used.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numPartitions ()  ;
  /**
   * Validates and transforms the input schema.
   * @param schema input schema
   * @return output schema
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
