package org.apache.spark.scheduler;
/**
 * Description of a task that gets passed onto executors to be executed, usually created by
 * <code>TaskSetManager.resourceOffer</code>.
 * <p>
 * TaskDescriptions and the associated Task need to be serialized carefully for two reasons:
 * <p>
 *     (1) When a TaskDescription is received by an Executor, the Executor needs to first get the
 *         list of JARs and files and add these to the classpath, and set the properties, before
 *         deserializing the Task object (serializedTask). This is why the Properties are included
 *         in the TaskDescription, even though they're also in the serialized task.
 *     (2) Because a TaskDescription is serialized and sent to an executor for each task, efficient
 *         serialization (both in terms of serialization time and serialized buffer size) is
 *         important. For this reason, we serialize TaskDescriptions ourselves with the
 *         TaskDescription.encode and TaskDescription.decode methods.  This results in a smaller
 *         serialized size because it avoids serializing unnecessary fields in the Map objects
 *         (which can introduce significant overhead when the maps are small).
 */
  class TaskDescription {
  static public  java.nio.ByteBuffer encode (org.apache.spark.scheduler.TaskDescription taskDescription)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.TaskDescription decode (java.nio.ByteBuffer byteBuffer)  { throw new RuntimeException(); }
  public  long taskId ()  { throw new RuntimeException(); }
  public  int attemptNumber ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.String, java.lang.Object> addedFiles ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.String, java.lang.Object> addedJars ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.String, java.lang.Object> addedArchives ()  { throw new RuntimeException(); }
  public  java.util.Properties properties ()  { throw new RuntimeException(); }
  public  int cpus ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer serializedTask ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskDescription (long taskId, int attemptNumber, java.lang.String executorId, java.lang.String name, int index, int partitionId, scala.collection.mutable.Map<java.lang.String, java.lang.Object> addedFiles, scala.collection.mutable.Map<java.lang.String, java.lang.Object> addedJars, scala.collection.mutable.Map<java.lang.String, java.lang.Object> addedArchives, java.util.Properties properties, int cpus, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, java.nio.ByteBuffer serializedTask)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
