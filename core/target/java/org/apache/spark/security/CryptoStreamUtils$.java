package org.apache.spark.security;
/**
 * A util class for manipulating IO encryption and decryption streams.
 */
public  class CryptoStreamUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CryptoStreamUtils$ MODULE$ = null;
  public   CryptoStreamUtils$ ()  { throw new RuntimeException(); }
  public  int IV_LENGTH_IN_BYTES ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_IO_ENCRYPTION_COMMONS_CONFIG_PREFIX ()  { throw new RuntimeException(); }
  /**
   * Helper method to wrap <code>OutputStream</code> with <code>CryptoOutputStream</code> for encryption.
   * @param os (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.io.OutputStream createCryptoOutputStream (java.io.OutputStream os, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Wrap a <code>WritableByteChannel</code> for encryption.
   * @param channel (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.nio.channels.WritableByteChannel createWritableChannel (java.nio.channels.WritableByteChannel channel, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Helper method to wrap <code>InputStream</code> with <code>CryptoInputStream</code> for decryption.
   * @param is (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.io.InputStream createCryptoInputStream (java.io.InputStream is, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Wrap a <code>ReadableByteChannel</code> for decryption.
   * @param channel (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.nio.channels.ReadableByteChannel createReadableChannel (java.nio.channels.ReadableByteChannel channel, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  public  java.util.Properties toCryptoConf (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Creates a new encryption key.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  byte[] createKey (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
