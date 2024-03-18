package org.apache.spark.resource;
/**
 * Case class representing allocated resource addresses for a specific resource.
 * Cluster manager uses the JSON serialization of this case class to pass allocated resource info to
 * driver and executors. See the <code></code>--resourcesFile<code></code> option there.
 */
  class ResourceAllocation implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceID id ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> addresses ()  { throw new RuntimeException(); }
  // not preceding
  public   ResourceAllocation (org.apache.spark.resource.ResourceID id, scala.collection.Seq<java.lang.String> addresses)  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceInformation toResourceInformation ()  { throw new RuntimeException(); }
}
