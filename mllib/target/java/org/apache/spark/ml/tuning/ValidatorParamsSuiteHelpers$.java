package org.apache.spark.ml.tuning;
public  class ValidatorParamsSuiteHelpers$ implements org.scalatest.Assertions {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ValidatorParamsSuiteHelpers$ MODULE$ = null;
  public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  public   ValidatorParamsSuiteHelpers$ ()  { throw new RuntimeException(); }
  /**
   * Assert sequences of estimatorParamMaps are identical.
   * If the values for a parameter are not directly comparable with ===
   * and are instead Params types themselves then their corresponding paramMaps
   * are compared against each other.
   * @param pMaps (undocumented)
   * @param pMaps2 (undocumented)
   */
  public  void compareParamMaps (org.apache.spark.ml.param.ParamMap[] pMaps, org.apache.spark.ml.param.ParamMap[] pMaps2)  { throw new RuntimeException(); }
  /**
   * When nested estimators (ex. OneVsRest) are saved within meta-algorithms such as
   * CrossValidator and TrainValidationSplit, relative paths should be used to store
   * the path of the estimator so that if the parent directory changes, loading the
   * model still works.
   * @param instance (undocumented)
   * @param tempDir (undocumented)
   */
  public <T extends org.apache.spark.ml.param.Params> void testFileMove (T instance, java.io.File tempDir)  { throw new RuntimeException(); }
}
