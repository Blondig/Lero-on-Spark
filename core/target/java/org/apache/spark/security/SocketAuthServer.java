package org.apache.spark.security;
/**
 * Creates a server in the JVM to communicate with external processes (e.g., Python and R) for
 * handling one batch of data, with authentication and error handling.
 * <p>
 * The socket server can only accept one connection, or close if no connection
 * in configurable amount of seconds (default 15).
 */
 abstract class SocketAuthServer<T extends java.lang.Object> implements org.apache.spark.internal.Logging {
  /**
   * Convenience function to create a socket server and run a user function in a background
   * thread to write to an output stream.
   * <p>
   * The socket server can only accept one connection, or close if no connection
   * in 15 seconds.
   * <p>
   * @param threadName Name for the background serving thread.
   * @param authHelper SocketAuthHelper for authentication
   * @param writeFunc User function to write to a given OutputStream
   * @return 3-tuple (as a Java array) with the port number of a local socket which serves the
   *         data collected from this job, the secret for authentication, and a socket auth
   *         server object that can be used to join the JVM serving thread in Python.
   */
  static public  java.lang.Object[] serveToStream (java.lang.String threadName, org.apache.spark.security.SocketAuthHelper authHelper, scala.Function1<java.io.OutputStream, scala.runtime.BoxedUnit> writeFunc)  { throw new RuntimeException(); }
  public   SocketAuthServer (org.apache.spark.security.SocketAuthHelper authHelper, java.lang.String threadName)  { throw new RuntimeException(); }
  public   SocketAuthServer (org.apache.spark.SparkEnv env, java.lang.String threadName)  { throw new RuntimeException(); }
  public   SocketAuthServer (java.lang.String threadName)  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  java.lang.String secret ()  { throw new RuntimeException(); }
  /**
   * Handle a connection which has already been authenticated.  Any error from this function
   * will clean up this connection and the entire server, and get propagated to {@link getResult}.
   * @param sock (undocumented)
   * @return (undocumented)
   */
  public abstract  T handleConnection (java.net.Socket sock)  ;
  /**
   * Blocks indefinitely for {@link handleConnection} to finish, and returns that result.  If
   * handleConnection throws an exception, this will throw an exception which includes the original
   * exception as a cause.
   * @return (undocumented)
   */
  public  T getResult ()  { throw new RuntimeException(); }
  public  T getResult (scala.concurrent.duration.Duration wait)  { throw new RuntimeException(); }
}
