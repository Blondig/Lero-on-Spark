package org.apache.spark.resource;
/**
 * Class that represents a resource request.
 * <p>
 * The class used when discovering resources (using the discovery script),
 * or via the context as it is parsing configuration for the ResourceID.
 * <p>
 * param:  id object identifying the resource
 * param:  amount integer amount for the resource. Note that for a request (executor level),
 *               fractional resources does not make sense, so amount is an integer.
 * param:  discoveryScript optional discovery script file name
 * param:  vendor optional vendor name
 * <p>
 * @since 3.0.0
 */
public  class ResourceRequest {
  // not preceding
  public   ResourceRequest (org.apache.spark.resource.ResourceID id, long amount, java.util.Optional<java.lang.String> discoveryScript, java.util.Optional<java.lang.String> vendor)  { throw new RuntimeException(); }
  public  long amount ()  { throw new RuntimeException(); }
  public  java.util.Optional<java.lang.String> discoveryScript ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceID id ()  { throw new RuntimeException(); }
  public  java.util.Optional<java.lang.String> vendor ()  { throw new RuntimeException(); }
}
