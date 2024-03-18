package org.apache.spark.mllib.clustering;
/**
 * Local LDA model.
 * This model stores only the inferred topics.
 * <p>
 * param:  topics Inferred topics (vocabSize x k matrix).
 */
public  class LocalLDAModel extends org.apache.spark.mllib.clustering.LDAModel implements scala.Serializable {
  static public  org.apache.spark.mllib.clustering.LocalLDAModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Matrix topics ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector docConcentration ()  { throw new RuntimeException(); }
  public  double topicConcentration ()  { throw new RuntimeException(); }
  protected  double gammaShape ()  { throw new RuntimeException(); }
  // not preceding
     LocalLDAModel (org.apache.spark.mllib.linalg.Matrix topics, org.apache.spark.mllib.linalg.Vector docConcentration, double topicConcentration, double gammaShape)  { throw new RuntimeException(); }
    long seed ()  { throw new RuntimeException(); }
  public  int k ()  { throw new RuntimeException(); }
  public  int vocabSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Matrix topicsMatrix ()  { throw new RuntimeException(); }
  public  scala.Tuple2<int[], double[]>[] describeTopics (int maxTermsPerTopic)  { throw new RuntimeException(); }
  /**
   * Random seed for cluster initialization.
   * @return (undocumented)
   */
  public  long getSeed ()  { throw new RuntimeException(); }
  /**
   * Set the random seed for cluster initialization.
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LocalLDAModel setSeed (long seed)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Calculates a lower bound on the log likelihood of the entire corpus.
   * <p>
   * See Equation (16) in original Online LDA paper.
   * <p>
   * @param documents test corpus to use for calculating log likelihood
   * @return variational lower bound on the log likelihood of the entire corpus
   */
  public  double logLikelihood (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> documents)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>logLikelihood</code>
   * @param documents (undocumented)
   * @return (undocumented)
   */
  public  double logLikelihood (org.apache.spark.api.java.JavaPairRDD<java.lang.Long, org.apache.spark.mllib.linalg.Vector> documents)  { throw new RuntimeException(); }
  /**
   * Calculate an upper bound on perplexity.  (Lower is better.)
   * See Equation (16) in original Online LDA paper.
   * <p>
   * @param documents test corpus to use for calculating perplexity
   * @return Variational upper bound on log perplexity per token.
   */
  public  double logPerplexity (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> documents)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>logPerplexity</code>
   * @param documents (undocumented)
   * @return (undocumented)
   */
  public  double logPerplexity (org.apache.spark.api.java.JavaPairRDD<java.lang.Long, org.apache.spark.mllib.linalg.Vector> documents)  { throw new RuntimeException(); }
  /**
   * Predicts the topic mixture distribution for each document (often called "theta" in the
   * literature).  Returns a vector of zeros for an empty document.
   * <p>
   * This uses a variational approximation following Hoffman et al. (2010), where the approximate
   * distribution is called "gamma."  Technically, this method returns this approximation "gamma"
   * for each document.
   * @param documents documents to predict topic mixture distributions for
   * @return An RDD of (document ID, topic mixture distribution for document)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> topicDistributions (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> documents)  { throw new RuntimeException(); }
  /**
   * Predicts the topic mixture distribution for a document (often called "theta" in the
   * literature).  Returns a vector of zeros for an empty document.
   * <p>
   * Note this means to allow quick query for single document. For batch documents, please refer
   * to <code>topicDistributions()</code> to avoid overhead.
   * <p>
   * @param document document to predict topic mixture distributions for
   * @return topic mixture distribution for the document
   */
  public  org.apache.spark.mllib.linalg.Vector topicDistribution (org.apache.spark.mllib.linalg.Vector document)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>topicDistributions</code>
   * @param documents (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<java.lang.Long, org.apache.spark.mllib.linalg.Vector> topicDistributions (org.apache.spark.api.java.JavaPairRDD<java.lang.Long, org.apache.spark.mllib.linalg.Vector> documents)  { throw new RuntimeException(); }
}
