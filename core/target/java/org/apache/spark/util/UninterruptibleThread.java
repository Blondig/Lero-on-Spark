package org.apache.spark.util;
/**
 * A special Thread that provides "runUninterruptibly" to allow running codes without being
 * interrupted by <code>Thread.interrupt()</code>. If <code>Thread.interrupt()</code> is called during runUninterruptibly
 * is running, it won't set the interrupted status. Instead, setting the interrupted status will be
 * deferred until it's returning from "runUninterruptibly".
 * <p>
 * Note: "runUninterruptibly" should be called only in <code>this</code> thread.
 */
  class UninterruptibleThread extends java.lang.Thread {
  public   UninterruptibleThread (java.lang.Runnable target, java.lang.String name)  { throw new RuntimeException(); }
  public   UninterruptibleThread (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Interrupt <code>this</code> thread if possible. If <code>this</code> is in the uninterruptible status, it won't be
   * interrupted until it enters into the interruptible status.
   */
  public  void interrupt ()  { throw new RuntimeException(); }
  /**
   * Run <code>f</code> uninterruptibly in <code>this</code> thread. The thread won't be interrupted before returning
   * from <code>f</code>.
   * <p>
   * Note: this method should be called only in <code>this</code> thread.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T runUninterruptibly (scala.Function0<T> f)  { throw new RuntimeException(); }
}
