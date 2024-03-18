package org.apache.spark.ml.regression;
/**
 * Summary of {@link GeneralizedLinearRegression} fitting and model.
 * <p>
 * param:  dataset Dataset to be summarized.
 * param:  origModel Model to be summarized.  This is copied to create an internal
 *                  model which cannot be modified from outside.
 * param:  diagInvAtWA diagonal of matrix (A^T * W * A)^-1 in the last iteration
 * param:  numIterations number of iterations
 * param:  solver the solver algorithm used for model training
 */
public  class GeneralizedLinearRegressionTrainingSummary extends org.apache.spark.ml.regression.GeneralizedLinearRegressionSummary implements scala.Serializable {
  // not preceding
     GeneralizedLinearRegressionTrainingSummary (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.regression.GeneralizedLinearRegressionModel origModel, double[] diagInvAtWA, int numIterations, java.lang.String solver)  { throw new RuntimeException(); }
  // not preceding
  public  double[] coefficientStandardErrors ()  { throw new RuntimeException(); }
  // not preceding
    scala.Tuple5<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>[] coefficientsWithStatistics ()  { throw new RuntimeException(); }
  /**
   * Whether the underlying <code>WeightedLeastSquares</code> using the "normal" solver.
   * @return (undocumented)
   */
    boolean isNormalSolver ()  { throw new RuntimeException(); }
  public  int numIterations ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] pValues ()  { throw new RuntimeException(); }
  public  java.lang.String solver ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] tValues ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
