package org.apache.spark.executor;
public  class Executor$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Executor$ MODULE$ = null;
  public   Executor$ ()  { throw new RuntimeException(); }
  public  java.lang.ThreadLocal<java.util.Properties> taskDeserializationProps ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.ExecutorSource executorSourceLocalModeOnly ()  { throw new RuntimeException(); }
  /**
   * Whether a <code>Throwable</code> thrown from a task is a fatal error. We will use this to decide whether
   * to kill the executor.
   * <p>
   * @param depthToCheck The max depth of the exception chain we should search for a fatal error. 0
   *                     means not checking any fatal error (in other words, return false), 1 means
   *                     checking only the exception but not the cause, and so on. This is to avoid
   *                     <code>StackOverflowError</code> when hitting a cycle in the exception chain.
   * @param t (undocumented)
   * @return (undocumented)
   */
  public  boolean isFatalError (java.lang.Throwable t, int depthToCheck)  { throw new RuntimeException(); }
}
