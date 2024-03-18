package org.apache.spark;
public  class CustomRegistrator implements org.apache.spark.serializer.KryoRegistrator {
  public   CustomRegistrator ()  { throw new RuntimeException(); }
  public  void registerClasses (com.esotericsoftware.kryo.Kryo kryo)  { throw new RuntimeException(); }
}
