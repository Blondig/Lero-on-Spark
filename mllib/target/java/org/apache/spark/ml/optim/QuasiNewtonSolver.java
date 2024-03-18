package org.apache.spark.ml.optim;
/**
 * A class for solving the normal equations using Quasi-Newton optimization methods.
 */
  class QuasiNewtonSolver implements org.apache.spark.ml.optim.NormalEquationSolver {
  public   QuasiNewtonSolver (boolean fitIntercept, int maxIter, double tol, scala.Option<scala.Function1<java.lang.Object, java.lang.Object>> l1RegFunc)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.optim.NormalEquationSolution solve (double bBar, double bbBar, org.apache.spark.ml.linalg.DenseVector abBar, org.apache.spark.ml.linalg.DenseVector aaBar, org.apache.spark.ml.linalg.DenseVector aBar)  { throw new RuntimeException(); }
}
