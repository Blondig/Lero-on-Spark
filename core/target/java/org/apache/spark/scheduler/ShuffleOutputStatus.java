package org.apache.spark.scheduler;
/**
 * A common trait between {@link MapStatus} and {@link MergeStatus}. This allows us to reuse existing
 * code to handle MergeStatus inside MapOutputTracker.
 */
public  interface ShuffleOutputStatus {
}
