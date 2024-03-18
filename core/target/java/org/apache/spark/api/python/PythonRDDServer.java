package org.apache.spark.api.python;
/**
 * Helper for making RDD[Array[Byte} from some python data, by reading the data from python
 * over a socket.  This is used in preference to writing data to a file when encryption is enabled.
 */
 abstract class PythonRDDServer extends org.apache.spark.security.SocketAuthServer<org.apache.spark.api.java.JavaRDD<byte[]>> {
  public   PythonRDDServer ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> handleConnection (java.net.Socket sock)  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.rdd.RDD<byte[]> streamToRDD (java.io.InputStream input)  ;
}
