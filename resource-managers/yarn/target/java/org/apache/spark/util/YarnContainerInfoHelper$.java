package org.apache.spark.util;
public  class YarnContainerInfoHelper$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final YarnContainerInfoHelper$ MODULE$ = null;
  public   YarnContainerInfoHelper$ ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getLogUrlsFromBaseUrl (java.lang.String baseUrl)  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> getLogUrls (org.apache.hadoop.conf.Configuration conf, scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> getAttributes (org.apache.hadoop.conf.Configuration conf, scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ContainerId getContainerId (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getClusterId (org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf)  { throw new RuntimeException(); }
  public  java.lang.String getYarnHttpScheme (org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf)  { throw new RuntimeException(); }
  public  java.lang.String getNodeManagerHttpAddress (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  public  java.lang.String getNodeManagerHost (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  public  java.lang.String getNodeManagerHttpPort (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  public  java.lang.String getNodeManagerPort (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
}
