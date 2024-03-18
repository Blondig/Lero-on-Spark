package org.apache.spark.rpc.netty;
/** A message to tell all endpoints that a remote process has connected. */
  class RemoteProcessConnected implements org.apache.spark.rpc.netty.InboxMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress remoteAddress ()  { throw new RuntimeException(); }
  // not preceding
  public   RemoteProcessConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
}
