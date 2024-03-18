package org.apache.spark.ml.classification;
/**
 * Abstraction for training results.
 */
public  interface TrainingSummary {
  /**
   *  objective function (scaled loss + regularization) at each iteration.
   *  It contains one more element, the initial state, than number of iterations.
   * @return (undocumented)
   */
  public  double[] objectiveHistory ()  ;
  /** Number of training iterations. */
  public  int totalIterations ()  ;
}
