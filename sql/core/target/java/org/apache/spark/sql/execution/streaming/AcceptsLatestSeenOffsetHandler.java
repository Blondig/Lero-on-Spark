package org.apache.spark.sql.execution.streaming;
/**
 * This feeds "latest seen offset" to the sources that implement AcceptsLatestSeenOffset.
 */
public  class AcceptsLatestSeenOffsetHandler {
  static public  void setLatestSeenOffsetOnSources (scala.Option<org.apache.spark.sql.execution.streaming.OffsetSeq> offsets, scala.collection.Seq<org.apache.spark.sql.connector.read.streaming.SparkDataStream> sources)  { throw new RuntimeException(); }
}
