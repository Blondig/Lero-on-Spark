package org.apache.spark.sql.execution.streaming.state;
public  class RocksDBStateEncoder$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RocksDBStateEncoder$ MODULE$ = null;
  public   RocksDBStateEncoder$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.RocksDBStateEncoder getEncoder (org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, int numColsPrefixKey)  { throw new RuntimeException(); }
  /**
   * Encode the UnsafeRow of N bytes as a N+1 byte array.
   * @note This creates a new byte array and memcopies the UnsafeRow to the new array.
   * @param row (undocumented)
   * @return (undocumented)
   */
  public  byte[] encodeUnsafeRow (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow decodeToUnsafeRow (byte[] bytes, int numFields)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow decodeToUnsafeRow (byte[] bytes, org.apache.spark.sql.catalyst.expressions.UnsafeRow reusedRow)  { throw new RuntimeException(); }
}
