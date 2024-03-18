package org.apache.spark.api.r;
/**
 * An RDD that stores serialized R objects as Array[Byte].
 */
public  class RRDD<T extends java.lang.Object> extends org.apache.spark.api.r.BaseRRDD<T, byte[]> {
  static public  org.apache.spark.api.java.JavaSparkContext createSparkContext (java.lang.String master, java.lang.String appName, java.lang.String sparkHome, java.lang.String[] jars, java.util.Map<java.lang.Object, java.lang.Object> sparkEnvirMap, java.util.Map<java.lang.Object, java.lang.Object> sparkExecutorEnvMap)  { throw new RuntimeException(); }
  /**
   * Create an RRDD given a sequence of byte arrays. Used to create RRDD when <code>parallelize</code> is
   * called from R.
   * @param jsc (undocumented)
   * @param arr (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.java.JavaRDD<byte[]> createRDDFromArray (org.apache.spark.api.java.JavaSparkContext jsc, byte[][] arr)  { throw new RuntimeException(); }
  /**
   * Create an RRDD given a temporary file name. This is used to create RRDD when parallelize is
   * called on large R objects.
   * <p>
   * @param fileName name of temporary file on driver machine
   * @param parallelism number of slices defaults to 4
   * @param jsc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.java.JavaRDD<byte[]> createRDDFromFile (org.apache.spark.api.java.JavaSparkContext jsc, java.lang.String fileName, int parallelism)  { throw new RuntimeException(); }
  static   java.lang.Object[] serveToStream (java.lang.String threadName, scala.Function1<java.io.OutputStream, scala.runtime.BoxedUnit> writeFunc)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   RRDD (org.apache.spark.rdd.RDD<T> parent, byte[] func, java.lang.String deserializer, java.lang.String serializer, byte[] packageNames, java.lang.Object[] broadcastVars, scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.api.java.JavaRDD<byte[]> asJavaRDD ()  { throw new RuntimeException(); }
}
