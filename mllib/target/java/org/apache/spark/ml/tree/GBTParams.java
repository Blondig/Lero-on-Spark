package org.apache.spark.ml.tree;
/**
 * Parameters for Gradient-Boosted Tree algorithms.
 * <p>
 * Note: Marked as private since this may be made public in the future.
 */
public  interface GBTParams extends org.apache.spark.ml.tree.TreeEnsembleParams, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasStepSize, org.apache.spark.ml.param.shared.HasValidationIndicatorCol {
  /** (private[ml]) Create a BoostingStrategy instance to use with the old API. */
    org.apache.spark.mllib.tree.configuration.BoostingStrategy getOldBoostingStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, scala.Enumeration.Value oldAlgo)  ;
  /** Get old Gradient Boosting Loss type */
    org.apache.spark.mllib.tree.loss.Loss getOldLossType ()  ;
  /** @group getParam */
  public  double getValidationTol ()  ;
  /**
   * Param for Step size (a.k.a. learning rate) in interval (0, 1] for shrinking
   * the contribution of each estimator.
   * (default = 0.1)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  ;
  /**
   * Threshold for stopping early when fit with validation is used.
   * (This parameter is ignored when fit without validation is used.)
   * The decision to stop early is decided based on this logic:
   * If the current loss on the validation set is greater than 0.01, the diff
   * of validation error is compared to relative tolerance which is
   * validationTol * (current loss on the validation set).
   * If the current loss on the validation set is less than or equal to 0.01,
   * the diff of validation error is compared to absolute tolerance which is
   * validationTol * 0.01.
   * @group param
   * @see validationIndicatorCol
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam validationTol ()  ;
}
