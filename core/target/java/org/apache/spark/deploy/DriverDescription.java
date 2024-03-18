package org.apache.spark.deploy;
  class DriverDescription implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  public  java.lang.String jarUrl ()  { throw new RuntimeException(); }
  public  int mem ()  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  boolean supervise ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.Command command ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> resourceReqs ()  { throw new RuntimeException(); }
  // not preceding
  public   DriverDescription (java.lang.String jarUrl, int mem, int cores, boolean supervise, org.apache.spark.deploy.Command command, scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> resourceReqs)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
