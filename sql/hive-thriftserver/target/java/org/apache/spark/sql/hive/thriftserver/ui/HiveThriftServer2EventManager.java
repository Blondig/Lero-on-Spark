package org.apache.spark.sql.hive.thriftserver.ui;
/**
 * This class manages events generated by the thriftserver application. It converts the
 * operation and session events to listener events and post it into the live listener bus.
 */
  class HiveThriftServer2EventManager {
  public   HiveThriftServer2EventManager (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  void onOperationClosed (java.lang.String id)  { throw new RuntimeException(); }
  public  void onSessionClosed (java.lang.String sessionId)  { throw new RuntimeException(); }
  public  void onSessionCreated (java.lang.String ip, java.lang.String sessionId, java.lang.String userName)  { throw new RuntimeException(); }
  public  void onStatementCanceled (java.lang.String id)  { throw new RuntimeException(); }
  public  void onStatementError (java.lang.String id, java.lang.String errorMsg, java.lang.String errorTrace)  { throw new RuntimeException(); }
  public  void onStatementFinish (java.lang.String id)  { throw new RuntimeException(); }
  public  void onStatementParsed (java.lang.String id, java.lang.String executionPlan)  { throw new RuntimeException(); }
  public  void onStatementStart (java.lang.String id, java.lang.String sessionId, java.lang.String statement, java.lang.String groupId, java.lang.String userName)  { throw new RuntimeException(); }
  public  void onStatementTimeout (java.lang.String id)  { throw new RuntimeException(); }
  public  void postLiveListenerBus (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
}