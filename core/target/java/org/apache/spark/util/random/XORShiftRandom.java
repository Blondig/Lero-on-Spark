package org.apache.spark.util.random;
/**
 * This class implements a XORShift random number generator algorithm
 * Source:
 * Marsaglia, G. (2003). Xorshift RNGs. Journal of Statistical Software, Vol. 8, Issue 14.
 * @see <a href="http://www.jstatsoft.org/v08/i14/paper">Paper</a>
 * This implementation is approximately 3.5 times faster than
 * {@link java.util.Random java.util.Random}, partly because of the algorithm, but also due
 * to renouncing thread safety. JDK's implementation uses an AtomicLong seed, this class
 * uses a regular Long. We can forgo thread safety since we use a new instance of the RNG
 * for each thread.
 */
  class XORShiftRandom extends java.util.Random {
  /** Hash seeds to have 0/1 bits throughout. */
  static   long hashSeed (long seed)  { throw new RuntimeException(); }
  public   XORShiftRandom (long init)  { throw new RuntimeException(); }
  public   XORShiftRandom ()  { throw new RuntimeException(); }
  protected  int next (int bits)  { throw new RuntimeException(); }
  public  void setSeed (long s)  { throw new RuntimeException(); }
}
