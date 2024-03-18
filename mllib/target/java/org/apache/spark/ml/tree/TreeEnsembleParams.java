package org.apache.spark.ml.tree;
/**
 * Parameters for Decision Tree-based ensemble algorithms.
 * <p>
 * Note: Marked as private since this may be made public in the future.
 */
public  interface TreeEnsembleParams extends org.apache.spark.ml.tree.DecisionTreeParams {
  /**
   * Fraction of the training data used for learning each decision tree, in range (0, 1].
   * (default = 1.0)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam subsamplingRate ()  ;
  /** @group getParam */
  public  double getSubsamplingRate ()  ;
  /**
   * Create a Strategy instance to use with the old API.
   * NOTE: The caller should set impurity and seed.
   * @param categoricalFeatures (undocumented)
   * @param numClasses (undocumented)
   * @param oldAlgo (undocumented)
   * @param oldImpurity (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, scala.Enumeration.Value oldAlgo, org.apache.spark.mllib.tree.impurity.Impurity oldImpurity)  ;
  /**
   * The number of features to consider for splits at each tree node.
   * Supported options:
   *  - "auto": Choose automatically for task:
   *            If numTrees == 1, set to "all."
   *            If numTrees greater than 1 (forest), set to "sqrt" for classification and
   *              to "onethird" for regression.
   *  - "all": use all features
   *  - "onethird": use 1/3 of the features
   *  - "sqrt": use sqrt(number of features)
   *  - "log2": use log2(number of features)
   *  - "n": when n is in the range (0, 1.0], use n * number of features. When n
   *         is in the range (1, number of features), use n features.
   * (default = "auto")
   * <p>
   * These various settings are based on the following references:
   *  - log2: tested in Breiman (2001)
   *  - sqrt: recommended by Breiman manual for random forests
   *  - The defaults of sqrt (classification) and onethird (regression) match the R randomForest
   *    package.
   * @see <a href="http://www.stat.berkeley.edu/~breiman/randomforest2001.pdf">Breiman (2001)</a>
   * @see <a href="http://www.stat.berkeley.edu/~breiman/Using_random_forests_V3.1.pdf">
   * Breiman manual for random forests</a>
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> featureSubsetStrategy ()  ;
  /** @group getParam */
  public  java.lang.String getFeatureSubsetStrategy ()  ;
}
