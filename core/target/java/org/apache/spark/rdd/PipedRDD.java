package org.apache.spark.rdd;
/**
 * An RDD that pipes the contents of each parent partition through an external command
 * (printing them one per line) and returns the output as a collection of strings.
 */
  class PipedRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<java.lang.String> {
  /**
   * A FilenameFilter that accepts anything that isn't equal to the name passed in.
   * param:  filterName of file or directory to leave out
   */
  public  class NotEqualsFileNameFilter implements java.io.FilenameFilter {
    public   NotEqualsFileNameFilter (java.lang.String filterName)  { throw new RuntimeException(); }
    public  boolean accept (java.io.File dir, java.lang.String name)  { throw new RuntimeException(); }
  }
  static public  scala.collection.Seq<java.lang.String> tokenize (java.lang.String command)  { throw new RuntimeException(); }
  static public  java.lang.String STDIN_WRITER_THREAD_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String STDERR_READER_THREAD_PREFIX ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PipedRDD (org.apache.spark.rdd.RDD<T> prev, scala.collection.Seq<java.lang.String> command, scala.collection.Map<java.lang.String, java.lang.String> envVars, scala.Function1<scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printPipeContext, scala.Function2<T, scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printRDDElement, boolean separateWorkingDir, int bufferSize, java.lang.String encoding, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.String> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
