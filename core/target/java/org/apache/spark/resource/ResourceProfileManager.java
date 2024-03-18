package org.apache.spark.resource;
/**
 * Manager of resource profiles. The manager allows one place to keep the actual ResourceProfiles
 * and everywhere else we can use the ResourceProfile Id to save on space.
 * Note we never remove a resource profile at this point. Its expected this number is small
 * so this shouldn't be much overhead.
 */
  class ResourceProfileManager implements org.apache.spark.internal.Logging {
  public   ResourceProfileManager (org.apache.spark.SparkConf sparkConf, org.apache.spark.scheduler.LiveListenerBus listenerBus)  { throw new RuntimeException(); }
  public  void addResourceProfile (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfile defaultResourceProfile ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.resource.ResourceProfile> getEquivalentProfile (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  /**
   * If we use anything except the default profile, it's only supported on YARN and Kubernetes
   * with dynamic allocation enabled. Throw an exception if not supported.
   * @param rp (undocumented)
   * @return (undocumented)
   */
    boolean isSupported (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfile resourceProfileFromId (int rpId)  { throw new RuntimeException(); }
}
