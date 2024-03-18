package org.apache.spark.streaming.api.java;
/**
 * Track the information of input stream at specified batch time.
 * <p>
 * param:  inputStreamId the input stream id
 * param:  numRecords the number of records in a batch
 * param:  metadata metadata for this batch. It should contain at least one standard field named
 *                 "Description" which maps to the content that will be shown in the UI.
 * param:  metadataDescription description of this input stream
 */
  class JavaStreamInputInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int inputStreamId ()  { throw new RuntimeException(); }
  public  long numRecords ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> metadata ()  { throw new RuntimeException(); }
  public  java.lang.String metadataDescription ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaStreamInputInfo (int inputStreamId, long numRecords, java.util.Map<java.lang.String, java.lang.Object> metadata, java.lang.String metadataDescription)  { throw new RuntimeException(); }
}
