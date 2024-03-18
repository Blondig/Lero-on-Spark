package org.apache.spark.sql.execution.streaming.state;
/** Mutable and reusable pair of byte arrays */
public  class ByteArrayPair {
  public  byte[] key ()  { throw new RuntimeException(); }
  public  byte[] value ()  { throw new RuntimeException(); }
  // not preceding
  public   ByteArrayPair (byte[] key, byte[] value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.ByteArrayPair set (byte[] key, byte[] value)  { throw new RuntimeException(); }
}
