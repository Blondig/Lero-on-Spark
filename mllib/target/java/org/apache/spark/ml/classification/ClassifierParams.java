package org.apache.spark.ml.classification;
/**
 * (private[spark]) Params for classification.
 */
public  interface ClassifierParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasRawPredictionCol {
  /**
   * Extract {@link labelCol}, weightCol(if any) and {@link featuresCol} from the given dataset,
   * and put it in an RDD with strong types.
   * Validates the label on the classifier is a valid integer in the range [0, numClasses).
   * @param dataset (undocumented)
   * @param numClasses (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> extractInstances (org.apache.spark.sql.Dataset<?> dataset, int numClasses)  ;
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
