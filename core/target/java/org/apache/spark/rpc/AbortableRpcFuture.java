package org.apache.spark.rpc;
/**
 * A wrapper for {@link Future} but add abort method.
 * This is used in long run RPC and provide an approach to abort the RPC.
 */
  class AbortableRpcFuture<T extends java.lang.Object> {
  // not preceding
  public   AbortableRpcFuture (scala.concurrent.Future<T> future, scala.Function1<java.lang.Throwable, scala.runtime.BoxedUnit> onAbort, scala.reflect.ClassTag<T> evidence$6)  { throw new RuntimeException(); }
  public  void abort (java.lang.Throwable t)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<T> future ()  { throw new RuntimeException(); }
}
