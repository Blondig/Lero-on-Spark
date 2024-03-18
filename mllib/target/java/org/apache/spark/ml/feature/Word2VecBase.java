package org.apache.spark.ml.feature;
/**
 * Params for {@link Word2Vec} and {@link Word2VecModel}.
 */
public  interface Word2VecBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasStepSize, org.apache.spark.ml.param.shared.HasSeed {
  /** @group getParam */
  public  int getMaxSentenceLength ()  ;
  /** @group getParam */
  public  int getMinCount ()  ;
  /** @group getParam */
  public  int getNumPartitions ()  ;
  /** @group getParam */
  public  int getVectorSize ()  ;
  /** @group expertGetParam */
  public  int getWindowSize ()  ;
  /**
   * Sets the maximum length (in words) of each sentence in the input data.
   * Any sentence longer than this threshold will be divided into chunks of
   * up to <code>maxSentenceLength</code> size.
   * Default: 1000
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxSentenceLength ()  ;
  /**
   * The minimum number of times a token must appear to be included in the word2vec model's
   * vocabulary.
   * Default: 5
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam minCount ()  ;
  /**
   * Number of partitions for sentences of words.
   * Default: 1
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numPartitions ()  ;
  /**
   * Validate and transform the input schema.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
  /**
   * The dimension of the code that you want to transform from words.
   * Default: 100
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam vectorSize ()  ;
  /**
   * The window size (context words from [-window, window]).
   * Default: 5
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam windowSize ()  ;
}
