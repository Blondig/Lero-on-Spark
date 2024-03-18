package org.apache.spark.streaming.dstream;
/**
 * This class represents an input stream that monitors a Hadoop-compatible filesystem for new
 * files and creates a stream out of them. The way it works as follows.
 * <p>
 * At each batch interval, the file system is queried for files in the given directory and
 * detected new files are selected for that batch. In this case "new" means files that
 * became visible to readers during that time period. Some extra care is needed to deal
 * with the fact that files may become visible after they are created. For this purpose, this
 * class remembers the information about the files selected in past batches for
 * a certain duration (say, "remember window") as shown in the figure below.
 * <p>
 * <pre><code>
 *                      |&lt;----- remember window -----&gt;|
 * ignore threshold ---&gt;|                             |&lt;--- current batch time
 *                      |____.____.____.____.____.____|
 *                      |    |    |    |    |    |    |
 * ---------------------|----|----|----|----|----|----|-----------------------&gt; Time
 *                      |____|____|____|____|____|____|
 *                             remembered batches
 * </code></pre>
 * <p>
 * The trailing end of the window is the "ignore threshold" and all files whose mod times
 * are less than this threshold are assumed to have already been selected and are therefore
 * ignored. Files whose mod times are within the "remember window" are checked against files
 * that have already been selected. At a high level, this is how new files are identified in
 * each batch - files whose mod times are greater than the ignore threshold and
 * have not been considered within the remember window. See the documentation on the method
 * <code>isNewFile</code> for more details.
 * <p>
 * This makes some assumptions from the underlying file system that the system is monitoring.
 * <p>
 *  - The clock of the file system is assumed to synchronized with the clock of the machine running
 *    the streaming app.
 *  - If a file is to be visible in the directory listings, it must be visible within a certain
 *    duration of the mod time of the file. This duration is the "remember window", which is set to
 *    1 minute (see <code>FileInputDStream.minRememberDuration</code>). Otherwise, the file will never be
 *    selected as the mod time will be less than the ignore threshold when it becomes visible.
 *  - Once a file is visible, the mod time cannot change. If it does due to appends, then the
 *    processing semantics are undefined.
 */
  class FileInputDStream<K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> extends org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> {
  /**
   * A custom version of the DStreamCheckpointData that stores names of
   * Hadoop files as checkpoint data.
   */
    class FileInputDStreamCheckpointData extends org.apache.spark.streaming.dstream.DStreamCheckpointData<scala.Tuple2<K, V>> {
    public   FileInputDStreamCheckpointData ()  { throw new RuntimeException(); }
    public  void cleanup (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
    public  void restore ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  void update (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  }
  static public  boolean defaultFilter (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * Calculate the number of last batches to remember, such that all the files selected in
   * at least last minRememberDurationS duration can be remembered.
   * @param batchDuration (undocumented)
   * @param minRememberDurationS (undocumented)
   * @return (undocumented)
   */
  static public  int calculateNumBatchesToRemember (org.apache.spark.streaming.Duration batchDuration, org.apache.spark.streaming.Duration minRememberDurationS)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Ident(org), org.apache), org.apache.hadoop), org.apache.hadoop.mapreduce), [org.apache.hadoop.mapreduce.InputFormat aka TypeName("NewInputFormat")]), List(TypeTree().setOriginal(Ident(TypeName("K"))), TypeTree().setOriginal(Ident(TypeName("V"))))))))
  public   FileInputDStream (org.apache.spark.streaming.StreamingContext _ssc, java.lang.String directory, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> filter, boolean newFilesOnly, scala.Option<org.apache.hadoop.conf.Configuration> conf, scala.reflect.ClassTag<K> km, scala.reflect.ClassTag<V> vm, scala.reflect.ClassTag<F> fm)  { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.dstream.FileInputDStream<K, V, F>.FileInputDStreamCheckpointData checkpointData ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String[]> batchTimeToSelectedFiles ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Finds the files that were modified since the last time this method was called and makes
   * a union RDD out of them. Note that this maintains the list of files that were processed
   * in the latest modification time in the previous call to this method. This is because the
   * modification time returned by the FileStatus API seems to return times only at the
   * granularity of seconds in HDFS. And new files may have the same modification time as the
   * latest modification time in the previous call to this method yet was not reported in
   * the previous call.
   * @param validTime (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, V>>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  /** Clear the old time-to-files mappings along with old RDDs */
  protected  void clearMetadata (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
}
