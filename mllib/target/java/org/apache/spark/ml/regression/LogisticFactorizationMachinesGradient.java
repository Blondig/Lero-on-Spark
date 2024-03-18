package org.apache.spark.ml.regression;
/**
 * FM with logistic loss
 * prediction formula:
 * <pre><code>
 *   \hat{y} = \sigmoid(y_{fm})
 * </code></pre>
 * loss formula:
 * <pre><code>
 *   - y * log(\hat{y}) - (1 - y) * log(1 - \hat{y})
 * </code></pre>
 * multiplier formula:
 * <pre><code>
 *   \frac{\partial l}{\partial \hat{y}} \cdot
 *   \frac{\partial \hat{y}}{\partial y_{fm}} =
 *   \hat{y} - y
 * </code></pre>
 */
  class LogisticFactorizationMachinesGradient extends org.apache.spark.ml.regression.BaseFactorizationMachinesGradient implements org.apache.spark.internal.Logging {
  public   LogisticFactorizationMachinesGradient (int factorSize, boolean fitIntercept, boolean fitLinear, int numFeatures)  { throw new RuntimeException(); }
  protected  double getLoss (double rawPrediction, double label)  { throw new RuntimeException(); }
  protected  double getMultiplier (double rawPrediction, double label)  { throw new RuntimeException(); }
  public  double getPrediction (double rawPrediction)  { throw new RuntimeException(); }
}
