package org.apache.spark.util;
/**
 * SPARK-24294: To bypass scala bug: https://github.com/scala/bug/issues/9554, we catch
 * fatal throwable in {@link scala.concurrent.Future}'s body, and re-throw
 * SparkFatalException, which wraps the fatal throwable inside.
 * Note that SparkFatalException should only be thrown from a {@link scala.concurrent.Future},
 * which is run by using ThreadUtils.awaitResult. ThreadUtils.awaitResult will catch
 * it and re-throw the original exception/error.
 */
 final class SparkFatalException extends java.lang.Exception {
  // not preceding
  public   SparkFatalException (java.lang.Throwable throwable)  { throw new RuntimeException(); }
  public  java.lang.Throwable throwable ()  { throw new RuntimeException(); }
}
