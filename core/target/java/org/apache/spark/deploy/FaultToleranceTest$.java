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
public  class FaultToleranceTest$ implements scala.App, org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FaultToleranceTest$ MODULE$ = null;
  public  long executionStart ()  { throw new RuntimeException(); }
  public   FaultToleranceTest$ ()  { throw new RuntimeException(); }
}
