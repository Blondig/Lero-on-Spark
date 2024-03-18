package org.apache.spark.api.python;
/**
 * A helper class to run Python mapPartition in Spark.
 */
  class PythonRunner extends org.apache.spark.api.python.BasePythonRunner<byte[], byte[]> {
  static public  java.util.concurrent.ConcurrentHashMap.KeySetView<scala.Tuple2<java.net.Socket, java.lang.Object>, java.lang.Boolean> runningMonitorThreads ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.python.PythonRunner apply (org.apache.spark.api.python.PythonFunction func)  { throw new RuntimeException(); }
  public   PythonRunner (scala.collection.Seq<org.apache.spark.api.python.ChainedPythonFunctions> funcs)  { throw new RuntimeException(); }
  protected  org.apache.spark.api.python.BasePythonRunner<byte[], byte[]>.WriterThread newWriterThread (org.apache.spark.SparkEnv env, java.net.Socket worker, scala.collection.Iterator<byte[]> inputIterator, int partitionIndex, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  scala.collection.Iterator<byte[]> newReaderIterator (java.io.DataInputStream stream, org.apache.spark.api.python.BasePythonRunner<byte[], byte[]>.WriterThread writerThread, long startTime, org.apache.spark.SparkEnv env, java.net.Socket worker, scala.Option<java.lang.Object> pid, java.util.concurrent.atomic.AtomicBoolean releasedOrClosed, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
