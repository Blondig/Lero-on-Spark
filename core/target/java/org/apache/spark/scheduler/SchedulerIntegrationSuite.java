package org.apache.spark.scheduler;
/**
 * Tests for the  entire scheduler code -- DAGScheduler, TaskSchedulerImpl, TaskSets,
 * TaskSetManagers.
 * <p>
 * Test cases are configured by providing a set of jobs to submit, and then simulating interaction
 * with spark's executors via a mocked backend (e.g., task completion, task failure, executors
 * disconnecting, etc.).
 */
public abstract class SchedulerIntegrationSuite<T extends org.apache.spark.scheduler.MockBackend> extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public   SchedulerIntegrationSuite (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  /**
   * Helper to run a few common asserts after a job has completed, in particular some internal
   * datastructures for bookkeeping.  This only does a very minimal check for whether the job
   * failed or succeeded -- often you will want extra asserts on {@link results} or {@link failure}.
   * @param noFailure (undocumented)
   */
  protected  void assertDataStructuresEmpty (boolean noFailure)  { throw new RuntimeException(); }
  /**
   * Looks at all shuffleMapOutputs that are dependencies of the given RDD, and makes sure
   * they are all registered
   * @param targetRdd (undocumented)
   */
  public  void assertMapOutputAvailable (org.apache.spark.scheduler.MockRDD targetRdd)  { throw new RuntimeException(); }
  /**
   * Helper to do a little extra error checking while waiting for the job to terminate.  Primarily
   * just does a little extra error handling if there is an exception from the backend.
   * @param jobFuture (undocumented)
   * @param duration (undocumented)
   */
  public  void awaitJobTermination (scala.concurrent.Future<?> jobFuture, scala.concurrent.duration.Duration duration)  { throw new RuntimeException(); }
  public  T backend ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicReference<java.lang.Exception> backendException ()  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration duration ()  { throw new RuntimeException(); }
  /**
   * If a call to {@link submit} results in a job failure, this will hold the exception, else it will
   * be null.
   * <p>
   * As with {@link results}, this only gets cleared between tests, so care must be taken if you are
   * submitting more than one job in one test.
   * @return (undocumented)
   */
  public  java.lang.Throwable failure ()  { throw new RuntimeException(); }
  /** models a stage boundary with multiple dependencies, like a join */
  public  org.apache.spark.scheduler.MockRDD join (int nParts, scala.collection.Seq<org.apache.spark.scheduler.MockRDD> inputs)  { throw new RuntimeException(); }
  /** models a one-to-one dependency within a stage, like a map or filter */
  public  org.apache.spark.scheduler.MockRDD oneToOne (org.apache.spark.scheduler.MockRDD input)  { throw new RuntimeException(); }
  /**
   * A map from partition to results for all tasks of a job when you call this test framework's
   * {@link submit} method.  Two important considerations:
   * <p>
   * 1. If there is a job failure, results may or may not be empty.  If any tasks succeed before
   * the job has failed, they will get included in <code>results</code>.  Instead, check for job failure by
   * checking {@link failure}. (Also see <code>assertDataStructuresEmpty()</code>)
   * <p>
   * 2. This only gets cleared between tests.  So you'll need to do special handling if you submit
   * more than one job in one test.
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> results ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Ident(org.apache.spark.scheduler.MockBackend))))
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.DAGScheduler scheduler ()  { throw new RuntimeException(); }
  public  void setupScheduler (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** models a stage boundary with a single dependency, like a shuffle */
  public  org.apache.spark.scheduler.MockRDD shuffle (int nParts, org.apache.spark.scheduler.MockRDD input)  { throw new RuntimeException(); }
  /** Submits a job to the scheduler, and returns a future which does a bit of error handling. */
  protected  scala.concurrent.Future<java.lang.Object> submit (org.apache.spark.rdd.RDD<?> rdd, int[] partitions, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<?>, ?> func)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TestTaskScheduler taskScheduler ()  { throw new RuntimeException(); }
  public  void testScheduler (java.lang.String name, scala.Function0<scala.runtime.BoxedUnit> testBody)  { throw new RuntimeException(); }
  public  void testScheduler (java.lang.String name, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> extraConfs, scala.Function0<scala.runtime.BoxedUnit> testBody)  { throw new RuntimeException(); }
  /**
   * Helper which makes it a little easier to setup a test, which starts a mock backend in another
   * thread, responding to tasks with your custom function.  You also supply the "body" of your
   * test, where you submit jobs to your backend, wait for them to complete, then check
   * whatever conditions you want.  Note that this is *not* safe to all bad backends --
   * in particular, your <code>backendFunc</code> has to return quickly, it can't throw errors, (instead
   * it should send back the right TaskEndReason)
   * @param backendFunc (undocumented)
   * @param testBody (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withBackend (scala.Function0<scala.runtime.BoxedUnit> backendFunc, scala.Function0<T> testBody)  { throw new RuntimeException(); }
}
