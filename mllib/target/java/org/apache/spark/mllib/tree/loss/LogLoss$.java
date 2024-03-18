package org.apache.spark.mllib.tree.loss;
/**
 * Class for log loss calculation (for classification).
 * This uses twice the binomial negative log likelihood, called "deviance" in Friedman (1999).
 * <p>
 * The log loss is defined as:
 *   2 log(1 + exp(-2 y F(x)))
 * where y is a label in {-1, 1} and F(x) is the model prediction for features x.
 */
public  class LogLoss$ implements org.apache.spark.mllib.tree.loss.ClassificationLoss {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LogLoss$ MODULE$ = null;
  public   LogLoss$ ()  { throw new RuntimeException(); }
  /**
   * Method to calculate the loss gradients for the gradient boosting calculation for binary
   * classification
   * The gradient with respect to F(x) is: - 4 y / (1 + exp(2 y F(x)))
   * @param prediction Predicted label.
   * @param label True label.
   * @return Loss gradient
   */
  public  double gradient (double prediction, double label)  { throw new RuntimeException(); }
    double computeError (double prediction, double label)  { throw new RuntimeException(); }
  /**
   * Returns the estimated probability of a label of 1.0.
   * @param margin (undocumented)
   * @return (undocumented)
   */
    double computeProbability (double margin)  { throw new RuntimeException(); }
}
