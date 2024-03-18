package org.apache.spark.util;
/**
 * An interface to represent clocks, so that they can be mocked out in unit tests.
 */
public  interface Clock {
  /** @return Current system time, in ms. */
  public  long getTimeMillis ()  ;
  /**
   * Current value of high resolution time source, in ns.
   * <p>
   * This method abstracts the call to the JRE's <code>System.nanoTime()</code> call. As with that method, the
   * value here is not guaranteed to be monotonically increasing, but rather a higher resolution
   * time source for use in the calculation of time intervals. The characteristics of the values
   * returned may very from JVM to JVM (or even the same JVM running on different OSes or CPUs), but
   * in general it should be preferred over {@link getTimeMillis()} when calculating time differences.
   * <p>
   * Specifically for Linux on x64 architecture, the following links provide useful information
   * about the characteristics of the value returned:
   * <p>
   *  http://btorpey.github.io/blog/2014/02/18/clock-sources-in-linux/
   *  https://stackoverflow.com/questions/10921210/cpu-tsc-fetch-operation-especially-in-multicore-multi-processor-environment
   * <p>
   * TL;DR: on modern (2.6.32+) Linux kernels with modern (AMD K8+) CPUs, the values returned by
   * <code>System.nanoTime()</code> are consistent across CPU cores *and* packages, and provide always
   * increasing values (although it may not be completely monotonic when the system clock is
   * adjusted by NTP daemons using time slew).
   * @return (undocumented)
   */
  public  long nanoTime ()  ;
  /**
   * Wait until the wall clock reaches at least the given time. Note this may not actually wait for
   * the actual difference between the current and target times, since the wall clock may drift.
   * @param targetTime (undocumented)
   * @return (undocumented)
   */
  public  long waitTillTime (long targetTime)  ;
}
