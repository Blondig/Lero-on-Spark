package org.apache.spark.mllib.stat.test;
/**
 * Class that represents the group and value of a sample.
 * <p>
 * param:  isExperiment if the sample is of the experiment group.
 * param:  value numeric value of the observation.
 */
public  class BinarySample implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  public  boolean isExperiment ()  { throw new RuntimeException(); }
  public  double value ()  { throw new RuntimeException(); }
  // not preceding
  public   BinarySample (boolean isExperiment, double value)  { throw new RuntimeException(); }
  public  boolean getIsExperiment ()  { throw new RuntimeException(); }
  public  double getValue ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
