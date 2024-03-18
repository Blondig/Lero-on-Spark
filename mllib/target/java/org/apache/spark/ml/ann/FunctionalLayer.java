package org.apache.spark.ml.ann;
/**
 * Functional layer properties, y = f(x)
 * <p>
 * param:  activationFunction activation function
 */
  class FunctionalLayer implements org.apache.spark.ml.ann.Layer {
  // not preceding
  public   FunctionalLayer (org.apache.spark.ml.ann.ActivationFunction activationFunction)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.ActivationFunction activationFunction ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel createModel (breeze.linalg.DenseVector<java.lang.Object> weights)  { throw new RuntimeException(); }
  public  int getOutputSize (int inputSize)  { throw new RuntimeException(); }
  public  boolean inPlace ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel initModel (breeze.linalg.DenseVector<java.lang.Object> weights, java.util.Random random)  { throw new RuntimeException(); }
  public  int weightSize ()  { throw new RuntimeException(); }
}
