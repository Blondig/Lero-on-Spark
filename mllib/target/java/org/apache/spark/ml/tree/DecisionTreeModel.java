package org.apache.spark.ml.tree;
/**
 * Abstraction for Decision Tree models.
 */
public  interface DecisionTreeModel {
  /**
   * Depth of the tree.
   * E.g.: Depth 0 means 1 leaf node.  Depth 1 means 1 internal node and 2 leaf nodes.
   * @return (undocumented)
   */
  public  int depth ()  ;
    org.apache.spark.sql.types.StructField getLeafField (java.lang.String leafCol)  ;
    org.apache.spark.ml.attribute.NominalAttribute leafAttr ()  ;
  /**
   * @return an iterator that traverses (DFS, left to right) the leaves
   *         in the subtree of this node.
   * @param node (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.ml.tree.LeafNode> leafIterator (org.apache.spark.ml.tree.Node node)  ;
  /**
   * Trace down the tree, and return the largest feature index used in any split.
   * <p>
   * @return  Max feature index used in a split, or -1 if there are no splits (single leaf node).
   */
    int maxSplitFeatureIndex ()  ;
    int numLeave ()  ;
  /** Number of nodes in tree, including leaf nodes. */
  public  int numNodes ()  ;
  /**
   * @return The index of the leaf corresponding to the feature vector.
   *         Leaves are indexed in pre-order from 0.
   * @param features (undocumented)
   */
  public  double predictLeaf (org.apache.spark.ml.linalg.Vector features)  ;
  /** Root of the decision tree */
  public  org.apache.spark.ml.tree.Node rootNode ()  ;
  /** Full description of model */
  public  java.lang.String toDebugString ()  ;
  /** Convert to spark.mllib DecisionTreeModel (losing some information) */
    org.apache.spark.mllib.tree.model.DecisionTreeModel toOld ()  ;
  /** Summary of the model */
  public  java.lang.String toString ()  ;
}
