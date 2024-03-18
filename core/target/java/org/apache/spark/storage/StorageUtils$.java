package org.apache.spark.storage;
/** Helper methods for storage-related objects. */
public  class StorageUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StorageUtils$ MODULE$ = null;
  public   StorageUtils$ ()  { throw new RuntimeException(); }
  /**
   * Attempt to clean up a ByteBuffer if it is direct or memory-mapped. This uses an *unsafe* Sun
   * API that will cause errors if one attempts to read from the disposed buffer. However, neither
   * the bytes allocated to direct buffers nor file descriptors opened for memory-mapped buffers put
   * pressure on the garbage collector. Waiting for garbage collection may lead to the depletion of
   * off-heap memory or huge numbers of open files. There's unfortunately no standard API to
   * manually dispose of these kinds of buffers.
   * @param buffer (undocumented)
   */
  public  void dispose (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  /**
   * Get the port used by the external shuffle service. In Yarn mode, this may be already be
   * set through the Hadoop configuration as the server is launched in the Yarn NM.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  int externalShuffleServicePort (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
