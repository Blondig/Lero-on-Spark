package org.apache.spark.resource;
/**
 * A set of task resource requests. This is used in conjunction with the ResourceProfile to
 * programmatically specify the resources needed for an RDD that will be applied at the
 * stage level.
 */
public  class TaskResourceRequests implements scala.Serializable {
  public   TaskResourceRequests ()  { throw new RuntimeException(); }
  /**
   * Add a certain {@link TaskResourceRequest} to the request set.
   * @param treq (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.resource.TaskResourceRequests addRequest (org.apache.spark.resource.TaskResourceRequest treq)  { throw new RuntimeException(); }
  /**
   * Specify number of cpus per Task.
   * This is a convenient API to add {@link TaskResourceRequest} for cpus.
   * <p>
   * @param amount Number of cpus to allocate per Task.
   * @return (undocumented)
   */
  public  org.apache.spark.resource.TaskResourceRequests cpus (int amount)  { throw new RuntimeException(); }
  /**
   * Returns all the resource requests for the task.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> requests ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) Returns all the resource requests for the task.
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> requestsJMap ()  { throw new RuntimeException(); }
  /**
   * Amount of a particular custom resource(GPU, FPGA, etc) to use.
   * This is a convenient API to add {@link TaskResourceRequest} for custom resources.
   * <p>
   * @param resourceName Name of the resource.
   * @param amount Amount requesting as a Double to support fractional resource requests.
   *               Valid values are less than or equal to 0.5 or whole numbers. This essentially
   *               lets you configure X number of tasks to run on a single resource,
   *               ie amount equals 0.5 translates into 2 tasks per resource address.
   * @return (undocumented)
   */
  public  org.apache.spark.resource.TaskResourceRequests resource (java.lang.String resourceName, double amount)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
