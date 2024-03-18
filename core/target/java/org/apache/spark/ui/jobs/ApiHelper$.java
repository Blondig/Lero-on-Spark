package org.apache.spark.ui.jobs;
public  class ApiHelper$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ApiHelper$ MODULE$ = null;
  public   ApiHelper$ ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_ID ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_TASK_INDEX ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_ATTEMPT ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_STATUS ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_LOCALITY ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_EXECUTOR ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_HOST ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_LAUNCH_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_DURATION ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_SCHEDULER_DELAY ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_DESER_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_GC_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_SER_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_GETTING_RESULT_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_PEAK_MEM ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_ACCUMULATORS ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_INPUT_SIZE ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_OUTPUT_SIZE ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_SHUFFLE_READ_FETCH_WAIT_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_SHUFFLE_TOTAL_READS ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_SHUFFLE_REMOTE_READS ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_SHUFFLE_WRITE_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_SHUFFLE_WRITE_SIZE ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_MEM_SPILL ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_DISK_SPILL ()  { throw new RuntimeException(); }
  public  java.lang.String HEADER_ERROR ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.String> COLUMN_TO_INDEX ()  { throw new RuntimeException(); }
  public  boolean hasAccumulators (org.apache.spark.status.api.v1.StageData stageData)  { throw new RuntimeException(); }
  public  boolean hasInput (org.apache.spark.status.api.v1.StageData stageData)  { throw new RuntimeException(); }
  public  boolean hasOutput (org.apache.spark.status.api.v1.StageData stageData)  { throw new RuntimeException(); }
  public  boolean hasShuffleRead (org.apache.spark.status.api.v1.StageData stageData)  { throw new RuntimeException(); }
  public  boolean hasShuffleWrite (org.apache.spark.status.api.v1.StageData stageData)  { throw new RuntimeException(); }
  public  boolean hasBytesSpilled (org.apache.spark.status.api.v1.StageData stageData)  { throw new RuntimeException(); }
  public  long totalBytesRead (org.apache.spark.status.api.v1.ShuffleReadMetrics metrics)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> indexName (java.lang.String sortColumn)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.String> lastStageNameAndDescription (org.apache.spark.status.AppStatusStore store, org.apache.spark.status.api.v1.JobData job)  { throw new RuntimeException(); }
}
