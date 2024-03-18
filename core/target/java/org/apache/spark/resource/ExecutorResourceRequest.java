package org.apache.spark.resource;
/**
 * An Executor resource request. This is used in conjunction with the {@link ResourceProfile} to
 * programmatically specify the resources needed for an RDD that will be applied at the
 * stage level.
 * <p>
 * This is used to specify what the resource requirements are for an Executor and how
 * Spark can find out specific details about those resources. Not all the parameters are
 * required for every resource type. Resources like GPUs are supported and have same limitations
 * as using the global spark configs spark.executor.resource.gpu.*. The amount, discoveryScript,
 * and vendor parameters for resources are all the same parameters a user would specify through the
 * configs: spark.executor.resource.{resourceName}.{amount, discoveryScript, vendor}.
 * <p>
 * For instance, a user wants to allocate an Executor with GPU resources on YARN. The user has
 * to specify the resource name (gpu), the amount or number of GPUs per Executor,
 * the discovery script would be specified so that when the Executor starts up it can
 * discovery what GPU addresses are available for it to use because YARN doesn't tell
 * Spark that, then vendor would not be used because its specific for Kubernetes.
 * <p>
 * See the configuration and cluster specific docs for more details.
 * <p>
 * Use {@link ExecutorResourceRequests} class as a convenience API.
 * <p>
 * param:  resourceName Name of the resource
 * param:  amount Amount requesting
 * param:  discoveryScript Optional script used to discover the resources. This is required on some
 *                        cluster managers that don't tell Spark the addresses of the resources
 *                        allocated. The script runs on Executors startup to discover the addresses
 *                        of the resources available.
 * param:  vendor Optional vendor, required for some cluster managers
 */
public  class ExecutorResourceRequest implements scala.Serializable {
  public  java.lang.String resourceName ()  { throw new RuntimeException(); }
  public  long amount ()  { throw new RuntimeException(); }
  public  java.lang.String discoveryScript ()  { throw new RuntimeException(); }
  public  java.lang.String vendor ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorResourceRequest (java.lang.String resourceName, long amount, java.lang.String discoveryScript, java.lang.String vendor)  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
