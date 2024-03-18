package org.apache.spark.ml.classification;
/** Params for Multilayer Perceptron. */
public  interface MultilayerPerceptronParams extends org.apache.spark.ml.classification.ProbabilisticClassifierParams, org.apache.spark.ml.param.shared.HasSeed, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasStepSize, org.apache.spark.ml.param.shared.HasSolver, org.apache.spark.ml.param.shared.HasBlockSize {
  /** @group expertGetParam */
  public  org.apache.spark.ml.linalg.Vector getInitialWeights ()  ;
  /** @group getParam */
  public  int[] getLayers ()  ;
  /**
   * The initial weights of the model.
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> initialWeights ()  ;
  /**
   * Layer sizes including input size and output size.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntArrayParam layers ()  ;
  /**
   * The solver algorithm for optimization.
   * Supported options: "gd" (minibatch gradient descent) or "l-bfgs".
   * Default: "l-bfgs"
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> solver ()  ;
}
