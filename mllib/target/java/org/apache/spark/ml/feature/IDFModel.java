package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link IDF}.
 */
public  class IDFModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.IDFModel> implements org.apache.spark.ml.feature.IDFBase, org.apache.spark.ml.util.MLWritable {
  static   class IDFModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   IDFModelWriter (org.apache.spark.ml.feature.IDFModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.IDFModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.IDFModel load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam minDocFreq ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
     IDFModel (java.lang.String uid, org.apache.spark.mllib.feature.IDFModel idfModel)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.IDFModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.IDFModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IDFModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  /** Returns the IDF vector. */
  public  org.apache.spark.ml.linalg.Vector idf ()  { throw new RuntimeException(); }
  /** Returns the document frequency */
  public  long[] docFreq ()  { throw new RuntimeException(); }
  /** Returns number of documents evaluated to compute idf */
  public  long numDocs ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
