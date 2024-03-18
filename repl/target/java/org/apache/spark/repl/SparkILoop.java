package org.apache.spark.repl;
/**
 *  A Spark-specific interactive shell.
 */
public  class SparkILoop extends scala.tools.nsc.interpreter.ILoop {
  /**
   * Creates an interpreter loop with default settings and feeds
   * the given code to it as input.
   * @param code (undocumented)
   * @param sets (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String run (java.lang.String code, scala.tools.nsc.Settings sets)  { throw new RuntimeException(); }
  static public  java.lang.String run (scala.collection.immutable.List<java.lang.String> lines)  { throw new RuntimeException(); }
  // not preceding
  public   SparkILoop (scala.Option<java.io.BufferedReader> in0, java.io.PrintWriter out)  { throw new RuntimeException(); }
  public   SparkILoop (java.io.BufferedReader in0, java.io.PrintWriter out)  { throw new RuntimeException(); }
  public   SparkILoop ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> initializationCommands ()  { throw new RuntimeException(); }
  public  void initializeSpark ()  { throw new RuntimeException(); }
  /** Print a welcome message */
  public  void printWelcome ()  { throw new RuntimeException(); }
  /** Available commands */
  public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> commands ()  { throw new RuntimeException(); }
  public  void resetCommand (java.lang.String line)  { throw new RuntimeException(); }
  public  void replay ()  { throw new RuntimeException(); }
  /**
   * The following code is mostly a copy of <code>process</code> implementation in <code>ILoop.scala</code> in Scala
   * <p>
   * In newer version of Scala, <code>printWelcome</code> is the first thing to be called. As a result,
   * SparkUI URL information would be always shown after the welcome message.
   * <p>
   * However, this is inconsistent compared with the existing version of Spark which will always
   * show SparkUI URL first.
   * <p>
   * The only way we can make it consistent will be duplicating the Scala code.
   * <p>
   * We should remove this duplication once Scala provides a way to load our custom initialization
   * code, and also customize the ordering of printing welcome message.
   * @param settings (undocumented)
   * @return (undocumented)
   */
  public  boolean process (scala.tools.nsc.Settings settings)  { throw new RuntimeException(); }
}
