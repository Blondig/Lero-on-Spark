package org.apache.spark.ml.regression;
public  class FactorizationMachines$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FactorizationMachines$ MODULE$ = null;
  public   FactorizationMachines$ ()  { throw new RuntimeException(); }
  /** String name for "gd". */
  public  java.lang.String GD ()  { throw new RuntimeException(); }
  /** String name for "adamW". */
  public  java.lang.String AdamW ()  { throw new RuntimeException(); }
  /** Set of solvers that FactorizationMachines supports. */
  public  java.lang.String[] supportedSolvers ()  { throw new RuntimeException(); }
  /** String name for "logisticLoss". */
  public  java.lang.String LogisticLoss ()  { throw new RuntimeException(); }
  /** String name for "squaredError". */
  public  java.lang.String SquaredError ()  { throw new RuntimeException(); }
  /** Set of loss function names that FactorizationMachines supports. */
  public  java.lang.String[] supportedRegressorLosses ()  { throw new RuntimeException(); }
  public  java.lang.String[] supportedClassifierLosses ()  { throw new RuntimeException(); }
  public  java.lang.String[] supportedLosses ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.Updater parseSolver (java.lang.String solver, int coefficientsSize)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.BaseFactorizationMachinesGradient parseLoss (java.lang.String lossFunc, int factorSize, boolean fitIntercept, boolean fitLinear, int numFeatures)  { throw new RuntimeException(); }
  public  scala.Tuple3<java.lang.Object, org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Matrix> splitCoefficients (org.apache.spark.ml.linalg.Vector coefficients, int numFeatures, int factorSize, boolean fitIntercept, boolean fitLinear)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector combineCoefficients (double intercept, org.apache.spark.ml.linalg.Vector linear, org.apache.spark.ml.linalg.Matrix factors, boolean fitIntercept, boolean fitLinear)  { throw new RuntimeException(); }
  public  double getRawPrediction (org.apache.spark.ml.linalg.Vector features, double intercept, org.apache.spark.ml.linalg.Vector linear, org.apache.spark.ml.linalg.Matrix factors)  { throw new RuntimeException(); }
}
