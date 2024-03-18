package org.apache.spark.api.python;
/**
 * A class to test Pickle serialization on the Scala side, that will be deserialized
 * in Python
 */
public  class TestWritable implements org.apache.hadoop.io.Writable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String str ()  { throw new RuntimeException(); }
  // not preceding
  public   TestWritable (java.lang.String str, int int_, double double_)  { throw new RuntimeException(); }
  public   TestWritable ()  { throw new RuntimeException(); }
  public  java.lang.String getStr ()  { throw new RuntimeException(); }
  public  void setStr (java.lang.String str)  { throw new RuntimeException(); }
  public  int getInt ()  { throw new RuntimeException(); }
  public  void setInt (int int_)  { throw new RuntimeException(); }
  public  double getDouble ()  { throw new RuntimeException(); }
  public  void setDouble (double double_)  { throw new RuntimeException(); }
  public  void write (java.io.DataOutput out)  { throw new RuntimeException(); }
  public  void readFields (java.io.DataInput in)  { throw new RuntimeException(); }
}
