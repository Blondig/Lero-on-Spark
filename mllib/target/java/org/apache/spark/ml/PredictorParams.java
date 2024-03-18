package org.apache.spark.ml;
/**
 * (private[ml])  Trait for parameters for prediction (regression and classification).
 */
public  interface PredictorParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasPredictionCol {
  /**
   * Extract {@link labelCol}, weightCol(if any) and {@link featuresCol} from the given dataset,
   * and put it in an RDD with strong types.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> extractInstances (org.apache.spark.sql.Dataset<?> dataset)  ;
  /**
   * Extract {@link labelCol}, weightCol(if any) and {@link featuresCol} from the given dataset,
   * and put it in an RDD with strong types.
   * Validate the output instances with the given function.
   * @param dataset (undocumented)
   * @param validateInstance (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> extractInstances (org.apache.spark.sql.Dataset<?> dataset, scala.Function1<org.apache.spark.ml.feature.Instance, scala.runtime.BoxedUnit> validateInstance)  ;
  /**
   * Validates and transforms the input schema with the provided param map.
   * <p>
   * @param schema input schema
   * @param fitting whether this is in fitting
   * @param featuresDataType  SQL DataType for FeaturesType.
   *                          E.g., <code>VectorUDT</code> for vector features.
   * @return output schema
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
