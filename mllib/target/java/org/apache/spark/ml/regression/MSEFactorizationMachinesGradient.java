package org.apache.spark.ml.regression;
/**
 * FM with mse
 * prediction formula:
 * <pre><code>
 *   \hat{y} = y_{fm}
 * </code></pre>
 * loss formula:
 * <pre><code>
 *   (\hat{y} - y) ^ 2
 * </code></pre>
 * multiplier formula:
 * <pre><code>
 *   \frac{\partial l}{\partial \hat{y}} \cdot
 *   \frac{\partial \hat{y}}{\partial y_{fm}} =
 *   2 * (\hat{y} - y)
 * </code></pre>
 */
  class MSEFactorizationMachinesGradient extends org.apache.spark.ml.regression.BaseFactorizationMachinesGradient implements org.apache.spark.internal.Logging {
  public   MSEFactorizationMachinesGradient (int factorSize, boolean fitIntercept, boolean fitLinear, int numFeatures)  { throw new RuntimeException(); }
  protected  double getLoss (double rawPrediction, double label)  { throw new RuntimeException(); }
  protected  double getMultiplier (double rawPrediction, double label)  { throw new RuntimeException(); }
  public  double getPrediction (double rawPrediction)  { throw new RuntimeException(); }
}
