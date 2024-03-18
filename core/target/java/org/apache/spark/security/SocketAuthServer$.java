package org.apache.spark.security;
public  class SocketAuthServer$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SocketAuthServer$ MODULE$ = null;
  public   SocketAuthServer$ ()  { throw new RuntimeException(); }
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
  public  java.lang.Object[] serveToStream (java.lang.String threadName, org.apache.spark.security.SocketAuthHelper authHelper, scala.Function1<java.io.OutputStream, scala.runtime.BoxedUnit> writeFunc)  { throw new RuntimeException(); }
}
