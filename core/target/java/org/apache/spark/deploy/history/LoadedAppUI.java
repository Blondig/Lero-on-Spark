package org.apache.spark.deploy.history;
/**
 * A loaded UI for a Spark application.
 * <p>
 * Loaded UIs are valid once created, and can be invalidated once the history provider detects
 * changes in the underlying app data (e.g. an updated event log). Invalidating a UI does not
 * unload it; it just signals the {@link ApplicationCache} that the UI should not be used to serve
 * new requests.
 * <p>
 * Reloading of the UI with new data requires collaboration between the cache and the provider;
 * the provider invalidates the UI when it detects updated information, and the cache invalidates
 * the cache entry when it detects the UI has been invalidated. That will trigger a callback
 * on the provider to finally clean up any UI state. The cache should hold read locks when
 * using the UI, and the provider should grab the UI's write lock before making destructive
 * operations.
 * <p>
 * Note that all this means that an invalidated UI will still stay in-memory, and any resources it
 * references will remain open, until the cache either sees that it's invalidated, or evicts it to
 * make room for another UI.
 * <p>
 * param:  ui Spark UI
 */
  class LoadedAppUI implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.SparkUI ui ()  { throw new RuntimeException(); }
  // not preceding
  public   LoadedAppUI (org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  public  java.util.concurrent.locks.ReentrantReadWriteLock lock ()  { throw new RuntimeException(); }
  public  boolean valid ()  { throw new RuntimeException(); }
  public  void invalidate ()  { throw new RuntimeException(); }
}
