package org.apache.spark.sql.execution.streaming.state;
/**
 * Encodes/decodes UnsafeRows to versioned byte arrays.
 * It uses the first byte of the generated byte array to store the version the describes how the
 * row is encoded in the rest of the byte array. Currently, the default version is 0,
 * <p>
 * VERSION 0:  [ VERSION (1 byte) | ROW (N bytes) ]
 *    The bytes of a UnsafeRow is written unmodified to starting from offset 1
 *    (offset 0 is the version byte of value 0). That is, if the unsafe row has N bytes,
 *    then the generated array byte will be N+1 bytes.
 */
public  class NoPrefixKeyStateEncoder implements org.apache.spark.sql.execution.streaming.state.RocksDBStateEncoder {
  public   NoPrefixKeyStateEncoder (org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema)  { throw new RuntimeException(); }
  /**
   * Decode pair of key-value byte arrays in a pair of key-value UnsafeRows.
   * <p>
   * @note The UnsafeRow returned is reused across calls, and the UnsafeRow just points to
   *       the given byte array.
   * @param byteArrayTuple (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.state.UnsafeRowPair decode (org.apache.spark.sql.execution.streaming.state.ByteArrayPair byteArrayTuple)  { throw new RuntimeException(); }
  /**
   * Decode byte array for a key to a UnsafeRow.
   * @note The UnsafeRow returned is reused across calls, and the UnsafeRow just points to
   *       the given byte array.
   * @param keyBytes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow decodeKey (byte[] keyBytes)  { throw new RuntimeException(); }
  /**
   * Decode byte array for a value to a UnsafeRow.
   * <p>
   * @note The UnsafeRow returned is reused across calls, and the UnsafeRow just points to
   *       the given byte array.
   * @param valueBytes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow decodeValue (byte[] valueBytes)  { throw new RuntimeException(); }
  public  byte[] encodeKey (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  byte[] encodePrefixKey (org.apache.spark.sql.catalyst.expressions.UnsafeRow prefixKey)  { throw new RuntimeException(); }
  public  byte[] encodeValue (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow extractPrefixKey (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  public  boolean supportPrefixKeyScan ()  { throw new RuntimeException(); }
}