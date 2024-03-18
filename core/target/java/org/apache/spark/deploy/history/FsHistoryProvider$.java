package org.apache.spark.deploy.history;
public  class FsHistoryProvider$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FsHistoryProvider$ MODULE$ = null;
  public   FsHistoryProvider$ ()  { throw new RuntimeException(); }
  /**
   * Current version of the data written to the listing database. When opening an existing
   * db, if the version does not match this value, the FsHistoryProvider will throw away
   * all data and re-generate the listing data from the event logs.
   * @return (undocumented)
   */
    long CURRENT_LISTING_VERSION ()  { throw new RuntimeException(); }
}
