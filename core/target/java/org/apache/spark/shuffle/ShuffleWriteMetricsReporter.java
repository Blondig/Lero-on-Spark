package org.apache.spark.shuffle;
/**
 * An interface for reporting shuffle write metrics. This interface assumes all the methods are
 * called on a single-threaded, i.e. concrete implementations would not need to synchronize.
 * <p>
 * All methods have additional Spark visibility modifier to allow public, concrete implementations
 * that still have these methods marked as private[spark].
 */
public  interface ShuffleWriteMetricsReporter {
    void decBytesWritten (long v)  ;
    void decRecordsWritten (long v)  ;
    void incBytesWritten (long v)  ;
    void incRecordsWritten (long v)  ;
    void incWriteTime (long v)  ;
}
