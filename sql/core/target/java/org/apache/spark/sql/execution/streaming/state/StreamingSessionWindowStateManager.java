package org.apache.spark.sql.execution.streaming.state;
public  interface StreamingSessionWindowStateManager extends scala.Serializable {
  /**
   * Returns the schema for key of the state.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType getStateKeySchema ()  ;
  /**
   * Returns the schema for value of the state.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType getStateValueSchema ()  ;
  /**
   * Returns the number of columns for <code>prefix key</code> in key schema.
   * @return (undocumented)
   */
  public  int getNumColsForPrefixKey ()  ;
  /**
   * Extracts the key without session window from the row.
   * This can be used to group session windows by key.
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow extractKeyWithoutSession (org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  ;
  /**
   * Returns true if the session of the given value doesn't exist in the store, or the value
   * in the session is different to the stored value of the session in the store.
   * This can be used to control the output in UPDATE mode.
   * @param store (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  boolean newOrModified (org.apache.spark.sql.execution.streaming.state.ReadStateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  ;
  /**
   * Returns all sessions for the key.
   * <p>
   * @param key The key without session, which can be retrieved from
   *            {@code extractKeyWithoutSession}.
   * @param store (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> getSessions (org.apache.spark.sql.execution.streaming.state.ReadStateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  ;
  /**
   * Replaces all sessions for the key to given one.
   * <p>
   * @param key The key without session, which can be retrieved from
   *            {@code extractKeyWithoutSession}.
   * @param sessions The all sessions including existing sessions if it's active.
   *                 Existing sessions which aren't included in this parameter will be removed.
   * @return A tuple having two elements
   *         1. number of added/updated rows
   *         2. number of deleted rows
   * @param store (undocumented)
   */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> updateSessions (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow key, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.UnsafeRow> sessions)  ;
  /**
   * Removes using a predicate on values, with returning removed values via iterator.
   * <p>
   * At a high level, this produces an iterator over the (key, value, matched) tuples such that
   * value satisfies the predicate, where producing an element removes the value from the
   * state store and producing all elements with a given key updates it accordingly.
   * <p>
   * This implies the iterator must be consumed fully without any other operations on this manager
   * or the underlying store being interleaved.
   * <p>
   * @param removalCondition The predicate on removing the key-value.
   * @param store (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> removeByValueCondition (org.apache.spark.sql.execution.streaming.state.StateStore store, scala.Function1<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object> removalCondition)  ;
  /**
   * Return an iterator containing all the sessions. Implementations must ensure that updates
   * (puts, removes) can be made while iterating over this iterator.
   * @param store (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> iterator (org.apache.spark.sql.execution.streaming.state.ReadStateStore store)  ;
  /**
   * Commits the change.
   * @param store (undocumented)
   * @return (undocumented)
   */
  public  long commit (org.apache.spark.sql.execution.streaming.state.StateStore store)  ;
  /**
   * Aborts the change.
   * @param store (undocumented)
   */
  public  void abortIfNeeded (org.apache.spark.sql.execution.streaming.state.StateStore store)  ;
}
