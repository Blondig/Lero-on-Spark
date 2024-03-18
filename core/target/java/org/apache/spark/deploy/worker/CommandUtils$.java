package org.apache.spark.deploy.worker;
/**
 * Utilities for running commands with the spark classpath.
 */
public  class CommandUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CommandUtils$ MODULE$ = null;
  public   CommandUtils$ ()  { throw new RuntimeException(); }
  /**
   * Build a ProcessBuilder based on the given parameters.
   * The <code>env</code> argument is exposed for testing.
   * @param command (undocumented)
   * @param securityMgr (undocumented)
   * @param memory (undocumented)
   * @param sparkHome (undocumented)
   * @param substituteArguments (undocumented)
   * @param classPaths (undocumented)
   * @param env (undocumented)
   * @return (undocumented)
   */
  public  java.lang.ProcessBuilder buildProcessBuilder (org.apache.spark.deploy.Command command, org.apache.spark.SecurityManager securityMgr, int memory, java.lang.String sparkHome, scala.Function1<java.lang.String, java.lang.String> substituteArguments, scala.collection.Seq<java.lang.String> classPaths, scala.collection.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  /** Spawn a thread that will redirect a given stream to a file */
  public  void redirectStream (java.io.InputStream in, java.io.File file)  { throw new RuntimeException(); }
}
