package org.apache.spark.streaming.scheduler;
/**
 * :: DeveloperApi ::
 * Class having information on completed batches.
 * param:  batchTime   Time of the batch
 * param:  streamIdToInputInfo A map of input stream id to its input info
 * param:  submissionTime  Clock time of when jobs of this batch was submitted to
 *                        the streaming scheduler queue
 * param:  processingStartTime Clock time of when the first job of this batch started processing
 * param:  processingEndTime Clock time of when the last job of this batch finished processing
 * param:  outputOperationInfos The output operations in this batch
 */
public  class BatchInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time batchTime ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.StreamInputInfo> streamIdToInputInfo ()  { throw new RuntimeException(); }
  public  long submissionTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> processingStartTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> processingEndTime ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.OutputOperationInfo> outputOperationInfos ()  { throw new RuntimeException(); }
  // not preceding
  public   BatchInfo (org.apache.spark.streaming.Time batchTime, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.StreamInputInfo> streamIdToInputInfo, long submissionTime, scala.Option<java.lang.Object> processingStartTime, scala.Option<java.lang.Object> processingEndTime, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.OutputOperationInfo> outputOperationInfos)  { throw new RuntimeException(); }
  /**
   * Time taken for the first job of this batch to start processing from the time this batch
   * was submitted to the streaming scheduler. Essentially, it is
   * <code>processingStartTime</code> - <code>submissionTime</code>.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> schedulingDelay ()  { throw new RuntimeException(); }
  /**
   * Time taken for the all jobs of this batch to finish processing from the time they started
   * processing. Essentially, it is <code>processingEndTime</code> - <code>processingStartTime</code>.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> processingDelay ()  { throw new RuntimeException(); }
  /**
   * Time taken for all the jobs of this batch to finish processing from the time they
   * were submitted.  Essentially, it is <code>processingDelay</code> + <code>schedulingDelay</code>.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> totalDelay ()  { throw new RuntimeException(); }
  /**
   * The number of recorders received by the receivers in this batch.
   * @return (undocumented)
   */
  public  long numRecords ()  { throw new RuntimeException(); }
}
