package org.apache.spark.streaming.dstream;
  class DStreamCheckpointData<T extends java.lang.Object> implements scala.Serializable, org.apache.spark.internal.Logging {
  public   DStreamCheckpointData (org.apache.spark.streaming.dstream.DStream<T> dstream, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Cleanup old checkpoint data. This gets called after a checkpoint of <code>time</code> has been
   * written to the checkpoint directory.
   * @param time (undocumented)
   */
  public  void cleanup (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String> currentCheckpointFiles ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.Object> data ()  { throw new RuntimeException(); }
  /**
   * Restore the checkpoint data. This gets called once when the DStream graph
   * (along with its output DStreams) is being restored from a graph checkpoint file.
   * Default implementation restores the RDDs from their checkpoint files.
   */
  public  void restore ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Updates the checkpoint data of the DStream. This gets called every time
   * the graph checkpoint is initiated. Default implementation records the
   * checkpoint files at which the generated RDDs of the DStream have been saved.
   * @param time (undocumented)
   */
  public  void update (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
}
