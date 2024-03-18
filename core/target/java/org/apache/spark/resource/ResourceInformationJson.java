package org.apache.spark.resource;
/** A case class to simplify JSON serialization of {@link ResourceInformation}. */
public  class ResourceInformationJson implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> addresses ()  { throw new RuntimeException(); }
  // not preceding
  public   ResourceInformationJson (java.lang.String name, scala.collection.Seq<java.lang.String> addresses)  { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JValue toJValue ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceInformation toResourceInformation ()  { throw new RuntimeException(); }
}
