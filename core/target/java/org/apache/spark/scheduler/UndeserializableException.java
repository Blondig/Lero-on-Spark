package org.apache.spark.scheduler;
/**
 * Make sure we are using the context classloader when deserializing failed TaskResults instead
 * of the Spark classloader.
 * <p>
 * This test compiles a jar containing an exception and tests that when it is thrown on the
 * executor, enqueueFailedTask can correctly deserialize the failure and identify the thrown
 * exception as the cause.
 * <p>
 * Before this fix, enqueueFailedTask would throw a ClassNotFoundException when deserializing
 * the exception, resulting in an UnknownReason for the TaskEndResult.
 */
public  class UndeserializableException extends java.lang.Exception {
  public   UndeserializableException ()  { throw new RuntimeException(); }
}
