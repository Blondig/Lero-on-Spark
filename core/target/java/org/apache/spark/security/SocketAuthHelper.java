package org.apache.spark.security;
/**
 * A class that can be used to add a simple authentication protocol to socket-based communication.
 * <p>
 * The protocol is simple: an auth secret is written to the socket, and the other side checks the
 * secret and writes either "ok" or "err" to the output. If authentication fails, the socket is
 * not expected to be valid anymore.
 * <p>
 * There's no secrecy, so this relies on the sockets being either local or somehow encrypted.
 */
  class SocketAuthHelper {
  // not preceding
  public   SocketAuthHelper (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Read the auth secret from the socket and compare to the expected value. Write the reply back
   * to the socket.
   * <p>
   * If authentication fails or error is thrown, this method will close the socket.
   * <p>
   * @param s The client socket.
   * @throws IllegalArgumentException If authentication fails.
   */
  public  void authClient (java.net.Socket s)  { throw new RuntimeException(); }
  /**
   * Authenticate with a server by writing the auth secret and checking the server's reply.
   * <p>
   * If authentication fails or error is thrown, this method will close the socket.
   * <p>
   * @param s The socket connected to the server.
   * @throws IllegalArgumentException If authentication fails.
   */
  public  void authToServer (java.net.Socket s)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  protected  java.lang.String readUtf8 (java.net.Socket s)  { throw new RuntimeException(); }
  public  java.lang.String secret ()  { throw new RuntimeException(); }
  protected  void writeUtf8 (java.lang.String str, java.net.Socket s)  { throw new RuntimeException(); }
}
