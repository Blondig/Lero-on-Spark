package org.apache.spark.sql.execution.streaming.state;
public  interface RocksDBStateEncoder {
  public  boolean supportPrefixKeyScan ()  ;
  public  byte[] encodePrefixKey (org.apache.spark.sql.catalyst.expressions.UnsafeRow prefixKey)  ;
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow extractPrefixKey (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  ;
  public  byte[] encodeKey (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  ;
  public  byte[] encodeValue (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  ;
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow decodeKey (byte[] keyBytes)  ;
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow decodeValue (byte[] valueBytes)  ;
  public  org.apache.spark.sql.execution.streaming.state.UnsafeRowPair decode (org.apache.spark.sql.execution.streaming.state.ByteArrayPair byteArrayTuple)  ;
}
