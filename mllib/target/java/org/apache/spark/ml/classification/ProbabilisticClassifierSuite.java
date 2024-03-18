package org.apache.spark.ml.classification;
public  class ProbabilisticClassifierSuite extends org.apache.spark.SparkFunSuite {
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
  /**
   * Helper for testing that a ProbabilisticClassificationModel computes
   * the same predictions across all combinations of output columns
   * (rawPrediction/probability/prediction) turned on/off. Makes sure the
   * output column values match by comparing vs. the case with all 3 output
   * columns turned on.
   * @param mlTest (undocumented)
   * @param model (undocumented)
   * @param testData (undocumented)
   */
  static public <FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<FeaturesType, M>> void testPredictMethods (org.apache.spark.ml.util.MLTest mlTest, M model, org.apache.spark.sql.Dataset<?> testData)  { throw new RuntimeException(); }
  public   ProbabilisticClassifierSuite ()  { throw new RuntimeException(); }
}
