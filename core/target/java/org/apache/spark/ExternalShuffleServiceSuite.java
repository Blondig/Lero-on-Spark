package org.apache.spark;
/**
 * This suite creates an external shuffle server and routes all shuffle fetches through it.
 * Note that failures in this suite may arise due to changes in Spark that invalidate expectations
 * set up in <code>ExternalBlockHandler</code>, such as changing the format of shuffle files or how
 * we hash files into folders.
 */
public  class ExternalShuffleServiceSuite extends org.apache.spark.ShuffleSuite implements org.scalatest.BeforeAndAfterAll, org.scalatest.concurrent.Eventually {
  public   ExternalShuffleServiceSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.shuffle.ExternalBlockHandler rpcHandler ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.server.TransportServer server ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.TransportContext transportContext ()  { throw new RuntimeException(); }
}
