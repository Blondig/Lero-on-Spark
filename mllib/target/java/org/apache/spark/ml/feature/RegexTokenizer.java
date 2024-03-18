package org.apache.spark.ml.feature;
/**
 * A regex based tokenizer that extracts tokens either by using the provided regex pattern to split
 * the text (default) or repeatedly matching the regex (if <code>gaps</code> is false).
 * Optional parameters also allow filtering tokens using a minimal length.
 * It returns an array of strings that can be empty.
 */
public  class RegexTokenizer extends org.apache.spark.ml.UnaryTransformer<java.lang.String, scala.collection.Seq<java.lang.String>, org.apache.spark.ml.feature.RegexTokenizer> implements org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.RegexTokenizer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RegexTokenizer (java.lang.String uid)  { throw new RuntimeException(); }
  public   RegexTokenizer ()  { throw new RuntimeException(); }
  /**
   * Minimum token length, greater than or equal to 0.
   * Default: 1, to avoid returning empty strings
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam minTokenLength ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RegexTokenizer setMinTokenLength (int value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  int getMinTokenLength ()  { throw new RuntimeException(); }
  /**
   * Indicates whether regex splits on gaps (true) or matches tokens (false).
   * Default: true
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam gaps ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RegexTokenizer setGaps (boolean value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  boolean getGaps ()  { throw new RuntimeException(); }
  /**
   * Regex pattern used to match delimiters if {@link gaps} is true or tokens if {@link gaps} is false.
   * Default: <code>"\\s+"</code>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> pattern ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RegexTokenizer setPattern (java.lang.String value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getPattern ()  { throw new RuntimeException(); }
  /**
   * Indicates whether to convert all characters to lowercase before tokenizing.
   * Default: true
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.BooleanParam toLowercase ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RegexTokenizer setToLowercase (boolean value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  boolean getToLowercase ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, scala.collection.Seq<java.lang.String>> createTransformFunc ()  { throw new RuntimeException(); }
  protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RegexTokenizer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
