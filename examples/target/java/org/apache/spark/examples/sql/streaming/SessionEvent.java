package org.apache.spark.examples.sql.streaming;
public  class SessionEvent implements scala.Product, scala.Serializable {
  static public  org.apache.spark.examples.sql.streaming.SessionEvent apply (java.lang.String userId, java.lang.String eventTypeStr, java.sql.Timestamp timestamp, long gapDuration)  { throw new RuntimeException(); }
  public  java.lang.String userId ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value eventType ()  { throw new RuntimeException(); }
  public  java.sql.Timestamp startTimestamp ()  { throw new RuntimeException(); }
  public  java.sql.Timestamp endTimestamp ()  { throw new RuntimeException(); }
  // not preceding
  public   SessionEvent (java.lang.String userId, scala.Enumeration.Value eventType, java.sql.Timestamp startTimestamp, java.sql.Timestamp endTimestamp)  { throw new RuntimeException(); }
}
