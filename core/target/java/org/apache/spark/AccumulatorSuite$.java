package org.apache.spark;
public  class AccumulatorSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AccumulatorSuite$ MODULE$ = null;
  public   AccumulatorSuite$ ()  { throw new RuntimeException(); }
  /**
   * Create a long accumulator and register it to <code>AccumulatorContext</code>.
   * @param name (undocumented)
   * @param countFailedValues (undocumented)
   * @param initValue (undocumented)
   * @param id (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.util.LongAccumulator createLongAccum (java.lang.String name, boolean countFailedValues, long initValue, long id)  { throw new RuntimeException(); }
  /**
   * Make an <code>AccumulableInfo</code> out of an <code>AccumulatorV2</code> with the intent to use the
   * info as an accumulator update.
   * @param a (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.scheduler.AccumulableInfo makeInfo (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
  /**
   * Run one or more Spark jobs and verify that in at least one job the peak execution memory
   * accumulator is updated afterwards.
   * @param sc (undocumented)
   * @param testName (undocumented)
   * @param testBody (undocumented)
   */
  public  void verifyPeakExecutionMemorySet (org.apache.spark.SparkContext sc, java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> testBody)  { throw new RuntimeException(); }
}
