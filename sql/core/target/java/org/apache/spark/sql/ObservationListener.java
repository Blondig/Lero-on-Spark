package org.apache.spark.sql;
  class ObservationListener implements org.apache.spark.sql.util.QueryExecutionListener, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Observation observation ()  { throw new RuntimeException(); }
  // not preceding
  public   ObservationListener (org.apache.spark.sql.Observation observation)  { throw new RuntimeException(); }
  public  void onSuccess (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, long durationNs)  { throw new RuntimeException(); }
  public  void onFailure (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, java.lang.Exception exception)  { throw new RuntimeException(); }
}
