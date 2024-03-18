package org.apache.spark.ml.image;
/**
 * Filter that allows loading a fraction of HDFS files.
 */
public  class SamplePathFilter extends org.apache.hadoop.conf.Configured implements org.apache.hadoop.fs.PathFilter {
  static public  java.lang.String ratioParam ()  { throw new RuntimeException(); }
  static public  java.lang.String seedParam ()  { throw new RuntimeException(); }
  static public  boolean isFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
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
  static public <T extends java.lang.Object> T withPathFilter (double sampleRatio, org.apache.spark.sql.SparkSession spark, long seed, scala.Function0<T> f)  { throw new RuntimeException(); }
  public   SamplePathFilter ()  { throw new RuntimeException(); }
  public  scala.util.Random random ()  { throw new RuntimeException(); }
  public  double sampleRatio ()  { throw new RuntimeException(); }
  public  void setConf (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  boolean accept (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
}
