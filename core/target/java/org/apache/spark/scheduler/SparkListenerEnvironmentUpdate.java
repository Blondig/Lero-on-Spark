package org.apache.spark.scheduler;
public  class SparkListenerEnvironmentUpdate implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.String, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>>> environmentDetails ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerEnvironmentUpdate (scala.collection.Map<java.lang.String, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>>> environmentDetails)  { throw new RuntimeException(); }
}
