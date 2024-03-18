package org.apache.spark.util;
/**
 * A special locking mechanism to provide locking with a given key. By providing the same key
 * (identity is tested using the <code>equals</code> method), we ensure there is only one <code>func</code> running at
 * the same time.
 * <p>
 * @param <K>  the type of key to identify a lock. This type must implement <code>equals</code> and <code>hashCode</code>
 *           correctly as it will be the key type of an internal Map.
 */
  class KeyLock<K extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   KeyLock ()  { throw new RuntimeException(); }
  /**
   * Run <code>func</code> under a lock identified by the given key. Multiple calls with the same key
   * (identity is tested using the <code>equals</code> method) will be locked properly to ensure there is only
   * one <code>func</code> running at the same time.
   * @param key (undocumented)
   * @param func (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withLock (K key, scala.Function0<T> func)  { throw new RuntimeException(); }
}
