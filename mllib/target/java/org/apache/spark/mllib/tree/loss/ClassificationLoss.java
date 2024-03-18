package org.apache.spark.mllib.tree.loss;
public  interface ClassificationLoss extends org.apache.spark.mllib.tree.loss.Loss {
  /**
   * Computes the class probability given the margin.
   * @param margin (undocumented)
   * @return (undocumented)
   */
    double computeProbability (double margin)  ;
}
