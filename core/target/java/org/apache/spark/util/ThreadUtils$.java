package org.apache.spark.util;
public  class ThreadUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ThreadUtils$ MODULE$ = null;
  public   ThreadUtils$ ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ExecutorService sameThreadExecutorService ()  { throw new RuntimeException(); }
  /**
   * An <code>ExecutionContextExecutor</code> that runs each task in the thread that invokes <code>execute/submit</code>.
   * The caller should make sure the tasks running in this <code>ExecutionContextExecutor</code> are short and
   * never block.
   * @return (undocumented)
   */
  public  scala.concurrent.ExecutionContextExecutor sameThread ()  { throw new RuntimeException(); }
  /**
   * Create a thread factory that names threads with a prefix and also sets the threads to daemon.
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ThreadFactory namedThreadFactory (java.lang.String prefix)  { throw new RuntimeException(); }
  /**
   * Wrapper over newCachedThreadPool. Thread names are formatted as prefix-ID, where ID is a
   * unique, sequentially assigned integer.
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ThreadPoolExecutor newDaemonCachedThreadPool (java.lang.String prefix)  { throw new RuntimeException(); }
  /**
   * Create a cached thread pool whose max number of threads is <code>maxThreadNumber</code>. Thread names
   * are formatted as prefix-ID, where ID is a unique, sequentially assigned integer.
   * @param prefix (undocumented)
   * @param maxThreadNumber (undocumented)
   * @param keepAliveSeconds (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ThreadPoolExecutor newDaemonCachedThreadPool (java.lang.String prefix, int maxThreadNumber, int keepAliveSeconds)  { throw new RuntimeException(); }
  /**
   * Wrapper over newFixedThreadPool. Thread names are formatted as prefix-ID, where ID is a
   * unique, sequentially assigned integer.
   * @param nThreads (undocumented)
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ThreadPoolExecutor newDaemonFixedThreadPool (int nThreads, java.lang.String prefix)  { throw new RuntimeException(); }
  /**
   * Wrapper over newSingleThreadExecutor.
   * @param threadName (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ExecutorService newDaemonSingleThreadExecutor (java.lang.String threadName)  { throw new RuntimeException(); }
  /**
   * Wrapper over ScheduledThreadPoolExecutor.
   * @param threadName (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ScheduledExecutorService newDaemonSingleThreadScheduledExecutor (java.lang.String threadName)  { throw new RuntimeException(); }
  /**
   * Wrapper over ScheduledThreadPoolExecutor.
   * @param threadNamePrefix (undocumented)
   * @param numThreads (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ScheduledExecutorService newDaemonThreadPoolScheduledExecutor (java.lang.String threadNamePrefix, int numThreads)  { throw new RuntimeException(); }
  /**
   * Run a piece of code in a new thread and return the result. Exception in the new thread is
   * thrown in the caller thread with an adjusted stack trace that removes references to this
   * method for clarity. The exception stack traces will be like the following
   * <p>
   * SomeException: exception-message
   *   at CallerClass.body-method (sourcefile.scala)
   *   at ... run in separate thread using org.apache.spark.util.ThreadUtils ... ()
   *   at CallerClass.caller-method (sourcefile.scala)
   *   ...
   * @param threadName (undocumented)
   * @param isDaemon (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T runInNewThread (java.lang.String threadName, boolean isDaemon, scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Construct a new ForkJoinPool with a specified max parallelism and name prefix.
   * @param prefix (undocumented)
   * @param maxThreadNumber (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ForkJoinPool newForkJoinPool (java.lang.String prefix, int maxThreadNumber)  { throw new RuntimeException(); }
  /**
   * Preferred alternative to <code>Await.result()</code>.
   * <p>
   * This method wraps and re-throws any exceptions thrown by the underlying <code>Await</code> call, ensuring
   * that this thread's stack trace appears in logs.
   * <p>
   * In addition, it calls <code>Awaitable.result</code> directly to avoid using <code>ForkJoinPool</code>'s
   * <code>BlockingContext</code>. Codes running in the user's thread may be in a thread of Scala ForkJoinPool.
   * As concurrent executions in ForkJoinPool may see some {@link ThreadLocal} value unexpectedly, this
   * method basically prevents ForkJoinPool from running other tasks in the current waiting thread.
   * In general, we should use this method because many places in Spark use {@link ThreadLocal} and it's
   * hard to debug when {@link ThreadLocal}s leak to other tasks.
   * @param awaitable (undocumented)
   * @param atMost (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T awaitResult (scala.concurrent.Awaitable<T> awaitable, scala.concurrent.duration.Duration atMost) throws org.apache.spark.SparkException { throw new RuntimeException(); }
  public <T extends java.lang.Object> T awaitResult (java.util.concurrent.Future<T> future, scala.concurrent.duration.Duration atMost) throws org.apache.spark.SparkException { throw new RuntimeException(); }
  /**
   * Preferred alternative to <code>Await.ready()</code>.
   * <p>
   * @see awaitResult
   * @param awaitable (undocumented)
   * @param atMost (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.concurrent.Awaitable awaitReady (scala.concurrent.Awaitable<T> awaitable, scala.concurrent.duration.Duration atMost) throws org.apache.spark.SparkException { throw new RuntimeException(); }
  public  void shutdown (java.util.concurrent.ExecutorService executor, scala.concurrent.duration.Duration gracePeriod)  { throw new RuntimeException(); }
  /**
   * Transforms input collection by applying the given function to each element in parallel fashion.
   * Comparing to the map() method of Scala parallel collections, this method can be interrupted
   * at any time. This is useful on canceling of task execution, for example.
   * <p>
   * @param in - the input collection which should be transformed in parallel.
   * @param prefix - the prefix assigned to the underlying thread pool.
   * @param maxThreads - maximum number of thread can be created during execution.
   * @param f - the lambda function will be applied to each element of <code>in</code>.
   * @tparam I - the type of elements in the input collection.
   * @tparam O - the type of elements in resulted collection.
   * @return new collection in which each element was given from the input collection <code>in</code> by
   *         applying the lambda function <code>f</code>.
   */
  public <I extends java.lang.Object, O extends java.lang.Object> scala.collection.Seq<O> parmap (scala.collection.Seq<I> in, java.lang.String prefix, int maxThreads, scala.Function1<I, O> f)  { throw new RuntimeException(); }
}
