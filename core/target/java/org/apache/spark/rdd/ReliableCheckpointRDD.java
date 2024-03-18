package org.apache.spark.rdd;
/**
 * An RDD that reads from checkpoint files previously written to reliable storage.
 */
  class ReliableCheckpointRDD<T extends java.lang.Object> extends org.apache.spark.rdd.CheckpointRDD<T> {
  /**
   * Write RDD to checkpoint files and return a ReliableCheckpointRDD representing the RDD.
   * @param originalRDD (undocumented)
   * @param checkpointDir (undocumented)
   * @param blockSize (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> org.apache.spark.rdd.ReliableCheckpointRDD<T> writeRDDToCheckpointDirectory (org.apache.spark.rdd.RDD<T> originalRDD, java.lang.String checkpointDir, int blockSize, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Write an RDD partition's data to a checkpoint file.
   * @param path (undocumented)
   * @param broadcastedConf (undocumented)
   * @param blockSize (undocumented)
   * @param ctx (undocumented)
   * @param iterator (undocumented)
   * @param evidence$3 (undocumented)
   */
  static public <T extends java.lang.Object> void writePartitionToCheckpointFile (java.lang.String path, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf, int blockSize, org.apache.spark.TaskContext ctx, scala.collection.Iterator<T> iterator, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * Read the content of the specified checkpoint file.
   * @param path (undocumented)
   * @param broadcastedConf (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.collection.Iterator<T> readCheckpointFile (org.apache.hadoop.fs.Path path, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public  java.lang.String checkpointPath ()  { throw new RuntimeException(); }
  // not preceding
  public   ReliableCheckpointRDD (org.apache.spark.SparkContext sc, java.lang.String checkpointPath, scala.Option<org.apache.spark.Partitioner> _partitioner, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Return the path of the checkpoint directory this RDD reads data from.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> getCheckpointFile ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  /**
   * Return partitions described by the files in the checkpoint directory.
   * <p>
   * Since the original RDD may belong to a prior application, there is no way to know a
   * priori the number of partitions to expect. This method assumes that the original set of
   * checkpoint files are fully preserved in a reliable storage across application lifespans.
   * @return (undocumented)
   */
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  // not preceding
    com.google.common.cache.LoadingCache<org.apache.spark.Partition, scala.collection.Seq<java.lang.String>> cachedPreferredLocations ()  { throw new RuntimeException(); }
  /**
   * Return the locations of the checkpoint file associated with the given partition.
   * @param split (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  /**
   * Read the content of the checkpoint file associated with the given partition.
   * @param split (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
