package org.apache.spark.deploy.master;
  class ZooKeeperPersistenceEngine extends org.apache.spark.deploy.master.PersistenceEngine implements org.apache.spark.internal.Logging {
  // not preceding
  public   ZooKeeperPersistenceEngine (org.apache.spark.SparkConf conf, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void persist (java.lang.String name, java.lang.Object obj)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Seq<T> read (java.lang.String prefix, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.Serializer serializer ()  { throw new RuntimeException(); }
  public  void unpersist (java.lang.String name)  { throw new RuntimeException(); }
}
