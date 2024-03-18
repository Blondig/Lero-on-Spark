package org.apache.spark.deploy.history;
/**
 * An entry in the cache.
 * <p>
 * param:  loadedUI Spark UI
 * param:  completed Flag to indicated that the application has completed (and so
 *                 does not need refreshing).
 */
 final class CacheEntry {
  // not preceding
  public   CacheEntry (org.apache.spark.deploy.history.LoadedAppUI loadedUI, boolean completed)  { throw new RuntimeException(); }
  public  boolean completed ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.history.LoadedAppUI loadedUI ()  { throw new RuntimeException(); }
  /** string value is for test assertions */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
