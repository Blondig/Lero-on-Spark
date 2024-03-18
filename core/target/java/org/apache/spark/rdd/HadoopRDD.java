package org.apache.spark.rdd;
/**
 * :: DeveloperApi ::
 * An RDD that provides core functionality for reading data stored in Hadoop (e.g., files in HDFS,
 * sources in HBase, or S3), using the older MapReduce API (<code>org.apache.hadoop.mapred</code>).
 * <p>
 * param:  sc The SparkContext to associate the RDD with.
 * param:  broadcastedConf A general Hadoop Configuration, or a subclass of it. If the enclosed
 *   variable references an instance of JobConf, then that JobConf will be used for the Hadoop job.
 *   Otherwise, a new JobConf will be created on each executor using the enclosed Configuration.
 * param:  initLocalJobConfFuncOpt Optional closure used to initialize any JobConf that HadoopRDD
 *     creates.
 * param:  inputFormatClass Storage format of the data to be read.
 * param:  keyClass Class of the key associated with the inputFormatClass.
 * param:  valueClass Class of the value associated with the inputFormatClass.
 * param:  minPartitions Minimum number of HadoopRDD partitions (Hadoop Splits) to generate.
 * <p>
 * @note Instantiating this class directly is not recommended, please use
 * <code>org.apache.spark.SparkContext.hadoopRDD()</code>
 */
public  class HadoopRDD<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> implements org.apache.spark.internal.Logging {
  /**
   * Analogous to {@link org.apache.spark.rdd.MapPartitionsRDD}, but passes in an InputSplit to
   * the given function rather than the index of the partition.
   */
  static   class HadoopMapPartitionsWithSplitRDD<U extends java.lang.Object, T extends java.lang.Object> extends org.apache.spark.rdd.RDD<U> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   HadoopMapPartitionsWithSplitRDD (org.apache.spark.rdd.RDD<T> prev, scala.Function2<org.apache.hadoop.mapred.InputSplit, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$2, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
    public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
    public  scala.collection.Iterator<U> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  }
  static public  class HadoopMapPartitionsWithSplitRDD$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final HadoopMapPartitionsWithSplitRDD$ MODULE$ = null;
    public   HadoopMapPartitionsWithSplitRDD$ ()  { throw new RuntimeException(); }
  }
  /**
   * Configuration's constructor is not threadsafe (see SPARK-1097 and HADOOP-10456).
   * Therefore, we synchronize on this lock before calling new JobConf() or new Configuration().
   * @return (undocumented)
   */
  static public  java.lang.Object CONFIGURATION_INSTANTIATION_LOCK ()  { throw new RuntimeException(); }
  /** Update the input bytes read metric each time this number of records has been read */
  static public  int RECORDS_BETWEEN_BYTES_READ_METRIC_UPDATES ()  { throw new RuntimeException(); }
  /**
   * The three methods below are helpers for accessing the local map, a property of the SparkEnv of
   * the local process.
   * @param key (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.Object getCachedMetadata (java.lang.String key)  { throw new RuntimeException(); }
  /** Add Hadoop configuration specific to a single partition and attempt. */
  static public  void addLocalConfiguration (java.lang.String jobTrackerId, int jobId, int splitId, int attemptId, org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  static   scala.Option<scala.collection.Seq<java.lang.String>> convertSplitLocationInfo (org.apache.hadoop.mapred.SplitLocationInfo[] infos)  { throw new RuntimeException(); }
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
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   HadoopRDD (org.apache.spark.SparkContext sc, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf, scala.Option<scala.Function1<org.apache.hadoop.mapred.JobConf, scala.runtime.BoxedUnit>> initLocalJobConfFuncOpt, java.lang.Class<? extends org.apache.hadoop.mapred.InputFormat<K, V>> inputFormatClass, java.lang.Class<K> keyClass, java.lang.Class<V> valueClass, int minPartitions)  { throw new RuntimeException(); }
  public   HadoopRDD (org.apache.spark.SparkContext sc, org.apache.hadoop.mapred.JobConf conf, java.lang.Class<? extends org.apache.hadoop.mapred.InputFormat<K, V>> inputFormatClass, java.lang.Class<K> keyClass, java.lang.Class<V> valueClass, int minPartitions)  { throw new RuntimeException(); }
  protected  java.lang.String jobConfCacheKey ()  { throw new RuntimeException(); }
  protected  java.lang.String inputFormatCacheKey ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapred.JobConf getJobConf ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapred.InputFormat<K, V> getInputFormat (org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.InterruptibleIterator<scala.Tuple2<K, V>> compute (org.apache.spark.Partition theSplit, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /** Maps over a partition, providing the InputSplit that was used as the base of the partition. */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithInputSplit (scala.Function2<org.apache.hadoop.mapred.InputSplit, scala.collection.Iterator<scala.Tuple2<K, V>>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$1)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  public  void checkpoint ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.HadoopRDD<K, V> persist (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration getConf ()  { throw new RuntimeException(); }
}
