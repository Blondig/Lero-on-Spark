package org.apache.spark.resource;
/**
 * Class to hold information about a type of Resource. A resource could be a GPU, FPGA, etc.
 * The array of addresses are resource specific and its up to the user to interpret the address.
 * <p>
 * One example is GPUs, where the addresses would be the indices of the GPUs
 * <p>
 * param:  name the name of the resource
 * param:  addresses an array of strings describing the addresses of the resource
 * <p>
 * @since 3.0.0
 */
public  class ResourceInformation implements scala.Serializable {
  /**
   * Parses a JSON string into a {@link ResourceInformation} instance.
   * @param json (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.resource.ResourceInformation parseJson (java.lang.String json)  { throw new RuntimeException(); }
  static public  org.apache.spark.resource.ResourceInformation parseJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String[] addresses ()  { throw new RuntimeException(); }
  // not preceding
  public   ResourceInformation (java.lang.String name, java.lang.String[] addresses)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JValue toJson ()  { throw new RuntimeException(); }
}
