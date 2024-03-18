package org.apache.spark.network.netty;
/**
 * Provides a utility for transforming from a SparkConf inside a Spark JVM (e.g., Executor,
 * Driver, or a standalone shuffle service) into a TransportConf with details on our environment
 * like the number of cores that are allocated to this JVM.
 */
public  class SparkTransportConf$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkTransportConf$ MODULE$ = null;
  public   SparkTransportConf$ ()  { throw new RuntimeException(); }
  /**
   * Utility for creating a {@link TransportConf} from a {@link SparkConf}.
   * @param _conf the {@link SparkConf}
   * @param module the module name
   * @param numUsableCores if nonzero, this will restrict the server and client threads to only
   *                       use the given number of cores, rather than all of the machine's cores.
   *                       This restriction will only occur if these properties are not already set.
   * @param role           optional role, could be driver, executor, worker and master. Default is
   *                      {@link None}, means no role specific configurations.
   * @return (undocumented)
   */
  public  org.apache.spark.network.util.TransportConf fromSparkConf (org.apache.spark.SparkConf _conf, java.lang.String module, int numUsableCores, scala.Option<java.lang.String> role)  { throw new RuntimeException(); }
}
