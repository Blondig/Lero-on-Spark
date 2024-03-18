package org.apache.spark.util;
/**
 * Various utility methods used by Spark.
 */
public  class Utils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Utils$ MODULE$ = null;
  public   Utils$ ()  { throw new RuntimeException(); }
  public  java.util.Random random ()  { throw new RuntimeException(); }
  /**
   * Define a default value for driver memory here since this value is referenced across the code
   * base and nearly all files already use Utils.scala
   * @return (undocumented)
   */
  public  int DEFAULT_DRIVER_MEM_MB ()  { throw new RuntimeException(); }
  public  int MAX_DIR_CREATION_ATTEMPTS ()  { throw new RuntimeException(); }
  /** Scheme used for files that are locally available on worker nodes in the cluster. */
  public  java.lang.String LOCAL_SCHEME ()  { throw new RuntimeException(); }
  /** Serialize an object using Java serialization */
  public <T extends java.lang.Object> byte[] serialize (T o)  { throw new RuntimeException(); }
  /** Deserialize an object using Java serialization */
  public <T extends java.lang.Object> T deserialize (byte[] bytes)  { throw new RuntimeException(); }
  /** Deserialize an object using Java serialization and the given ClassLoader */
  public <T extends java.lang.Object> T deserialize (byte[] bytes, java.lang.ClassLoader loader)  { throw new RuntimeException(); }
  /** Deserialize a Long value (used for {@link org.apache.spark.api.python.PythonPartitioner}) */
  public  long deserializeLongValue (byte[] bytes)  { throw new RuntimeException(); }
  /** Serialize via nested stream using specific serializer */
  public  void serializeViaNestedStream (java.io.OutputStream os, org.apache.spark.serializer.SerializerInstance ser, scala.Function1<org.apache.spark.serializer.SerializationStream, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /** Deserialize via nested stream using specific serializer */
  public  void deserializeViaNestedStream (java.io.InputStream is, org.apache.spark.serializer.SerializerInstance ser, scala.Function1<org.apache.spark.serializer.DeserializationStream, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /** String interning to reduce the memory usage. */
  public  java.lang.String weakIntern (java.lang.String s)  { throw new RuntimeException(); }
  /**
   * Get the ClassLoader which loaded Spark.
   * @return (undocumented)
   */
  public  java.lang.ClassLoader getSparkClassLoader ()  { throw new RuntimeException(); }
  /**
   * Get the Context ClassLoader on this thread or, if not present, the ClassLoader that
   * loaded Spark.
   * <p>
   * This should be used whenever passing a ClassLoader to Class.ForName or finding the currently
   * active loader when setting up ClassLoader delegation chains.
   * @return (undocumented)
   */
  public  java.lang.ClassLoader getContextOrSparkClassLoader ()  { throw new RuntimeException(); }
  /** Determines whether the provided class is loadable in the current thread. */
  public  boolean classIsLoadable (java.lang.String clazz)  { throw new RuntimeException(); }
  /**
   * Preferred alternative to Class.forName(className), as well as
   * Class.forName(className, initialize, loader) with current thread's ContextClassLoader.
   * @param className (undocumented)
   * @param initialize (undocumented)
   * @param noSparkClassLoader (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> java.lang.Class<C> classForName (java.lang.String className, boolean initialize, boolean noSparkClassLoader)  { throw new RuntimeException(); }
  /**
   * Run a segment of code using a different context class loader in the current thread
   * @param ctxClassLoader (undocumented)
   * @param fn (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withContextClassLoader (java.lang.ClassLoader ctxClassLoader, scala.Function0<T> fn)  { throw new RuntimeException(); }
  /**
   * Primitive often used when writing {@link java.nio.ByteBuffer} to {@link java.io.DataOutput}
   * @param bb (undocumented)
   * @param out (undocumented)
   */
  public  void writeByteBuffer (java.nio.ByteBuffer bb, java.io.DataOutput out)  { throw new RuntimeException(); }
  /**
   * Primitive often used when writing {@link java.nio.ByteBuffer} to {@link java.io.OutputStream}
   * @param bb (undocumented)
   * @param out (undocumented)
   */
  public  void writeByteBuffer (java.nio.ByteBuffer bb, java.io.OutputStream out)  { throw new RuntimeException(); }
  /**
   * JDK equivalent of <code>chmod 700 file</code>.
   * <p>
   * @param file the file whose permissions will be modified
   * @return true if the permissions were successfully changed, false otherwise.
   */
  public  boolean chmod700 (java.io.File file)  { throw new RuntimeException(); }
  /**
   * Create a directory given the abstract pathname
   * @return true, if the directory is successfully created; otherwise, return false.
   * @param dir (undocumented)
   */
  public  boolean createDirectory (java.io.File dir)  { throw new RuntimeException(); }
  /**
   * Create a directory inside the given parent directory. The directory is guaranteed to be
   * newly created, and is not marked for automatic deletion.
   * @param root (undocumented)
   * @param namePrefix (undocumented)
   * @return (undocumented)
   */
  public  java.io.File createDirectory (java.lang.String root, java.lang.String namePrefix)  { throw new RuntimeException(); }
  /**
   * Create a temporary directory inside the given parent directory. The directory will be
   * automatically deleted when the VM shuts down.
   * @param root (undocumented)
   * @param namePrefix (undocumented)
   * @return (undocumented)
   */
  public  java.io.File createTempDir (java.lang.String root, java.lang.String namePrefix)  { throw new RuntimeException(); }
  /**
   * Copy all data from an InputStream to an OutputStream. NIO way of file stream to file stream
   * copying is disabled by default unless explicitly set transferToEnabled as true,
   * the parameter transferToEnabled should be configured by spark.file.transferTo = [true|false].
   * @param in (undocumented)
   * @param out (undocumented)
   * @param closeStreams (undocumented)
   * @param transferToEnabled (undocumented)
   * @return (undocumented)
   */
  public  long copyStream (java.io.InputStream in, java.io.OutputStream out, boolean closeStreams, boolean transferToEnabled)  { throw new RuntimeException(); }
  /**
   * Copy the first <code>maxSize</code> bytes of data from the InputStream to an in-memory
   * buffer, primarily to check for corruption.
   * <p>
   * This returns a new InputStream which contains the same data as the original input stream.
   * It may be entirely on in-memory buffer, or it may be a combination of in-memory data, and then
   * continue to read from the original stream. The only real use of this is if the original input
   * stream will potentially detect corruption while the data is being read (e.g. from compression).
   * This allows for an eager check of corruption in the first maxSize bytes of data.
   * <p>
   * @return An InputStream which includes all data from the original stream (combining buffered
   *         data and remaining data in the original stream)
   * @param in (undocumented)
   * @param maxSize (undocumented)
   */
  public  java.io.InputStream copyStreamUpTo (java.io.InputStream in, long maxSize)  { throw new RuntimeException(); }
  public  void copyFileStreamNIO (java.nio.channels.FileChannel input, java.nio.channels.WritableByteChannel output, long startPosition, long bytesToCopy)  { throw new RuntimeException(); }
  /**
   * A file name may contain some invalid URI characters, such as " ". This method will convert the
   * file name to a raw path accepted by <code>java.net.URI(String)</code>.
   * <p>
   * Note: the file name must not contain "/" or "\"
   * @param fileName (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String encodeFileNameToURIRawPath (java.lang.String fileName)  { throw new RuntimeException(); }
  /**
   * Get the file name from uri's raw path and decode it. If the raw path of uri ends with "/",
   * return the name before the last "/".
   * @param uri (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String decodeFileNameInURI (java.net.URI uri)  { throw new RuntimeException(); }
  /**
   * Download a file or directory to target directory. Supports fetching the file in a variety of
   * ways, including HTTP, Hadoop-compatible filesystems, and files on a standard filesystem, based
   * on the URL parameter. Fetching directories is only supported from Hadoop-compatible
   * filesystems.
   * <p>
   * If <code>useCache</code> is true, first attempts to fetch the file to a local cache that's shared
   * across executors running the same application. <code>useCache</code> is used mainly for
   * the executors, and not in local mode.
   * <p>
   * Throws SparkException if the target file already exists and has different contents than
   * the requested file.
   * <p>
   * If <code>shouldUntar</code> is true, it untars the given url if it is a tar.gz or tgz into <code>targetDir</code>.
   * This is a legacy behavior, and users should better use <code>spark.archives</code> configuration or
   * <code>SparkContext.addArchive</code>
   * @param url (undocumented)
   * @param targetDir (undocumented)
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @param timestamp (undocumented)
   * @param useCache (undocumented)
   * @param shouldUntar (undocumented)
   * @return (undocumented)
   */
  public  java.io.File fetchFile (java.lang.String url, java.io.File targetDir, org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, long timestamp, boolean useCache, boolean shouldUntar)  { throw new RuntimeException(); }
  /**
   * Unpacks an archive file into the specified directory. It expects .jar, .zip, .tar.gz, .tgz
   * and .tar files. This behaves same as Hadoop's archive in distributed cache. This method is
   * basically copied from <code>org.apache.hadoop.yarn.util.FSDownload.unpack</code>.
   * @param source (undocumented)
   * @param dest (undocumented)
   */
  public  void unpack (java.io.File source, java.io.File dest)  { throw new RuntimeException(); }
  /** Records the duration of running `body`. */
  public <T extends java.lang.Object> scala.Tuple2<T, java.lang.Object> timeTakenMs (scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Download a file or directory to target directory. Supports fetching the file in a variety of
   * ways, including HTTP, Hadoop-compatible filesystems, and files on a standard filesystem, based
   * on the URL parameter. Fetching directories is only supported from Hadoop-compatible
   * filesystems.
   * <p>
   * Throws SparkException if the target file already exists and has different contents than
   * the requested file.
   * @param url (undocumented)
   * @param targetDir (undocumented)
   * @param filename (undocumented)
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  public  java.io.File doFetchFile (java.lang.String url, java.io.File targetDir, java.lang.String filename, org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Fetch a file or directory from a Hadoop-compatible filesystem.
   * <p>
   * Visible for testing
   * @param path (undocumented)
   * @param targetDir (undocumented)
   * @param fs (undocumented)
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @param fileOverwrite (undocumented)
   * @param filename (undocumented)
   */
    void fetchHcfsFile (org.apache.hadoop.fs.Path path, java.io.File targetDir, org.apache.hadoop.fs.FileSystem fs, org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, boolean fileOverwrite, scala.Option<java.lang.String> filename)  { throw new RuntimeException(); }
  /**
   * Validate that a given URI is actually a valid URL as well.
   * @param uri The URI to validate
   */
  public  void validateURL (java.net.URI uri) throws java.net.MalformedURLException { throw new RuntimeException(); }
  /**
   * Get the path of a temporary directory.  Spark's local directories can be configured through
   * multiple settings, which are used with the following precedence:
   * <p>
   *   - If called from inside of a YARN container, this will return a directory chosen by YARN.
   *   - If the SPARK_LOCAL_DIRS environment variable is set, this will return a directory from it.
   *   - Otherwise, if the spark.local.dir is set, this will return a directory from it.
   *   - Otherwise, this will return java.io.tmpdir.
   * <p>
   * Some of these configuration options might be lists of multiple paths, but this method will
   * always return a single directory. The return directory is chosen randomly from the array
   * of directories it gets from getOrCreateLocalRootDirs.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getLocalDir (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    boolean isRunningInYarnContainer (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Returns if the current codes are running in a Spark task, e.g., in executors.
   * @return (undocumented)
   */
  public  boolean isInRunningSparkTask ()  { throw new RuntimeException(); }
  /**
   * Gets or creates the directories listed in spark.local.dir or SPARK_LOCAL_DIRS,
   * and returns only the directories that exist / could be created.
   * <p>
   * If no directories could be created, this will return an empty list.
   * <p>
   * This method will cache the local directories for the application when it's first invoked.
   * So calling it multiple times with a different configuration will always return the same
   * set of directories.
   * @param conf (undocumented)
   * @return (undocumented)
   */
    java.lang.String[] getOrCreateLocalRootDirs (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Return the configured local directories where Spark can write files. This
   * method does not create any directories on its own, it only encapsulates the
   * logic of locating the local directories according to deployment mode.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String[] getConfiguredLocalDirs (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Used by unit tests. Do not call from other places. */
    void clearLocalRootDirs ()  { throw new RuntimeException(); }
  /**
   * Shuffle the elements of a collection into a random order, returning the
   * result in a new collection. Unlike scala.util.Random.shuffle, this method
   * uses a local random number generator, avoiding inter-thread contention.
   * @param seq (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.Seq<T> randomize (scala.collection.TraversableOnce<T> seq, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Shuffle the elements of an array into a random order, modifying the
   * original array. Returns the original array.
   * @param arr (undocumented)
   * @param rand (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> java.lang.Object randomizeInPlace (java.lang.Object arr, java.util.Random rand)  { throw new RuntimeException(); }
  /**
   * Allow setting a custom host name because when we run on Mesos we need to use the same
   * hostname it reports to the master.
   * @param hostname (undocumented)
   */
  public  void setCustomHostname (java.lang.String hostname)  { throw new RuntimeException(); }
  /**
   * Get the local machine's FQDN.
   * @return (undocumented)
   */
  public  java.lang.String localCanonicalHostName ()  { throw new RuntimeException(); }
  /**
   * Get the local machine's hostname.
   * @return (undocumented)
   */
  public  java.lang.String localHostName ()  { throw new RuntimeException(); }
  /**
   * Get the local machine's URI.
   * @return (undocumented)
   */
  public  java.lang.String localHostNameForURI ()  { throw new RuntimeException(); }
  /**
   * Checks if the host contains only valid hostname/ip without port
   * NOTE: Incase of IPV6 ip it should be enclosed inside []
   * @param host (undocumented)
   */
  public  void checkHost (java.lang.String host)  { throw new RuntimeException(); }
  public  void checkHostPort (java.lang.String hostPort)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.Object> parseHostPort (java.lang.String hostPort)  { throw new RuntimeException(); }
  /**
   * Return the string to tell how long has passed in milliseconds.
   * @param startTimeNs - a timestamp in nanoseconds returned by <code>System.nanoTime</code>.
   * @return (undocumented)
   */
  public  java.lang.String getUsedTimeNs (long startTimeNs)  { throw new RuntimeException(); }
  /**
   * Lists files recursively.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  java.io.File[] recursiveList (java.io.File f)  { throw new RuntimeException(); }
  /**
   * Delete a file or directory and its contents recursively.
   * Don't follow directories if they are symlinks.
   * Throws an exception if deletion is unsuccessful.
   * @param file (undocumented)
   */
  public  void deleteRecursively (java.io.File file)  { throw new RuntimeException(); }
  /**
   * Determines if a directory contains any files newer than cutoff seconds.
   * <p>
   * @param dir must be the path to a directory, or IllegalArgumentException is thrown
   * @param cutoff measured in seconds. Returns true if there are any files or directories in the
   *               given directory whose last modified time is later than this many seconds ago
   * @return (undocumented)
   */
  public  boolean doesDirectoryContainAnyNewFiles (java.io.File dir, long cutoff)  { throw new RuntimeException(); }
  /**
   * Convert a time parameter such as (50s, 100ms, or 250us) to milliseconds for internal use. If
   * no suffix is provided, the passed number is assumed to be in ms.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  long timeStringAsMs (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Convert a time parameter such as (50s, 100ms, or 250us) to seconds for internal use. If
   * no suffix is provided, the passed number is assumed to be in seconds.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  long timeStringAsSeconds (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Convert a passed byte string (e.g. 50b, 100k, or 250m) to bytes for internal use.
   * <p>
   * If no suffix is provided, the passed number is assumed to be in bytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  long byteStringAsBytes (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Convert a passed byte string (e.g. 50b, 100k, or 250m) to kibibytes for internal use.
   * <p>
   * If no suffix is provided, the passed number is assumed to be in kibibytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  long byteStringAsKb (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Convert a passed byte string (e.g. 50b, 100k, or 250m) to mebibytes for internal use.
   * <p>
   * If no suffix is provided, the passed number is assumed to be in mebibytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  long byteStringAsMb (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Convert a passed byte string (e.g. 50b, 100k, or 250m, 500g) to gibibytes for internal use.
   * <p>
   * If no suffix is provided, the passed number is assumed to be in gibibytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  long byteStringAsGb (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Convert a Java memory parameter passed to -Xmx (such as 300m or 1g) to a number of mebibytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  int memoryStringToMb (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Convert a quantity in bytes to a human-readable string such as "4.0 MiB".
   * @param size (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String bytesToString (long size)  { throw new RuntimeException(); }
  public  java.lang.String bytesToString (scala.math.BigInt size)  { throw new RuntimeException(); }
  /**
   * Returns a human-readable string representing a duration such as "35ms"
   * @param ms (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String msDurationToString (long ms)  { throw new RuntimeException(); }
  /**
   * Convert a quantity in megabytes to a human-readable string such as "4.0 MiB".
   * @param megabytes (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String megabytesToString (long megabytes)  { throw new RuntimeException(); }
  /**
   * Execute a command and return the process running the command.
   * @param command (undocumented)
   * @param workingDir (undocumented)
   * @param extraEnvironment (undocumented)
   * @param redirectStderr (undocumented)
   * @return (undocumented)
   */
  public  java.lang.Process executeCommand (scala.collection.Seq<java.lang.String> command, java.io.File workingDir, scala.collection.Map<java.lang.String, java.lang.String> extraEnvironment, boolean redirectStderr)  { throw new RuntimeException(); }
  /**
   * Execute a command and get its output, throwing an exception if it yields a code other than 0.
   * @param command (undocumented)
   * @param workingDir (undocumented)
   * @param extraEnvironment (undocumented)
   * @param redirectStderr (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String executeAndGetOutput (scala.collection.Seq<java.lang.String> command, java.io.File workingDir, scala.collection.Map<java.lang.String, java.lang.String> extraEnvironment, boolean redirectStderr)  { throw new RuntimeException(); }
  /**
   * Return and start a daemon thread that processes the content of the input stream line by line.
   * @param threadName (undocumented)
   * @param inputStream (undocumented)
   * @param processLine (undocumented)
   * @return (undocumented)
   */
  public  java.lang.Thread processStreamByLine (java.lang.String threadName, java.io.InputStream inputStream, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> processLine)  { throw new RuntimeException(); }
  /**
   * Execute a block of code that evaluates to Unit, forwarding any uncaught exceptions to the
   * default UncaughtExceptionHandler
   * <p>
   * NOTE: This method is to be called by the spark-started JVM process.
   * @param block (undocumented)
   */
  public  void tryOrExit (scala.Function0<scala.runtime.BoxedUnit> block)  { throw new RuntimeException(); }
  /**
   * Execute a block of code that evaluates to Unit, stop SparkContext if there is any uncaught
   * exception
   * <p>
   * NOTE: This method is to be called by the driver-side components to avoid stopping the
   * user-started JVM process completely; in contrast, tryOrExit is to be called in the
   * spark-started JVM process .
   * @param sc (undocumented)
   * @param block (undocumented)
   */
  public  void tryOrStopSparkContext (org.apache.spark.SparkContext sc, scala.Function0<scala.runtime.BoxedUnit> block)  { throw new RuntimeException(); }
  /**
   * Execute a block of code that returns a value, re-throwing any non-fatal uncaught
   * exceptions as IOException. This is used when implementing Externalizable and Serializable's
   * read and write methods, since Java's serializer will not report non-IOExceptions properly;
   * see SPARK-4080 for more context.
   * @param block (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T tryOrIOException (scala.Function0<T> block)  { throw new RuntimeException(); }
  /** Executes the given block. Log non-fatal errors if any, and only throw fatal errors */
  public  void tryLogNonFatalError (scala.Function0<scala.runtime.BoxedUnit> block)  { throw new RuntimeException(); }
  /**
   * Execute a block of code, then a finally block, but if exceptions happen in
   * the finally block, do not suppress the original exception.
   * <p>
   * This is primarily an issue with <code>finally { out.close() }</code> blocks, where
   * close needs to be called to clean up <code>out</code>, but if an exception happened
   * in <code>out.write</code>, it's likely <code>out</code> may be corrupted and <code>out.close</code> will
   * fail as well. This would then suppress the original/likely more meaningful
   * exception from the original <code>out.write</code> call.
   * @param block (undocumented)
   * @param finallyBlock (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T tryWithSafeFinally (scala.Function0<T> block, scala.Function0<scala.runtime.BoxedUnit> finallyBlock)  { throw new RuntimeException(); }
  /**
   * Execute a block of code and call the failure callbacks in the catch block. If exceptions occur
   * in either the catch or the finally block, they are appended to the list of suppressed
   * exceptions in original exception which is then rethrown.
   * <p>
   * This is primarily an issue with <code>catch { abort() }</code> or <code>finally { out.close() }</code> blocks,
   * where the abort/close needs to be called to clean up <code>out</code>, but if an exception happened
   * in <code>out.write</code>, it's likely <code>out</code> may be corrupted and <code>abort</code> or <code>out.close</code> will
   * fail as well. This would then suppress the original/likely more meaningful
   * exception from the original <code>out.write</code> call.
   * @param block (undocumented)
   * @param catchBlock (undocumented)
   * @param finallyBlock (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T tryWithSafeFinallyAndFailureCallbacks (scala.Function0<T> block, scala.Function0<scala.runtime.BoxedUnit> catchBlock, scala.Function0<scala.runtime.BoxedUnit> finallyBlock)  { throw new RuntimeException(); }
  /**
   * When called inside a class in the spark package, returns the name of the user code class
   * (outside the spark package) that called into Spark, as well as which Spark method they called.
   * This is used, for example, to tell users where in their code each RDD got created.
   * <p>
   * @param skipClass Function that is used to exclude non-user-code classes.
   * @return (undocumented)
   */
  public  org.apache.spark.util.CallSite getCallSite (scala.Function1<java.lang.String, java.lang.Object> skipClass)  { throw new RuntimeException(); }
  /**
   * Return the file length, if the file is compressed it returns the uncompressed file length.
   * It also caches the uncompressed file size to avoid repeated decompression. The cache size is
   * read from workerConf.
   * @param file (undocumented)
   * @param workConf (undocumented)
   * @return (undocumented)
   */
  public  long getFileLength (java.io.File file, org.apache.spark.SparkConf workConf)  { throw new RuntimeException(); }
  /** Return a string containing part of a file from byte 'start' to 'end'. */
  public  java.lang.String offsetBytes (java.lang.String path, long length, long start, long end)  { throw new RuntimeException(); }
  /**
   * Return a string containing data across a set of files. The <code>startIndex</code>
   * and <code>endIndex</code> is based on the cumulative size of all the files take in
   * the given order. See figure below for more details.
   * @param files (undocumented)
   * @param fileLengths (undocumented)
   * @param start (undocumented)
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String offsetBytes (scala.collection.Seq<java.io.File> files, scala.collection.Seq<java.lang.Object> fileLengths, long start, long end)  { throw new RuntimeException(); }
  /**
   * Clone an object using a Spark serializer.
   * @param value (undocumented)
   * @param serializer (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T clone (T value, org.apache.spark.serializer.SerializerInstance serializer, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Split a string of potentially quoted arguments from the command line the way that a shell
   * would do it to determine arguments to a command. For example, if the string is 'a "b c" d',
   * then it would be parsed as three arguments: 'a', 'b c' and 'd'.
   * @param s (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> splitCommandString (java.lang.String s)  { throw new RuntimeException(); }
  public  int nonNegativeMod (int x, int mod)  { throw new RuntimeException(); }
  public  int nonNegativeHash (java.lang.Object obj)  { throw new RuntimeException(); }
  /**
   * Returns the system properties map that is thread-safe to iterator over. It gets the
   * properties which have been set explicitly, as well as those for which only a default value
   * has been defined.
   * @return (undocumented)
   */
  public  scala.collection.Map<java.lang.String, java.lang.String> getSystemProperties ()  { throw new RuntimeException(); }
  /**
   * Method executed for repeating a task for side effects.
   * Unlike a for comprehension, it permits JVM JIT optimization
   * @param numIters (undocumented)
   * @param f (undocumented)
   */
  public  void times (int numIters, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * Timing method based on iterations that permit JVM JIT optimization.
   * <p>
   * @param numIters number of iterations
   * @param f function to be executed. If prepare is not None, the running time of each call to f
   *          must be an order of magnitude longer than one nanosecond for accurate timing.
   * @param prepare function to be executed before each call to f. Its running time doesn't count.
   * @return the total time across all iterations (not counting preparation time) in nanoseconds.
   */
  public  long timeIt (int numIters, scala.Function0<scala.runtime.BoxedUnit> f, scala.Option<scala.Function0<scala.runtime.BoxedUnit>> prepare)  { throw new RuntimeException(); }
  /**
   * Counts the number of elements of an iterator using a while loop rather than calling
   * {@link scala.collection.Iterator#size} because it uses a for loop, which is slightly slower
   * in the current version of Scala.
   * @param iterator (undocumented)
   * @return (undocumented)
   */
  public  long getIteratorSize (scala.collection.Iterator<?> iterator)  { throw new RuntimeException(); }
  /**
   * Generate a zipWithIndex iterator, avoid index value overflowing problem
   * in scala's zipWithIndex
   * @param iter (undocumented)
   * @param startIndex (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.Iterator<scala.Tuple2<T, java.lang.Object>> getIteratorZipWithIndex (scala.collection.Iterator<T> iter, long startIndex)  { throw new RuntimeException(); }
  /**
   * Creates a symlink.
   * <p>
   * @param src absolute path to the source
   * @param dst relative path for the destination
   */
  public  void symlink (java.io.File src, java.io.File dst)  { throw new RuntimeException(); }
  /** Return the class name of the given object, removing all dollar signs */
  public  java.lang.String getFormattedClassName (java.lang.Object obj)  { throw new RuntimeException(); }
  /**
   * Return a Hadoop FileSystem with the scheme encoded in the given path.
   * @param path (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.fs.FileSystem getHadoopFileSystem (java.net.URI path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Return a Hadoop FileSystem with the scheme encoded in the given path.
   * @param path (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.fs.FileSystem getHadoopFileSystem (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Whether the underlying operating system is Windows.
   * @return (undocumented)
   */
  public  boolean isWindows ()  { throw new RuntimeException(); }
  /**
   * Whether the underlying operating system is Mac OS X.
   * @return (undocumented)
   */
  public  boolean isMac ()  { throw new RuntimeException(); }
  /**
   * Whether the underlying operating system is Mac OS X and processor is Apple Silicon.
   * @return (undocumented)
   */
  public  boolean isMacOnAppleSilicon ()  { throw new RuntimeException(); }
  /**
   * Pattern for matching a Windows drive, which contains only a single alphabet character.
   * @return (undocumented)
   */
  public  scala.util.matching.Regex windowsDrive ()  { throw new RuntimeException(); }
  /**
   * Indicates whether Spark is currently running unit tests.
   * @return (undocumented)
   */
  public  boolean isTesting ()  { throw new RuntimeException(); }
  /**
   * Terminates a process waiting for at most the specified duration.
   * <p>
   * @return the process exit value if it was successfully terminated, else None
   * @param process (undocumented)
   * @param timeoutMs (undocumented)
   */
  public  scala.Option<java.lang.Object> terminateProcess (java.lang.Process process, long timeoutMs)  { throw new RuntimeException(); }
  /**
   * Return the stderr of a process after waiting for the process to terminate.
   * If the process does not terminate within the specified timeout, return None.
   * @param process (undocumented)
   * @param timeoutMs (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> getStderr (java.lang.Process process, long timeoutMs)  { throw new RuntimeException(); }
  /**
   * Execute the given block, logging and re-throwing any uncaught exception.
   * This is particularly useful for wrapping code that runs in a thread, to ensure
   * that exceptions are printed, and to avoid having to catch Throwable.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T logUncaughtExceptions (scala.Function0<T> f)  { throw new RuntimeException(); }
  /** Executes the given block in a Try, logging any uncaught exceptions. */
  public <T extends java.lang.Object> scala.util.Try<T> tryLog (scala.Function0<T> f)  { throw new RuntimeException(); }
  /** Returns true if the given exception was fatal. See docs for scala.util.control.NonFatal. */
  public  boolean isFatalError (java.lang.Throwable e)  { throw new RuntimeException(); }
  /**
   * Return a well-formed URI for the file described by a user input string.
   * <p>
   * If the supplied path does not contain a scheme, or is a relative path, it will be
   * converted into an absolute path with a file:// scheme.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  java.net.URI resolveURI (java.lang.String path)  { throw new RuntimeException(); }
  /** Resolve a comma-separated list of paths. */
  public  java.lang.String resolveURIs (java.lang.String paths)  { throw new RuntimeException(); }
  /** Check whether a path is an absolute URI. */
  public  boolean isAbsoluteURI (java.lang.String path)  { throw new RuntimeException(); }
  /** Return all non-local paths from a comma-separated list of paths. */
  public  java.lang.String[] nonLocalPaths (java.lang.String paths, boolean testWindows)  { throw new RuntimeException(); }
  /**
   * Load default Spark properties from the given file. If no file is provided,
   * use the common defaults file. This mutates state in the given SparkConf and
   * in this JVM's system properties if the config specified in the file is not
   * already set. Return the path of the properties file used.
   * @param conf (undocumented)
   * @param filePath (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String loadDefaultSparkProperties (org.apache.spark.SparkConf conf, java.lang.String filePath)  { throw new RuntimeException(); }
  /**
   * Updates Spark config with properties from a set of Properties.
   * Provided properties have the highest priority.
   * @param conf (undocumented)
   * @param properties (undocumented)
   */
  public  void updateSparkConfigFromProperties (org.apache.spark.SparkConf conf, scala.collection.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  /**
   * Implements the same logic as JDK <code>java.lang.String#trim</code> by removing leading and trailing
   * non-printable characters less or equal to ' ' (SPACE) but preserves natural line
   * delimiters according to {@link java.util.Properties} load method. The natural line delimiters are
   * removed by JDK during load. Therefore any remaining ones have been specifically provided and
   * escaped by the user, and must not be ignored
   * <p>
   * @param str
   * @return the trimmed value of str
   */
    java.lang.String trimExceptCRLF (java.lang.String str)  { throw new RuntimeException(); }
  /** Load properties present in the given file. */
  public  scala.collection.Map<java.lang.String, java.lang.String> getPropertiesFromFile (java.lang.String filename)  { throw new RuntimeException(); }
  /** Return the path of the default Spark properties file. */
  public  java.lang.String getDefaultPropertiesFile (scala.collection.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  /**
   * Return a nice string representation of the exception. It will call "printStackTrace" to
   * recursively generate the stack trace including the exception and its causes.
   * @param e (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String exceptionString (java.lang.Throwable e)  { throw new RuntimeException(); }
  /** Return a thread dump of all threads' stacktraces.  Used to capture dumps for the web UI */
  public  org.apache.spark.status.api.v1.ThreadStackTrace[] getThreadDump ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ThreadStackTrace> getThreadDumpForThread (long threadId)  { throw new RuntimeException(); }
  /**
   * Convert all spark properties set in the given SparkConf to a sequence of java options.
   * @param conf (undocumented)
   * @param filterKey (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> sparkJavaOpts (org.apache.spark.SparkConf conf, scala.Function1<java.lang.String, java.lang.Object> filterKey)  { throw new RuntimeException(); }
  /**
   * Maximum number of retries when binding to a port before giving up.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  int portMaxRetries (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Returns the user port to try when trying to bind a service. Handles wrapping and skipping
   * privileged ports.
   * @param base (undocumented)
   * @param offset (undocumented)
   * @return (undocumented)
   */
  public  int userPort (int base, int offset)  { throw new RuntimeException(); }
  /**
   * Attempt to start a service on the given port, or fail after a number of attempts.
   * Each subsequent attempt uses 1 + the port used in the previous attempt (unless the port is 0).
   * <p>
   * @param startPort The initial port to start the service on.
   * @param startService Function to start service on a given port.
   *                     This is expected to throw java.net.BindException on port collision.
   * @param conf A SparkConf used to get the maximum number of retries when binding to a port.
   * @param serviceName Name of the service.
   * @return (service: T, port: Int)
   */
  public <T extends java.lang.Object> scala.Tuple2<T, java.lang.Object> startServiceOnPort (int startPort, scala.Function1<java.lang.Object, scala.Tuple2<T, java.lang.Object>> startService, org.apache.spark.SparkConf conf, java.lang.String serviceName)  { throw new RuntimeException(); }
  /**
   * Return whether the exception is caused by an address-port collision when binding.
   * @param exception (undocumented)
   * @return (undocumented)
   */
  public  boolean isBindCollision (java.lang.Throwable exception)  { throw new RuntimeException(); }
  /**
   * configure a new log4j level
   * @param l (undocumented)
   */
  public  void setLogLevel (org.apache.logging.log4j.Level l)  { throw new RuntimeException(); }
  /**
   * Return the current system LD_LIBRARY_PATH name
   * @return (undocumented)
   */
  public  java.lang.String libraryPathEnvName ()  { throw new RuntimeException(); }
  /**
   * Return the prefix of a command that appends the given library paths to the
   * system-specific library path environment variable. On Unix, for instance,
   * this returns the string LD_LIBRARY_PATH="path1:path2:$LD_LIBRARY_PATH".
   * @param libraryPaths (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String libraryPathEnvPrefix (scala.collection.Seq<java.lang.String> libraryPaths)  { throw new RuntimeException(); }
  /**
   * Return the value of a config either through the SparkConf or the Hadoop configuration.
   * We Check whether the key is set in the SparkConf before look at any Hadoop configuration.
   * If the key is set in SparkConf, no matter whether it is running on YARN or not,
   * gets the value from SparkConf.
   * Only when the key is not set in SparkConf and running on YARN,
   * gets the value from Hadoop configuration.
   * @param conf (undocumented)
   * @param key (undocumented)
   * @param default_ (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getSparkOrYarnConfig (org.apache.spark.SparkConf conf, java.lang.String key, java.lang.String default_)  { throw new RuntimeException(); }
  /**
   * Return a pair of host and port extracted from the <code>sparkUrl</code>.
   * <p>
   * A spark url (<code>spark://host:port</code>) is a special URI that its scheme is <code>spark</code> and only contains
   * host and port.
   * <p>
   * @throws org.apache.spark.SparkException if sparkUrl is invalid.
   * @param sparkUrl (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.String, java.lang.Object> extractHostPortFromSparkUrl (java.lang.String sparkUrl) throws org.apache.spark.SparkException { throw new RuntimeException(); }
  /**
   * Returns the current user name. This is the currently logged in user, unless that's been
   * overridden by the <code>SPARK_USER</code> environment variable.
   * @return (undocumented)
   */
  public  java.lang.String getCurrentUserName ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> EMPTY_USER_GROUPS ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> getCurrentUserGroups (org.apache.spark.SparkConf sparkConf, java.lang.String username)  { throw new RuntimeException(); }
  /**
   * Split the comma delimited string of master URLs into a list.
   * For instance, "spark://abc,def" becomes [spark://abc, spark://def].
   * @param masterUrls (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String[] parseStandaloneMasterUrls (java.lang.String masterUrls)  { throw new RuntimeException(); }
  /** An identifier that backup masters use in their responses. */
  public  java.lang.String BACKUP_STANDALONE_MASTER_PREFIX ()  { throw new RuntimeException(); }
  /** Return true if the response message is sent from a backup Master on standby. */
  public  boolean responseFromBackup (java.lang.String msg)  { throw new RuntimeException(); }
  /**
   * To avoid calling <code>Utils.getCallSite</code> for every single RDD we create in the body,
   * set a dummy call site that RDDs use instead. This is for performance optimization.
   * @param sc (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withDummyCallSite (org.apache.spark.SparkContext sc, scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Return whether the specified file is a parent directory of the child file.
   * @param parent (undocumented)
   * @param child (undocumented)
   * @return (undocumented)
   */
  public  boolean isInDirectory (java.io.File parent, java.io.File child)  { throw new RuntimeException(); }
  /**
   * @return whether it is local mode
   * @param conf (undocumented)
   */
  public  boolean isLocalMaster (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Push based shuffle can only be enabled when below conditions are met:
   *   - the application is submitted to run in YARN mode
   *   - external shuffle service enabled
   *   - IO encryption disabled
   *   - serializer(such as KryoSerializer) supports relocation of serialized objects
   * @param conf (undocumented)
   * @param isDriver (undocumented)
   * @param checkSerializer (undocumented)
   * @return (undocumented)
   */
  public  boolean isPushBasedShuffleEnabled (org.apache.spark.SparkConf conf, boolean isDriver, boolean checkSerializer)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T instantiateSerializerOrShuffleManager (java.lang.String className, org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T instantiateSerializerFromConf (org.apache.spark.internal.config.ConfigEntry<java.lang.String> propertyName, org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * Return whether dynamic allocation is enabled in the given conf.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  boolean isDynamicAllocationEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  boolean isStreamingDynamicAllocationEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Return the initial number of executors for dynamic allocation.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  int getDynamicAllocationInitialExecutors (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public <R extends java.io.Closeable, T extends java.lang.Object> T tryWithResource (scala.Function0<R> createResource, scala.Function1<R, T> f)  { throw new RuntimeException(); }
  /**
   * Returns a path of temporary file which is in the same directory with <code>path</code>.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  java.io.File tempFileWith (java.io.File path)  { throw new RuntimeException(); }
  /**
   * Returns the name of this JVM process. This is OS dependent but typically (OSX, Linux, Windows),
   * this is formatted as PID@hostname.
   * @return (undocumented)
   */
  public  java.lang.String getProcessName ()  { throw new RuntimeException(); }
  /**
   * Utility function that should be called early in <code>main()</code> for daemons to set up some common
   * diagnostic state.
   * @param log (undocumented)
   */
  public  void initDaemon (org.slf4j.Logger log)  { throw new RuntimeException(); }
  /**
   * Return the jar files pointed by the "spark.jars" property. Spark internally will distribute
   * these jars through file server. In the YARN mode, it will return an empty list, since YARN
   * has its own mechanism to distribute jars.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> getUserJars (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Return the local jar files which will be added to REPL's classpath. These jar files are
   * specified by --jars (spark.jars) or --packages, remote jars will be downloaded to local by
   * SparkSubmit at first.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> getLocalUserJarsForShell (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    java.lang.String REDACTION_REPLACEMENT_TEXT ()  { throw new RuntimeException(); }
  /**
   * Redact the sensitive values in the given map. If a map key matches the redaction pattern then
   * its value is replaced with a dummy text.
   * @param conf (undocumented)
   * @param kvs (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> redact (org.apache.spark.SparkConf conf, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> kvs)  { throw new RuntimeException(); }
  /**
   * Redact the sensitive values in the given map. If a map key matches the redaction pattern then
   * its value is replaced with a dummy text.
   * @param regex (undocumented)
   * @param kvs (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> scala.collection.Seq<scala.Tuple2<K, V>> redact (scala.Option<scala.util.matching.Regex> regex, scala.collection.Seq<scala.Tuple2<K, V>> kvs)  { throw new RuntimeException(); }
  /**
   * Redact the sensitive information in the given string.
   * @param regex (undocumented)
   * @param text (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String redact (scala.Option<scala.util.matching.Regex> regex, java.lang.String text)  { throw new RuntimeException(); }
  /**
   * Looks up the redaction regex from within the key value pairs and uses it to redact the rest
   * of the key value pairs. No care is taken to make sure the redaction property itself is not
   * redacted. So theoretically, the property itself could be configured to redact its own value
   * when printing.
   * @param kvs (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> redact (scala.collection.Map<java.lang.String, java.lang.String> kvs)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> redactCommandLineArgs (org.apache.spark.SparkConf conf, scala.collection.Seq<java.lang.String> commands)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> stringToSeq (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Create instances of extension classes.
   * <p>
   * The classes in the given list must:
   * - Be sub-classes of the given base class.
   * - Provide either a no-arg constructor, or a 1-arg constructor that takes a SparkConf.
   * <p>
   * The constructors are allowed to throw "UnsupportedOperationException" if the extension does not
   * want to be registered; this allows the implementations to check the Spark configuration (or
   * other state) and decide they do not need to be added. A log message is printed in that case.
   * Other exceptions are bubbled up.
   * @param extClass (undocumented)
   * @param classes (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.Seq<T> loadExtensions (java.lang.Class<T> extClass, scala.collection.Seq<java.lang.String> classes, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Check the validity of the given Kubernetes master URL and return the resolved URL. Prefix
   * "k8s://" is appended to the resolved URL as the prefix is used by KubernetesClusterManager
   * in canCreate to determine if the KubernetesClusterManager should be used.
   * @param rawMasterURL (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String checkAndGetK8sMasterUrl (java.lang.String rawMasterURL)  { throw new RuntimeException(); }
  /**
   * Replaces all the {{EXECUTOR_ID}} occurrences with the Executor Id
   * and {{APP_ID}} occurrences with the App Id.
   * @param opt (undocumented)
   * @param appId (undocumented)
   * @param execId (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String substituteAppNExecIds (java.lang.String opt, java.lang.String appId, java.lang.String execId)  { throw new RuntimeException(); }
  /**
   * Replaces all the {{APP_ID}} occurrences with the App Id.
   * @param opt (undocumented)
   * @param appId (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String substituteAppId (java.lang.String opt, java.lang.String appId)  { throw new RuntimeException(); }
  public  java.lang.String createSecret (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Returns true if and only if the underlying class is a member class.
   * <p>
   * Note: jdk8u throws a "Malformed class name" error if a given class is a deeply-nested
   * inner class (See SPARK-34607 for details). This issue has already been fixed in jdk9+, so
   * we can remove this helper method safely if we drop the support of jdk8u.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  public  boolean isMemberClass (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  /**
   * Safer than Class obj's getSimpleName which may throw Malformed class name error in scala.
   * This method mimics scalatest's getSimpleNameOfAnObjectsClass.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getSimpleName (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  /**
   * Return the number of half widths in a given string. Note that a full width character
   * occupies two half widths.
   * <p>
   * For a string consisting of 1 million characters, the execution of this method requires
   * about 50ms.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  int stringHalfWidth (java.lang.String str)  { throw new RuntimeException(); }
  public  java.lang.String sanitizeDirName (java.lang.String str)  { throw new RuntimeException(); }
  public  boolean isClientMode (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Returns whether the URI is a "local:" URI. */
  public  boolean isLocalUri (java.lang.String uri)  { throw new RuntimeException(); }
  /** Check whether the file of the path is splittable. */
  public  boolean isFileSplittable (org.apache.hadoop.fs.Path path, org.apache.hadoop.io.compress.CompressionCodecFactory codecFactory)  { throw new RuntimeException(); }
  /** Create a new properties object with the same values as `props` */
  public  java.util.Properties cloneProperties (java.util.Properties props)  { throw new RuntimeException(); }
  /**
   * Convert a sequence of <code>Path</code>s to a metadata string. When the length of metadata string
   * exceeds <code>stopAppendingThreshold</code>, stop appending paths for saving memory.
   * @param paths (undocumented)
   * @param stopAppendingThreshold (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String buildLocationMetadata (scala.collection.Seq<org.apache.hadoop.fs.Path> paths, int stopAppendingThreshold)  { throw new RuntimeException(); }
  /**
   * Convert MEMORY_OFFHEAP_SIZE to MB Unit, return 0 if MEMORY_OFFHEAP_ENABLED is false.
   * @param sparkConf (undocumented)
   * @return (undocumented)
   */
  public  int executorOffHeapMemorySizeAsMb (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * return 0 if MEMORY_OFFHEAP_ENABLED is false.
   * @param sparkConf (undocumented)
   * @param offHeapSize (undocumented)
   * @return (undocumented)
   */
  public  long checkOffHeapEnabled (org.apache.spark.SparkConf sparkConf, long offHeapSize)  { throw new RuntimeException(); }
  /** Returns a string message about delegation token generation failure */
  public  java.lang.String createFailedToGetTokenMessage (java.lang.String serviceName, java.lang.Throwable e)  { throw new RuntimeException(); }
  /**
   * Decompress a zip file into a local dir. File names are read from the zip file. Note, we skip
   * addressing the directory here. Also, we rely on the caller side to address any exceptions.
   * @param fs (undocumented)
   * @param dfsZipFile (undocumented)
   * @param localDir (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.io.File> unzipFilesFromFile (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path dfsZipFile, java.io.File localDir)  { throw new RuntimeException(); }
  /**
   * Return the median number of a long array
   * <p>
   * @param sizes
   * @param alreadySorted
   * @return
   */
  public  long median (long[] sizes, boolean alreadySorted)  { throw new RuntimeException(); }
}
