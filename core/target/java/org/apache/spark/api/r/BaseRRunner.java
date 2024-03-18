package org.apache.spark.api.r;
/**
 * A helper class to run R UDFs in Spark.
 */
 abstract class BaseRRunner<IN extends java.lang.Object, OUT extends java.lang.Object> implements org.apache.spark.internal.Logging {
  public abstract class ReaderIterator implements scala.collection.Iterator<OUT> {
    public   ReaderIterator (java.io.DataInputStream stream, org.apache.spark.api.r.BufferedStreamThread errThread)  { throw new RuntimeException(); }
    protected  boolean eos ()  { throw new RuntimeException(); }
    protected  scala.PartialFunction<java.lang.Throwable, OUT> handleException ()  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  OUT next ()  { throw new RuntimeException(); }
    /**
     * Reads next object from the stream.
     * When the stream reaches end of data, needs to process the following sections,
     * and then returns null.
     * @return (undocumented)
     */
    protected abstract  OUT read ()  ;
  }
  /**
   * The thread responsible for writing the iterator to the R process.
   */
  public abstract class WriterThread extends java.lang.Thread {
    public   WriterThread (java.io.OutputStream output, scala.collection.Iterator<IN> iter, int partitionIndex)  { throw new RuntimeException(); }
    // not preceding
    protected  java.io.DataOutputStream dataOut ()  { throw new RuntimeException(); }
    // not preceding
    protected  java.io.PrintStream printOut ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
    /**
     * Writes input data to the stream connected to the R worker.
     * @param dataOut (undocumented)
     */
    protected abstract  void writeIteratorToStream (java.io.DataOutputStream dataOut)  ;
  }
  /**
   * ProcessBuilder used to launch worker R processes.
   * @param port (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.r.BufferedStreamThread createRWorker (int port)  { throw new RuntimeException(); }
  public   BaseRRunner (byte[] func, java.lang.String deserializer, java.lang.String serializer, byte[] packageNames, org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars, int numPartitions, boolean isDataFrame, java.lang.String[] colNames, int mode)  { throw new RuntimeException(); }
  protected  double bootTime ()  { throw new RuntimeException(); }
  protected  java.io.DataInputStream dataStream ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<OUT> compute (scala.collection.Iterator<IN> inputIterator, int partitionIndex)  { throw new RuntimeException(); }
  /**
   * Creates an iterator that reads data from R process.
   * @param dataStream (undocumented)
   * @param errThread (undocumented)
   * @return (undocumented)
   */
  protected abstract  org.apache.spark.api.r.BaseRRunner<IN, OUT>.ReaderIterator newReaderIterator (java.io.DataInputStream dataStream, org.apache.spark.api.r.BufferedStreamThread errThread)  ;
  /**
   * Start a thread to write RDD data to the R process.
   * @param output (undocumented)
   * @param iter (undocumented)
   * @param partitionIndex (undocumented)
   * @return (undocumented)
   */
  protected abstract  org.apache.spark.api.r.BaseRRunner<IN, OUT>.WriterThread newWriterThread (java.io.OutputStream output, scala.collection.Iterator<IN> iter, int partitionIndex)  ;
}
