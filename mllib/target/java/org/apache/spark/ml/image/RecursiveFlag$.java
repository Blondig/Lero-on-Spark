package org.apache.spark.ml.image;
public  class RecursiveFlag$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RecursiveFlag$ MODULE$ = null;
  public   RecursiveFlag$ ()  { throw new RuntimeException(); }
  /**
   * Sets the spark recursive flag and then restores it.
   * <p>
   * @param value Value to set
   * @param spark Existing spark session
   * @param f The function to evaluate after setting the flag
   * @return Returns the evaluation result T of the function
   */
  public <T extends java.lang.Object> T withRecursiveFlag (boolean value, org.apache.spark.sql.SparkSession spark, scala.Function0<T> f)  { throw new RuntimeException(); }
}
