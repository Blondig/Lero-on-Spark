package org.apache.spark.ml.regression;
public  class FMRegressorSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FMRegressorSuite$ MODULE$ = null;
  public   FMRegressorSuite$ ()  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, double[]> generateFactorInteractionInput (org.apache.spark.sql.SparkSession spark, int factorSize, int numFeatures, int numSamples, int seed, boolean fitIntercept, boolean fitLinear)  { throw new RuntimeException(); }
}
