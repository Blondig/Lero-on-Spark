package org.apache.spark.ml.tree;
/**
 * Abstraction for models which are ensembles of decision trees
 * @param <M>   Type of tree model in this ensemble
 */
public  interface TreeEnsembleModel<M extends org.apache.spark.ml.tree.DecisionTreeModel> {
  /** Trees in this ensemble. Warning: These have null parent Estimators. */
  public  M[] trees ()  ;
  /** Weights for each tree, zippable with {@link trees} */
  public  double[] treeWeights ()  ;
  /** Weights used by the python wrappers. */
    org.apache.spark.ml.linalg.Vector javaTreeWeights ()  ;
  /** Summary of the model */
  public  java.lang.String toString ()  ;
  /** Full description of model */
  public  java.lang.String toDebugString ()  ;
  /** Total number of nodes, summed over all trees in the ensemble. */
  public  int totalNumNodes ()  ;
  /**
   * @return The indices of the leaves corresponding to the feature vector.
   *         Leaves are indexed in pre-order from 0.
   * @param features (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector predictLeaf (org.apache.spark.ml.linalg.Vector features)  ;
    org.apache.spark.sql.types.StructField getLeafField (java.lang.String leafCol)  ;
}
