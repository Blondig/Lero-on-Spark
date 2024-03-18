package org.apache.spark.ml.feature;
/**
 * Params for {@link IDF} and {@link IDFModel}.
 */
public  interface IDFBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /** @group getParam */
  public  int getMinDocFreq ()  ;
  /**
   * The minimum number of documents in which a term should appear.
   * Default: 0
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam minDocFreq ()  ;
  /**
   * Validate and transform the input schema.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
