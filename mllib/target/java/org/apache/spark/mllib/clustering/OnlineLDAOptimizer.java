package org.apache.spark.mllib.clustering;
/**
 * An online optimizer for LDA. The Optimizer implements the Online variational Bayes LDA
 * algorithm, which processes a subset of the corpus on each iteration, and updates the term-topic
 * distribution adaptively.
 * <p>
 * Original Online LDA paper:
 *   Hoffman, Blei and Bach, "Online Learning for Latent Dirichlet Allocation." NIPS, 2010.
 */
public final class OnlineLDAOptimizer implements org.apache.spark.mllib.clustering.LDAOptimizer, org.apache.spark.internal.Logging {
  /**
   * Uses variational inference to infer the topic distribution <code>gammad</code> given the term counts
   * for a document. <code>termCounts</code> must contain at least one non-zero entry, otherwise Breeze will
   * throw a BLAS error.
   * <p>
   * An optimization (Lee, Seung: Algorithms for non-negative matrix factorization, NIPS 2001)
   * avoids explicit computation of variational parameter <code>phi</code>.
   * @see <a href="http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.31.7566">here</a>
   * <p>
   * @return Returns a tuple of <code>gammad</code> - estimate of gamma, the topic distribution, <code>sstatsd</code> -
   *         statistics for updating lambda and <code>ids</code> - list of termCounts vector indices.
   * @param indices (undocumented)
   * @param values (undocumented)
   * @param expElogbeta (undocumented)
   * @param alpha (undocumented)
   * @param gammaShape (undocumented)
   * @param k (undocumented)
   * @param seed (undocumented)
   */
  static   scala.Tuple3<breeze.linalg.DenseVector<java.lang.Object>, breeze.linalg.DenseMatrix<java.lang.Object>, scala.collection.immutable.List<java.lang.Object>> variationalTopicInference (scala.collection.immutable.List<java.lang.Object> indices, double[] values, breeze.linalg.DenseMatrix<java.lang.Object> expElogbeta, breeze.linalg.Vector<java.lang.Object> alpha, double gammaShape, int k, long seed)  { throw new RuntimeException(); }
  static   scala.Tuple3<breeze.linalg.DenseVector<java.lang.Object>, breeze.linalg.DenseMatrix<java.lang.Object>, scala.collection.immutable.List<java.lang.Object>> variationalTopicInference (org.apache.spark.mllib.linalg.Vector termCounts, breeze.linalg.DenseMatrix<java.lang.Object> expElogbeta, breeze.linalg.Vector<java.lang.Object> alpha, double gammaShape, int k, long seed)  { throw new RuntimeException(); }
  public   OnlineLDAOptimizer ()  { throw new RuntimeException(); }
  /** (for debugging)  Get docConcentration */
    org.apache.spark.mllib.linalg.Vector getAlpha ()  { throw new RuntimeException(); }
  /** (for debugging)  Get topicConcentration */
    double getEta ()  { throw new RuntimeException(); }
  /** (for debugging) Get parameter for topics */
    breeze.linalg.DenseMatrix<java.lang.Object> getLambda ()  { throw new RuntimeException(); }
  /**
   * A (positive) learning parameter that downweights early iterations. Larger values make early
   * iterations count less.
   * @return (undocumented)
   */
  public  double getTau0 ()  { throw new RuntimeException(); }
  /**
   * A (positive) learning parameter that downweights early iterations. Larger values make early
   * iterations count less.
   * Default: 1024, following the original Online LDA paper.
   * @param tau0 (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.OnlineLDAOptimizer setTau0 (double tau0)  { throw new RuntimeException(); }
  /**
   * Learning rate: exponential decay rate
   * @return (undocumented)
   */
  public  double getKappa ()  { throw new RuntimeException(); }
  /**
   * Learning rate: exponential decay rate---should be between
   * (0.5, 1.0] to guarantee asymptotic convergence.
   * Default: 0.51, based on the original Online LDA paper.
   * @param kappa (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.OnlineLDAOptimizer setKappa (double kappa)  { throw new RuntimeException(); }
  /**
   * Mini-batch fraction, which sets the fraction of document sampled and used in each iteration
   * @return (undocumented)
   */
  public  double getMiniBatchFraction ()  { throw new RuntimeException(); }
  /**
   * Mini-batch fraction in (0, 1], which sets the fraction of document sampled and used in
   * each iteration.
   * <p>
   * @note This should be adjusted in synch with <code>LDA.setMaxIterations()</code>
   * so the entire corpus is used.  Specifically, set both so that
   * maxIterations * miniBatchFraction is at least 1.
   * <p>
   * Default: 0.05, i.e., 5% of total documents.
   * @param miniBatchFraction (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.OnlineLDAOptimizer setMiniBatchFraction (double miniBatchFraction)  { throw new RuntimeException(); }
  /**
   * Optimize docConcentration, indicates whether docConcentration (Dirichlet parameter for
   * document-topic distribution) will be optimized during training.
   * @return (undocumented)
   */
  public  boolean getOptimizeDocConcentration ()  { throw new RuntimeException(); }
  /**
   * Sets whether to optimize docConcentration parameter during training.
   * <p>
   * Default: false
   * @param optimizeDocConcentration (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.OnlineLDAOptimizer setOptimizeDocConcentration (boolean optimizeDocConcentration)  { throw new RuntimeException(); }
  /**
   * Set the Dirichlet parameter for the posterior over topics.
   * This is only used for testing now. In the future, it can help support training stop/resume.
   * @param lambda (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer setLambda (breeze.linalg.DenseMatrix<java.lang.Object> lambda)  { throw new RuntimeException(); }
  /**
   * Used for random initialization of the variational parameters.
   * Larger value produces values closer to 1.0.
   * This is only used for testing currently.
   * @param shape (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer setGammaShape (double shape)  { throw new RuntimeException(); }
  /**
   * Sets whether to sample mini-batches with or without replacement. (default = true)
   * This is only used for testing currently.
   * @param replace (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer setSampleWithReplacement (boolean replace)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer initialize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> docs, org.apache.spark.mllib.clustering.LDA lda)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer next ()  { throw new RuntimeException(); }
  /**
   * Submit a subset (like 1%, decide by the miniBatchFraction) of the corpus to the Online LDA
   * model, and it will update the topic distribution adaptively for the terms appearing in the
   * subset.
   * @param batch (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer submitMiniBatch (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> batch)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.LDAModel getLDAModel (double[] iterationTimes)  { throw new RuntimeException(); }
}
