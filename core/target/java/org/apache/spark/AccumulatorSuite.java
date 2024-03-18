package org.apache.spark;
public  class AccumulatorSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.matchers.must.Matchers, org.apache.spark.LocalSparkContext {
  /**
   * Create a long accumulator and register it to <code>AccumulatorContext</code>.
   * @param name (undocumented)
   * @param countFailedValues (undocumented)
   * @param initValue (undocumented)
   * @param id (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.util.LongAccumulator createLongAccum (java.lang.String name, boolean countFailedValues, long initValue, long id)  { throw new RuntimeException(); }
  /**
   * Make an <code>AccumulableInfo</code> out of an <code>AccumulatorV2</code> with the intent to use the
   * info as an accumulator update.
   * @param a (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.scheduler.AccumulableInfo makeInfo (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
  /**
   * Run one or more Spark jobs and verify that in at least one job the peak execution memory
   * accumulator is updated afterwards.
   * @param sc (undocumented)
   * @param testName (undocumented)
   * @param testBody (undocumented)
   */
  static public  void verifyPeakExecutionMemorySet (org.apache.spark.SparkContext sc, java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> testBody)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.KeyWord key ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.ValueWord value ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AWord a ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AnWord an ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.TheSameInstanceAsPhrase theSameInstanceAs ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.RegexWord regex ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DecidedWord decided ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DeterminedWord determined ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.TheAfterWord after ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.FullyMatchWord fullyMatch ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.StartWithWord startWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EndWithWord endWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.IncludeWord include ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.HaveWord have ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.BeWord be ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ContainWord contain ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.NotWord not ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.LengthWord length ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SizeWord size ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SortedWord sorted ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.DefinedWord defined ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ExistWord exist ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ReadableWord readable ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.WritableWord writable ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EmptyWord empty ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.CompileWord compile ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.TypeCheckWord typeCheck ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.MatchPatternWord matchPattern ()  { throw new RuntimeException(); }
  public   AccumulatorSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
}
