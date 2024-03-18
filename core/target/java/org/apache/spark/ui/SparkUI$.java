package org.apache.spark.ui;
public  class SparkUI$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkUI$ MODULE$ = null;
  public   SparkUI$ ()  { throw new RuntimeException(); }
  public  java.lang.String STATIC_RESOURCE_DIR ()  { throw new RuntimeException(); }
  public  java.lang.String DEFAULT_POOL_NAME ()  { throw new RuntimeException(); }
  public  int getUIPort (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Create a new UI backed by an AppStatusStore.
   * @param sc (undocumented)
   * @param store (undocumented)
   * @param conf (undocumented)
   * @param securityManager (undocumented)
   * @param appName (undocumented)
   * @param basePath (undocumented)
   * @param startTime (undocumented)
   * @param appSparkVersion (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ui.SparkUI create (scala.Option<org.apache.spark.SparkContext> sc, org.apache.spark.status.AppStatusStore store, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath, long startTime, java.lang.String appSparkVersion)  { throw new RuntimeException(); }
}
