package org.apache.spark.status;
public  class LiveResourceProfile extends org.apache.spark.status.LiveEntity {
  // not preceding
  public   LiveResourceProfile (int resourceProfileId, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResources, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResources, scala.Option<java.lang.Object> maxTasksPerExecutor)  { throw new RuntimeException(); }
  protected  Object doUpdate ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResources ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxTasksPerExecutor ()  { throw new RuntimeException(); }
  public  int resourceProfileId ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResources ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ResourceProfileInfo toApi ()  { throw new RuntimeException(); }
}
