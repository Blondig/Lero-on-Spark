package org.apache.spark.ml.tree.impl;
/**
 * ALGORITHM
 * <p>
 * This is a sketch of the algorithm to help new developers.
 * <p>
 * The algorithm partitions data by instances (rows).
 * On each iteration, the algorithm splits a set of nodes.  In order to choose the best split
 * for a given node, sufficient statistics are collected from the distributed data.
 * For each node, the statistics are collected to some worker node, and that worker selects
 * the best split.
 * <p>
 * This setup requires discretization of continuous features.  This binning is done in the
 * findSplits() method during initialization, after which each continuous feature becomes
 * an ordered discretized feature with at most maxBins possible values.
 * <p>
 * The main loop in the algorithm operates on a queue of nodes (nodeStack).  These nodes
 * lie at the periphery of the tree being trained.  If multiple trees are being trained at once,
 * then this queue contains nodes from all of them.  Each iteration works roughly as follows:
 *   On the master node:
 *     - Some number of nodes are pulled off of the queue (based on the amount of memory
 *       required for their sufficient statistics).
 *     - For random forests, if featureSubsetStrategy is not "all," then a subset of candidate
 *       features are chosen for each node.  See method selectNodesToSplit().
 *   On worker nodes, via method findBestSplits():
 *     - The worker makes one pass over its subset of instances.
 *     - For each (tree, node, feature, split) tuple, the worker collects statistics about
 *       splitting.  Note that the set of (tree, node) pairs is limited to the nodes selected
 *       from the queue for this iteration.  The set of features considered can also be limited
 *       based on featureSubsetStrategy.
 *     - For each node, the statistics for that node are aggregated to a particular worker
 *       via reduceByKey().  The designated worker chooses the best (feature, split) pair,
 *       or chooses to stop splitting if the stopping criteria are met.
 *   On the master node:
 *     - The master collects all decisions about splitting nodes and updates the model.
 *     - The updated model is passed to the workers on the next iteration.
 * This process continues until the node queue is empty.
 * <p>
 * Most of the methods in this implementation support the statistics aggregation, which is
 * the heaviest part of the computation.  In general, this implementation is bound by either
 * the cost of statistics computation on workers or by communicating the sufficient statistics.
 */
public  class RandomForest {
  static   class NodeIndexInfo implements scala.Serializable {
    // not preceding
    public   NodeIndexInfo (int nodeIndexInGroup, scala.Option<int[]> featureSubset)  { throw new RuntimeException(); }
    public  scala.Option<int[]> featureSubset ()  { throw new RuntimeException(); }
    public  int nodeIndexInGroup ()  { throw new RuntimeException(); }
  }
  /**
   * Train a random forest.
   * <p>
   * @param input Training data: RDD of <code>LabeledPoint</code>
   * @return an unweighted set of trees
   * @param strategy (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @param seed (undocumented)
   */
  static public  org.apache.spark.ml.tree.DecisionTreeModel[] run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, long seed)  { throw new RuntimeException(); }
  /**
   * Train a random forest with metadata and splits. This method is mainly for GBT,
   * in which bagged input can be reused among trees.
   * <p>
   * @param baggedInput bagged training data: RDD of <code>BaggedPoint</code>
   * @param metadata Learning and dataset metadata for DecisionTree.
   * @return an unweighted set of trees
   * @param bcSplits (undocumented)
   * @param strategy (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @param seed (undocumented)
   * @param instr (undocumented)
   * @param prune (undocumented)
   * @param parentUID (undocumented)
   */
  static public  org.apache.spark.ml.tree.DecisionTreeModel[] runBagged (org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> baggedInput, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.tree.Split[][]> bcSplits, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, long seed, scala.Option<org.apache.spark.ml.util.Instrumentation> instr, boolean prune, scala.Option<java.lang.String> parentUID)  { throw new RuntimeException(); }
  /**
   * Train a random forest.
   * <p>
   * @param input Training data: RDD of <code>Instance</code>
   * @return an unweighted set of trees
   * @param strategy (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @param seed (undocumented)
   * @param instr (undocumented)
   * @param prune (undocumented)
   * @param parentUID (undocumented)
   */
  static public  org.apache.spark.ml.tree.DecisionTreeModel[] run (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, long seed, scala.Option<org.apache.spark.ml.util.Instrumentation> instr, boolean prune, scala.Option<java.lang.String> parentUID)  { throw new RuntimeException(); }
  /**
   * Given a group of nodes, this finds the best split for each node.
   * <p>
   * @param input Training data: RDD of {@link TreePoint}
   * @param metadata Learning and dataset metadata
   * @param topNodesForGroup For each tree in group, tree index -> root node.
   *                         Used for matching instances with nodes.
   * @param nodesForGroup Mapping: treeIndex --> nodes to be split in tree
   * @param treeToNodeToIndexInfo Mapping: treeIndex --> nodeIndex --> nodeIndexInfo,
   *                              where nodeIndexInfo stores the index in the group and the
   *                              feature subsets (if using feature subsets).
   * @param bcSplits possible splits for all features, indexed (numFeatures)(numSplits)
   * @param nodeStack  Queue of nodes to split, with values (treeIndex, node).
   *                   Updated with new non-leaf nodes which are created.
   * @param nodeIds an RDD of Array[Int] where each value in the array is the data
   *                point's node Id for a corresponding tree. This is used to prevent
   *                the need to pass the entire tree to the executors during the node
   *                stat aggregation phase.
   * @param timer (undocumented)
   * @param outputBestSplits (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.Split>[] findBestSplits (org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> input, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.LearningNode> topNodesForGroup, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.LearningNode[]> nodesForGroup, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.impl.RandomForest.NodeIndexInfo>> treeToNodeToIndexInfo, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.tree.Split[][]> bcSplits, scala.collection.mutable.ListBuffer<scala.Tuple2<java.lang.Object, org.apache.spark.ml.tree.LearningNode>> nodeStack, org.apache.spark.ml.tree.impl.TimeTracker timer, org.apache.spark.rdd.RDD<int[]> nodeIds, boolean outputBestSplits)  { throw new RuntimeException(); }
  /**
   * Find the best split for a node.
   * <p>
   * @param binAggregates Bin statistics.
   * @return tuple for best split: (Split, information gain, prediction at node)
   * @param splits (undocumented)
   * @param featuresForNode (undocumented)
   * @param node (undocumented)
   */
  static   scala.Tuple2<org.apache.spark.ml.tree.Split, org.apache.spark.mllib.tree.model.ImpurityStats> binsToBestSplit (org.apache.spark.ml.tree.impl.DTStatsAggregator binAggregates, org.apache.spark.ml.tree.Split[][] splits, scala.Option<int[]> featuresForNode, org.apache.spark.ml.tree.LearningNode node)  { throw new RuntimeException(); }
  /**
   * Returns splits for decision tree calculation.
   * Continuous and categorical features are handled differently.
   * <p>
   * Continuous features:
   *   For each feature, there are numBins - 1 possible splits representing the possible binary
   *   decisions at each node in the tree.
   *   This finds locations (feature values) for splits using a subsample of the data.
   * <p>
   * Categorical features:
   *   For each feature, there is 1 bin per split.
   *   Splits and bins are handled in 2 ways:
   *   (a) "unordered features"
   *       For multiclass classification with a low-arity feature
   *       (i.e., if isMulticlass &amp;&amp; isSpaceSufficientForAllCategoricalSplits),
   *       the feature is split based on subsets of categories.
   *   (b) "ordered features"
   *       For regression and binary classification,
   *       and for multiclass classification with a high-arity feature,
   *       there is one bin per category.
   * <p>
   * @param input Training data: RDD of {@link Instance}
   * @param metadata Learning and dataset metadata
   * @param seed random seed
   * @return Splits, an Array of {@link Split}
   *          of size (numFeatures, numSplits)
   */
  static protected  org.apache.spark.ml.tree.Split[][] findSplits (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> input, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, long seed)  { throw new RuntimeException(); }
  /**
   * Nested method to extract list of eligible categories given an index. It extracts the
   * position of ones in a binary representation of the input. If binary
   * representation of an number is 01101 (13), the output list should (3.0, 2.0,
   * 0.0). The maxFeatureValue depict the number of rightmost digits that will be tested for ones.
   * @param input (undocumented)
   * @param maxFeatureValue (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.immutable.List<java.lang.Object> extractMultiClassCategories (int input, int maxFeatureValue)  { throw new RuntimeException(); }
  /**
   * Find splits for a continuous feature
   * NOTE: Returned number of splits is set based on <code>featureSamples</code> and
   *       could be different from the specified <code>numSplits</code>.
   *       The <code>numSplits</code> attribute in the <code>DecisionTreeMetadata</code> class will be set accordingly.
   * <p>
   * @param featureSamples feature values and sample weights of each sample
   * @param metadata decision tree metadata
   *                 NOTE: <code>metadata.numbins</code> will be changed accordingly
   *                       if there are not enough splits to be found
   * @param featureIndex feature index to find splits
   * @return array of split thresholds
   */
  static   double[] findSplitsForContinuousFeature (scala.collection.Iterable<scala.Tuple2<java.lang.Object, java.lang.Object>> featureSamples, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, int featureIndex)  { throw new RuntimeException(); }
  /**
   * Find splits for a continuous feature
   * NOTE: Returned number of splits is set based on <code>featureSamples</code> and
   *       could be different from the specified <code>numSplits</code>.
   *       The <code>numSplits</code> attribute in the <code>DecisionTreeMetadata</code> class will be set accordingly.
   * <p>
   * @param partValueWeights non-zero distinct values and their weights
   * @param metadata decision tree metadata
   *                 NOTE: <code>metadata.numbins</code> will be changed accordingly
   *                       if there are not enough splits to be found
   * @param featureIndex feature index to find splits
   * @return array of split thresholds
   * @param count (undocumented)
   */
  static   double[] findSplitsForContinuousFeature (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> partValueWeights, long count, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, int featureIndex)  { throw new RuntimeException(); }
  /**
   * Pull nodes off of the queue, and collect a group of nodes to be split on this iteration.
   * This tracks the memory usage for aggregates and stops adding nodes when too much memory
   * will be needed; this allows an adaptive number of nodes since different nodes may require
   * different amounts of memory (if featureSubsetStrategy is not "all").
   * <p>
   * @param nodeStack  Queue of nodes to split.
   * @param maxMemoryUsage  Bound on size of aggregate statistics.
   * @return  (nodesForGroup, treeToNodeToIndexInfo).
   *          nodesForGroup holds the nodes to split: treeIndex --> nodes in tree.
   * <p>
   *          treeToNodeToIndexInfo holds indices selected features for each node:
   *            treeIndex --> (global) node index --> (node index in group, feature indices).
   *          The (global) node index is the index in the tree; the node index in group is the
   *           index in [0, numNodesInGroup) of the node in this group.
   *          The feature indices are None if not subsampling features.
   * @param metadata (undocumented)
   * @param rng (undocumented)
   */
  static   scala.Tuple2<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.LearningNode[]>, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.impl.RandomForest.NodeIndexInfo>>> selectNodesToSplit (scala.collection.mutable.ListBuffer<scala.Tuple2<java.lang.Object, org.apache.spark.ml.tree.LearningNode>> nodeStack, long maxMemoryUsage, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, scala.util.Random rng)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
