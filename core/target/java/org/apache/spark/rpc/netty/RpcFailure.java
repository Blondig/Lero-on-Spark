package org.apache.spark.rpc.netty;
/**
 * A response that indicates some failure happens in the receiver side.
 */
  class RpcFailure implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.Throwable e ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcFailure (java.lang.Throwable e)  { throw new RuntimeException(); }
}
