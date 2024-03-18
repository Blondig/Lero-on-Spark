package org.apache.spark.status;
public  class KVUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KVUtils$ MODULE$ = null;
  public   KVUtils$ ()  { throw new RuntimeException(); }
  /**
   * Open or create a disk-based KVStore.
   * <p>
   * @param path Location of the store.
   * @param metadata Metadata value to compare to the data in the store. If the store does not
   *                 contain any metadata (e.g. it's a new store), this value is written as
   *                 the store's metadata.
   * @param conf SparkConf use to get <code>HYBRID_STORE_DISK_BACKEND</code>
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <M extends java.lang.Object> org.apache.spark.util.kvstore.KVStore open (java.io.File path, M metadata, org.apache.spark.SparkConf conf, scala.reflect.ClassTag<M> evidence$1)  { throw new RuntimeException(); }
  /** Turns a KVStoreView into a Scala sequence, applying a filter. */
  public <T extends java.lang.Object> scala.collection.Seq<T> viewToSeq (org.apache.spark.util.kvstore.KVStoreView<T> view, int max, scala.Function1<T, java.lang.Object> filter)  { throw new RuntimeException(); }
}
