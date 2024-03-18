package org.apache.spark.ml.clustering;
public  class KMeansSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KMeansSuite$ MODULE$ = null;
  public   KMeansSuite$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> generateKMeansData (org.apache.spark.sql.SparkSession spark, int rows, int dim, int k)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> generateSparseData (org.apache.spark.sql.SparkSession spark, int rows, int dim, int seed)  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
}
