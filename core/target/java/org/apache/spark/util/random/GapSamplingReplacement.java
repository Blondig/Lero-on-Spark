package org.apache.spark.util.random;
/** advance to first sample as part of object construction. */
  class GapSamplingReplacement implements scala.Serializable {
  public  double f ()  { throw new RuntimeException(); }
  public  java.util.Random rng ()  { throw new RuntimeException(); }
  // not preceding
  public   GapSamplingReplacement (double f, java.util.Random rng, double epsilon)  { throw new RuntimeException(); }
  protected  double q ()  { throw new RuntimeException(); }
  /**
   * Sample from Poisson distribution, conditioned such that the sampled value is >= 1.
   * This is an adaptation from the algorithm for Generating Poisson distributed random variables:
   * http://en.wikipedia.org/wiki/Poisson_distribution
   * @return (undocumented)
   */
  protected  int poissonGE1 ()  { throw new RuntimeException(); }
  public  int sample ()  { throw new RuntimeException(); }
}
