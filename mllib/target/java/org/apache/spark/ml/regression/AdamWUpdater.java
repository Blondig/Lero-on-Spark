package org.apache.spark.ml.regression;
/**
 * AdamW optimizer.
 * <p>
 * The implementation is based upon:
 * <a href="https://arxiv.org/pdf/1711.05101.pdf">
 * Loshchilov I, Hutter F. "DECOUPLED WEIGHT DECAY REGULARIZATION" 2019</a>.
 * <p>
 * The main contribution of this paper is to improve regularization in Adam
 * by decoupling the weight decay from the gradient-based update.
 * This paper proposed a simple modification to recover the original formulation of
 * weight decay regularization by decoupling the weight decay from the optimization steps
 * taken w.r.t. the loss function.
 */
  class AdamWUpdater extends org.apache.spark.mllib.optimization.Updater implements org.apache.spark.internal.Logging {
  public   AdamWUpdater (int weightSize)  { throw new RuntimeException(); }
  public  double beta1 ()  { throw new RuntimeException(); }
  public  double beta1T ()  { throw new RuntimeException(); }
  public  double beta2 ()  { throw new RuntimeException(); }
  public  double beta2T ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector weightsOld, org.apache.spark.mllib.linalg.Vector gradient, double stepSize, int iter, double regParam)  { throw new RuntimeException(); }
  public  double epsilon ()  { throw new RuntimeException(); }
  public  breeze.linalg.Vector<java.lang.Object> m ()  { throw new RuntimeException(); }
  public  breeze.linalg.Vector<java.lang.Object> v ()  { throw new RuntimeException(); }
}
