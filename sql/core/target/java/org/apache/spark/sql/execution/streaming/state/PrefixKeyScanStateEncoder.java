package org.apache.spark.sql.execution.streaming.state;
public  class PrefixKeyScanStateEncoder implements org.apache.spark.sql.execution.streaming.state.RocksDBStateEncoder {
  public   PrefixKeyScanStateEncoder (org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, int numColsPrefixKey)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.UnsafeRowPair decode (org.apache.spark.sql.execution.streaming.state.ByteArrayPair byteArrayTuple)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow decodeKey (byte[] keyBytes)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow decodeValue (byte[] valueBytes)  { throw new RuntimeException(); }
  public  byte[] encodeKey (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  byte[] encodePrefixKey (org.apache.spark.sql.catalyst.expressions.UnsafeRow prefixKey)  { throw new RuntimeException(); }
  public  byte[] encodeValue (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow extractPrefixKey (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  public  boolean supportPrefixKeyScan ()  { throw new RuntimeException(); }
}
