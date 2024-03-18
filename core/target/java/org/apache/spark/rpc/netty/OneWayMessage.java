package org.apache.spark.rpc.netty;
  class OneWayMessage implements org.apache.spark.rpc.netty.InboxMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  { throw new RuntimeException(); }
  public  Object content ()  { throw new RuntimeException(); }
  // not preceding
  public   OneWayMessage (org.apache.spark.rpc.RpcAddress senderAddress, Object content)  { throw new RuntimeException(); }
}
