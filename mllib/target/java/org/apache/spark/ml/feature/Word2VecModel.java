package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link Word2Vec}.
 */
public  class Word2VecModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.Word2VecModel> implements org.apache.spark.ml.feature.Word2VecBase, org.apache.spark.ml.util.MLWritable {
  static   class Data implements scala.Product, scala.Serializable {
    public  java.lang.String word ()  { throw new RuntimeException(); }
    public  float[] vector ()  { throw new RuntimeException(); }
    // not preceding
    public   Data (java.lang.String word, float[] vector)  { throw new RuntimeException(); }
  }
  static public  class Data$ extends scala.runtime.AbstractFunction2<java.lang.String, float[], org.apache.spark.ml.feature.Word2VecModel.Data> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Data$ MODULE$ = null;
    public   Data$ ()  { throw new RuntimeException(); }
  }
  static   class Word2VecModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   Word2VecModelWriter (org.apache.spark.ml.feature.Word2VecModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class Word2VecModelWriter$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Word2VecModelWriter$ MODULE$ = null;
    public   Word2VecModelWriter$ ()  { throw new RuntimeException(); }
    /**
     * Calculate the number of partitions to use in saving the model.
     * [SPARK-11994] - We want to partition the model in partitions smaller than
     * spark.kryoserializer.buffer.max
     * @param bufferSizeInBytes  Set to spark.kryoserializer.buffer.max
     * @param numWords  Vocab size
     * @param vectorSize  Vector length for each word
     * @return (undocumented)
     */
    public  int calculateNumberOfPartitions (long bufferSizeInBytes, int numWords, int vectorSize)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.Word2VecModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Word2VecModel load (java.lang.String path)  { throw new RuntimeException(); }
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
     Word2VecModel (java.lang.String uid, org.apache.spark.mllib.feature.Word2VecModel wordVectors)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getVectors ()  { throw new RuntimeException(); }
  /**
   * Find "num" number of words closest in similarity to the given word, not
   * including the word itself.
   * @return a dataframe with columns "word" and "similarity" of the word and the cosine
   * similarities between the synonyms and the given word.
   * @param word (undocumented)
   * @param num (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> findSynonyms (java.lang.String word, int num)  { throw new RuntimeException(); }
  /**
   * Find "num" number of words whose vector representation is most similar to the supplied vector.
   * If the supplied vector is the vector representation of a word in the model's vocabulary,
   * that word will be in the results.
   * @return a dataframe with columns "word" and "similarity" of the word and the cosine
   * similarities between the synonyms and the given word vector.
   * @param vec (undocumented)
   * @param num (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> findSynonyms (org.apache.spark.ml.linalg.Vector vec, int num)  { throw new RuntimeException(); }
  /**
   * Find "num" number of words whose vector representation is most similar to the supplied vector.
   * If the supplied vector is the vector representation of a word in the model's vocabulary,
   * that word will be in the results.
   * @return an array of the words and the cosine similarities between the synonyms given
   * word vector.
   * @param vec (undocumented)
   * @param num (undocumented)
   */
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonymsArray (org.apache.spark.ml.linalg.Vector vec, int num)  { throw new RuntimeException(); }
  /**
   * Find "num" number of words closest in similarity to the given word, not
   * including the word itself.
   * @return an array of the words and the cosine similarities between the synonyms given
   * word vector.
   * @param word (undocumented)
   * @param num (undocumented)
   */
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonymsArray (java.lang.String word, int num)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2VecModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2VecModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Transform a sentence column to a vector column to represent the whole sentence. The transform
   * is performed by averaging all word vectors it contains.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Word2VecModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
