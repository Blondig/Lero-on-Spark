package org.apache.spark.api.python;
/**
 * A wrapper for a Python function, contains all necessary context to run the function in Python
 * runner.
 */
  class PythonFunction implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> command ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> envVars ()  { throw new RuntimeException(); }
  public  java.util.List<java.lang.String> pythonIncludes ()  { throw new RuntimeException(); }
  public  java.lang.String pythonExec ()  { throw new RuntimeException(); }
  public  java.lang.String pythonVer ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast>> broadcastVars ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.python.PythonAccumulatorV2 accumulator ()  { throw new RuntimeException(); }
  // not preceding
  public   PythonFunction (scala.collection.Seq<java.lang.Object> command, java.util.Map<java.lang.String, java.lang.String> envVars, java.util.List<java.lang.String> pythonIncludes, java.lang.String pythonExec, java.lang.String pythonVer, java.util.List<org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast>> broadcastVars, org.apache.spark.api.python.PythonAccumulatorV2 accumulator)  { throw new RuntimeException(); }
  public   PythonFunction (byte[] command, java.util.Map<java.lang.String, java.lang.String> envVars, java.util.List<java.lang.String> pythonIncludes, java.lang.String pythonExec, java.lang.String pythonVer, java.util.List<org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast>> broadcastVars, org.apache.spark.api.python.PythonAccumulatorV2 accumulator)  { throw new RuntimeException(); }
}
