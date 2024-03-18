package org.apache.spark.sql.execution.streaming.state;
public  interface HDFSBackedStateStoreMap {
  public  int size ()  ;
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  ;
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  ;
  public  void putAll (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreMap map)  ;
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow remove (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  ;
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator ()  ;
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> prefixScan (org.apache.spark.sql.catalyst.expressions.UnsafeRow prefixKey)  ;
  public  void clear ()  ;
}
