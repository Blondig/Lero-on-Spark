package org.apache.spark.resource;
/**
 * A task resource request. This is used in conjunction with the {@link ResourceProfile} to
 * programmatically specify the resources needed for an RDD that will be applied at the
 * stage level.
 * <p>
 * Use {@link TaskResourceRequests} class as a convenience API.
 * <p>
 * param:  resourceName Resource name
 * param:  amount Amount requesting as a Double to support fractional resource requests.
 *               Valid values are less than or equal to 0.5 or whole numbers. This essentially
 *               lets you configure X number of tasks to run on a single resource,
 *               ie amount equals 0.5 translates into 2 tasks per resource address.
 */
public  class TaskResourceRequest implements scala.Serializable {
  // not preceding
  public   TaskResourceRequest (java.lang.String resourceName, double amount)  { throw new RuntimeException(); }
  public  double amount ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String resourceName ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
