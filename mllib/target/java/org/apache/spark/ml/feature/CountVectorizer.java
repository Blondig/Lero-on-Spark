package org.apache.spark.ml.feature;
/**
 * Extracts a vocabulary from document collections and generates a {@link CountVectorizerModel}.
 */
public  class CountVectorizer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.CountVectorizerModel> implements org.apache.spark.ml.feature.CountVectorizerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.CountVectorizer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam vocabSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam minDF ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam maxDF ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam minTF ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam binary ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   CountVectorizer (java.lang.String uid)  { throw new RuntimeException(); }
  public   CountVectorizer ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setVocabSize (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setMinDF (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setMaxDF (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setMinTF (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setBinary (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.CountVectorizerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.CountVectorizer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
