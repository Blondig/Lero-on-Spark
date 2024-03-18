package org.apache.spark.status;
/**
 * An interface for creating history listeners(to replay event logs) defined in other modules like
 * SQL, and setup the UI of the plugin to rebuild the history UI.
 */
public  interface AppHistoryServerPlugin {
  /**
   * Creates listeners to replay the event logs.
   * @param conf (undocumented)
   * @param store (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.scheduler.SparkListener> createListeners (org.apache.spark.SparkConf conf, org.apache.spark.status.ElementTrackingStore store)  ;
  /**
   * The position of a plugin tab relative to the other plugin tabs in the history UI.
   * @return (undocumented)
   */
  public  int displayOrder ()  ;
  /**
   * Sets up UI of this plugin to rebuild the history UI.
   * @param ui (undocumented)
   */
  public  void setupUI (org.apache.spark.ui.SparkUI ui)  ;
}
