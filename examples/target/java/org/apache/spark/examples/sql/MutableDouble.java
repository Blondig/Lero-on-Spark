package org.apache.spark.examples.sql;
public  class MutableDouble implements scala.Serializable {
  // not preceding
  public   MutableDouble (double value)  { throw new RuntimeException(); }
  public  double value ()  { throw new RuntimeException(); }
}
