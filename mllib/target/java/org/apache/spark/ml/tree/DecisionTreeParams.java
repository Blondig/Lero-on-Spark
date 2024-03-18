package org.apache.spark.ml.tree;
/**
 * Parameters for Decision Tree-based algorithms.
 * <p>
 * Note: Marked as private since this may be made public in the future.
 */
public  interface DecisionTreeParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasCheckpointInterval, org.apache.spark.ml.param.shared.HasSeed, org.apache.spark.ml.param.shared.HasWeightCol {
  /**
   * If false, the algorithm will pass trees to executors to match instances with nodes.
   * If true, the algorithm will cache node IDs for each instance.
   * Caching can speed up training of deeper trees. Users can set how often should the
   * cache be checkpointed or disable it by setting checkpointInterval.
   * (default = false)
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam cacheNodeIds ()  ;
  /** @group expertGetParam */
  public  boolean getCacheNodeIds ()  ;
  /** @group getParam */
  public  java.lang.String getLeafCol ()  ;
  /** @group getParam */
  public  int getMaxBins ()  ;
  /** @group getParam */
  public  int getMaxDepth ()  ;
  /** @group expertGetParam */
  public  int getMaxMemoryInMB ()  ;
  /** @group getParam */
  public  double getMinInfoGain ()  ;
  /** @group getParam */
  public  int getMinInstancesPerNode ()  ;
  /** @group getParam */
  public  double getMinWeightFractionPerNode ()  ;
  /** (private[ml]) Create a Strategy instance to use with the old API. */
    org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, scala.Enumeration.Value oldAlgo, org.apache.spark.mllib.tree.impurity.Impurity oldImpurity, double subsamplingRate)  ;
  /**
   * Leaf indices column name.
   * Predicted leaf index of each instance in each tree by preorder.
   * (default = "")
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> leafCol ()  ;
  /**
   * Maximum number of bins used for discretizing continuous features and for choosing how to split
   * on features at each node.  More bins give higher granularity.
   * Must be at least 2 and at least number of categories in any categorical feature.
   * (default = 32)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxBins ()  ;
  /**
   * Maximum depth of the tree (nonnegative).
   * E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   * (default = 5)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxDepth ()  ;
  /**
   * Maximum memory in MB allocated to histogram aggregation. If too small, then 1 node will be
   * split per iteration, and its aggregates may exceed this size.
   * (default = 256 MB)
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxMemoryInMB ()  ;
  /**
   * Minimum information gain for a split to be considered at a tree node.
   * Should be at least 0.0.
   * (default = 0.0)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam minInfoGain ()  ;
  /**
   * Minimum number of instances each child must have after split.
   * If a split causes the left or right child to have fewer than minInstancesPerNode,
   * the split will be discarded as invalid.
   * Must be at least 1.
   * (default = 1)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam minInstancesPerNode ()  ;
  /**
   * Minimum fraction of the weighted sample count that each child must have after split.
   * If a split causes the fraction of the total weight in the left or right child to be less than
   * minWeightFractionPerNode, the split will be discarded as invalid.
   * Should be in the interval [0.0, 0.5).
   * (default = 0.0)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam minWeightFractionPerNode ()  ;
  /** @group setParam */
  public  org.apache.spark.ml.tree.DecisionTreeParams setLeafCol (java.lang.String value)  ;
}
