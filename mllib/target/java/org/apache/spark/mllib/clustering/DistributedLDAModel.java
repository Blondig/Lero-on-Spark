package org.apache.spark.mllib.clustering;
/**
 * Distributed LDA model.
 * This model stores the inferred topics, the full training dataset, and the topic distributions.
 */
public  class DistributedLDAModel extends org.apache.spark.mllib.clustering.LDAModel {
  /**
   * The {@link DistributedLDAModel} constructor's default arguments assume gammaShape = 100
   * to ensure equivalence in LDAModel.toLocal conversion.
   * @return (undocumented)
   */
  static   double defaultGammaShape ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.clustering.DistributedLDAModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
    org.apache.spark.graphx.Graph<breeze.linalg.DenseVector<java.lang.Object>, java.lang.Object> graph ()  { throw new RuntimeException(); }
    breeze.linalg.DenseVector<java.lang.Object> globalTopicTotals ()  { throw new RuntimeException(); }
  public  int k ()  { throw new RuntimeException(); }
  public  int vocabSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector docConcentration ()  { throw new RuntimeException(); }
  public  double topicConcentration ()  { throw new RuntimeException(); }
    double[] iterationTimes ()  { throw new RuntimeException(); }
  protected  double gammaShape ()  { throw new RuntimeException(); }
    java.lang.String[] checkpointFiles ()  { throw new RuntimeException(); }
  // not preceding
     DistributedLDAModel (org.apache.spark.graphx.Graph<breeze.linalg.DenseVector<java.lang.Object>, java.lang.Object> graph, breeze.linalg.DenseVector<java.lang.Object> globalTopicTotals, int k, int vocabSize, org.apache.spark.mllib.linalg.Vector docConcentration, double topicConcentration, double[] iterationTimes, double gammaShape, java.lang.String[] checkpointFiles)  { throw new RuntimeException(); }
  /**
   * Convert model to a local model.
   * The local model stores the inferred topics but not the topic distributions for training
   * documents.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LocalLDAModel toLocal ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.linalg.Matrix topicsMatrix ()  { throw new RuntimeException(); }
  public  scala.Tuple2<int[], double[]>[] describeTopics (int maxTermsPerTopic)  { throw new RuntimeException(); }
  /**
   * Return the top documents for each topic
   * <p>
   * @param maxDocumentsPerTopic  Maximum number of documents to collect for each topic.
   * @return  Array over topics.  Each element represent as a pair of matching arrays:
   *          (IDs for the documents, weights of the topic in these documents).
   *          For each topic, documents are sorted in order of decreasing topic weights.
   */
  public  scala.Tuple2<long[], double[]>[] topDocumentsPerTopic (int maxDocumentsPerTopic)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, int[], int[]>> topicAssignments ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.api.java.JavaRDD<scala.Tuple3<java.lang.Long, int[], int[]>> javaTopicAssignments ()  { throw new RuntimeException(); }
  // not preceding
  public  double logLikelihood ()  { throw new RuntimeException(); }
  // not preceding
  public  double logPrior ()  { throw new RuntimeException(); }
  /**
   * For each document in the training set, return the distribution over topics for that document
   * ("theta_doc").
   * <p>
   * @return  RDD of (document ID, topic distribution) pairs
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> topicDistributions ()  { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link topicDistributions}
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<java.lang.Long, org.apache.spark.mllib.linalg.Vector> javaTopicDistributions ()  { throw new RuntimeException(); }
  /**
   * For each document, return the top k weighted topics for that document and their weights.
   * @return RDD of (doc ID, topic indices, topic weights)
   * @param k (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, int[], double[]>> topTopicsPerDocument (int k)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link topTopicsPerDocument}
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<scala.Tuple3<java.lang.Long, int[], double[]>> javaTopTopicsPerDocument (int k)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
