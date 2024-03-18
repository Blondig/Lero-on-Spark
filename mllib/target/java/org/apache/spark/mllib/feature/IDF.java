package org.apache.spark.mllib.feature;
/**
 * Inverse document frequency (IDF).
 * The standard formulation is used: <code>idf = log((m + 1) / (d(t) + 1))</code>, where <code>m</code> is the total
 * number of documents and <code>d(t)</code> is the number of documents that contain term <code>t</code>.
 * <p>
 * This implementation supports filtering out terms which do not appear in a minimum number
 * of documents (controlled by the variable <code>minDocFreq</code>). For terms that are not in
 * at least <code>minDocFreq</code> documents, the IDF is found as 0, resulting in TF-IDFs of 0.
 * The document frequency is 0 as well for such terms
 * <p>
 * param:  minDocFreq minimum of documents in which a term
 *                   should appear for filtering
 */
public  class IDF {
  /** Document frequency aggregator. */
  static public  class DocumentFrequencyAggregator implements scala.Serializable {
    // not preceding
    public   DocumentFrequencyAggregator (int minDocFreq)  { throw new RuntimeException(); }
    public   DocumentFrequencyAggregator ()  { throw new RuntimeException(); }
    /** Adds a new document. */
    public  org.apache.spark.mllib.feature.IDF.DocumentFrequencyAggregator add (org.apache.spark.mllib.linalg.Vector doc)  { throw new RuntimeException(); }
    /** Returns the current IDF vector, docFreq, number of documents */
    public  scala.Tuple3<org.apache.spark.mllib.linalg.Vector, long[], java.lang.Object> idf ()  { throw new RuntimeException(); }
    /** Merges another. */
    public  org.apache.spark.mllib.feature.IDF.DocumentFrequencyAggregator merge (org.apache.spark.mllib.feature.IDF.DocumentFrequencyAggregator other)  { throw new RuntimeException(); }
    public  int minDocFreq ()  { throw new RuntimeException(); }
  }
  public  int minDocFreq ()  { throw new RuntimeException(); }
  // not preceding
  public   IDF (int minDocFreq)  { throw new RuntimeException(); }
  public   IDF ()  { throw new RuntimeException(); }
  /**
   * Computes the inverse document frequency.
   * @param dataset an RDD of term frequency vectors
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.IDFModel fit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> dataset)  { throw new RuntimeException(); }
  /**
   * Computes the inverse document frequency.
   * @param dataset a JavaRDD of term frequency vectors
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.IDFModel fit (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> dataset)  { throw new RuntimeException(); }
}
