package org.apache.spark.resource;
/**
 * Resource profile builder to build a {@link ResourceProfile} to associate with an RDD.
 * A {@link ResourceProfile} allows the user to specify executor and task resource requirements
 * for an RDD that will get applied during a stage. This allows the user to change the resource
 * requirements between stages.
 * <p>
 */
public  class ResourceProfileBuilder {
  public   ResourceProfileBuilder ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfile build ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfileBuilder clearExecutorResourceRequests ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfileBuilder clearTaskResourceRequests ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResources ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) gets a Java Map of resources to ExecutorResourceRequest
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResourcesJMap ()  { throw new RuntimeException(); }
  /**
   * Add executor resource requests
   * @param requests The detailed executor resource requests, see {@link ExecutorResourceRequests}
   * @return This ResourceProfileBuilder
   */
  public  org.apache.spark.resource.ResourceProfileBuilder require (org.apache.spark.resource.ExecutorResourceRequests requests)  { throw new RuntimeException(); }
  /**
   * Add task resource requests
   * @param requests The detailed task resource requests, see {@link TaskResourceRequest}
   * @return This ResourceProfileBuilder
   */
  public  org.apache.spark.resource.ResourceProfileBuilder require (org.apache.spark.resource.TaskResourceRequests requests)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResources ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) gets a Java Map of resources to TaskResourceRequest
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResourcesJMap ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
