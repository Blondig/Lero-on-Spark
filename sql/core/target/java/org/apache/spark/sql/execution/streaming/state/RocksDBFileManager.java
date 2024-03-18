package org.apache.spark.sql.execution.streaming.state;
/**
 * Class responsible for syncing RocksDB checkpoint files from local disk to DFS.
 * For each version, checkpoint is saved in specific directory structure that allows successive
 * versions to reuse to SST data files and archived log files. This allows each commit to be
 * incremental, only new SST files and archived log files generated by RocksDB will be uploaded.
 * The directory structures on local disk and in DFS are as follows.
 * <p>
 * Local checkpoint dir structure
 * ------------------------------
 * RocksDB generates a bunch of files in the local checkpoint directory. The most important among
 * them are the SST files; they are the actual log structured data files. Rest of the files contain
 * the metadata necessary for RocksDB to read the SST files and start from the checkpoint.
 * Note that the SST files are hard links to files in the RocksDB's working directory, and therefore
 * successive checkpoints can share some of the SST files. So these SST files have to be copied to
 * DFS in shared directory such that different committed versions can save them.
 * <p>
 * We consider both SST files and archived log files as immutable files which can be shared between
 * different checkpoints.
 * <p>
 *    localCheckpointDir
 *                  |
 *                  +-- OPTIONS-000005
 *                  +-- MANIFEST-000008
 *                  +-- CURRENT
 *                  +-- 00007.sst
 *                  +-- 00011.sst
 *                  +-- archive
 *                  |     +-- 00008.log
 *                  |     +-- 00013.log
 *                  ...
 * <p>
 * DFS directory structure after saving to DFS as version 10
 * -----------------------------------------------------------
 * The SST and archived log files are given unique file names and copied to the shared subdirectory.
 * Every version maintains a mapping of local immutable file name to the unique file name in DFS.
 * This mapping is saved in a JSON file (named <code>metadata</code>), which is zipped along with other
 * checkpoint files into a single file <code>[version].zip</code>.
 * <p>
 *    dfsRootDir
 *           |
 *           +-- SSTs
 *           |      +-- 00007-[uuid1].sst
 *           |      +-- 00011-[uuid2].sst
 *           +-- logs
 *           |      +-- 00008-[uuid3].log
 *           |      +-- 00013-[uuid4].log
 *           +-- 10.zip
 *           |      +-- metadata         <--- contains mapping between 00007.sst and [uuid1].sst,
 *                                            and the mapping between 00008.log and [uuid3].log
 *           |      +-- OPTIONS-000005
 *           |      +-- MANIFEST-000008
 *           |      +-- CURRENT
 *           |      ...
 *           |
 *           +-- 9.zip
 *           +-- 8.zip
 *           ...
 * <p>
 * Note the following.
 * - Each [version].zip is a complete description of all the data and metadata needed to recover
 *   a RocksDB instance at the corresponding version. The SST files and log files are not included
 *   in the zip files, they can be shared cross different versions. This is unlike the
 *   [version].delta files of HDFSBackedStateStore where previous delta files needs to be read
 *   to be recovered.
 * - This is safe wrt speculatively executed tasks running concurrently in different executors
 *   as each task would upload a different copy of the generated immutable files and
 *   atomically update the [version].zip.
 * - Immutable files are identified uniquely based on their file name and file size.
 * - Immutable files can be reused only across adjacent checkpoints/versions.
 * - This class is thread-safe. Specifically, it is safe to concurrently delete old files from a
 *   different thread than the task thread saving files.
 * <p>
 * param:  dfsRootDir  Directory where the [version].zip files will be stored
 * param:  localTempDir Local directory for temporary work
 * param:  hadoopConf   Hadoop configuration for talking to DFS
 * param:  loggingId    Id that will be prepended in logs for isolating concurrent RocksDBs
 */
public  class RocksDBFileManager implements org.apache.spark.internal.Logging {
  public   RocksDBFileManager (java.lang.String dfsRootDir, java.io.File localTempDir, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String loggingId)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.RocksDBFileManagerMetrics latestLoadCheckpointMetrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.RocksDBFileManagerMetrics latestSaveCheckpointMetrics ()  { throw new RuntimeException(); }
  /** Save all the files in given local checkpoint directory as a committed version in DFS */
  public  void saveCheckpointToDfs (java.io.File checkpointDir, long version, long numKeys)  { throw new RuntimeException(); }
  /**
   * Load all necessary files for specific checkpoint version from DFS to given local directory.
   * If version is 0, then it will delete all files in the directory. For other versions, it
   * ensures that only the exact files generated during checkpointing will be present in the
   * local directory.
   * @param version (undocumented)
   * @param localDir (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.state.RocksDBCheckpointMetadata loadCheckpointFromDfs (long version, java.io.File localDir)  { throw new RuntimeException(); }
  /** Get the latest version available in the DFS directory. If no data present, it returns 0. */
  public  long getLatestVersion ()  { throw new RuntimeException(); }
  /**
   * Delete old versions by deleting the associated version and SST files.
   * At a high-level, this method finds which versions to delete, and which SST files that were
   * last used in those versions. It's safe to delete these SST files because a SST file can
   * be reused only in successive versions. Therefore, if a SST file F was last used in version
   * V, then it won't be used in version V+1 or later, and if version V can be deleted, then
   * F can safely be deleted as well.
   * <p>
   * To find old files, it does the following.
   * - List all the existing [version].zip files
   * - Find the min version that needs to be retained based on the given <code>numVersionsToRetain</code>.
   * - Accordingly decide which versions should be deleted.
   * - Resolve all SSTs files of all the existing versions, if not already resolved.
   * - Find what was the latest version in which each SST file was used.
   * - Delete the files that were last used in the to-be-deleted versions as we will not
   *   need those files any more.
   * <p>
   * Note that it only deletes files that it knows are safe to delete.
   * It may not delete the following files.
   * - Partially written SST files
   * - SST files that were used in a version, but that version got overwritten with a different
   *   set of SST files.
   * @param numVersionsToRetain (undocumented)
   */
  public  void deleteOldVersions (int numVersionsToRetain)  { throw new RuntimeException(); }
  protected  java.lang.String logName ()  { throw new RuntimeException(); }
}