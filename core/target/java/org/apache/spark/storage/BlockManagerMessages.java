package org.apache.spark.storage;
public  class BlockManagerMessages {
  static public  class RemoveBlock implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMasterStorageEndpoint, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  }
  static public  class RemoveBlock$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockManagerMessages.RemoveBlock> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveBlock$ MODULE$ = null;
    public   RemoveBlock$ ()  { throw new RuntimeException(); }
  }
  static public  class ReplicateBlock implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMasterStorageEndpoint, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> replicas ()  { throw new RuntimeException(); }
    public  int maxReplicas ()  { throw new RuntimeException(); }
    // not preceding
    public   ReplicateBlock (org.apache.spark.storage.BlockId blockId, scala.collection.Seq<org.apache.spark.storage.BlockManagerId> replicas, int maxReplicas)  { throw new RuntimeException(); }
  }
  static public  class ReplicateBlock$ extends scala.runtime.AbstractFunction3<org.apache.spark.storage.BlockId, scala.collection.Seq<org.apache.spark.storage.BlockManagerId>, java.lang.Object, org.apache.spark.storage.BlockManagerMessages.ReplicateBlock> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ReplicateBlock$ MODULE$ = null;
    public   ReplicateBlock$ ()  { throw new RuntimeException(); }
  }
  static public  class DecommissionBlockManager$ implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMasterStorageEndpoint, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DecommissionBlockManager$ MODULE$ = null;
    public   DecommissionBlockManager$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveRdd implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMasterStorageEndpoint, scala.Product, scala.Serializable {
    public  int rddId ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveRdd (int rddId)  { throw new RuntimeException(); }
  }
  static public  class RemoveRdd$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.storage.BlockManagerMessages.RemoveRdd> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveRdd$ MODULE$ = null;
    public   RemoveRdd$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveShuffle implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMasterStorageEndpoint, scala.Product, scala.Serializable {
    public  int shuffleId ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveShuffle (int shuffleId)  { throw new RuntimeException(); }
  }
  static public  class RemoveShuffle$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.storage.BlockManagerMessages.RemoveShuffle> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveShuffle$ MODULE$ = null;
    public   RemoveShuffle$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveBroadcast implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMasterStorageEndpoint, scala.Product, scala.Serializable {
    public  long broadcastId ()  { throw new RuntimeException(); }
    public  boolean removeFromDriver ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveBroadcast (long broadcastId, boolean removeFromDriver)  { throw new RuntimeException(); }
  }
  static public  class RemoveBroadcast$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.storage.BlockManagerMessages.RemoveBroadcast> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveBroadcast$ MODULE$ = null;
    public   RemoveBroadcast$ ()  { throw new RuntimeException(); }
  }
  /**
   * Driver to Executor message to trigger a thread dump.
   */
  static public  class TriggerThreadDump$ implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMasterStorageEndpoint, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TriggerThreadDump$ MODULE$ = null;
    public   TriggerThreadDump$ ()  { throw new RuntimeException(); }
  }
  static public  class RegisterBlockManager implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    public  java.lang.String[] localDirs ()  { throw new RuntimeException(); }
    public  long maxOnHeapMemSize ()  { throw new RuntimeException(); }
    public  long maxOffHeapMemSize ()  { throw new RuntimeException(); }
    public  org.apache.spark.rpc.RpcEndpointRef sender ()  { throw new RuntimeException(); }
    // not preceding
    public   RegisterBlockManager (org.apache.spark.storage.BlockManagerId blockManagerId, java.lang.String[] localDirs, long maxOnHeapMemSize, long maxOffHeapMemSize, org.apache.spark.rpc.RpcEndpointRef sender)  { throw new RuntimeException(); }
  }
  static public  class RegisterBlockManager$ extends scala.runtime.AbstractFunction5<org.apache.spark.storage.BlockManagerId, java.lang.String[], java.lang.Object, java.lang.Object, org.apache.spark.rpc.RpcEndpointRef, org.apache.spark.storage.BlockManagerMessages.RegisterBlockManager> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegisterBlockManager$ MODULE$ = null;
    public   RegisterBlockManager$ ()  { throw new RuntimeException(); }
  }
  static public  class UpdateBlockInfo implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, java.io.Externalizable, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
    public  long memSize ()  { throw new RuntimeException(); }
    public  long diskSize ()  { throw new RuntimeException(); }
    // not preceding
    public   UpdateBlockInfo (org.apache.spark.storage.BlockManagerId blockManagerId, org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize)  { throw new RuntimeException(); }
    public   UpdateBlockInfo ()  { throw new RuntimeException(); }
    public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
    public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  }
  static public  class UpdateBlockInfo$ extends scala.runtime.AbstractFunction5<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockId, org.apache.spark.storage.StorageLevel, java.lang.Object, java.lang.Object, org.apache.spark.storage.BlockManagerMessages.UpdateBlockInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UpdateBlockInfo$ MODULE$ = null;
    public   UpdateBlockInfo$ ()  { throw new RuntimeException(); }
  }
  static public  class GetLocations implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    // not preceding
    public   GetLocations (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  }
  static public  class GetLocations$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockManagerMessages.GetLocations> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetLocations$ MODULE$ = null;
    public   GetLocations$ ()  { throw new RuntimeException(); }
  }
  static public  class GetLocationsAndStatus implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  java.lang.String requesterHost ()  { throw new RuntimeException(); }
    // not preceding
    public   GetLocationsAndStatus (org.apache.spark.storage.BlockId blockId, java.lang.String requesterHost)  { throw new RuntimeException(); }
  }
  static public  class GetLocationsAndStatus$ extends scala.runtime.AbstractFunction2<org.apache.spark.storage.BlockId, java.lang.String, org.apache.spark.storage.BlockManagerMessages.GetLocationsAndStatus> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetLocationsAndStatus$ MODULE$ = null;
    public   GetLocationsAndStatus$ ()  { throw new RuntimeException(); }
  }
  /**
   * The response message of <code>GetLocationsAndStatus</code> request.
   * <p>
   * param:  localDirs if it is persisted-to-disk on the same host as the requester executor is
   *                  running on then localDirs will be Some and the cached data will be in a file
   *                  in one of those dirs, otherwise it is None.
   */
  static public  class BlockLocationsAndStatus implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> locations ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockStatus status ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String[]> localDirs ()  { throw new RuntimeException(); }
    // not preceding
    public   BlockLocationsAndStatus (scala.collection.Seq<org.apache.spark.storage.BlockManagerId> locations, org.apache.spark.storage.BlockStatus status, scala.Option<java.lang.String[]> localDirs)  { throw new RuntimeException(); }
  }
  static public  class BlockLocationsAndStatus$ extends scala.runtime.AbstractFunction3<scala.collection.Seq<org.apache.spark.storage.BlockManagerId>, org.apache.spark.storage.BlockStatus, scala.Option<java.lang.String[]>, org.apache.spark.storage.BlockManagerMessages.BlockLocationsAndStatus> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BlockLocationsAndStatus$ MODULE$ = null;
    public   BlockLocationsAndStatus$ ()  { throw new RuntimeException(); }
  }
  static public  class GetLocationsMultipleBlockIds implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId[] blockIds ()  { throw new RuntimeException(); }
    // not preceding
    public   GetLocationsMultipleBlockIds (org.apache.spark.storage.BlockId[] blockIds)  { throw new RuntimeException(); }
  }
  static public  class GetLocationsMultipleBlockIds$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockId[], org.apache.spark.storage.BlockManagerMessages.GetLocationsMultipleBlockIds> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetLocationsMultipleBlockIds$ MODULE$ = null;
    public   GetLocationsMultipleBlockIds$ ()  { throw new RuntimeException(); }
  }
  static public  class GetPeers implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    // not preceding
    public   GetPeers (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  }
  static public  class GetPeers$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockManagerMessages.GetPeers> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetPeers$ MODULE$ = null;
    public   GetPeers$ ()  { throw new RuntimeException(); }
  }
  static public  class GetExecutorEndpointRef implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    // not preceding
    public   GetExecutorEndpointRef (java.lang.String executorId)  { throw new RuntimeException(); }
  }
  static public  class GetExecutorEndpointRef$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.storage.BlockManagerMessages.GetExecutorEndpointRef> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetExecutorEndpointRef$ MODULE$ = null;
    public   GetExecutorEndpointRef$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveExecutor implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  java.lang.String execId ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveExecutor (java.lang.String execId)  { throw new RuntimeException(); }
  }
  static public  class RemoveExecutor$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.storage.BlockManagerMessages.RemoveExecutor> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveExecutor$ MODULE$ = null;
    public   RemoveExecutor$ ()  { throw new RuntimeException(); }
  }
  static public  class StopBlockManagerMaster$ implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StopBlockManagerMaster$ MODULE$ = null;
    public   StopBlockManagerMaster$ ()  { throw new RuntimeException(); }
  }
  static public  class GetMemoryStatus$ implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetMemoryStatus$ MODULE$ = null;
    public   GetMemoryStatus$ ()  { throw new RuntimeException(); }
  }
  static public  class GetStorageStatus$ implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetStorageStatus$ MODULE$ = null;
    public   GetStorageStatus$ ()  { throw new RuntimeException(); }
  }
  static public  class DecommissionBlockManagers implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  scala.collection.Seq<java.lang.String> executorIds ()  { throw new RuntimeException(); }
    // not preceding
    public   DecommissionBlockManagers (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  }
  static public  class DecommissionBlockManagers$ extends scala.runtime.AbstractFunction1<scala.collection.Seq<java.lang.String>, org.apache.spark.storage.BlockManagerMessages.DecommissionBlockManagers> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DecommissionBlockManagers$ MODULE$ = null;
    public   DecommissionBlockManagers$ ()  { throw new RuntimeException(); }
  }
  static public  class GetReplicateInfoForRDDBlocks implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    // not preceding
    public   GetReplicateInfoForRDDBlocks (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  }
  static public  class GetReplicateInfoForRDDBlocks$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockManagerMessages.GetReplicateInfoForRDDBlocks> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetReplicateInfoForRDDBlocks$ MODULE$ = null;
    public   GetReplicateInfoForRDDBlocks$ ()  { throw new RuntimeException(); }
  }
  static public  class GetBlockStatus implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  boolean askStorageEndpoints ()  { throw new RuntimeException(); }
    // not preceding
    public   GetBlockStatus (org.apache.spark.storage.BlockId blockId, boolean askStorageEndpoints)  { throw new RuntimeException(); }
  }
  static public  class GetBlockStatus$ extends scala.runtime.AbstractFunction2<org.apache.spark.storage.BlockId, java.lang.Object, org.apache.spark.storage.BlockManagerMessages.GetBlockStatus> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetBlockStatus$ MODULE$ = null;
    public   GetBlockStatus$ ()  { throw new RuntimeException(); }
  }
  static public  class GetMatchingBlockIds implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object> filter ()  { throw new RuntimeException(); }
    public  boolean askStorageEndpoints ()  { throw new RuntimeException(); }
    // not preceding
    public   GetMatchingBlockIds (scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object> filter, boolean askStorageEndpoints)  { throw new RuntimeException(); }
  }
  static public  class GetMatchingBlockIds$ extends scala.runtime.AbstractFunction2<scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object>, java.lang.Object, org.apache.spark.storage.BlockManagerMessages.GetMatchingBlockIds> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetMatchingBlockIds$ MODULE$ = null;
    public   GetMatchingBlockIds$ ()  { throw new RuntimeException(); }
  }
  static public  class BlockManagerHeartbeat implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    // not preceding
    public   BlockManagerHeartbeat (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  }
  static public  class BlockManagerHeartbeat$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockManagerMessages.BlockManagerHeartbeat> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BlockManagerHeartbeat$ MODULE$ = null;
    public   BlockManagerHeartbeat$ ()  { throw new RuntimeException(); }
  }
  static public  class IsExecutorAlive implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    // not preceding
    public   IsExecutorAlive (java.lang.String executorId)  { throw new RuntimeException(); }
  }
  static public  class IsExecutorAlive$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.storage.BlockManagerMessages.IsExecutorAlive> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IsExecutorAlive$ MODULE$ = null;
    public   IsExecutorAlive$ ()  { throw new RuntimeException(); }
  }
  static public  class GetShufflePushMergerLocations implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  int numMergersNeeded ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Set<java.lang.String> hostsToFilter ()  { throw new RuntimeException(); }
    // not preceding
    public   GetShufflePushMergerLocations (int numMergersNeeded, scala.collection.immutable.Set<java.lang.String> hostsToFilter)  { throw new RuntimeException(); }
  }
  static public  class GetShufflePushMergerLocations$ extends scala.runtime.AbstractFunction2<java.lang.Object, scala.collection.immutable.Set<java.lang.String>, org.apache.spark.storage.BlockManagerMessages.GetShufflePushMergerLocations> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetShufflePushMergerLocations$ MODULE$ = null;
    public   GetShufflePushMergerLocations$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveShufflePushMergerLocation implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  java.lang.String host ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveShufflePushMergerLocation (java.lang.String host)  { throw new RuntimeException(); }
  }
  static public  class RemoveShufflePushMergerLocation$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.storage.BlockManagerMessages.RemoveShufflePushMergerLocation> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveShufflePushMergerLocation$ MODULE$ = null;
    public   RemoveShufflePushMergerLocation$ ()  { throw new RuntimeException(); }
  }
  static public  interface ToBlockManagerMasterStorageEndpoint {
  }
  static public  interface ToBlockManagerMaster {
  }
}
