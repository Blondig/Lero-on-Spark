package org.apache.spark.resource;
/**
 * Case class that represents resource requirements for a component in a
 * an application (components are driver, executor or task).
 * <p>
 * A configuration of spark.task.resource.[resourceName].amount = 4, equates to:
 * amount = 4, and numParts = 1.
 * <p>
 * A configuration of spark.task.resource.[resourceName].amount = 0.25, equates to:
 * amount = 1, and numParts = 4.
 * <p>
 * param:  resourceName gpu, fpga, etc.
 * param:  amount whole units of the resource we expect (e.g. 1 gpus, 2 fpgas)
 * param:  numParts if not 1, the number of ways a whole resource is subdivided.
 *                 This is always an integer greater than or equal to 1,
 *                 where 1 is whole resource, 2 is divide a resource in two, and so on.
 */
  class ResourceRequirement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String resourceName ()  { throw new RuntimeException(); }
  public  int amount ()  { throw new RuntimeException(); }
  public  int numParts ()  { throw new RuntimeException(); }
  // not preceding
  public   ResourceRequirement (java.lang.String resourceName, int amount, int numParts)  { throw new RuntimeException(); }
}
