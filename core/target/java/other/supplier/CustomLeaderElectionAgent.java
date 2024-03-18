package other.supplier;
public  class CustomLeaderElectionAgent implements org.apache.spark.deploy.master.LeaderElectionAgent {
  // not preceding
  public   CustomLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable masterInstance)  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.LeaderElectable masterInstance ()  { throw new RuntimeException(); }
}
