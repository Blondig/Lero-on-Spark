package org.apache.spark.mllib.feature;
/**
 * Word2Vec model
 * param:  wordIndex maps each word to an index, which can retrieve the corresponding
 *                  vector from wordVectors
 * param:  wordVectors array of length numWords * vectorSize, vector corresponding
 *                    to the word mapped with index i can be retrieved by the slice
 *                    (i * vectorSize, i * vectorSize + vectorSize)
 */
public  class Word2VecModel implements scala.Serializable, org.apache.spark.mllib.util.Saveable {
  static public  org.apache.spark.mllib.feature.Word2VecModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.Object> wordIndex ()  { throw new RuntimeException(); }
    float[] wordVectors ()  { throw new RuntimeException(); }
  // not preceding
     Word2VecModel (scala.collection.immutable.Map<java.lang.String, java.lang.Object> wordIndex, float[] wordVectors)  { throw new RuntimeException(); }
  public   Word2VecModel (scala.collection.immutable.Map<java.lang.String, float[]> model)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Transforms a word to its vector representation
   * @param word a word
   * @return vector representation of word
   */
  public  org.apache.spark.mllib.linalg.Vector transform (java.lang.String word)  { throw new RuntimeException(); }
  /**
   * Find synonyms of a word; do not include the word itself in results.
   * @param word a word
   * @param num number of synonyms to find
   * @return array of (word, cosineSimilarity)
   */
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonyms (java.lang.String word, int num)  { throw new RuntimeException(); }
  /**
   * Find synonyms of the vector representation of a word, possibly
   * including any words in the model vocabulary whose vector representation
   * is the supplied vector.
   * @param vector vector representation of a word
   * @param num number of synonyms to find
   * @return array of (word, cosineSimilarity)
   */
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonyms (org.apache.spark.mllib.linalg.Vector vector, int num)  { throw new RuntimeException(); }
  /**
   * Find synonyms of the vector representation of a word, rejecting
   * words identical to the value of wordOpt, if one is supplied.
   * @param vector vector representation of a word
   * @param num number of synonyms to find
   * @param wordOpt optionally, a word to reject from the results list
   * @return array of (word, cosineSimilarity)
   */
    scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonyms (double[] vector, int num, scala.Option<java.lang.String> wordOpt)  { throw new RuntimeException(); }
  /**
   * Returns a map of words to their vector representations.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, float[]> getVectors ()  { throw new RuntimeException(); }
}
