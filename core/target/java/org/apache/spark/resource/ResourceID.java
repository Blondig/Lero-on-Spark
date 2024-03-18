package org.apache.spark.resource;
/**
 * Resource identifier.
 * param:  componentName spark.driver / spark.executor / spark.task
 * param:  resourceName  gpu, fpga, etc
 * <p>
 * @since 3.0.0
 */
public  class ResourceID {
  // not preceding
  public   ResourceID (java.lang.String componentName, java.lang.String resourceName)  { throw new RuntimeException(); }
    java.lang.String amountConf ()  { throw new RuntimeException(); }
  public  java.lang.String componentName ()  { throw new RuntimeException(); }
    java.lang.String confPrefix ()  { throw new RuntimeException(); }
    java.lang.String discoveryScriptConf ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String resourceName ()  { throw new RuntimeException(); }
    java.lang.String vendorConf ()  { throw new RuntimeException(); }
}
