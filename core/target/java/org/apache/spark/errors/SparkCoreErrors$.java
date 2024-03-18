package org.apache.spark.errors;
/**
 * Object for grouping error messages from (most) exceptions thrown during query execution.
 */
public  class SparkCoreErrors$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkCoreErrors$ MODULE$ = null;
  public   SparkCoreErrors$ ()  { throw new RuntimeException(); }
  public  java.lang.Throwable unexpectedPy4JServerError (java.lang.Object other)  { throw new RuntimeException(); }
  public  java.lang.Throwable eofExceptionWhileReadPortNumberError (java.lang.String daemonModule, scala.Option<java.lang.Object> daemonExitValue)  { throw new RuntimeException(); }
  public  java.lang.Throwable unsupportedDataTypeError (Object other)  { throw new RuntimeException(); }
  public  java.lang.Throwable rddBlockNotFoundError (org.apache.spark.storage.BlockId blockId, int id)  { throw new RuntimeException(); }
  public  java.lang.Throwable blockHaveBeenRemovedError (java.lang.String string)  { throw new RuntimeException(); }
  public  java.lang.Throwable histogramOnEmptyRDDOrContainingInfinityOrNaNError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable emptyRDDError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable pathNotSupportedError (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.Throwable checkpointRDDBlockIdNotFoundError (org.apache.spark.storage.RDDBlockId rddBlockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable endOfStreamError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotUseMapSideCombiningWithArrayKeyError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable hashPartitionerCannotPartitionArrayKeyError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable reduceByKeyLocallyNotSupportArrayKeysError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable rddLacksSparkContextError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotChangeStorageLevelError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable canOnlyZipRDDsWithSamePartitionSizeError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable emptyCollectionError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable countByValueApproxNotSupportArraysError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable checkpointDirectoryHasNotBeenSetInSparkContextError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidCheckpointFileError (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  java.lang.Throwable failToCreateCheckpointPathError (org.apache.hadoop.fs.Path checkpointDirPath)  { throw new RuntimeException(); }
  public  java.lang.Throwable checkpointRDDHasDifferentNumberOfPartitionsFromOriginalRDDError (int originalRDDId, int originalRDDLength, int newRDDId, int newRDDLength)  { throw new RuntimeException(); }
  public  java.lang.Throwable checkpointFailedToSaveError (int task, org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  java.lang.Throwable mustSpecifyCheckpointDirError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable askStandaloneSchedulerToShutDownExecutorsError (java.lang.Exception e)  { throw new RuntimeException(); }
  public  java.lang.Throwable stopStandaloneSchedulerDriverEndpointError (java.lang.Exception e)  { throw new RuntimeException(); }
  public  java.lang.Throwable noExecutorIdleError (java.lang.String id)  { throw new RuntimeException(); }
  public  java.lang.Throwable barrierStageWithRDDChainPatternError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable barrierStageWithDynamicAllocationError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable numPartitionsGreaterThanMaxNumConcurrentTasksError (int numPartitions, int maxNumConcurrentTasks)  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotRunSubmitMapStageOnZeroPartitionRDDError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable accessNonExistentAccumulatorError (long id)  { throw new RuntimeException(); }
  public  java.lang.Throwable sendResubmittedTaskStatusForShuffleMapStagesOnlyError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable nonEmptyEventQueueAfterTimeoutError (long timeoutMillis)  { throw new RuntimeException(); }
  public  java.lang.Throwable durationCalledOnUnfinishedTaskError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable unrecognizedSchedulerModePropertyError (java.lang.String schedulerModeProperty, java.lang.String schedulingModeConf)  { throw new RuntimeException(); }
  public  java.lang.Throwable sparkError (java.lang.String errorMsg)  { throw new RuntimeException(); }
  public  java.lang.Throwable clusterSchedulerError (java.lang.String message)  { throw new RuntimeException(); }
  public  java.lang.Throwable failToSerializeTaskError (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.Throwable unrecognizedBlockIdError (java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.Throwable taskHasNotLockedBlockError (long currentTaskAttemptId, org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable blockDoesNotExistError (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotSaveBlockOnDecommissionedExecutorError (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable waitingForReplicationToFinishError (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.Throwable unableToRegisterWithExternalShuffleServerError (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.Throwable waitingForAsyncReregistrationError (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.Throwable unexpectedShuffleBlockWithUnsupportedResolverError (org.apache.spark.shuffle.ShuffleManager shuffleManager, org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable failToStoreBlockOnBlockManagerError (org.apache.spark.storage.BlockManagerId blockManagerId, org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable readLockedBlockNotFoundError (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable failToGetBlockWithLockError (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable blockNotFoundError (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable interruptedError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable blockStatusQueryReturnedNullError (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  java.lang.Throwable unexpectedBlockManagerMasterEndpointResultError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable failToCreateDirectoryError (java.lang.String path, int maxAttempts)  { throw new RuntimeException(); }
  public  java.lang.Throwable unsupportedOperationError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable noSuchElementError ()  { throw new RuntimeException(); }
  public  java.lang.Throwable fetchFailedError (org.apache.spark.storage.BlockManagerId bmAddress, int shuffleId, long mapId, int mapIndex, int reduceId, java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  java.lang.Throwable failToGetNonShuffleBlockError (org.apache.spark.storage.BlockId blockId, java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.Throwable graphiteSinkInvalidProtocolError (java.lang.String invalidProtocol)  { throw new RuntimeException(); }
  public  java.lang.Throwable graphiteSinkPropertyMissingError (java.lang.String missingProperty)  { throw new RuntimeException(); }
}
