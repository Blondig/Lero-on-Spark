package org.apache.spark.scheduler;
public  class HealthTracker$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HealthTracker$ MODULE$ = null;
  public   HealthTracker$ ()  { throw new RuntimeException(); }
  /**
   * Returns true if the excludeOnFailure is enabled, based on checking the configuration
   * in the following order:
   * 1. Is it specifically enabled or disabled?
   * 2. Is it enabled via the legacy timeout conf?
   * 3. Default is off
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  boolean isExcludeOnFailureEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  long getExludeOnFailureTimeout (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Verify that exclude on failure configurations are consistent; if not, throw an exception.
   * Should only be called if excludeOnFailure is enabled.
   * <p>
   * The configuration is expected to adhere to a few invariants.  Default values
   * follow these rules of course, but users may unwittingly change one configuration
   * without making the corresponding adjustment elsewhere. This ensures we fail-fast when
   * there are such misconfigurations.
   * @param conf (undocumented)
   */
  public  void validateExcludeOnFailureConfs (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
