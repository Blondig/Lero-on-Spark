package org.apache.spark.rpc;
/**
 * An exception thrown if RpcTimeout modifies a <code>TimeoutException</code>.
 */
  class RpcTimeoutException extends java.util.concurrent.TimeoutException {
  public   RpcTimeoutException (java.lang.String message, java.util.concurrent.TimeoutException cause)  { throw new RuntimeException(); }
}
