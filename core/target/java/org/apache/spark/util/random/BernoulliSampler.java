package org.apache.spark.util.random;
/**
 * :: DeveloperApi ::
 * A sampler based on Bernoulli trials.
 * <p>
 * param:  fraction the sampling fraction, aka Bernoulli sampling probability
 * @param <T>  item type
 */
public  class BernoulliSampler<T extends java.lang.Object> implements org.apache.spark.util.random.RandomSampler<T, T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BernoulliSampler (double fraction, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.util.random.BernoulliSampler<T> clone ()  { throw new RuntimeException(); }
  public  int sample ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
}
