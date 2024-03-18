package org.apache.spark.deploy.history;
public  class ApplicationCacheSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.internal.Logging, org.scalatestplus.mockito.MockitoSugar, org.scalatest.matchers.must.Matchers {
  /**
   * Stub cache operations.
   * The state is kept in a map of {@link CacheKey} to {@link CacheEntry},
   * the <code>probeTime</code> field in the cache entry setting the timestamp of the entry
   */
  public  class StubCacheOperations implements org.apache.spark.deploy.history.ApplicationCacheOperations, org.apache.spark.internal.Logging {
    public   StubCacheOperations ()  { throw new RuntimeException(); }
    public  long attachCount ()  { throw new RuntimeException(); }
    public  void attachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui, boolean completed)  { throw new RuntimeException(); }
    /** Map of attached spark UIs */
    public  scala.collection.mutable.HashMap<org.apache.spark.deploy.history.CacheKey, org.apache.spark.ui.SparkUI> attached ()  { throw new RuntimeException(); }
    public  long detachCount ()  { throw new RuntimeException(); }
    /**
     * Detach a reconstructed UI
     * <p>
     * @param ui Spark UI
     * @param appId (undocumented)
     * @param attemptId (undocumented)
     */
    public  void detachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
    public  long getAppUICount ()  { throw new RuntimeException(); }
    /**
     * Lookup from the internal cache of attached UIs
     * @param appId (undocumented)
     * @param attemptId (undocumented)
     * @return (undocumented)
     */
    public  scala.Option<org.apache.spark.ui.SparkUI> getAttached (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
    /** map to UI instances, including timestamps, which are used in update probes */
    public  scala.collection.mutable.HashMap<org.apache.spark.deploy.history.CacheKey, org.apache.spark.deploy.history.CacheEntry> instances ()  { throw new RuntimeException(); }
    public  org.apache.spark.deploy.history.LoadedAppUI putAndAttach (java.lang.String appId, scala.Option<java.lang.String> attemptId, boolean completed, long started, long ended)  { throw new RuntimeException(); }
    public  org.apache.spark.deploy.history.LoadedAppUI putAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, boolean completed, long started, long ended)  { throw new RuntimeException(); }
    public  long updateProbeCount ()  { throw new RuntimeException(); }
  }
  public   ApplicationCacheSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AWord a ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.TheAfterWord after ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AnWord an ()  { throw new RuntimeException(); }
  /**
   * Assert that a metric counter has a specific value; failure raises an exception
   * including the cache's toString value
   * @param name counter name (for exceptions)
   * @param counter counter
   * @param expected expected value.
   * @param cache cache
   */
  public  void assertMetric (java.lang.String name, com.codahale.metrics.Counter counter, long expected, org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
  /**
   * Assert that a key wasn't found in cache or loaded.
   * <p>
   * Looks for the specific nested exception raised by {@link ApplicationCache}
   * @param appId application ID
   * @param attemptId attempt ID
   * @param cache app cache
   */
  public  void assertNotFound (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.BeWord be ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.CompileWord compile ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ContainWord contain ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DecidedWord decided ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.DefinedWord defined ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DeterminedWord determined ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EmptyWord empty ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EndWithWord endWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ExistWord exist ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.FullyMatchWord fullyMatch ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.HaveWord have ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.IncludeWord include ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.KeyWord key ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.LengthWord length ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.MatchPatternWord matchPattern ()  { throw new RuntimeException(); }
  /**
   * Create a new UI. The info/attempt info classes here are from the package
   * <code>org.apache.spark.status.api.v1</code>, not the near-equivalents from the history package
   * @param name (undocumented)
   * @param attemptId (undocumented)
   * @param completed (undocumented)
   * @param started (undocumented)
   * @param ended (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ui.SparkUI newUI (java.lang.String name, scala.Option<java.lang.String> attemptId, boolean completed, long started, long ended)  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.NotWord not ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ReadableWord readable ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.RegexWord regex ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SizeWord size ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SortedWord sorted ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.StartWithWord startWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.TheSameInstanceAsPhrase theSameInstanceAs ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.TypeCheckWord typeCheck ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.ValueWord value ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.WritableWord writable ()  { throw new RuntimeException(); }
}
