package org.apache.spark.deploy.history;
public  class EventFilter$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EventFilter$ MODULE$ = null;
  public   EventFilter$ ()  { throw new RuntimeException(); }
  public  void applyFilterToFile (org.apache.hadoop.fs.FileSystem fs, scala.collection.Seq<org.apache.spark.deploy.history.EventFilter> filters, org.apache.hadoop.fs.Path path, scala.Function2<java.lang.String, org.apache.spark.scheduler.SparkListenerEvent, scala.runtime.BoxedUnit> onAccepted, scala.Function2<java.lang.String, org.apache.spark.scheduler.SparkListenerEvent, scala.runtime.BoxedUnit> onRejected, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> onUnidentified)  { throw new RuntimeException(); }
}
