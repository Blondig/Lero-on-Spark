package org.apache.spark.deploy;
/**
 * This suite tests the fault tolerance of the Spark standalone scheduler, mainly the Master.
 * In order to mimic a real distributed cluster more closely, Docker is used.
 * Execute using
 * ./bin/spark-class org.apache.spark.deploy.FaultToleranceTest
 * <p>
 * Make sure that the environment includes the following properties in SPARK_DAEMON_JAVA_OPTS:
 *   - spark.deploy.recoveryMode=ZOOKEEPER
 *   - spark.deploy.zookeeper.url=172.17.42.1:2181
 * Note that 172.17.42.1 is the default docker ip for the host and 2181 is the default ZK port.
 * <p>
 * In case of failure, make sure to kill off prior docker containers before restarting:
 *   docker kill $(docker ps -q)
 * <p>
 * Unfortunately, due to the Docker dependency this suite cannot be run automatically without a
 * working installation of Docker. In addition to having Docker, the following are assumed:
 *   - Docker can run without sudo (see http://docs.docker.io/en/latest/use/basics/)
 *   - The docker images tagged spark-test-master and spark-test-worker are built from the
 *     docker/ directory. Run 'docker/spark-test/build' to generate these.
 */
public  class FaultToleranceTest {
  static public  long executionStart ()  { throw new RuntimeException(); }
  static protected  java.lang.String[] args ()  { throw new RuntimeException(); }
  static public  java.lang.String[] scala$App$$_args ()  { throw new RuntimeException(); }
  static public  void scala$App$$_args_$eq (java.lang.String[] x$1)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.ListBuffer<scala.Function0<scala.runtime.BoxedUnit>> scala$App$$initCode ()  { throw new RuntimeException(); }
  static public  void delayedInit (scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static protected abstract  void scala$App$_setter_$executionStart_$eq (long x$1)  ;
  static protected abstract  void scala$App$_setter_$scala$App$$initCode_$eq (scala.collection.mutable.ListBuffer<scala.Function0<scala.runtime.BoxedUnit>> x$1)  ;
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
}
