package org.apache.spark.ml.feature;
/**
 * Converts a text document to a sparse vector of token counts.
 * param:  vocabulary An Array over terms. Only the terms in the vocabulary will be counted.
 */
public  class CountVectorizerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.CountVectorizerModel> implements org.apache.spark.ml.feature.CountVectorizerParams, org.apache.spark.ml.util.MLWritable {
  static   class CountVectorizerModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   CountVectorizerModelWriter (org.apache.spark.ml.feature.CountVectorizerModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.CountVectorizerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.CountVectorizerModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam vocabSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam minDF ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam maxDF ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam minTF ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam binary ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  java.lang.String[] vocabulary ()  { throw new RuntimeException(); }
  // not preceding
  public   CountVectorizerModel (java.lang.String uid, java.lang.String[] vocabulary)  { throw new RuntimeException(); }
  public   CountVectorizerModel (java.lang.String[] vocabulary)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizerModel setMinTF (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizerModel setBinary (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.CountVectorizerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
