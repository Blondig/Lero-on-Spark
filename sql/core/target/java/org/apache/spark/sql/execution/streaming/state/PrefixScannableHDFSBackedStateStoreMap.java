package org.apache.spark.sql.execution.streaming.state;
public  class PrefixScannableHDFSBackedStateStoreMap implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreMap {
  public   PrefixScannableHDFSBackedStateStoreMap (org.apache.spark.sql.types.StructType keySchema, int numColsPrefixKey)  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> prefixScan (org.apache.spark.sql.catalyst.expressions.UnsafeRow prefixKey)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
  public  void putAll (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreMap other)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow remove (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
}
