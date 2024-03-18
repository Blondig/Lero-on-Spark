package org.apache.spark.security;
/**
 * Create a socket server class and run user function on the socket in a background thread
 * that can read and write to the socket input/output streams. The function is passed in a
 * socket that has been connected and authenticated.
 */
  class SocketFuncServer extends org.apache.spark.security.SocketAuthServer<scala.runtime.BoxedUnit> {
  public   SocketFuncServer (org.apache.spark.security.SocketAuthHelper authHelper, java.lang.String threadName, scala.Function1<java.net.Socket, scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
  public  void handleConnection (java.net.Socket sock)  { throw new RuntimeException(); }
}
