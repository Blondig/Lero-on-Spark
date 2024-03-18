package org.apache.spark.scheduler;
/**
 * Exception thrown when submit a job with barrier stage(s) failing a required check.
 */
  class BarrierJobAllocationFailed extends org.apache.spark.SparkException {
  static public  java.lang.String ERROR_MESSAGE_RUN_BARRIER_WITH_UNSUPPORTED_RDD_CHAIN_PATTERN ()  { throw new RuntimeException(); }
  static public  java.lang.String ERROR_MESSAGE_RUN_BARRIER_WITH_DYN_ALLOCATION ()  { throw new RuntimeException(); }
  static public  java.lang.String ERROR_MESSAGE_BARRIER_REQUIRE_MORE_SLOTS_THAN_CURRENT_TOTAL_NUMBER ()  { throw new RuntimeException(); }
  public   BarrierJobAllocationFailed (java.lang.String message)  { throw new RuntimeException(); }
}
