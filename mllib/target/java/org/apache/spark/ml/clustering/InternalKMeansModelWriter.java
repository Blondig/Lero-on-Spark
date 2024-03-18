package org.apache.spark.ml.clustering;
/** A writer for KMeans that handles the "internal" (or default) format */
public  class InternalKMeansModelWriter implements org.apache.spark.ml.util.MLWriterFormat, org.apache.spark.ml.util.MLFormatRegister {
  public   InternalKMeansModelWriter ()  { throw new RuntimeException(); }
  public  java.lang.String format ()  { throw new RuntimeException(); }
  public  java.lang.String stageName ()  { throw new RuntimeException(); }
  public  void write (java.lang.String path, org.apache.spark.sql.SparkSession sparkSession, scala.collection.mutable.Map<java.lang.String, java.lang.String> optionMap, org.apache.spark.ml.PipelineStage stage)  { throw new RuntimeException(); }
}
