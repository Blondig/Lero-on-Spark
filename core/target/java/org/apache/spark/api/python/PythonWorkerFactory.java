package org.apache.spark.api.python;
  class PythonWorkerFactory implements org.apache.spark.internal.Logging {
  static public  int PROCESS_WAIT_TIMEOUT_MS ()  { throw new RuntimeException(); }
  static public  long IDLE_WORKER_TIMEOUT_NS ()  { throw new RuntimeException(); }
  public   PythonWorkerFactory (java.lang.String pythonExec, scala.collection.immutable.Map<java.lang.String, java.lang.String> envVars)  { throw new RuntimeException(); }
  public  java.net.InetAddress daemonHost ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.net.Socket, scala.Option<java.lang.Object>> create ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void stopWorker (java.net.Socket worker)  { throw new RuntimeException(); }
  public  void releaseWorker (java.net.Socket worker)  { throw new RuntimeException(); }
}
