package org.apache.spark.deploy;
/**
 * Main gateway of launching a Spark application.
 * <p>
 * This program handles setting up the classpath with relevant Spark dependencies and provides
 * a layer over the different cluster managers and deploy modes that Spark supports.
 */
  class SparkSubmit implements org.apache.spark.internal.Logging {
  static   scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> exitFn ()  { throw new RuntimeException(); }
  static   java.io.PrintStream printStream ()  { throw new RuntimeException(); }
  static   java.lang.String YARN_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
  static   java.lang.String REST_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
  static   java.lang.String STANDALONE_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
  static   java.lang.String KUBERNETES_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource represents a user jar.
   * @param res (undocumented)
   * @return (undocumented)
   */
  static   boolean isUserJar (java.lang.String res)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource represents a shell.
   * @param res (undocumented)
   * @return (undocumented)
   */
  static   boolean isShell (java.lang.String res)  { throw new RuntimeException(); }
  /**
   * Return whether the given main class represents a sql shell.
   * @param mainClass (undocumented)
   * @return (undocumented)
   */
  static   boolean isSqlShell (java.lang.String mainClass)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource requires running python.
   * @param res (undocumented)
   * @return (undocumented)
   */
  static   boolean isPython (java.lang.String res)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource requires running R.
   * @param res (undocumented)
   * @return (undocumented)
   */
  static   boolean isR (java.lang.String res)  { throw new RuntimeException(); }
  static   boolean isInternal (java.lang.String res)  { throw new RuntimeException(); }
  static   void exitFn_$eq (scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> x$1)  { throw new RuntimeException(); }
  static   void printStream_$eq (java.io.PrintStream x$1)  { throw new RuntimeException(); }
  static   void printMessage (java.lang.String str)  { throw new RuntimeException(); }
  static   void printErrorAndExit (java.lang.String str)  { throw new RuntimeException(); }
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
  public   SparkSubmit ()  { throw new RuntimeException(); }
  public  void doSubmit (java.lang.String[] args)  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.SparkSubmitArguments parseArguments (java.lang.String[] args)  { throw new RuntimeException(); }
  /**
   * Prepare the environment for submitting an application.
   * <p>
   * @param args the parsed SparkSubmitArguments used for environment preparation.
   * @param conf the Hadoop Configuration, this argument will only be set in unit test.
   * @return a 4-tuple:
   *        (1) the arguments for the child process,
   *        (2) a list of classpath entries for the child,
   *        (3) a map of system properties, and
   *        (4) the main class for the child
   * <p>
   * Exposed for testing.
   */
    scala.Tuple4<scala.collection.Seq<java.lang.String>, scala.collection.Seq<java.lang.String>, org.apache.spark.SparkConf, java.lang.String> prepareSubmitEnvironment (org.apache.spark.deploy.SparkSubmitArguments args, scala.Option<org.apache.hadoop.conf.Configuration> conf)  { throw new RuntimeException(); }
}
