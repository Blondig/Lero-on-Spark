package org.apache.spark.repl;
public  class SparkShellSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.apache.spark.internal.Logging {
  public   SparkShellSuite ()  { throw new RuntimeException(); }
  /**
   * Run a spark-shell operation and expect all the script and expected answers to be returned.
   * This method refers to {@link runCliWithin()} method in {@link CliSuite}.
   * <p>
   * @param timeout maximum time for the commands to complete
   * @param extraArgs any extra arguments
   * @param errorResponses a sequence of strings whose presence in the stdout of the forked process
   *                       is taken as an immediate error condition. That is: if a line containing
   *                       with one of these strings is found, fail the test immediately.
   *                       The default value is <code>Seq("Error:")</code>
   * @param scriptsAndExpectedAnswers one or more tuples of query + answer
   */
  public  void runInterpreter (scala.concurrent.duration.FiniteDuration timeout, scala.collection.Seq<java.lang.String> extraArgs, scala.collection.Seq<java.lang.String> errorResponses, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> scriptsAndExpectedAnswers)  { throw new RuntimeException(); }
}
