package org.apache.spark.sql.execution.datasources;
/**
 * A trait for classes that are capable of collecting statistics on data that's being processed by
 * a single write task in {@link FileFormatWriter} - i.e. there should be one instance per executor.
 * <p>
 * newPartition event is only triggered if the relation to be written out is partitioned.
 */
public  interface WriteTaskStatsTracker {
  /**
   * Process the fact that a file is finished to be written and closed.
   * @param filePath Path of the file.
   */
  public  void closeFile (java.lang.String filePath)  ;
  /**
   * Returns the final statistics computed so far.
   * @param taskCommitTime Time of committing the task.
   * @note This may only be called once. Further use of the object may lead to undefined behavior.
   * @return An object of subtype of {@link WriteTaskStats}, to be sent to the driver.
   */
  public  org.apache.spark.sql.execution.datasources.WriteTaskStats getFinalStats (long taskCommitTime)  ;
  /**
   * Process the fact that a new file is about to be written.
   * @param filePath Path of the file into which future rows will be written.
   */
  public  void newFile (java.lang.String filePath)  ;
  /**
   * Process the fact that a new partition is about to be written.
   * Only triggered when the relation is partitioned by a (non-empty) sequence of columns.
   * @param partitionValues The values that define this new partition.
   */
  public  void newPartition (org.apache.spark.sql.catalyst.InternalRow partitionValues)  ;
  /**
   * Process the fact that a new row to update the tracked statistics accordingly.
   * @note Keep in mind that any overhead here is per-row, obviously,
   *       so implementations should be as lightweight as possible.
   * @param filePath Path of the file which the row is written to.
   * @param row Current data row to be processed.
   */
  public  void newRow (java.lang.String filePath, org.apache.spark.sql.catalyst.InternalRow row)  ;
}
