package org.apache.spark.rdd;
/**
 * :: DeveloperApi ::
 * An RDD that provides core functionality for reading data stored in Hadoop (e.g., files in HDFS,
 * sources in HBase, or S3), using the new MapReduce API (<code>org.apache.hadoop.mapreduce</code>).
 * <p>
 * param:  sc The SparkContext to associate the RDD with.
 * param:  inputFormatClass Storage format of the data to be read.
 * param:  keyClass Class of the key associated with the inputFormatClass.
 * param:  valueClass Class of the value associated with the inputFormatClass.
 * <p>
 * @note Instantiating this class directly is not recommended, please use
 * <code>org.apache.spark.SparkContext.newAPIHadoopRDD()</code>
 */
public  class NewHadoopRDD<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> implements org.apache.spark.internal.Logging {
  /**
   * Analogous to {@link org.apache.spark.rdd.MapPartitionsRDD}, but passes in an InputSplit to
   * the given function rather than the index of the partition.
   */
  static   class NewHadoopMapPartitionsWithSplitRDD<U extends java.lang.Object, T extends java.lang.Object> extends org.apache.spark.rdd.RDD<U> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   NewHadoopMapPartitionsWithSplitRDD (org.apache.spark.rdd.RDD<T> prev, scala.Function2<org.apache.hadoop.mapreduce.InputSplit, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$2, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
    public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
    public  scala.collection.Iterator<U> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  }
  static public  class NewHadoopMapPartitionsWithSplitRDD$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NewHadoopMapPartitionsWithSplitRDD$ MODULE$ = null;
    public   NewHadoopMapPartitionsWithSplitRDD$ ()  { throw new RuntimeException(); }
  }
  /**
   * Configuration's constructor is not threadsafe (see SPARK-1097 and HADOOP-10456).
   * Therefore, we synchronize on this lock before calling new Configuration().
   * @return (undocumented)
   */
  static public  java.lang.Object CONFIGURATION_INSTANTIATION_LOCK ()  { throw new RuntimeException(); }
  // not preceding
  public   NewHadoopRDD (org.apache.spark.SparkContext sc, java.lang.Class<? extends org.apache.hadoop.mapreduce.InputFormat<K, V>> inputFormatClass, java.lang.Class<K> keyClass, java.lang.Class<V> valueClass, org.apache.hadoop.conf.Configuration _conf)  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapreduce.JobID jobId ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration getConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.InterruptibleIterator<scala.Tuple2<K, V>> compute (org.apache.spark.Partition theSplit, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /** Maps over a partition, providing the InputSplit that was used as the base of the partition. */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithInputSplit (scala.Function2<org.apache.hadoop.mapreduce.InputSplit, scala.collection.Iterator<scala.Tuple2<K, V>>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$1)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition hsplit)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.NewHadoopRDD<K, V> persist (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
}
