package org.apache.spark.sql.execution.streaming.state;
/**
 * Base trait for a versioned key-value store which provides read operations. Each instance of a
 * <code>ReadStateStore</code> represents a specific version of state data, and such instances are created
 * through a {@link StateStoreProvider}.
 * <p>
 * <code>abort</code> method will be called when the task is completed - please clean up the resources in
 * the method.
 * <p>
 * IMPLEMENTATION NOTES:
 * * The implementation can throw exception on calling prefixScan method if the functionality is
 *   not supported yet from the implementation. Note that some stateful operations would not work
 *   on disabling prefixScan functionality.
 */
public  interface ReadStateStore {
  /**
   * Clean up the resource.
   * <p>
   * The method name is to respect backward compatibility on {@link StateStore}.
   */
  public  void abort ()  ;
  /**
   * Get the current value of a non-null key.
   * @return a non-null row if the key exists in the store, otherwise null.
   * @param key (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  ;
  /** Unique identifier of the store */
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId id ()  ;
  /** Return an iterator containing all the key-value pairs in the StateStore. */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator ()  ;
  /**
   * Return an iterator containing all the key-value pairs which are matched with
   * the given prefix key.
   * <p>
   * The operator will provide numColsPrefixKey greater than 0 in StateStoreProvider.init method
   * if the operator needs to leverage the "prefix scan" feature. The schema of the prefix key
   * should be same with the leftmost <code>numColsPrefixKey</code> columns of the key schema.
   * <p>
   * It is expected to throw exception if Spark calls this method without setting numColsPrefixKey
   * to the greater than 0.
   * @param prefixKey (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> prefixScan (org.apache.spark.sql.catalyst.expressions.UnsafeRow prefixKey)  ;
  /** Version of the data in this store before committing updates. */
  public  long version ()  ;
}
