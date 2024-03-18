package org.apache.spark.deploy;
/**
 * This suite gets BlockData when the ExternalShuffleService is restarted
 * with #spark.shuffle.service.db.enabled = true or false
 * Note that failures in this suite may arise when#spark.shuffle.service.db.enabled = false
 */
public  class ExternalShuffleServiceDbSuite extends org.apache.spark.SparkFunSuite {
  public   ExternalShuffleServiceDbSuite ()  { throw new RuntimeException(); }
  public  java.lang.String SORT_MANAGER ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.shuffle.ExternalBlockHandler blockHandler ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.shuffle.ExternalShuffleBlockResolver blockResolver ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.shuffle.TestShuffleDataContext dataContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.ExternalShuffleService externalShuffleService ()  { throw new RuntimeException(); }
  public  void registerExecutor ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf shuffleServiceConf ()  { throw new RuntimeException(); }
  public  java.lang.String sortBlock0 ()  { throw new RuntimeException(); }
  public  java.lang.String sortBlock1 ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
}
