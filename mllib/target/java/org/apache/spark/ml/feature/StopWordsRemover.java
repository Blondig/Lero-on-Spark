package org.apache.spark.ml.feature;
/**
 * A feature transformer that filters out stop words from input.
 * <p>
 * Since 3.0.0, <code>StopWordsRemover</code> can filter out multiple columns at once by setting the
 * <code>inputCols</code> parameter. Note that when both the <code>inputCol</code> and <code>inputCols</code> parameters are set,
 * an Exception will be thrown.
 * <p>
 * @note null values from input array are preserved unless adding null to stopWords
 * explicitly.
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Stop_words">Stop words (Wikipedia)</a>
 */
public  class StopWordsRemover extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCols, org.apache.spark.ml.util.DefaultParamsWritable {
  static   scala.collection.immutable.Set<java.lang.String> supportedLanguages ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.StopWordsRemover load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads the default stop words for the given language.
   * Supported languages: danish, dutch, english, finnish, french, german, hungarian,
   * italian, norwegian, portuguese, russian, spanish, swedish, turkish
   * @see <a href="http://anoncvs.postgresql.org/cvsweb.cgi/pgsql/src/backend/snowball/stopwords/">
   * here</a>
   * @param language (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String[] loadDefaultStopWords (java.lang.String language)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam outputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   StopWordsRemover (java.lang.String uid)  { throw new RuntimeException(); }
  public   StopWordsRemover ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setOutputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /**
   * The words to be filtered out.
   * Default: English stop words
   * @see <code>StopWordsRemover.loadDefaultStopWords()</code>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam stopWords ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setStopWords (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String[] getStopWords ()  { throw new RuntimeException(); }
  /**
   * Whether to do a case sensitive comparison over the stop words.
   * Default: false
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam caseSensitive ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setCaseSensitive (boolean value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  boolean getCaseSensitive ()  { throw new RuntimeException(); }
  /**
   * Locale of the input for case insensitive matching. Ignored when {@link caseSensitive}
   * is true.
   * Default: the string of default locale (<code>Locale.getDefault</code>), or <code>Locale.US</code> if default locale
   * is not in available locales in JVM.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> locale ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setLocale (java.lang.String value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getLocale ()  { throw new RuntimeException(); }
  /** Returns the input and output column names corresponding in pair. */
    scala.Tuple2<java.lang.String[], java.lang.String[]> getInOutCols ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StopWordsRemover copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
