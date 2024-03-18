package org.apache.spark.sql.hive.thriftserver.ui;
/**
 * Provides a view of a KVStore with methods that make it easy to query SQL-specific state. There's
 * no state kept in this class, so it's ok to have multiple instances of it in an application.
 */
public  class HiveThriftServer2AppStatusStore {
  public   HiveThriftServer2AppStatusStore (org.apache.spark.util.kvstore.KVStore store)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.hive.thriftserver.ui.ExecutionInfo> getExecution (java.lang.String executionId)  { throw new RuntimeException(); }
  public  long getExecutionCount ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.thriftserver.ui.ExecutionInfo> getExecutionList ()  { throw new RuntimeException(); }
  public  int getOnlineSessionNum ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.hive.thriftserver.ui.SessionInfo> getSession (java.lang.String sessionId)  { throw new RuntimeException(); }
  public  long getSessionCount ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.thriftserver.ui.SessionInfo> getSessionList ()  { throw new RuntimeException(); }
  /**
   * When an error or a cancellation occurs, we set the finishTimestamp of the statement.
   * Therefore, when we count the number of running statements, we need to exclude errors and
   * cancellations and count all statements that have not been closed so far.
   * @return (undocumented)
   */
  public  int getTotalRunning ()  { throw new RuntimeException(); }
}
