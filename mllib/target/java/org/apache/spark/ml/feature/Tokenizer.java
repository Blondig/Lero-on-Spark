package org.apache.spark.ml.feature;
/**
 * A tokenizer that converts the input string to lowercase and then splits it by white spaces.
 * <p>
 * @see RegexTokenizer
 */
public  class Tokenizer extends org.apache.spark.ml.UnaryTransformer<java.lang.String, scala.collection.Seq<java.lang.String>, org.apache.spark.ml.feature.Tokenizer> implements org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.Tokenizer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Tokenizer (java.lang.String uid)  { throw new RuntimeException(); }
  public   Tokenizer ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, scala.collection.Seq<java.lang.String>> createTransformFunc ()  { throw new RuntimeException(); }
  protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Tokenizer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
