package org.apache.spark.sql.kafka010;
/** A version of {@link HDFSMetadataLog} specialized for saving the initial offsets. */
  class KafkaSourceInitialOffsetWriter extends org.apache.spark.sql.execution.streaming.HDFSMetadataLog<org.apache.spark.sql.kafka010.KafkaSourceOffset> {
  public   KafkaSourceInitialOffsetWriter (org.apache.spark.sql.SparkSession sparkSession, java.lang.String metadataPath)  { throw new RuntimeException(); }
  public  int VERSION ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset deserialize (java.io.InputStream in)  { throw new RuntimeException(); }
  public  void serialize (org.apache.spark.sql.kafka010.KafkaSourceOffset metadata, java.io.OutputStream out)  { throw new RuntimeException(); }
}
