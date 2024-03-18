package other.supplier;
public  class CustomRecoveryModeFactory extends org.apache.spark.deploy.master.StandaloneRecoveryModeFactory {
  static public  int instantiationAttempts ()  { throw new RuntimeException(); }
  public   CustomRecoveryModeFactory (org.apache.spark.SparkConf conf, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  /**
   * PersistenceEngine defines how the persistent data(Information about worker, driver etc..)
   * is handled for recovery.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.master.PersistenceEngine createPersistenceEngine ()  { throw new RuntimeException(); }
  /**
   * Create an instance of LeaderAgent that decides who gets elected as master.
   * @param master (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.master.LeaderElectionAgent createLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable master)  { throw new RuntimeException(); }
}
