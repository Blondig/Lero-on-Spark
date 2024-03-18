package org.apache.spark.rdd;
public  class ReliableCheckpointRDD$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReliableCheckpointRDD$ MODULE$ = null;
  public   ReliableCheckpointRDD$ ()  { throw new RuntimeException(); }
  /**
   * Write RDD to checkpoint files and return a ReliableCheckpointRDD representing the RDD.
   * @param originalRDD (undocumented)
   * @param checkpointDir (undocumented)
   * @param blockSize (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.rdd.ReliableCheckpointRDD<T> writeRDDToCheckpointDirectory (org.apache.spark.rdd.RDD<T> originalRDD, java.lang.String checkpointDir, int blockSize, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Write an RDD partition's data to a checkpoint file.
   * @param path (undocumented)
   * @param broadcastedConf (undocumented)
   * @param blockSize (undocumented)
   * @param ctx (undocumented)
   * @param iterator (undocumented)
   * @param evidence$3 (undocumented)
   */
  public <T extends java.lang.Object> void writePartitionToCheckpointFile (java.lang.String path, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf, int blockSize, org.apache.spark.TaskContext ctx, scala.collection.Iterator<T> iterator, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * Read the content of the specified checkpoint file.
   * @param path (undocumented)
   * @param broadcastedConf (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.Iterator<T> readCheckpointFile (org.apache.hadoop.fs.Path path, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
