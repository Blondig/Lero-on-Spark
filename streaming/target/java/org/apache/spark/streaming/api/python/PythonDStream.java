package org.apache.spark.streaming.api.python;
/**
 * Base class for PythonDStream with some common methods
 */
 abstract class PythonDStream extends org.apache.spark.streaming.dstream.DStream<byte[]> {
  /**
   * cannot access PythonTransformFunctionSerializer.register() via Py4j
   * Py4JError: PythonTransformFunctionSerializerregister does not exist in the JVM
   * @param ser (undocumented)
   */
  static public  void registerSerializer (org.apache.spark.streaming.api.python.PythonTransformFunctionSerializer ser)  { throw new RuntimeException(); }
  /**
   * helper function for DStream.foreachRDD(),
   * cannot be <code>foreachRDD</code>, it will confusing py4j
   * @param jdstream (undocumented)
   * @param pfunc (undocumented)
   */
  static public  void callForeachRDD (org.apache.spark.streaming.api.java.JavaDStream<byte[]> jdstream, org.apache.spark.streaming.api.python.PythonTransformFunction pfunc)  { throw new RuntimeException(); }
  /**
   * convert list of RDD into queue of RDDs, for ssc.queueStream()
   * @param rdds (undocumented)
   * @return (undocumented)
   */
  static public  java.util.Queue<org.apache.spark.api.java.JavaRDD<byte[]>> toRDDQueue (java.util.ArrayList<org.apache.spark.api.java.JavaRDD<byte[]>> rdds)  { throw new RuntimeException(); }
  /**
   * Stop {@link StreamingContext} if the Python process crashes (E.g., OOM) in case the user cannot
   * stop it in the Python side.
   * @param e (undocumented)
   */
  static public  void stopStreamingContextIfPythonProcessIsDead (java.lang.Throwable e)  { throw new RuntimeException(); }
  public   PythonDStream (org.apache.spark.streaming.dstream.DStream<?> parent, org.apache.spark.streaming.api.python.PythonTransformFunction pfunc)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.python.TransformFunction func ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaDStream<byte[]> asJavaDStream ()  { throw new RuntimeException(); }
}
