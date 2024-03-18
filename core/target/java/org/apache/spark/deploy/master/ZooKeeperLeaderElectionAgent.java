package org.apache.spark.deploy.master;
  class ZooKeeperLeaderElectionAgent implements org.apache.curator.framework.recipes.leader.LeaderLatchListener, org.apache.spark.deploy.master.LeaderElectionAgent, org.apache.spark.internal.Logging {
  // not preceding
  public   ZooKeeperLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable masterInstance, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void isLeader ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.LeaderElectable masterInstance ()  { throw new RuntimeException(); }
  public  void notLeader ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String workingDir ()  { throw new RuntimeException(); }
}
