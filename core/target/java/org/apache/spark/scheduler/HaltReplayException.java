package org.apache.spark.scheduler;
/**
 * Exception that can be thrown by listeners to halt replay. This is handled by ReplayListenerBus
 * only, and will cause errors if thrown when using other bus implementations.
 */
  class HaltReplayException extends java.lang.RuntimeException {
  public   HaltReplayException ()  { throw new RuntimeException(); }
}
