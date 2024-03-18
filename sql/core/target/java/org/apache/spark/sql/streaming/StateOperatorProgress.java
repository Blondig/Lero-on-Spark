package org.apache.spark.sql.streaming;
/**
 * Information about updates made to stateful operators in a {@link StreamingQuery} during a trigger.
 */
public  class StateOperatorProgress implements scala.Serializable {
  public  java.lang.String operatorName ()  { throw new RuntimeException(); }
  public  long numRowsTotal ()  { throw new RuntimeException(); }
  public  long numRowsUpdated ()  { throw new RuntimeException(); }
  public  long allUpdatesTimeMs ()  { throw new RuntimeException(); }
  public  long numRowsRemoved ()  { throw new RuntimeException(); }
  public  long allRemovalsTimeMs ()  { throw new RuntimeException(); }
  public  long commitTimeMs ()  { throw new RuntimeException(); }
  public  long memoryUsedBytes ()  { throw new RuntimeException(); }
  public  long numRowsDroppedByWatermark ()  { throw new RuntimeException(); }
  public  long numShufflePartitions ()  { throw new RuntimeException(); }
  public  long numStateStoreInstances ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Long> customMetrics ()  { throw new RuntimeException(); }
  // not preceding
     StateOperatorProgress (java.lang.String operatorName, long numRowsTotal, long numRowsUpdated, long allUpdatesTimeMs, long numRowsRemoved, long allRemovalsTimeMs, long commitTimeMs, long memoryUsedBytes, long numRowsDroppedByWatermark, long numShufflePartitions, long numStateStoreInstances, java.util.Map<java.lang.String, java.lang.Long> customMetrics)  { throw new RuntimeException(); }
  /** The compact JSON representation of this progress. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this progress. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
    org.apache.spark.sql.streaming.StateOperatorProgress copy (long newNumRowsUpdated, long newNumRowsDroppedByWatermark)  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
