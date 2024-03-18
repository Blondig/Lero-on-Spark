package org.apache.spark;
public  class SerializableWritable<T extends org.apache.hadoop.io.Writable> implements java.io.Serializable {
  // not preceding
  public   SerializableWritable (T t)  { throw new RuntimeException(); }
  public  T t ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  T value ()  { throw new RuntimeException(); }
}
