package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param maxBlockSizeInMB (default: 0.0). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasMaxBlockSizeInMB extends org.apache.spark.ml.param.Params {
  /** @group expertGetParam */
  public  double getMaxBlockSizeInMB ()  ;
  /**
   * Param for Maximum memory in MB for stacking input data into blocks. Data is stacked within partitions. If more than remaining data size in a partition then it is adjusted to the data size. Default 0.0 represents choosing optimal value, depends on specific algorithm. Must be &amp;gt;= 0..
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam maxBlockSizeInMB ()  ;
}
