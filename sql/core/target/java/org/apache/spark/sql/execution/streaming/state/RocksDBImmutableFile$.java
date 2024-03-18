package org.apache.spark.sql.execution.streaming.state;
public  class RocksDBImmutableFile$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RocksDBImmutableFile$ MODULE$ = null;
  public   RocksDBImmutableFile$ ()  { throw new RuntimeException(); }
  public  java.lang.String SST_FILES_DFS_SUBDIR ()  { throw new RuntimeException(); }
  public  java.lang.String LOG_FILES_DFS_SUBDIR ()  { throw new RuntimeException(); }
  public  java.lang.String LOG_FILES_LOCAL_SUBDIR ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.RocksDBImmutableFile apply (java.lang.String localFileName, java.lang.String dfsFileName, long sizeBytes)  { throw new RuntimeException(); }
  public  boolean isSstFile (java.lang.String fileName)  { throw new RuntimeException(); }
  public  boolean isLogFile (java.lang.String fileName)  { throw new RuntimeException(); }
  public  boolean isImmutableFile (java.io.File file)  { throw new RuntimeException(); }
}
