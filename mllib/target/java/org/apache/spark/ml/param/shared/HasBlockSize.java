package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param blockSize. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasBlockSize extends org.apache.spark.ml.param.Params {
  /**
   * Param for block size for stacking input data in matrices. Data is stacked within partitions. If block size is more than remaining data in a partition then it is adjusted to the size of this data..
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam blockSize ()  ;
  /** @group expertGetParam */
  public  int getBlockSize ()  ;
}
