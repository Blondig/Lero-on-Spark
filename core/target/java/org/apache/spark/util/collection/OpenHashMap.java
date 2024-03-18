package org.apache.spark.util.collection;
/**
 * A fast hash map implementation for nullable keys. This hash map supports insertions and updates,
 * but not deletions. This map is about 5X faster than java.util.HashMap, while using much less
 * space overhead.
 * <p>
 * Under the hood, it uses our OpenHashSet implementation.
 * <p>
 * NOTE: when using numeric type as the value type, the user of this class should be careful to
 * distinguish between the 0/0.0/0L and non-exist value
 */
  class OpenHashMap<K extends java.lang.Object, V extends java.lang.Object> implements scala.collection.Iterable<scala.Tuple2<K, V>>, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   OpenHashMap (int initialCapacity, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  public   OpenHashMap (scala.reflect.ClassTag<K> evidence$3, scala.reflect.ClassTag<V> evidence$4)  { throw new RuntimeException(); }
  protected  org.apache.spark.util.collection.OpenHashSet<K> _keySet ()  { throw new RuntimeException(); }
  /** Get the value for a given key */
  public  V apply (K k)  { throw new RuntimeException(); }
  /**
   * If the key doesn't exist yet in the hash map, set its value to defaultValue; otherwise,
   * set its value to mergeValue(oldValue).
   * <p>
   * @return the newly updated value.
   * @param k (undocumented)
   * @param defaultValue (undocumented)
   * @param mergeValue (undocumented)
   */
  public  V changeValue (K k, scala.Function0<V> defaultValue, scala.Function1<V, V> mergeValue)  { throw new RuntimeException(); }
  /** Tests whether this map contains a binding for a key. */
  public  boolean contains (K k)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<K, V>> iterator ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  /** Set the value for a key */
  public  void update (K k, V v)  { throw new RuntimeException(); }
}
