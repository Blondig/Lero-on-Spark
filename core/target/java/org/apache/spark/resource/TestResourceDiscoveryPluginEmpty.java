package org.apache.spark.resource;
public  class TestResourceDiscoveryPluginEmpty implements org.apache.spark.api.resource.ResourceDiscoveryPlugin {
  public   TestResourceDiscoveryPluginEmpty ()  { throw new RuntimeException(); }
  public  java.util.Optional<org.apache.spark.resource.ResourceInformation> discoverResource (org.apache.spark.resource.ResourceRequest request, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
