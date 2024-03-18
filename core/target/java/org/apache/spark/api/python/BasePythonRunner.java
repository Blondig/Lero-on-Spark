package org.apache.spark.api.python;
/**
 * A helper class to run Python mapPartition/UDFs in Spark.
 * <p>
 * funcs is a list of independent Python functions, each one of them is a list of chained Python
 * functions (from bottom to top).
 */
 abstract class BasePythonRunner<IN extends java.lang.Object, OUT extends java.lang.Object> implements org.apache.spark.internal.Logging {
  /**
   * The thread responsible for writing the data from the PythonRDD's parent iterator to the
   * Python process.
   */
  public abstract class WriterThread extends java.lang.Thread {
    public   WriterThread (org.apache.spark.SparkEnv env, java.net.Socket worker, scala.collection.Iterator<IN> inputIterator, int partitionIndex, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
    /**
     * Gateway to call BarrierTaskContext methods.
     * @param requestMethod (undocumented)
     * @param sock (undocumented)
     * @param message (undocumented)
     */
    public  void barrierAndServe (int requestMethod, java.net.Socket sock, java.lang.String message)  { throw new RuntimeException(); }
    /** Contains the throwable thrown while writing the parent iterator to the Python process. */
    public  scala.Option<java.lang.Throwable> exception ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
    /**
     * Terminates the writer thread and waits for it to exit, ignoring any exceptions that may occur
     * due to cleanup.
     */
    public  void shutdownOnTaskCompletion ()  { throw new RuntimeException(); }
    /**
     * Writes a command section to the stream connected to the Python worker.
     * @param dataOut (undocumented)
     */
    protected abstract  void writeCommand (java.io.DataOutputStream dataOut)  ;
    /**
     * Writes input data to the stream connected to the Python worker.
     * @param dataOut (undocumented)
     */
    protected abstract  void writeIteratorToStream (java.io.DataOutputStream dataOut)  ;
    public  void writeUTF (java.lang.String str, java.io.DataOutputStream dataOut)  { throw new RuntimeException(); }
  }
  public abstract class ReaderIterator implements scala.collection.Iterator<OUT> {
    public   ReaderIterator (java.io.DataInputStream stream, org.apache.spark.api.python.BasePythonRunner<IN, OUT>.WriterThread writerThread, long startTime, org.apache.spark.SparkEnv env, java.net.Socket worker, scala.Option<java.lang.Object> pid, java.util.concurrent.atomic.AtomicBoolean releasedOrClosed, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
    protected  void handleEndOfDataSection ()  { throw new RuntimeException(); }
    protected  scala.PartialFunction<java.lang.Throwable, OUT> handleException ()  { throw new RuntimeException(); }
    protected  org.apache.spark.api.python.PythonException handlePythonException ()  { throw new RuntimeException(); }
    protected  void handleTimingData ()  { throw new RuntimeException(); }
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
   * It is necessary to have a monitor thread for python workers if the user cancels with
   * interrupts disabled. In that case we will need to explicitly kill the worker, otherwise the
   * threads can block indefinitely.
   */
  public  class MonitorThread extends java.lang.Thread {
    public   MonitorThread (org.apache.spark.SparkEnv env, java.net.Socket worker, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  /**
   * This thread monitors the WriterThread and kills it in case of deadlock.
   * <p>
   * A deadlock can arise if the task completes while the writer thread is sending input to the
   * Python process (e.g. due to the use of <code>take()</code>), and the Python process is still producing
   * output. When the inputs are sufficiently large, this can result in a deadlock due to the use of
   * blocking I/O (SPARK-38677). To resolve the deadlock, we need to close the socket.
   */
  public  class WriterMonitorThread extends java.lang.Thread {
    public   WriterMonitorThread (org.apache.spark.SparkEnv env, java.net.Socket worker, org.apache.spark.api.python.BasePythonRunner<IN, OUT>.WriterThread writerThread, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  public   BasePythonRunner (scala.collection.Seq<org.apache.spark.api.python.ChainedPythonFunctions> funcs, int evalType, int[][] argOffsets)  { throw new RuntimeException(); }
  protected  int bufferSize ()  { throw new RuntimeException(); }
  protected  long authSocketTimeout ()  { throw new RuntimeException(); }
  protected  boolean simplifiedTraceback ()  { throw new RuntimeException(); }
  protected  java.util.Map<java.lang.String, java.lang.String> envVars ()  { throw new RuntimeException(); }
  protected  java.lang.String pythonExec ()  { throw new RuntimeException(); }
  protected  java.lang.String pythonVer ()  { throw new RuntimeException(); }
  protected  org.apache.spark.api.python.PythonAccumulatorV2 accumulator ()  { throw new RuntimeException(); }
    scala.Option<java.net.ServerSocket> serverSocket ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<OUT> compute (scala.collection.Iterator<IN> inputIterator, int partitionIndex, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.api.python.BasePythonRunner<IN, OUT>.WriterThread newWriterThread (org.apache.spark.SparkEnv env, java.net.Socket worker, scala.collection.Iterator<IN> inputIterator, int partitionIndex, org.apache.spark.TaskContext context)  ;
  protected abstract  scala.collection.Iterator<OUT> newReaderIterator (java.io.DataInputStream stream, org.apache.spark.api.python.BasePythonRunner<IN, OUT>.WriterThread writerThread, long startTime, org.apache.spark.SparkEnv env, java.net.Socket worker, scala.Option<java.lang.Object> pid, java.util.concurrent.atomic.AtomicBoolean releasedOrClosed, org.apache.spark.TaskContext context)  ;
}
