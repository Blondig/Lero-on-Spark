package org.apache.spark.api.python;
public  class PythonRDD$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PythonRDD$ MODULE$ = null;
  public   PythonRDD$ ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Set<java.lang.Object> getWorkerBroadcasts (java.net.Socket worker)  { throw new RuntimeException(); }
  /**
   * Return an RDD of values from an RDD of (Long, Array[Byte]), with preservePartitions=true
   * <p>
   * This is useful for PySpark to have the partitioner after partitionBy()
   * @param pair (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> valueOfPair (org.apache.spark.api.java.JavaPairRDD<java.lang.Object, byte[]> pair)  { throw new RuntimeException(); }
  /**
   * Adapter for calling SparkContext#runJob from Python.
   * <p>
   * This method will serve an iterator of an array that contains all elements in the RDD
   * (effectively a collect()), but allows you to run on a certain subset of partitions,
   * or to enable local execution.
   * <p>
   * @return 3-tuple (as a Java array) with the port number of a local socket which serves the
   *         data collected from this job, the secret for authentication, and a socket auth
   *         server object that can be used to join the JVM serving thread in Python.
   * @param sc (undocumented)
   * @param rdd (undocumented)
   * @param partitions (undocumented)
   */
  public  java.lang.Object[] runJob (org.apache.spark.SparkContext sc, org.apache.spark.api.java.JavaRDD<byte[]> rdd, java.util.ArrayList<java.lang.Object> partitions)  { throw new RuntimeException(); }
  /**
   * A helper function to collect an RDD as an iterator, then serve it via socket.
   * <p>
   * @return 3-tuple (as a Java array) with the port number of a local socket which serves the
   *         data collected from this job, the secret for authentication, and a socket auth
   *         server object that can be used to join the JVM serving thread in Python.
   * @param rdd (undocumented)
   */
  public <T extends java.lang.Object> java.lang.Object[] collectAndServe (org.apache.spark.rdd.RDD<T> rdd)  { throw new RuntimeException(); }
  /**
   * A helper function to collect an RDD as an iterator, then serve it via socket.
   * This method is similar with <code>PythonRDD.collectAndServe</code>, but user can specify job group id,
   * job description, and interruptOnCancel option.
   * @param rdd (undocumented)
   * @param groupId (undocumented)
   * @param description (undocumented)
   * @param interruptOnCancel (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> java.lang.Object[] collectAndServeWithJobGroup (org.apache.spark.rdd.RDD<T> rdd, java.lang.String groupId, java.lang.String description, boolean interruptOnCancel)  { throw new RuntimeException(); }
  /**
   * A helper function to create a local RDD iterator and serve it via socket. Partitions are
   * are collected as separate jobs, by order of index. Partition data is first requested by a
   * non-zero integer to start a collection job. The response is prefaced by an integer with 1
   * meaning partition data will be served, 0 meaning the local iterator has been consumed,
   * and -1 meaning an error occurred during collection. This function is used by
   * pyspark.rdd._local_iterator_from_socket().
   * <p>
   * @return 3-tuple (as a Java array) with the port number of a local socket which serves the
   *         data collected from this job, the secret for authentication, and a socket auth
   *         server object that can be used to join the JVM serving thread in Python.
   * @param rdd (undocumented)
   * @param prefetchPartitions (undocumented)
   */
  public <T extends java.lang.Object> java.lang.Object[] toLocalIteratorAndServe (org.apache.spark.rdd.RDD<T> rdd, boolean prefetchPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> readRDDFromFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String filename, int parallelism)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> readRDDFromInputStream (org.apache.spark.SparkContext sc, java.io.InputStream in, int parallelism)  { throw new RuntimeException(); }
  public  org.apache.spark.api.python.PythonBroadcast setupBroadcast (java.lang.String path)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> void writeIteratorToStream (scala.collection.Iterator<T> iter, java.io.DataOutputStream dataOut)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a path using {@link org.apache.hadoop.mapred.SequenceFileInputFormat},
   * key and value class.
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param path (undocumented)
   * @param keyClassMaybeNull (undocumented)
   * @param valueClassMaybeNull (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param minSplits (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.api.java.JavaRDD<byte[]> sequenceFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String keyClassMaybeNull, java.lang.String valueClassMaybeNull, java.lang.String keyConverterClass, java.lang.String valueConverterClass, int minSplits, int batchSize)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a file path, using an arbitrary {@link org.apache.hadoop.mapreduce.InputFormat},
   * key and value class.
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param path (undocumented)
   * @param inputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> newAPIHadoopFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a {@link org.apache.hadoop.conf.Configuration} converted from a map that is
   * passed in from Python, using an arbitrary {@link org.apache.hadoop.mapreduce.InputFormat},
   * key and value class.
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param inputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> newAPIHadoopRDD (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a file path, using an arbitrary {@link org.apache.hadoop.mapred.InputFormat},
   * key and value class.
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param path (undocumented)
   * @param inputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> hadoopFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a {@link org.apache.hadoop.conf.Configuration} converted from a map
   * that is passed in from Python, using an arbitrary {@link org.apache.hadoop.mapred.InputFormat},
   * key and value class
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param inputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> hadoopRDD (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize)  { throw new RuntimeException(); }
  public  void writeUTF (java.lang.String str, java.io.DataOutputStream dataOut)  { throw new RuntimeException(); }
  /**
   * Create a socket server and a background thread to serve the data in <code>items</code>,
   * <p>
   * The socket server can only accept one connection, or close if no connection
   * in 15 seconds.
   * <p>
   * Once a connection comes in, it tries to serialize all the data in <code>items</code>
   * and send them into this connection.
   * <p>
   * The thread will terminate after all the data are sent or any exceptions happen.
   * <p>
   * @return 3-tuple (as a Java array) with the port number of a local socket which serves the
   *         data collected from this job, the secret for authentication, and a socket auth
   *         server object that can be used to join the JVM serving thread in Python.
   * @param items (undocumented)
   * @param threadName (undocumented)
   */
  public  java.lang.Object[] serveIterator (scala.collection.Iterator<?> items, java.lang.String threadName)  { throw new RuntimeException(); }
  /**
   * Create a socket server and background thread to execute the writeFunc
   * with the given OutputStream.
   * <p>
   * The socket server can only accept one connection, or close if no connection
   * in 15 seconds.
   * <p>
   * Once a connection comes in, it will execute the block of code and pass in
   * the socket output stream.
   * <p>
   * The thread will terminate after the block of code is executed or any
   * exceptions happen.
   * <p>
   * @return 3-tuple (as a Java array) with the port number of a local socket which serves the
   *         data collected from this job, the secret for authentication, and a socket auth
   *         server object that can be used to join the JVM serving thread in Python.
   * @param threadName (undocumented)
   * @param writeFunc (undocumented)
   */
    java.lang.Object[] serveToStream (java.lang.String threadName, scala.Function1<java.io.OutputStream, scala.runtime.BoxedUnit> writeFunc)  { throw new RuntimeException(); }
  /**
   * Output a Python RDD of key-value pairs as a Hadoop SequenceFile using the Writable types
   * we convert from the RDD's key and value types. Note that keys and values can't be
   * {@link org.apache.hadoop.io.Writable} types already, since Writables are not Java
   * <code>Serializable</code> and we can't peek at them. The <code>path</code> can be on any Hadoop file system.
   * @param pyRDD (undocumented)
   * @param batchSerialized (undocumented)
   * @param path (undocumented)
   * @param compressionCodecClass (undocumented)
   */
  public <C extends org.apache.hadoop.io.compress.CompressionCodec> void saveAsSequenceFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String compressionCodecClass)  { throw new RuntimeException(); }
  /**
   * Output a Python RDD of key-value pairs to any Hadoop file system, using old Hadoop
   * <code>OutputFormat</code> in mapred package. Keys and values are converted to suitable output
   * types using either user specified converters or, if not specified,
   * {@link org.apache.spark.api.python.JavaToWritableConverter}. Post-conversion types
   * <code>keyClass</code> and <code>valueClass</code> are automatically inferred if not specified. The passed-in
   * <code>confAsMap</code> is merged with the default Hadoop conf associated with the SparkContext of
   * this RDD.
   * @param pyRDD (undocumented)
   * @param batchSerialized (undocumented)
   * @param path (undocumented)
   * @param outputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param compressionCodecClass (undocumented)
   */
  public <F extends org.apache.hadoop.mapred.OutputFormat<?, ?>, C extends org.apache.hadoop.io.compress.CompressionCodec> void saveAsHadoopFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String outputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, java.lang.String compressionCodecClass)  { throw new RuntimeException(); }
  /**
   * Output a Python RDD of key-value pairs to any Hadoop file system, using new Hadoop
   * <code>OutputFormat</code> in mapreduce package. Keys and values are converted to suitable output
   * types using either user specified converters or, if not specified,
   * {@link org.apache.spark.api.python.JavaToWritableConverter}. Post-conversion types
   * <code>keyClass</code> and <code>valueClass</code> are automatically inferred if not specified. The passed-in
   * <code>confAsMap</code> is merged with the default Hadoop conf associated with the SparkContext of
   * this RDD.
   * @param pyRDD (undocumented)
   * @param batchSerialized (undocumented)
   * @param path (undocumented)
   * @param outputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   */
  public <F extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> void saveAsNewAPIHadoopFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String outputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap)  { throw new RuntimeException(); }
  /**
   * Output a Python RDD of key-value pairs to any Hadoop file system, using a Hadoop conf
   * converted from the passed-in <code>confAsMap</code>. The conf should set relevant output params (
   * e.g., output path, output format, etc), in the same way as it would be configured for
   * a Hadoop MapReduce job. Both old and new Hadoop OutputFormat APIs are supported
   * (mapred vs. mapreduce). Keys/values are converted for output using either user specified
   * converters or, by default, {@link org.apache.spark.api.python.JavaToWritableConverter}.
   * @param pyRDD (undocumented)
   * @param batchSerialized (undocumented)
   * @param confAsMap (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param useNewAPI (undocumented)
   */
  public  void saveAsHadoopDataset (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, java.lang.String keyConverterClass, java.lang.String valueConverterClass, boolean useNewAPI)  { throw new RuntimeException(); }
}
