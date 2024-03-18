package org.apache.spark.ml.image;
public  class SamplePathFilter$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SamplePathFilter$ MODULE$ = null;
  public   SamplePathFilter$ ()  { throw new RuntimeException(); }
  public  java.lang.String ratioParam ()  { throw new RuntimeException(); }
  public  java.lang.String seedParam ()  { throw new RuntimeException(); }
  public  boolean isFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * Sets the HDFS PathFilter flag and then restores it.
   * Only applies the filter if sampleRatio is less than 1.
   * <p>
   * @param sampleRatio Fraction of the files that the filter picks
   * @param spark Existing Spark session
   * @param seed Random number seed
   * @param f The function to evaluate after setting the flag
   * @return Returns the evaluation result T of the function
   */
  public <T extends java.lang.Object> T withPathFilter (double sampleRatio, org.apache.spark.sql.SparkSession spark, long seed, scala.Function0<T> f)  { throw new RuntimeException(); }
}
