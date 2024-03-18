package other.supplier;
public  class CustomPersistenceEngine extends org.apache.spark.deploy.master.PersistenceEngine {
  static public  int persistAttempts ()  { throw new RuntimeException(); }
  static public  int unpersistAttempts ()  { throw new RuntimeException(); }
  static public  int readAttempts ()  { throw new RuntimeException(); }
  static public  scala.Option<other.supplier.CustomPersistenceEngine> lastInstance ()  { throw new RuntimeException(); }
  public   CustomPersistenceEngine (org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, byte[]> data ()  { throw new RuntimeException(); }
  /**
   * Defines how the object is serialized and persisted. Implementation will
   * depend on the store used.
   * @param name (undocumented)
   * @param obj (undocumented)
   */
  public  void persist (java.lang.String name, java.lang.Object obj)  { throw new RuntimeException(); }
  /**
   * Defines how the object referred by its name is removed from the store.
   * @param name (undocumented)
   */
  public  void unpersist (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Gives all objects, matching a prefix. This defines how objects are
   * read/deserialized back.
   * @param prefix (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.Seq<T> read (java.lang.String prefix, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
}
