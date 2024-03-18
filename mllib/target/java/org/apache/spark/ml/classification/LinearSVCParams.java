package org.apache.spark.ml.classification;
/** Params for linear SVM Classifier. */
public  interface LinearSVCParams extends org.apache.spark.ml.classification.ClassifierParams, org.apache.spark.ml.param.shared.HasRegParam, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasFitIntercept, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasStandardization, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.param.shared.HasAggregationDepth, org.apache.spark.ml.param.shared.HasThreshold, org.apache.spark.ml.param.shared.HasMaxBlockSizeInMB {
  /**
   * Param for threshold in binary classification prediction.
   * For LinearSVC, this threshold is applied to the rawPrediction, rather than a probability.
   * This threshold can be any real number, where Inf will make all predictions 0.0
   * and -Inf will make all predictions 1.0.
   * Default: 0.0
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam threshold ()  ;
}
