package org.apache.spark.scheduler.cluster;
public  class CoarseGrainedClusterMessages {
  static public  class RetrieveSparkAppConfig implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  int resourceProfileId ()  { throw new RuntimeException(); }
    // not preceding
    public   RetrieveSparkAppConfig (int resourceProfileId)  { throw new RuntimeException(); }
  }
  static public  class RetrieveSparkAppConfig$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RetrieveSparkAppConfig> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RetrieveSparkAppConfig$ MODULE$ = null;
    public   RetrieveSparkAppConfig$ ()  { throw new RuntimeException(); }
  }
  static public  class SparkAppConfig implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sparkProperties ()  { throw new RuntimeException(); }
    public  scala.Option<byte[]> ioEncryptionKey ()  { throw new RuntimeException(); }
    public  scala.Option<byte[]> hadoopDelegationCreds ()  { throw new RuntimeException(); }
    public  org.apache.spark.resource.ResourceProfile resourceProfile ()  { throw new RuntimeException(); }
    // not preceding
    public   SparkAppConfig (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sparkProperties, scala.Option<byte[]> ioEncryptionKey, scala.Option<byte[]> hadoopDelegationCreds, org.apache.spark.resource.ResourceProfile resourceProfile)  { throw new RuntimeException(); }
  }
  static public  class SparkAppConfig$ extends scala.runtime.AbstractFunction4<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>>, scala.Option<byte[]>, scala.Option<byte[]>, org.apache.spark.resource.ResourceProfile, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.SparkAppConfig> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SparkAppConfig$ MODULE$ = null;
    public   SparkAppConfig$ ()  { throw new RuntimeException(); }
  }
  static public  class RetrieveLastAllocatedExecutorId$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RetrieveLastAllocatedExecutorId$ MODULE$ = null;
    public   RetrieveLastAllocatedExecutorId$ ()  { throw new RuntimeException(); }
  }
  static public  class LaunchTask implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  org.apache.spark.util.SerializableBuffer data ()  { throw new RuntimeException(); }
    // not preceding
    public   LaunchTask (org.apache.spark.util.SerializableBuffer data)  { throw new RuntimeException(); }
  }
  static public  class LaunchTask$ extends scala.runtime.AbstractFunction1<org.apache.spark.util.SerializableBuffer, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.LaunchTask> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LaunchTask$ MODULE$ = null;
    public   LaunchTask$ ()  { throw new RuntimeException(); }
  }
  static public  class KillTask implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  long taskId ()  { throw new RuntimeException(); }
    public  java.lang.String executor ()  { throw new RuntimeException(); }
    public  boolean interruptThread ()  { throw new RuntimeException(); }
    public  java.lang.String reason ()  { throw new RuntimeException(); }
    // not preceding
    public   KillTask (long taskId, java.lang.String executor, boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  }
  static public  class KillTask$ extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.KillTask> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final KillTask$ MODULE$ = null;
    public   KillTask$ ()  { throw new RuntimeException(); }
  }
  static public  class KillExecutorsOnHost implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String host ()  { throw new RuntimeException(); }
    // not preceding
    public   KillExecutorsOnHost (java.lang.String host)  { throw new RuntimeException(); }
  }
  static public  class KillExecutorsOnHost$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.KillExecutorsOnHost> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final KillExecutorsOnHost$ MODULE$ = null;
    public   KillExecutorsOnHost$ ()  { throw new RuntimeException(); }
  }
  static public  class DecommissionExecutorsOnHost implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String host ()  { throw new RuntimeException(); }
    // not preceding
    public   DecommissionExecutorsOnHost (java.lang.String host)  { throw new RuntimeException(); }
  }
  static public  class DecommissionExecutorsOnHost$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.DecommissionExecutorsOnHost> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DecommissionExecutorsOnHost$ MODULE$ = null;
    public   DecommissionExecutorsOnHost$ ()  { throw new RuntimeException(); }
  }
  static public  class UpdateDelegationTokens implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  byte[] tokens ()  { throw new RuntimeException(); }
    // not preceding
    public   UpdateDelegationTokens (byte[] tokens)  { throw new RuntimeException(); }
  }
  static public  class UpdateDelegationTokens$ extends scala.runtime.AbstractFunction1<byte[], org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.UpdateDelegationTokens> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UpdateDelegationTokens$ MODULE$ = null;
    public   UpdateDelegationTokens$ ()  { throw new RuntimeException(); }
  }
  static public  class RegisterExecutor implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    public  org.apache.spark.rpc.RpcEndpointRef executorRef ()  { throw new RuntimeException(); }
    public  java.lang.String hostname ()  { throw new RuntimeException(); }
    public  int cores ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrls ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
    public  int resourceProfileId ()  { throw new RuntimeException(); }
    // not preceding
    public   RegisterExecutor (java.lang.String executorId, org.apache.spark.rpc.RpcEndpointRef executorRef, java.lang.String hostname, int cores, scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrls, scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, int resourceProfileId)  { throw new RuntimeException(); }
  }
  static public  class RegisterExecutor$ extends scala.runtime.AbstractFunction8<java.lang.String, org.apache.spark.rpc.RpcEndpointRef, java.lang.String, java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.String>, scala.collection.immutable.Map<java.lang.String, java.lang.String>, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation>, java.lang.Object, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RegisterExecutor> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegisterExecutor$ MODULE$ = null;
    public   RegisterExecutor$ ()  { throw new RuntimeException(); }
  }
  static public  class LaunchedExecutor implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    // not preceding
    public   LaunchedExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  }
  static public  class LaunchedExecutor$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.LaunchedExecutor> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LaunchedExecutor$ MODULE$ = null;
    public   LaunchedExecutor$ ()  { throw new RuntimeException(); }
  }
  static public  class StatusUpdate implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    public  long taskId ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
    public  org.apache.spark.util.SerializableBuffer data ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
    // not preceding
    public   StatusUpdate (java.lang.String executorId, long taskId, scala.Enumeration.Value state, org.apache.spark.util.SerializableBuffer data, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  }
  static public  class StatusUpdate$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StatusUpdate$ MODULE$ = null;
    public   StatusUpdate$ ()  { throw new RuntimeException(); }
    /** Alternate factory method that takes a ByteBuffer directly for the data field */
    public  org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.StatusUpdate apply (java.lang.String executorId, long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer data, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  }
  static public  class ShufflePushCompletion implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  int shuffleId ()  { throw new RuntimeException(); }
    public  int shuffleMergeId ()  { throw new RuntimeException(); }
    public  int mapIndex ()  { throw new RuntimeException(); }
    // not preceding
    public   ShufflePushCompletion (int shuffleId, int shuffleMergeId, int mapIndex)  { throw new RuntimeException(); }
  }
  static public  class ShufflePushCompletion$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.ShufflePushCompletion> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ShufflePushCompletion$ MODULE$ = null;
    public   ShufflePushCompletion$ ()  { throw new RuntimeException(); }
  }
  static public  class ReviveOffers$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ReviveOffers$ MODULE$ = null;
    public   ReviveOffers$ ()  { throw new RuntimeException(); }
  }
  static public  class StopDriver$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StopDriver$ MODULE$ = null;
    public   StopDriver$ ()  { throw new RuntimeException(); }
  }
  static public  class StopExecutor$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StopExecutor$ MODULE$ = null;
    public   StopExecutor$ ()  { throw new RuntimeException(); }
  }
  static public  class StopExecutors$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StopExecutors$ MODULE$ = null;
    public   StopExecutors$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveExecutor implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    public  org.apache.spark.scheduler.ExecutorLossReason reason ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveExecutor (java.lang.String executorId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
  }
  static public  class RemoveExecutor$ extends scala.runtime.AbstractFunction2<java.lang.String, org.apache.spark.scheduler.ExecutorLossReason, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RemoveExecutor> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveExecutor$ MODULE$ = null;
    public   RemoveExecutor$ ()  { throw new RuntimeException(); }
  }
  static public  class ExecutorDecommissioning implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    // not preceding
    public   ExecutorDecommissioning (java.lang.String executorId)  { throw new RuntimeException(); }
  }
  static public  class ExecutorDecommissioning$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.ExecutorDecommissioning> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExecutorDecommissioning$ MODULE$ = null;
    public   ExecutorDecommissioning$ ()  { throw new RuntimeException(); }
  }
  static public  class DecommissionExecutor$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DecommissionExecutor$ MODULE$ = null;
    public   DecommissionExecutor$ ()  { throw new RuntimeException(); }
  }
  static public  class ExecutorDecommissionSigReceived$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExecutorDecommissionSigReceived$ MODULE$ = null;
    public   ExecutorDecommissionSigReceived$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveWorker implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String workerId ()  { throw new RuntimeException(); }
    public  java.lang.String host ()  { throw new RuntimeException(); }
    public  java.lang.String message ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveWorker (java.lang.String workerId, java.lang.String host, java.lang.String message)  { throw new RuntimeException(); }
  }
  static public  class RemoveWorker$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RemoveWorker> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveWorker$ MODULE$ = null;
    public   RemoveWorker$ ()  { throw new RuntimeException(); }
  }
  static public  class SetupDriver implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  org.apache.spark.rpc.RpcEndpointRef driver ()  { throw new RuntimeException(); }
    // not preceding
    public   SetupDriver (org.apache.spark.rpc.RpcEndpointRef driver)  { throw new RuntimeException(); }
  }
  static public  class SetupDriver$ extends scala.runtime.AbstractFunction1<org.apache.spark.rpc.RpcEndpointRef, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.SetupDriver> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SetupDriver$ MODULE$ = null;
    public   SetupDriver$ ()  { throw new RuntimeException(); }
  }
  static public  class AddWebUIFilter implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String filterName ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams ()  { throw new RuntimeException(); }
    public  java.lang.String proxyBase ()  { throw new RuntimeException(); }
    // not preceding
    public   AddWebUIFilter (java.lang.String filterName, scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams, java.lang.String proxyBase)  { throw new RuntimeException(); }
  }
  static public  class AddWebUIFilter$ extends scala.runtime.AbstractFunction3<java.lang.String, scala.collection.immutable.Map<java.lang.String, java.lang.String>, java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.AddWebUIFilter> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddWebUIFilter$ MODULE$ = null;
    public   AddWebUIFilter$ ()  { throw new RuntimeException(); }
  }
  static public  class RegisterClusterManager implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  org.apache.spark.rpc.RpcEndpointRef am ()  { throw new RuntimeException(); }
    // not preceding
    public   RegisterClusterManager (org.apache.spark.rpc.RpcEndpointRef am)  { throw new RuntimeException(); }
  }
  static public  class RegisterClusterManager$ extends scala.runtime.AbstractFunction1<org.apache.spark.rpc.RpcEndpointRef, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RegisterClusterManager> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegisterClusterManager$ MODULE$ = null;
    public   RegisterClusterManager$ ()  { throw new RuntimeException(); }
  }
  static public  class MiscellaneousProcessAdded implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  long time ()  { throw new RuntimeException(); }
    public  java.lang.String processId ()  { throw new RuntimeException(); }
    public  org.apache.spark.scheduler.MiscellaneousProcessDetails info ()  { throw new RuntimeException(); }
    // not preceding
    public   MiscellaneousProcessAdded (long time, java.lang.String processId, org.apache.spark.scheduler.MiscellaneousProcessDetails info)  { throw new RuntimeException(); }
  }
  static public  class MiscellaneousProcessAdded$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.String, org.apache.spark.scheduler.MiscellaneousProcessDetails, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.MiscellaneousProcessAdded> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MiscellaneousProcessAdded$ MODULE$ = null;
    public   MiscellaneousProcessAdded$ ()  { throw new RuntimeException(); }
  }
  static public  class RetrieveDelegationTokens$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RetrieveDelegationTokens$ MODULE$ = null;
    public   RetrieveDelegationTokens$ ()  { throw new RuntimeException(); }
  }
  static public  class RequestExecutors implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  scala.collection.immutable.Map<org.apache.spark.resource.ResourceProfile, java.lang.Object> resourceProfileToTotalExecs ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> numLocalityAwareTasksPerResourceProfileId ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.Object>> hostToLocalTaskCount ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Set<java.lang.String> excludedNodes ()  { throw new RuntimeException(); }
    // not preceding
    public   RequestExecutors (scala.collection.immutable.Map<org.apache.spark.resource.ResourceProfile, java.lang.Object> resourceProfileToTotalExecs, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> numLocalityAwareTasksPerResourceProfileId, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.Object>> hostToLocalTaskCount, scala.collection.immutable.Set<java.lang.String> excludedNodes)  { throw new RuntimeException(); }
  }
  static public  class RequestExecutors$ extends scala.runtime.AbstractFunction4<scala.collection.immutable.Map<org.apache.spark.resource.ResourceProfile, java.lang.Object>, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.Object>>, scala.collection.immutable.Set<java.lang.String>, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RequestExecutors> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RequestExecutors$ MODULE$ = null;
    public   RequestExecutors$ ()  { throw new RuntimeException(); }
  }
  static public  class GetExecutorLossReason implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    // not preceding
    public   GetExecutorLossReason (java.lang.String executorId)  { throw new RuntimeException(); }
  }
  static public  class GetExecutorLossReason$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.GetExecutorLossReason> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetExecutorLossReason$ MODULE$ = null;
    public   GetExecutorLossReason$ ()  { throw new RuntimeException(); }
  }
  static public  class KillExecutors implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  scala.collection.Seq<java.lang.String> executorIds ()  { throw new RuntimeException(); }
    // not preceding
    public   KillExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  }
  static public  class KillExecutors$ extends scala.runtime.AbstractFunction1<scala.collection.Seq<java.lang.String>, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.KillExecutors> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final KillExecutors$ MODULE$ = null;
    public   KillExecutors$ ()  { throw new RuntimeException(); }
  }
  static public  class Shutdown$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Shutdown$ MODULE$ = null;
    public   Shutdown$ ()  { throw new RuntimeException(); }
  }
  static public  class IsExecutorAlive implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    // not preceding
    public   IsExecutorAlive (java.lang.String executorId)  { throw new RuntimeException(); }
  }
  static public  class IsExecutorAlive$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.IsExecutorAlive> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IsExecutorAlive$ MODULE$ = null;
    public   IsExecutorAlive$ ()  { throw new RuntimeException(); }
  }
}
