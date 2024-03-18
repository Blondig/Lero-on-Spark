package org.apache.spark.deploy.history;
public abstract class HybridStoreSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.concurrent.TimeLimits {
  public   HybridStoreSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.kvstore.KVStore db ()  { throw new RuntimeException(); }
  public  java.io.File dbpath ()  { throw new RuntimeException(); }
}
