package org.apache.spark.shuffle;
/**
 * An interface for reporting shuffle read metrics, for each shuffle. This interface assumes
 * all the methods are called on a single-threaded, i.e. concrete implementations would not need
 * to synchronize.
 * <p>
 * All methods have additional Spark visibility modifier to allow public, concrete implementations
 * that still have these methods marked as private[spark].
 */
public  interface ShuffleReadMetricsReporter {
    void incFetchWaitTime (long v)  ;
    void incLocalBlocksFetched (long v)  ;
    void incLocalBytesRead (long v)  ;
    void incRecordsRead (long v)  ;
    void incRemoteBlocksFetched (long v)  ;
    void incRemoteBytesRead (long v)  ;
    void incRemoteBytesReadToDisk (long v)  ;
}
