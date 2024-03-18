package org.apache.spark.serializer;
public  class KryoDistributedTest {
  static public  class AppJarRegistrator implements org.apache.spark.serializer.KryoRegistrator {
    public   AppJarRegistrator ()  { throw new RuntimeException(); }
    public  void registerClasses (com.esotericsoftware.kryo.Kryo k)  { throw new RuntimeException(); }
  }
  static public  class AppJarRegistrator$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AppJarRegistrator$ MODULE$ = null;
    public   AppJarRegistrator$ ()  { throw new RuntimeException(); }
    public  java.lang.String customClassName ()  { throw new RuntimeException(); }
  }
  static public  class MyCustomClass {
    public   MyCustomClass ()  { throw new RuntimeException(); }
  }
}
