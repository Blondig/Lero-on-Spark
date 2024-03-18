package org.apache.spark.internal.io;
/**
 * An interface to define how a single Spark job commits its outputs. Three notes:
 * <p>
 * 1. Implementations must be serializable, as the committer instance instantiated on the driver
 *    will be used for tasks on executors.
 * 2. Implementations should have a constructor with 2 or 3 arguments:
 *      (jobId: String, path: String) or
 *      (jobId: String, path: String, dynamicPartitionOverwrite: Boolean)
 * 3. A committer should not be reused across multiple Spark jobs.
 * <p>
 * The proper call sequence is:
 * <p>
 * 1. Driver calls setupJob.
 * 2. As part of each task's execution, executor calls setupTask and then commitTask
 *    (or abortTask if task failed).
 * 3. When all necessary tasks completed successfully, the driver calls commitJob. If the job
 *    failed to execute (e.g. too many failed tasks), the job should call abortJob.
 * <p>
 * @note This class is exposed as an API considering the usage of many downstream custom
 * implementations, but will be subject to be changed and/or moved.
 */
public abstract class FileCommitProtocol implements org.apache.spark.internal.Logging {
  static public  class EmptyTaskCommitMessage$ extends org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EmptyTaskCommitMessage$ MODULE$ = null;
    public   EmptyTaskCommitMessage$ ()  { throw new RuntimeException(); }
  }
  static public  class TaskCommitMessage implements scala.Serializable {
    // not preceding
    public   TaskCommitMessage (Object obj)  { throw new RuntimeException(); }
    public  Object obj ()  { throw new RuntimeException(); }
  }
  /**
   * Instantiates a FileCommitProtocol using the given className.
   * @param className (undocumented)
   * @param jobId (undocumented)
   * @param outputPath (undocumented)
   * @param dynamicPartitionOverwrite (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.internal.io.FileCommitProtocol instantiate (java.lang.String className, java.lang.String jobId, java.lang.String outputPath, boolean dynamicPartitionOverwrite)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path getStagingDir (java.lang.String path, java.lang.String jobId)  { throw new RuntimeException(); }
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
  public   FileCommitProtocol ()  { throw new RuntimeException(); }
  /**
   * Setups up a job. Must be called on the driver before any other methods can be invoked.
   * @param jobContext (undocumented)
   */
  public abstract  void setupJob (org.apache.hadoop.mapreduce.JobContext jobContext)  ;
  /**
   * Commits a job after the writes succeed. Must be called on the driver.
   * @param jobContext (undocumented)
   * @param taskCommits (undocumented)
   */
  public abstract  void commitJob (org.apache.hadoop.mapreduce.JobContext jobContext, scala.collection.Seq<org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage> taskCommits)  ;
  /**
   * Aborts a job after the writes fail. Must be called on the driver.
   * <p>
   * Calling this function is a best-effort attempt, because it is possible that the driver
   * just crashes (or killed) before it can call abort.
   * @param jobContext (undocumented)
   */
  public abstract  void abortJob (org.apache.hadoop.mapreduce.JobContext jobContext)  ;
  /**
   * Sets up a task within a job.
   * Must be called before any other task related methods can be invoked.
   * @param taskContext (undocumented)
   */
  public abstract  void setupTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  ;
  /**
   * Notifies the commit protocol to add a new file, and gets back the full path that should be
   * used. Must be called on the executors when running tasks.
   * <p>
   * Note that the returned temp file may have an arbitrary path. The commit protocol only
   * promises that the file will be at the location specified by the arguments after job commit.
   * <p>
   * A full file path consists of the following parts:
   *  1. the base path
   *  2. some sub-directory within the base path, used to specify partitioning
   *  3. file prefix, usually some unique job id with the task id
   *  4. bucket id
   *  5. source specific file extension, e.g. ".snappy.parquet"
   * <p>
   * The "dir" parameter specifies 2, and "ext" parameter specifies both 4 and 5, and the rest
   * are left to the commit protocol implementation to decide.
   * <p>
   * Important: it is the caller's responsibility to add uniquely identifying content to "ext"
   * if a task is going to write out multiple files to the same dir. The file commit protocol only
   * guarantees that files written by different tasks will not conflict.
   * @param taskContext (undocumented)
   * @param dir (undocumented)
   * @param ext (undocumented)
   * @return (undocumented)
   *
   * @deprecated use newTaskTempFile(..., spec: FileNameSpec) instead. Since 3.3.0. 
   */
  public abstract  java.lang.String newTaskTempFile (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, scala.Option<java.lang.String> dir, java.lang.String ext)  ;
  /**
   * Notifies the commit protocol to add a new file, and gets back the full path that should be
   * used. Must be called on the executors when running tasks.
   * <p>
   * Note that the returned temp file may have an arbitrary path. The commit protocol only
   * promises that the file will be at the location specified by the arguments after job commit.
   * <p>
   * The "dir" parameter specifies the sub-directory within the base path, used to specify
   * partitioning. The "spec" parameter specifies the file name. The rest are left to the commit
   * protocol implementation to decide.
   * <p>
   * Important: it is the caller's responsibility to add uniquely identifying content to "spec"
   * if a task is going to write out multiple files to the same dir. The file commit protocol only
   * guarantees that files written by different tasks will not conflict.
   * <p>
   * @since 3.2.0
   * @param taskContext (undocumented)
   * @param dir (undocumented)
   * @param spec (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String newTaskTempFile (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, scala.Option<java.lang.String> dir, org.apache.spark.internal.io.FileNameSpec spec)  { throw new RuntimeException(); }
  /**
   * Similar to newTaskTempFile(), but allows files to committed to an absolute output location.
   * Depending on the implementation, there may be weaker guarantees around adding files this way.
   * <p>
   * Important: it is the caller's responsibility to add uniquely identifying content to "ext"
   * if a task is going to write out multiple files to the same dir. The file commit protocol only
   * guarantees that files written by different tasks will not conflict.
   * @param taskContext (undocumented)
   * @param absoluteDir (undocumented)
   * @param ext (undocumented)
   * @return (undocumented)
   *
   * @deprecated use newTaskTempFileAbsPath(..., spec: FileNameSpec) instead. Since 3.3.0. 
   */
  public abstract  java.lang.String newTaskTempFileAbsPath (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String absoluteDir, java.lang.String ext)  ;
  /**
   * Similar to newTaskTempFile(), but allows files to committed to an absolute output location.
   * Depending on the implementation, there may be weaker guarantees around adding files this way.
   * <p>
   * The "absoluteDir" parameter specifies the final absolute directory of file. The "spec"
   * parameter specifies the file name. The rest are left to the commit protocol implementation to
   * decide.
   * <p>
   * Important: it is the caller's responsibility to add uniquely identifying content to "spec"
   * if a task is going to write out multiple files to the same dir. The file commit protocol only
   * guarantees that files written by different tasks will not conflict.
   * <p>
   * @since 3.2.0
   * @param taskContext (undocumented)
   * @param absoluteDir (undocumented)
   * @param spec (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String newTaskTempFileAbsPath (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String absoluteDir, org.apache.spark.internal.io.FileNameSpec spec)  { throw new RuntimeException(); }
  /**
   * Commits a task after the writes succeed. Must be called on the executors when running tasks.
   * @param taskContext (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  ;
  /**
   * Aborts a task after the writes have failed. Must be called on the executors when running tasks.
   * <p>
   * Calling this function is a best-effort attempt, because it is possible that the executor
   * just crashes (or killed) before it can call abort.
   * @param taskContext (undocumented)
   */
  public abstract  void abortTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  ;
  /**
   * Specifies that a file should be deleted with the commit of this job. The default
   * implementation deletes the file immediately.
   * @param fs (undocumented)
   * @param path (undocumented)
   * @param recursive (undocumented)
   * @return (undocumented)
   */
  public  boolean deleteWithJob (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, boolean recursive)  { throw new RuntimeException(); }
  /**
   * Called on the driver after a task commits. This can be used to access task commit messages
   * before the job has finished. These same task commit messages will be passed to commitJob()
   * if the entire job succeeds.
   * @param taskCommit (undocumented)
   */
  public  void onTaskCommit (org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage taskCommit)  { throw new RuntimeException(); }
}
