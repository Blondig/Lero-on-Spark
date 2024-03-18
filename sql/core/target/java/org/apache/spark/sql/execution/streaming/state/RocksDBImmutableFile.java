package org.apache.spark.sql.execution.streaming.state;
/**
 * A RocksDBImmutableFile maintains a mapping between a local RocksDB file name and the name of
 * its copy on DFS. Since these files are immutable, their DFS copies can be reused.
 */
public  interface RocksDBImmutableFile {
  public  java.lang.String localFileName ()  ;
  public  java.lang.String dfsFileName ()  ;
  public  long sizeBytes ()  ;
  /**
   * Whether another local file is same as the file described by this class.
   * A file is same only when the name and the size are same.
   * @param otherFile (undocumented)
   * @return (undocumented)
   */
  public  boolean isSameFile (java.io.File otherFile)  ;
}
