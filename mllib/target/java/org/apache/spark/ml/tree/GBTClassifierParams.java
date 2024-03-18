package org.apache.spark.ml.tree;
public  interface GBTClassifierParams extends org.apache.spark.ml.tree.GBTParams, org.apache.spark.ml.tree.TreeEnsembleClassifierParams, org.apache.spark.ml.tree.HasVarianceImpurity {
  /**
   * Loss function which GBT tries to minimize. (case-insensitive)
   * Supported: "logistic"
   * (default = logistic)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> lossType ()  ;
  /** @group getParam */
  public  java.lang.String getLossType ()  ;
  /** (private[ml]) Convert new loss to old loss. */
    org.apache.spark.mllib.tree.loss.ClassificationLoss getOldLossType ()  ;
}
