package org.apache.spark.ml.feature;
/**
 * Params for {@link PCA} and {@link PCAModel}.
 */
public  interface PCAParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /** @group getParam */
  public  int getK ()  ;
  /**
   * The number of principal components.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam k ()  ;
  /** Validates and transforms the input schema. */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
