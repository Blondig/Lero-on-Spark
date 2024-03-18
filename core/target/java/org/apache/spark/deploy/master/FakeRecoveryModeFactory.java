package org.apache.spark.deploy.master;
public  class FakeRecoveryModeFactory extends org.apache.spark.deploy.master.StandaloneRecoveryModeFactory {
  static public  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> persistentData ()  { throw new RuntimeException(); }
  public   FakeRecoveryModeFactory (org.apache.spark.SparkConf conf, org.apache.spark.serializer.Serializer ser)  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.PersistenceEngine createPersistenceEngine ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.LeaderElectionAgent createLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable master)  { throw new RuntimeException(); }
}
