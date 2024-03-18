package org.apache.spark.mllib.stat.test;
/**
 * Trait for hypothesis test results.
 * @param <DF>  Return type of <code>degreesOfFreedom</code>.
 */
public  interface TestResult<DF extends java.lang.Object> {
  /**
   * Returns the degree(s) of freedom of the hypothesis test.
   * Return type should be Number(e.g. Int, Double) or tuples of Numbers for toString compatibility.
   * @return (undocumented)
   */
  public  DF degreesOfFreedom ()  ;
  /**
   * Null hypothesis of the test.
   * @return (undocumented)
   */
  public  java.lang.String nullHypothesis ()  ;
  /**
   * The probability of obtaining a test statistic result at least as extreme as the one that was
   * actually observed, assuming that the null hypothesis is true.
   * @return (undocumented)
   */
  public  double pValue ()  ;
  /**
   * Test statistic.
   * @return (undocumented)
   */
  public  double statistic ()  ;
  /**
   * String explaining the hypothesis test result.
   * Specific classes implementing this trait should override this method to output test-specific
   * information.
   * @return (undocumented)
   */
  public  java.lang.String toString ()  ;
}
