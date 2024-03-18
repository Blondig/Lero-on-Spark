package org.apache.spark.ml.stat;
/**
 * Conduct the two-sided Kolmogorov Smirnov (KS) test for data sampled from a
 * continuous distribution. By comparing the largest difference between the empirical cumulative
 * distribution of the sample data and the theoretical distribution we can provide a test for the
 * the null hypothesis that the sample data comes from that theoretical distribution.
 * For more information on KS Test:
 * @see <a href="https://en.wikipedia.org/wiki/Kolmogorov%E2%80%93Smirnov_test">
 * Kolmogorov-Smirnov test (Wikipedia)</a>
 */
// not preceding
public  class KolmogorovSmirnovTest$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KolmogorovSmirnovTest$ MODULE$ = null;
  /**
   * Convenience function to conduct a one-sample, two-sided Kolmogorov-Smirnov test for probability
   * distribution equality. Currently supports the normal distribution, taking as parameters
   * the mean and standard deviation.
   * <p>
   * @param dataset A <code>Dataset</code> or a <code>DataFrame</code> containing the sample of data to test
   * @param sampleCol Name of sample column in dataset, of any numerical type
   * @param distName a <code>String</code> name for a theoretical distribution, currently only support "norm".
   * @param params <code>Double*</code> specifying the parameters to be used for the theoretical distribution.
   *              For "norm" distribution, the parameters includes mean and variance.
   * @return DataFrame containing the test result for the input sampled data.
   *         This DataFrame will contain a single Row with the following fields:
   *          - <code>pValue: Double</code>
   *          - <code>statistic: Double</code>
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<?> dataset, java.lang.String sampleCol, java.lang.String distName, double... params)  { throw new RuntimeException(); }
  public   KolmogorovSmirnovTest$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<?> dataset, java.lang.String sampleCol, scala.Function1<java.lang.Object, java.lang.Object> cdf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<?> dataset, java.lang.String sampleCol, org.apache.spark.api.java.function.Function<java.lang.Double, java.lang.Double> cdf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<?> dataset, java.lang.String sampleCol, java.lang.String distName, scala.collection.Seq<java.lang.Object> params)  { throw new RuntimeException(); }
}
