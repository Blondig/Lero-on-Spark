package org.apache.spark.rdd;
/**
 * This holds file names of the current Spark task. This is used in HadoopRDD,
 * FileScanRDD, NewHadoopRDD and InputFileName function in Spark SQL.
 */
public  class InputFileBlockHolder {
  /**
   * Returns the holding file name or empty string if it is unknown.
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.UTF8String getInputFilePath ()  { throw new RuntimeException(); }
  /**
   * Returns the starting offset of the block currently being read, or -1 if it is unknown.
   * @return (undocumented)
   */
  static public  long getStartOffset ()  { throw new RuntimeException(); }
  /**
   * Returns the length of the block being read, or -1 if it is unknown.
   * @return (undocumented)
   */
  static public  long getLength ()  { throw new RuntimeException(); }
  /**
   * Sets the thread-local input block.
   * @param filePath (undocumented)
   * @param startOffset (undocumented)
   * @param length (undocumented)
   */
  static public  void set (java.lang.String filePath, long startOffset, long length)  { throw new RuntimeException(); }
  /**
   * Clears the input file block to default value.
   */
  static public  void unset ()  { throw new RuntimeException(); }
  /**
   * Initializes thread local by explicitly getting the value. It triggers ThreadLocal's
   * initialValue in the parent thread.
   */
  static public  void initialize ()  { throw new RuntimeException(); }
}
