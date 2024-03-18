package org.apache.spark.resource;
/**
 * The default plugin that is loaded into a Spark application to control how custom
 * resources are discovered. This executes the discovery script specified by the user
 * and gets the json output back and constructs ResourceInformation objects from that.
 * If the user specifies custom plugins, this is the last one to be executed and
 * throws if the resource isn't discovered.
 * <p>
 * @since 3.0.0
 */
public  class ResourceDiscoveryScriptPlugin implements org.apache.spark.api.resource.ResourceDiscoveryPlugin, org.apache.spark.internal.Logging {
  public   ResourceDiscoveryScriptPlugin ()  { throw new RuntimeException(); }
  public  java.util.Optional<org.apache.spark.resource.ResourceInformation> discoverResource (org.apache.spark.resource.ResourceRequest request, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
}
