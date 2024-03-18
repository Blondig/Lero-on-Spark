package org.apache.spark.ml.param;
/**
 * A param and its value.
 */
public  class ParamPair<T extends java.lang.Object> implements scala.Product, scala.Serializable {
  public  org.apache.spark.ml.param.Param<T> param ()  { throw new RuntimeException(); }
  public  T value ()  { throw new RuntimeException(); }
  // not preceding
  public   ParamPair (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
}
