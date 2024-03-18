package org.apache.spark.ml.clustering;
/**
 * Common params for GaussianMixture and GaussianMixtureModel
 */
public  interface GaussianMixtureParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasSeed, org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.param.shared.HasProbabilityCol, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasAggregationDepth {
  /** @group getParam */
  public  int getK ()  ;
  /**
   * Number of independent Gaussians in the mixture model. Must be greater than 1. Default: 2.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam k ()  ;
  /**
   * Validates and transforms the input schema.
   * <p>
   * @param schema input schema
   * @return output schema
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
