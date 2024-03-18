package org.apache.spark.util.random;
public  class SamplingUtils {
  /**
   * Reservoir sampling implementation that also returns the input size.
   * <p>
   * @param input input size
   * @param k reservoir size
   * @param seed random seed
   * @return (samples, input size)
   * @param evidence$1 (undocumented)
   */
  static public <T extends java.lang.Object> scala.Tuple2<java.lang.Object, java.lang.Object> reservoirSampleAndCount (scala.collection.Iterator<T> input, int k, long seed, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Returns a sampling rate that guarantees a sample of size greater than or equal to
   * sampleSizeLowerBound 99.99% of the time.
   * <p>
   * How the sampling rate is determined:
   * <p>
   * Let p = num / total, where num is the sample size and total is the total number of
   * datapoints in the RDD. We're trying to compute q {@literal >} p such that
   *   - when sampling with replacement, we're drawing each datapoint with prob_i ~ Pois(q),
   *     where we want to guarantee
   *     Pr[s {@literal <} num] {@literal <} 0.0001 for s = sum(prob_i for i from 0 to total),
   *     i.e. the failure rate of not having a sufficiently large sample {@literal <} 0.0001.
   *     Setting q = p + 5 * sqrt(p/total) is sufficient to guarantee 0.9999 success rate for
   *     num {@literal >} 12, but we need a slightly larger q (9 empirically determined).
   *   - when sampling without replacement, we're drawing each datapoint with prob_i
   *     ~ Binomial(total, fraction) and our choice of q guarantees 1-delta, or 0.9999 success
   *     rate, where success rate is defined the same as in sampling with replacement.
   * <p>
   * The smallest sampling rate supported is 1e-10 (in order to avoid running into the limit of the
   * RNG's resolution).
   * <p>
   * @param sampleSizeLowerBound sample size
   * @param total size of RDD
   * @param withReplacement whether sampling with replacement
   * @return a sampling rate that guarantees sufficient sample size with 99.99% success rate
   */
  static public  double computeFractionForSampleSize (int sampleSizeLowerBound, long total, boolean withReplacement)  { throw new RuntimeException(); }
}
