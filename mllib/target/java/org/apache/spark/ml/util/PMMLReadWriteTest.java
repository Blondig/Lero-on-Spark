package org.apache.spark.ml.util;
public  interface PMMLReadWriteTest extends org.apache.spark.ml.util.TempDirectory {
  /**
   * Test PMML export. Requires exported model is small enough to be loaded locally.
   * Checks that the model can be exported and the result is valid PMML, but does not check
   * the specific contents of the model.
   * @param sc (undocumented)
   * @param instance (undocumented)
   * @param checkModelData (undocumented)
   */
  public <T extends org.apache.spark.ml.param.Params> void testPMMLWrite (org.apache.spark.SparkContext sc, T instance, scala.Function1<org.dmg.pmml.PMML, scala.runtime.BoxedUnit> checkModelData)  ;
}
