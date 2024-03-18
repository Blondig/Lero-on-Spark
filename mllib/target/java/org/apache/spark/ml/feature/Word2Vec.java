package org.apache.spark.ml.feature;
/**
 * Word2Vec trains a model of <code>Map(String, Vector)</code>, i.e. transforms a word into a code for further
 * natural language processing or machine learning process.
 */
public final class Word2Vec extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.Word2VecModel> implements org.apache.spark.ml.feature.Word2VecBase, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.Word2Vec load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam vectorSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam windowSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam numPartitions ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam minCount ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxSentenceLength ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Word2Vec (java.lang.String uid)  { throw new RuntimeException(); }
  public   Word2Vec ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2Vec setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2Vec setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2Vec setVectorSize (int value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.feature.Word2Vec setWindowSize (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2Vec setStepSize (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2Vec setNumPartitions (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2Vec setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2Vec setSeed (long value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2Vec setMinCount (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2Vec setMaxSentenceLength (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Word2VecModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Word2Vec copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
