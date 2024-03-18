package org.apache.spark.deploy.yarn;
public  class YarnSparkHadoopUtil {
  static public  double AM_MEMORY_OVERHEAD_FACTOR ()  { throw new RuntimeException(); }
  static public  java.lang.String ANY_HOST ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.yarn.api.records.Priority RM_REQUEST_PRIORITY ()  { throw new RuntimeException(); }
  /**
   * Add a path variable to the given environment map.
   * If the map already contains this key, append the value to the existing value instead.
   * @param env (undocumented)
   * @param key (undocumented)
   * @param value (undocumented)
   */
  static public  void addPathToEnvironment (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set zero or more environment variables specified by the given input string.
   * The input string is expected to take the form "KEY1=VAL1,KEY2=VAL2,KEY3=VAL3".
   * @param env (undocumented)
   * @param inputString (undocumented)
   */
  static public  void setEnvFromInputString (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String inputString)  { throw new RuntimeException(); }
  /**
   * Replace environment variables in a string according to the same rules as
   * {@link org.apache.hadoop.yarn.api.ApplicationConstants.Environment}:
   * <code>$VAR_NAME</code> for Unix, <code>%VAR_NAME%</code> for Windows, and <code>{{VAR_NAME}}</code> for all OS.
   * The <code>${VAR_NAME}</code> syntax is also supported for Unix.
   * This support escapes for <code>$</code> and <code>\</code> (on Unix) and <code>%</code> and <code>^</code> characters (on Windows), e.g.
   * <code>\$FOO</code>, <code>^%FOO^%</code>, and <code>%%FOO%%</code> will be resolved to <code>$FOO</code>, <code>%FOO%</code>, and <code>%FOO%</code>,
   * respectively, instead of being treated as variable names.
   * <p>
   * @param unresolvedString The unresolved string which may contain variable references.
   * @param env The System environment
   * @param isWindows True iff running in a Windows environment
   * @return The input string with variables replaced with their values from <code>env</code>
   * @see <a href="https://pubs.opengroup.org/onlinepubs/000095399/basedefs/xbd_chap08.html Environment Variables (IEEE Std 1003.1-2017)"/>
   * @see <a href="https://en.wikibooks.org/wiki/Windows_Batch_Scripting#Quoting_and_escaping Windows Batch Scripting | Quoting and Escaping"/>
   */
  static public  java.lang.String replaceEnvVars (java.lang.String unresolvedString, scala.collection.immutable.Map<java.lang.String, java.lang.String> env, boolean isWindows)  { throw new RuntimeException(); }
  /**
   * Kill if OOM is raised - leverage yarn's failure handling to cause rescheduling.
   * Not killing the task leaves various aspects of the executor and (to some extent) the jvm in
   * an inconsistent state.
   * TODO: If the OOM is not recoverable by rescheduling it on different node, then do
   * 'something' to fail job ... akin to unhealthy trackers in mapred ?
   * <p>
   * The handler if an OOM Exception is thrown by the JVM must be configured on Windows
   * differently: the 'taskkill' command should be used, whereas Unix-based systems use 'kill'.
   * <p>
   * As the JVM interprets both %p and %%p as the same, we can use either of them. However,
   * some tests on Windows computers suggest, that the JVM only accepts '%%p'.
   * <p>
   * Furthermore, the behavior of the character '%' on the Windows command line differs from
   * the behavior of '%' in a .cmd file: it gets interpreted as an incomplete environment
   * variable. Windows .cmd files escape a '%' by '%%'. Thus, the correct way of writing
   * '%%p' in an escaped way is '%%%%p'.
   * @param javaOpts (undocumented)
   */
  static   void addOutOfMemoryErrorArgument (scala.collection.mutable.ListBuffer<java.lang.String> javaOpts)  { throw new RuntimeException(); }
  /**
   * Escapes a string for inclusion in a command line executed by Yarn. Yarn executes commands
   * using either
   * <p>
   * (Unix-based) <code>bash -c "command arg1 arg2"</code> and that means plain quoting doesn't really work.
   * The argument is enclosed in single quotes and some key characters are escaped.
   * <p>
   * (Windows-based) part of a .cmd file in which case windows escaping for each argument must be
   * applied. Windows is quite lenient, however it is usually Java that causes trouble, needing to
   * distinguish between arguments starting with '-' and class names. If arguments are surrounded
   * by ' java takes the following string as is, hence an argument is mistakenly taken as a class
   * name which happens to start with a '-'. The way to avoid this, is to surround nothing with
   * a ', but instead with a ".
   * <p>
   * @param arg A single argument.
   * @return Argument quoted for execution via Yarn's generated shell script.
   */
  static public  java.lang.String escapeForShell (java.lang.String arg)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<org.apache.hadoop.yarn.api.records.ApplicationAccessType, java.lang.String> getApplicationAclsForYarn (org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.yarn.api.records.ContainerId getContainerId ()  { throw new RuntimeException(); }
  /**
   * Get offHeap memory size from {@link ExecutorResourceRequest}
   * return 0 if MEMORY_OFFHEAP_ENABLED is false.
   * @param sparkConf (undocumented)
   * @param execRequest (undocumented)
   * @return (undocumented)
   */
  static public  long executorOffHeapMemorySizeAsMb (org.apache.spark.SparkConf sparkConf, org.apache.spark.resource.ExecutorResourceRequest execRequest)  { throw new RuntimeException(); }
}
