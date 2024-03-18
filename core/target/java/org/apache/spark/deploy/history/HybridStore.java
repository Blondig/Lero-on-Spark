package org.apache.spark.deploy.history;
/**
 * An implementation of KVStore that accelerates event logs loading.
 * <p>
 * When rebuilding the application state from event logs, HybridStore will
 * write data to InMemoryStore at first and use a background thread to dump
 * data to a disk-based KVStore once the app store is restored. We don't expect write
 * operations (except the case for caching) after calling switch to the disk-based KVStore.
 */
  class HybridStore implements org.apache.spark.util.kvstore.KVStore {
  static public  interface SwitchToDiskStoreListener {
    public  void onSwitchToDiskStoreFail (java.lang.Exception e)  ;
    public  void onSwitchToDiskStoreSuccess ()  ;
  }
  public   HybridStore ()  { throw new RuntimeException(); }
    java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.lang.Object> klassMap ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T getMetadata (java.lang.Class<T> klass)  { throw new RuntimeException(); }
  public  void setMetadata (java.lang.Object value)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T read (java.lang.Class<T> klass, java.lang.Object naturalKey)  { throw new RuntimeException(); }
  public  void write (java.lang.Object value)  { throw new RuntimeException(); }
  public  void delete (java.lang.Class<?> klass, java.lang.Object naturalKey)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.util.kvstore.KVStoreView<T> view (java.lang.Class<T> klass)  { throw new RuntimeException(); }
  public  long count (java.lang.Class<?> klass)  { throw new RuntimeException(); }
  public  long count (java.lang.Class<?> klass, java.lang.String index, java.lang.Object indexedValue)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> boolean removeAllByIndexValues (java.lang.Class<T> klass, java.lang.String index, java.util.Collection<?> indexValues)  { throw new RuntimeException(); }
  public  void setDiskStore (org.apache.spark.util.kvstore.KVStore diskStore)  { throw new RuntimeException(); }
  /**
   * This method is called when the writing is done for inMemoryStore. A
   * background thread will be created and be started to dump data in inMemoryStore
   * to diskStore. Once the dumping is completed, the underlying kvstore will be
   * switched to diskStore.
   * @param listener (undocumented)
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   */
  public  void switchToDiskStore (org.apache.spark.deploy.history.HybridStore.SwitchToDiskStoreListener listener, java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * This method return the store that we should use.
   * Visible for testing.
   * @return (undocumented)
   */
    org.apache.spark.util.kvstore.KVStore getStore ()  { throw new RuntimeException(); }
}
