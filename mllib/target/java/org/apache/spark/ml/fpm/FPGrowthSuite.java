package org.apache.spark.ml.fpm;
public  class FPGrowthSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext, org.apache.spark.ml.util.DefaultReadWriteTest {
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getFPGrowthData (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  public   FPGrowthSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<?> dataset ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
}
