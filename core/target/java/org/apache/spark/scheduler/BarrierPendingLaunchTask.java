package org.apache.spark.scheduler;
  class BarrierPendingLaunchTask implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value taskLocality ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> assignedResources ()  { throw new RuntimeException(); }
  // not preceding
  public   BarrierPendingLaunchTask (java.lang.String execId, java.lang.String host, int index, scala.Enumeration.Value taskLocality, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> assignedResources)  { throw new RuntimeException(); }
  public  int assignedOfferIndex ()  { throw new RuntimeException(); }
  public  int assignedCores ()  { throw new RuntimeException(); }
}
