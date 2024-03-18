package org.apache.spark.sql.hive.thriftserver.ui;
/**
 * An inner sparkListener called in sc.stop to clean up the HiveThriftServer2
 */
  class HiveThriftServer2Listener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.internal.Logging {
  public   HiveThriftServer2Listener (org.apache.spark.status.ElementTrackingStore kvstore, org.apache.spark.SparkConf sparkConf, scala.Option<org.apache.hive.service.server.HiveServer2> server, boolean live)  { throw new RuntimeException(); }
    boolean noLiveData ()  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  public  void updateStoreWithTriggerEnabled (org.apache.spark.status.LiveEntity entity)  { throw new RuntimeException(); }
  public  void updateLiveStore (org.apache.spark.status.LiveEntity entity, boolean trigger)  { throw new RuntimeException(); }
}
