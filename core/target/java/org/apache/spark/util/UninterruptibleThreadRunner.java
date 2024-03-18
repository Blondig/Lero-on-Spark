package org.apache.spark.util;
/**
 * {@link UninterruptibleThreadRunner} ensures that all tasks are running in an
 * {@link UninterruptibleThread}. A good example is Kafka consumer usage.
 */
  class UninterruptibleThreadRunner {
  public   UninterruptibleThreadRunner (java.lang.String threadName)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T runUninterruptibly (scala.Function0<T> body)  { throw new RuntimeException(); }
  public  void shutdown ()  { throw new RuntimeException(); }
}
