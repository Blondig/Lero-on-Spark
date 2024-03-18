package org.apache.spark.status.api.v1.streaming;
public  class BatchInfo {
  // not preceding
     BatchInfo (long batchId, java.util.Date batchTime, java.lang.String status, long batchDuration, long inputSize, scala.Option<java.lang.Object> schedulingDelay, scala.Option<java.lang.Object> processingTime, scala.Option<java.lang.Object> totalDelay, int numActiveOutputOps, int numCompletedOutputOps, int numFailedOutputOps, int numTotalOutputOps, scala.Option<java.lang.String> firstFailureReason)  { throw new RuntimeException(); }
  public  long batchDuration ()  { throw new RuntimeException(); }
  public  long batchId ()  { throw new RuntimeException(); }
  public  java.util.Date batchTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> firstFailureReason ()  { throw new RuntimeException(); }
  public  long inputSize ()  { throw new RuntimeException(); }
  public  int numActiveOutputOps ()  { throw new RuntimeException(); }
  public  int numCompletedOutputOps ()  { throw new RuntimeException(); }
  public  int numFailedOutputOps ()  { throw new RuntimeException(); }
  public  int numTotalOutputOps ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> processingTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> schedulingDelay ()  { throw new RuntimeException(); }
  public  java.lang.String status ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> totalDelay ()  { throw new RuntimeException(); }
}
