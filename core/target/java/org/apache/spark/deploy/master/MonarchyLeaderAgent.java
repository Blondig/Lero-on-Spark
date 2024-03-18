package org.apache.spark.deploy.master;
/** Single-node implementation of LeaderElectionAgent -- we're initially and always the leader. */
  class MonarchyLeaderAgent implements org.apache.spark.deploy.master.LeaderElectionAgent {
  // not preceding
  public   MonarchyLeaderAgent (org.apache.spark.deploy.master.LeaderElectable masterInstance)  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.LeaderElectable masterInstance ()  { throw new RuntimeException(); }
}
