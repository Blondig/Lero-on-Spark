package org.apache.spark.rpc.netty;
/** A message to tell all endpoints that a network error has happened. */
  class RemoteProcessConnectionError implements org.apache.spark.rpc.netty.InboxMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.Throwable cause ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress remoteAddress ()  { throw new RuntimeException(); }
  // not preceding
  public   RemoteProcessConnectionError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
}
