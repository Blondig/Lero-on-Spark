package org.apache.spark.scheduler;
/**
 * HealthTracker is designed to track problematic executors and nodes.  It supports excluding
 * executors and nodes across an entire application (with a periodic expiry). TaskSetManagers add
 * additional logic for exclusion of executors and nodes for individual tasks and stages which
 * works in concert with the logic here.
 * <p>
 * The tracker needs to deal with a variety of workloads, e.g.:
 * <p>
 *  * bad user code -- this may lead to many task failures, but that should not count against
 *      individual executors
 *  * many small stages -- this may prevent a bad executor for having many failures within one
 *      stage, but still many failures over the entire application
 *  * "flaky" executors -- they don't fail every task, but are still faulty enough to merit
 *      excluding
 *  * missing shuffle files -- may trigger fetch failures on healthy executors.
 * <p>
 * See the design doc on SPARK-8425 for a more in-depth discussion. Note SPARK-32037 renamed
 * the feature.
 * <p>
 * THREADING: As with most helpers of TaskSchedulerImpl, this is not thread-safe.  Though it is
 * called by multiple threads, callers must already have a lock on the TaskSchedulerImpl.  The
 * one exception is {@link excludedNodeList()}, which can be called without holding a lock.
 */
  class HealthTracker implements org.apache.spark.internal.Logging {
  /**
   * Tracks all failures for one executor (that have not passed the timeout).
   * <p>
   * In general we actually expect this to be extremely small, since it won't contain more than the
   * maximum number of task failures before an executor is failed (default 2).
   */
   final class ExecutorFailureList implements org.apache.spark.internal.Logging {
    public   ExecutorFailureList ()  { throw new RuntimeException(); }
    public  void addFailures (int stage, int stageAttempt, org.apache.spark.scheduler.ExecutorFailuresInTaskSet failuresInTaskSet)  { throw new RuntimeException(); }
    /**
     * Apply the timeout to individual tasks.  This is to prevent one-off failures that are very
     * spread out in time (and likely have nothing to do with problems on the executor) from
     * triggering exlusion.  However, note that we do *not* remove executors and nodes from
     * being excluded as we expire individual task failures -- each have their own timeout.  E.g.,
     * suppose:
     *  * timeout = 10, maxFailuresPerExec = 2
     *  * Task 1 fails on exec 1 at time 0
     *  * Task 2 fails on exec 1 at time 5
     * -->  exec 1 is excluded from time 5 - 15.
     * This is to simplify the implementation, as well as keep the behavior easier to understand
     * for the end user.
     * @param dropBefore (undocumented)
     */
    public  void dropFailuresWithTimeoutBefore (long dropBefore)  { throw new RuntimeException(); }
    public  boolean isEmpty ()  { throw new RuntimeException(); }
    /**
     * The number of unique tasks that failed on this executor.  Only counts failures within the
     * timeout, and in successful tasksets.
     * @return (undocumented)
     */
    public  int numUniqueTaskFailures ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  /**
   * Returns true if the excludeOnFailure is enabled, based on checking the configuration
   * in the following order:
   * 1. Is it specifically enabled or disabled?
   * 2. Is it enabled via the legacy timeout conf?
   * 3. Default is off
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  boolean isExcludeOnFailureEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  long getExludeOnFailureTimeout (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Verify that exclude on failure configurations are consistent; if not, throw an exception.
   * Should only be called if excludeOnFailure is enabled.
   * <p>
   * The configuration is expected to adhere to a few invariants.  Default values
   * follow these rules of course, but users may unwittingly change one configuration
   * without making the corresponding adjustment elsewhere. This ensures we fail-fast when
   * there are such misconfigurations.
   * @param conf (undocumented)
   */
  static public  void validateExcludeOnFailureConfs (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  // not preceding
  public   HealthTracker (org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.SparkConf conf, scala.Option<org.apache.spark.ExecutorAllocationClient> allocationClient, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public   HealthTracker (org.apache.spark.SparkContext sc, scala.Option<org.apache.spark.ExecutorAllocationClient> allocationClient)  { throw new RuntimeException(); }
  public  long EXCLUDE_ON_FAILURE_TIMEOUT_MILLIS ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.ExcludedExecutor> executorIdToExcludedStatus ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> nodeIdToExcludedExpiryTime ()  { throw new RuntimeException(); }
  /**
   * Time when the next excluded node will expire.  Used as a shortcut to
   * avoid iterating over all entries in the excludedNodeList when none will have expired.
   * @return (undocumented)
   */
  public  long nextExpiryTime ()  { throw new RuntimeException(); }
  /**
   * Mapping from nodes to all of the executors that have been excluded on that node. We do *not*
   * remove from this when executors are removed from spark, so we can track when we get multiple
   * successive excluded executors on one node.  Nonetheless, it will not grow too large because
   * there cannot be many excluded executors on one node, before we stop requesting more
   * executors on that node, and we clean up the list of exluded executors once an executor has
   * been excluded for EXCLUDE_ON_FAILURE_TIMEOUT_MILLIS.
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.String>> nodeToExcludedExecs ()  { throw new RuntimeException(); }
  /**
   * Include executors and nodes that have been excluded for at least
   * EXCLUDE_ON_FAILURE_TIMEOUT_MILLIS
   */
  public  void applyExcludeOnFailureTimeout ()  { throw new RuntimeException(); }
    void killExcludedIdleExecutor (java.lang.String exec)  { throw new RuntimeException(); }
  public  void updateExcludedForFetchFailure (java.lang.String host, java.lang.String exec)  { throw new RuntimeException(); }
  public  void updateExcludedForSuccessfulTaskSet (int stageId, int stageAttemptId, scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.ExecutorFailuresInTaskSet> failuresByExec)  { throw new RuntimeException(); }
  public  boolean isExecutorExcluded (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * Get the full set of nodes that are excluded.  Unlike other methods in this class, this *IS*
   * thread-safe -- no lock required on a taskScheduler.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Set<java.lang.String> excludedNodeList ()  { throw new RuntimeException(); }
  public  boolean isNodeExcluded (java.lang.String node)  { throw new RuntimeException(); }
  public  void handleRemovedExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
}
