package org.apache.spark.deploy.master;
  class ExecutorDesc {
  // not preceding
  public   ExecutorDesc (int id, org.apache.spark.deploy.master.ApplicationInfo application, org.apache.spark.deploy.master.WorkerInfo worker, int cores, int memory, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.ApplicationInfo application ()  { throw new RuntimeException(); }
  /** Copy all state (non-val) variables from the given on-the-wire ExecutorDescription. */
  public  void copyState (org.apache.spark.deploy.ExecutorDescription execDesc)  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  java.lang.String fullId ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  int memory ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.WorkerInfo worker ()  { throw new RuntimeException(); }
}
