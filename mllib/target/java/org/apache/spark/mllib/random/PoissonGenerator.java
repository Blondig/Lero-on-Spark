package org.apache.spark.mllib.random;
/**
 * Generates i.i.d. samples from the Poisson distribution with the given mean.
 * <p>
 * param:  mean mean for the Poisson distribution.
 */
public  class PoissonGenerator implements org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> {
  // not preceding
  public   PoissonGenerator (double mean)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.random.PoissonGenerator copy ()  { throw new RuntimeException(); }
  public  double mean ()  { throw new RuntimeException(); }
  public  double nextValue ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
}
