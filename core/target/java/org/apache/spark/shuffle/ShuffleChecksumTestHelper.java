package org.apache.spark.shuffle;
public  interface ShuffleChecksumTestHelper {
  /**
   * Ensure that the checksum values are consistent between write and read side.
   * @param numPartition (undocumented)
   * @param algorithm (undocumented)
   * @param checksum (undocumented)
   * @param data (undocumented)
   * @param index (undocumented)
   */
  public  void compareChecksums (int numPartition, java.lang.String algorithm, java.io.File checksum, java.io.File data, java.io.File index)  ;
}
