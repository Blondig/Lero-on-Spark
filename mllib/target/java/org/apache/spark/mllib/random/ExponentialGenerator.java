package org.apache.spark.mllib.random;
/**
 * Generates i.i.d. samples from the exponential distribution with the given mean.
 * <p>
 * param:  mean mean for the exponential distribution.
 */
public  class ExponentialGenerator implements org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> {
  // not preceding
  public   ExponentialGenerator (double mean)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.random.ExponentialGenerator copy ()  { throw new RuntimeException(); }
  public  double mean ()  { throw new RuntimeException(); }
  public  double nextValue ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
}
