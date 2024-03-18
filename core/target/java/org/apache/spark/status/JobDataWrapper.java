package org.apache.spark.status;
/**
 * Keep track of the existing stages when the job was submitted, and those that were
 * completed during the job's execution. This allows a more accurate accounting of how
 * many tasks were skipped for the job.
 */
  class JobDataWrapper {
  // not preceding
  public   JobDataWrapper (org.apache.spark.status.api.v1.JobData info, scala.collection.immutable.Set<java.lang.Object> skippedStages, scala.Option<java.lang.Object> sqlExecutionId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.JobData info ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> skippedStages ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> sqlExecutionId ()  { throw new RuntimeException(); }
}
