package org.apache.spark.security;
/**
 * A util class for manipulating IO encryption and decryption streams.
 */
public  class CryptoStreamUtils {
  /**
   * SPARK-25535. The commons-crypto library will throw InternalError if something goes
   * wrong, and leave bad state behind in the Java wrappers, so it's not safe to use them
   * afterwards. This wrapper detects that situation and avoids further calls into the
   * commons-crypto code, while still allowing the underlying streams to be closed.
   * <p>
   * This should be removed once CRYPTO-141 is fixed (and Spark upgrades its commons-crypto
   * dependency).
   */
  static public  interface BaseErrorHandler extends java.io.Closeable {
    /** The encrypted stream that may get into an unhealthy state. */
    public  java.io.Closeable cipherStream ()  ;
    public  void close ()  ;
    /**
     * The underlying stream that is being wrapped by the encrypted stream, so that it can be
     * closed even if there's an error in the crypto layer.
     * @return (undocumented)
     */
    public  java.io.Closeable original ()  ;
    public <T extends java.lang.Object> T safeCall (scala.Function0<T> fn)  ;
  }
  static public  class ErrorHandlingReadableChannel implements java.nio.channels.ReadableByteChannel, org.apache.spark.security.CryptoStreamUtils.BaseErrorHandler {
    // not preceding
    public   ErrorHandlingReadableChannel (java.nio.channels.ReadableByteChannel cipherStream, java.nio.channels.ReadableByteChannel original)  { throw new RuntimeException(); }
    protected  java.nio.channels.ReadableByteChannel cipherStream ()  { throw new RuntimeException(); }
    public  boolean isOpen ()  { throw new RuntimeException(); }
    protected  java.nio.channels.ReadableByteChannel original ()  { throw new RuntimeException(); }
    public  int read (java.nio.ByteBuffer src)  { throw new RuntimeException(); }
  }
  static public  int IV_LENGTH_IN_BYTES ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_IO_ENCRYPTION_COMMONS_CONFIG_PREFIX ()  { throw new RuntimeException(); }
  /**
   * Helper method to wrap <code>OutputStream</code> with <code>CryptoOutputStream</code> for encryption.
   * @param os (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  static public  java.io.OutputStream createCryptoOutputStream (java.io.OutputStream os, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Wrap a <code>WritableByteChannel</code> for encryption.
   * @param channel (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  static public  java.nio.channels.WritableByteChannel createWritableChannel (java.nio.channels.WritableByteChannel channel, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Helper method to wrap <code>InputStream</code> with <code>CryptoInputStream</code> for decryption.
   * @param is (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  static public  java.io.InputStream createCryptoInputStream (java.io.InputStream is, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Wrap a <code>ReadableByteChannel</code> for decryption.
   * @param channel (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  static public  java.nio.channels.ReadableByteChannel createReadableChannel (java.nio.channels.ReadableByteChannel channel, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  static public  java.util.Properties toCryptoConf (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Creates a new encryption key.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  byte[] createKey (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
