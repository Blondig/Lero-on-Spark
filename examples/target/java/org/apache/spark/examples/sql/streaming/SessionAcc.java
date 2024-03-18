package org.apache.spark.examples.sql.streaming;
public  class SessionAcc implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  public  scala.collection.immutable.List<org.apache.spark.examples.sql.streaming.SessionEvent> events ()  { throw new RuntimeException(); }
  // not preceding
  public   SessionAcc (scala.collection.immutable.List<org.apache.spark.examples.sql.streaming.SessionEvent> events)  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.examples.sql.streaming.SessionEvent> eventsAsSorted ()  { throw new RuntimeException(); }
  public  java.sql.Timestamp startTime ()  { throw new RuntimeException(); }
  public  java.sql.Timestamp endTime ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
