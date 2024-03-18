package org.apache.spark.api.r;
/**
 * Helper for making RDD[Array[Byte} from some R data, by reading the data from R
 * over a socket. This is used in preference to writing data to a file when encryption is enabled.
 */
  class RParallelizeServer extends org.apache.spark.security.SocketAuthServer<org.apache.spark.api.java.JavaRDD<byte[]>> {
  public   RParallelizeServer (org.apache.spark.api.java.JavaSparkContext sc, int parallelism)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> handleConnection (java.net.Socket sock)  { throw new RuntimeException(); }
}
