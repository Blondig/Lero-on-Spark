package org.apache.spark.ml.regression;
/**
 * Factorization Machines base gradient class
 * Implementing the raw FM formula, include raw prediction and raw gradient,
 * then inherit the base class to implement special gradient class(like logloss, mse).
 * <p>
 * Factorization Machines raw formula:
 * <pre><code>
 *   y_{fm} = w_0 + \sum\limits^n_{i-1} w_i x_i +
 *     \sum\limits^n_{i=1} \sum\limits^n_{j=i+1} \langle v_i, v_j \rangle x_i x_j
 * </code></pre>
 * the pairwise interactions (2-way term) can be reformulated:
 * <pre><code>
 *   \sum\limits^n_{i=1} \sum\limits^n_{j=i+1} \langle v_i, v_j \rangle x_i x_j
 *   = \frac{1}{2}\sum\limits^k_{f=1}
 *   \left(\left( \sum\limits^n_{i=1}v_{i,f}x_i \right)^2 -
 *     \sum\limits^n_{i=1}v_{i,f}^2x_i^2 \right)
 * </code></pre>
 * and the gradients are:
 * <pre><code>
 *   \frac{\partial}{\partial\theta}y_{fm} = \left\{
 *   \begin{align}
 *   &amp;1, &amp; if\ \theta\ is\ w_0 \\
 *   &amp;x_i, &amp; if\ \theta\ is\ w_i \\
 *   &amp;x_i{\sum}^n_{j=1}v_{j,f}x_j - v_{i,f}x_i^2, &amp; if\ \theta\ is\ v_{i,j} \\
 *   \end{align}
 *   \right.
 * </code></pre>
 * <p>
 * Factorization Machines formula with prediction task:
 * <pre><code>
 *   \hat{y} = p\left( y_{fm} \right)
 * </code></pre>
 * p is the prediction function, for binary classification task is sigmoid.
 * The loss function gradient formula:
 * <pre><code>
 *   \frac{\partial}{\partial\theta} l\left( \hat{y},y \right) =
 *   \frac{\partial}{\partial\theta} l\left( p\left( y_{fm} \right),y \right) =
 *   \frac{\partial l}{\partial \hat{y}} \cdot
 *   \frac{\partial \hat{y}}{\partial y_{fm}} \cdot
 *   \frac{\partial y_{fm}}{\partial\theta}
 * </code></pre>
 * Last term is same for all task, so be implemented in base gradient class.
 * last term named rawGradient in following code, and first two term named multiplier.
 */
 abstract class BaseFactorizationMachinesGradient extends org.apache.spark.mllib.optimization.Gradient {
  public   BaseFactorizationMachinesGradient (int factorSize, boolean fitIntercept, boolean fitLinear, int numFeatures)  { throw new RuntimeException(); }
  public  double compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights, org.apache.spark.mllib.linalg.Vector cumGradient)  { throw new RuntimeException(); }
  protected abstract  double getLoss (double rawPrediction, double label)  ;
  protected abstract  double getMultiplier (double rawPrediction, double label)  ;
  public abstract  double getPrediction (double rawPrediction)  ;
  public  scala.Tuple2<java.lang.Object, double[]> getRawPrediction (org.apache.spark.mllib.linalg.Vector data, org.apache.spark.mllib.linalg.Vector weights)  { throw new RuntimeException(); }
}
