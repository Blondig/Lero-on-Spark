package org.apache.spark.sql.hive.thriftserver.ui;
  class ExecutionInfo {
  // not preceding
  public   ExecutionInfo (java.lang.String execId, java.lang.String statement, java.lang.String sessionId, long startTimestamp, java.lang.String userName, long finishTimestamp, long closeTimestamp, java.lang.String executePlan, java.lang.String detail, scala.Enumeration.Value state, scala.collection.mutable.ArrayBuffer<java.lang.String> jobId, java.lang.String groupId)  { throw new RuntimeException(); }
  public  long closeTimestamp ()  { throw new RuntimeException(); }
  public  java.lang.String detail ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  java.lang.String executePlan ()  { throw new RuntimeException(); }
  public  long finishTimestamp ()  { throw new RuntimeException(); }
  public  java.lang.String groupId ()  { throw new RuntimeException(); }
  public  boolean isExecutionActive ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.lang.String> jobId ()  { throw new RuntimeException(); }
  public  java.lang.String sessionId ()  { throw new RuntimeException(); }
  public  long startTimestamp ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  public  java.lang.String statement ()  { throw new RuntimeException(); }
  public  long totalTime (long endTime)  { throw new RuntimeException(); }
  public  java.lang.String userName ()  { throw new RuntimeException(); }
}
