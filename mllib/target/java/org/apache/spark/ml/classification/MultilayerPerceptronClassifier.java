package org.apache.spark.ml.classification;
/**
 * Classifier trainer based on the Multilayer Perceptron.
 * Each layer has sigmoid activation function, output layer has softmax.
 * Number of inputs has to be equal to the size of feature vectors.
 * Number of outputs has to be equal to the total number of labels.
 * <p>
 */
public  class MultilayerPerceptronClassifier extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.MultilayerPerceptronClassifier, org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel> implements org.apache.spark.ml.classification.MultilayerPerceptronParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /** String name for "l-bfgs" solver. */
  static   java.lang.String LBFGS ()  { throw new RuntimeException(); }
  /** String name for "gd" (minibatch gradient descent) solver. */
  static   java.lang.String GD ()  { throw new RuntimeException(); }
  /** Set of solvers that MultilayerPerceptronClassifier supports. */
  static   java.lang.String[] supportedSolvers ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntArrayParam layers ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> initialWeights ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam blockSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MultilayerPerceptronClassifier (java.lang.String uid)  { throw new RuntimeException(); }
  public   MultilayerPerceptronClassifier ()  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link layers}.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier setLayers (int[] value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link blockSize}.
   * Default is 128.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier setBlockSize (int value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link solver}.
   * Default is "l-bfgs".
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier setSolver (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations.
   * Default is 100.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier setMaxIter (int value)  { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * Default is 1E-6.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier setTol (double value)  { throw new RuntimeException(); }
  /**
   * Set the seed for weights initialization if weights are not set
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier setSeed (long value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link initialWeights}.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier setInitialWeights (org.apache.spark.ml.linalg.Vector value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link stepSize} (applicable only for solver "gd").
   * Default is 0.03.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier setStepSize (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassifier copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  /**
   * Train a model using the given dataset and parameters.
   * Developers can implement this instead of <code>fit()</code> to avoid dealing with schema validation
   * and copying parameters into the model.
   * <p>
   * @param dataset Training dataset
   * @return Fitted model
   */
  protected  org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
}
