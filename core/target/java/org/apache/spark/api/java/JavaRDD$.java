package org.apache.spark.api.java;
public  class JavaRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JavaRDD$ MODULE$ = null;
  public   JavaRDD$ ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.api.java.JavaRDD<T> fromRDD (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.rdd.RDD<T> toRDD (org.apache.spark.api.java.JavaRDD<T> rdd)  { throw new RuntimeException(); }
    org.apache.spark.api.java.JavaRDD<byte[]> readRDDFromFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String filename, int parallelism)  { throw new RuntimeException(); }
    org.apache.spark.api.java.JavaRDD<byte[]> readRDDFromInputStream (org.apache.spark.SparkContext sc, java.io.InputStream in, int parallelism)  { throw new RuntimeException(); }
}
