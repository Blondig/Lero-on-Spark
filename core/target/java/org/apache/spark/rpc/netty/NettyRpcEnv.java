package org.apache.spark.rpc.netty;
  class NettyRpcEnv extends org.apache.spark.rpc.RpcEnv implements org.apache.spark.internal.Logging {
  /**
   * When deserializing the {@link NettyRpcEndpointRef}, it needs a reference to {@link NettyRpcEnv}.
   * Use <code>currentEnv</code> to wrap the deserialization codes. E.g.,
   * <p>
   * <pre><code>
   *   NettyRpcEnv.currentEnv.withValue(this) {
   *     your deserialization codes
   *   }
   * </code></pre>
   * @return (undocumented)
   */
  static   scala.util.DynamicVariable<org.apache.spark.rpc.netty.NettyRpcEnv> currentEnv ()  { throw new RuntimeException(); }
  /**
   * Similar to <code>currentEnv</code>, this variable references the client instance associated with an
   * RPC, in case it's needed to find out the remote address during deserialization.
   * @return (undocumented)
   */
  static   scala.util.DynamicVariable<org.apache.spark.network.client.TransportClient> currentClient ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   NettyRpcEnv (org.apache.spark.SparkConf conf, org.apache.spark.serializer.JavaSerializerInstance javaSerializerInstance, java.lang.String host, org.apache.spark.SecurityManager securityManager, int numUsableCores)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> role ()  { throw new RuntimeException(); }
    org.apache.spark.network.util.TransportConf transportConf ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ScheduledExecutorService timeoutScheduler ()  { throw new RuntimeException(); }
    java.util.concurrent.ThreadPoolExecutor clientConnectionExecutor ()  { throw new RuntimeException(); }
  /**
   * Remove the address's Outbox and stop it.
   * @param address (undocumented)
   */
    void removeOutbox (org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
  public  void startServer (java.lang.String bindAddress, int port)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rpc.RpcAddress address ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef setupEndpoint (java.lang.String name, org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.spark.rpc.RpcEndpointRef> asyncSetupEndpointRefByURI (java.lang.String uri)  { throw new RuntimeException(); }
  public  void stop (org.apache.spark.rpc.RpcEndpointRef endpointRef)  { throw new RuntimeException(); }
    void send (org.apache.spark.rpc.netty.RequestMessage message)  { throw new RuntimeException(); }
    org.apache.spark.network.client.TransportClient createClient (org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
   <T extends java.lang.Object> org.apache.spark.rpc.AbortableRpcFuture<T> askAbortable (org.apache.spark.rpc.netty.RequestMessage message, org.apache.spark.rpc.RpcTimeout timeout, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
   <T extends java.lang.Object> scala.concurrent.Future<T> ask (org.apache.spark.rpc.netty.RequestMessage message, org.apache.spark.rpc.RpcTimeout timeout, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
    java.nio.ByteBuffer serialize (Object content)  { throw new RuntimeException(); }
  /**
   * Returns {@link SerializationStream} that forwards the serialized bytes to <code>out</code>.
   * @param out (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.serializer.SerializationStream serializeStream (java.io.OutputStream out)  { throw new RuntimeException(); }
   <T extends java.lang.Object> T deserialize (org.apache.spark.network.client.TransportClient client, java.nio.ByteBuffer bytes, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef endpointRef (org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  public  void shutdown ()  { throw new RuntimeException(); }
  public  void awaitTermination ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T deserialize (scala.Function0<T> deserializationAction)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnvFileServer fileServer ()  { throw new RuntimeException(); }
  public  java.nio.channels.ReadableByteChannel openChannel (java.lang.String uri)  { throw new RuntimeException(); }
}
