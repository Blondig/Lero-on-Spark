package org.apache.spark.ml.r;
/**
 * This is the Scala stub of SparkR read.ml. It will dispatch the call to corresponding
 * model wrapper loading function according the class name extracted from rMetadata of the path.
 */
public  class RWrappers {
  static public  java.lang.Object load (java.lang.String path)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  static protected final  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  static protected final  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> session (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.SparkSession> org$apache$spark$ml$util$BaseReadWrite$$optionSparkSession ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$ml$util$BaseReadWrite$$optionSparkSession_$eq (scala.Option<org.apache.spark.sql.SparkSession> x$1)  { throw new RuntimeException(); }
}
