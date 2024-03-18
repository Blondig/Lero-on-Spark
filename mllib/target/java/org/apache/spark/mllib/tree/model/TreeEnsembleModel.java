package org.apache.spark.mllib.tree.model;
/**
 * Represents a tree ensemble model.
 * <p>
 * param:  algo algorithm for the ensemble model, either Classification or Regression
 * param:  trees tree ensembles
 * param:  treeWeights tree ensemble weights
 * param:  combiningStrategy strategy for combining the predictions, not used for regression.
 */
  class TreeEnsembleModel implements scala.Serializable {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public  class Metadata implements scala.Product, scala.Serializable {
      static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
      static public  java.lang.String toString ()  { throw new RuntimeException(); }
      public  java.lang.String algo ()  { throw new RuntimeException(); }
      public  java.lang.String treeAlgo ()  { throw new RuntimeException(); }
      public  java.lang.String combiningStrategy ()  { throw new RuntimeException(); }
      public  double[] treeWeights ()  { throw new RuntimeException(); }
      // not preceding
      public   Metadata (java.lang.String algo, java.lang.String treeAlgo, java.lang.String combiningStrategy, double[] treeWeights)  { throw new RuntimeException(); }
    }
    public  class Metadata$ extends scala.runtime.AbstractFunction4<java.lang.String, java.lang.String, java.lang.String, double[], org.apache.spark.mllib.tree.model.TreeEnsembleModel.SaveLoadV1_0.Metadata> implements scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final Metadata$ MODULE$ = null;
      public   Metadata$ ()  { throw new RuntimeException(); }
    }
    /**
     * Model data for model import/export.
     * We have to duplicate NodeData here since Spark SQL does not yet support extracting subfields
     * of nested fields; once that is possible, we can use something like:
     *  case class EnsembleNodeData(treeId: Int, node: NodeData),
     *  where NodeData is from DecisionTreeModel.
     */
    public  class EnsembleNodeData implements scala.Product, scala.Serializable {
      static public abstract  R apply (T1 v1, T2 v2)  ;
      static public  java.lang.String toString ()  { throw new RuntimeException(); }
      public  int treeId ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.NodeData node ()  { throw new RuntimeException(); }
      // not preceding
      public   EnsembleNodeData (int treeId, org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.NodeData node)  { throw new RuntimeException(); }
    }
    public  class EnsembleNodeData$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.NodeData, org.apache.spark.mllib.tree.model.TreeEnsembleModel.SaveLoadV1_0.EnsembleNodeData> implements scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final EnsembleNodeData$ MODULE$ = null;
      public   EnsembleNodeData$ ()  { throw new RuntimeException(); }
    }
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    public  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, org.apache.spark.mllib.tree.model.TreeEnsembleModel model, java.lang.String className)  { throw new RuntimeException(); }
    /**
     * Read metadata from the loaded JSON metadata.
     * @param metadata (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.tree.model.TreeEnsembleModel.SaveLoadV1_0.Metadata readMetadata (org.json4s.JsonAST.JValue metadata)  { throw new RuntimeException(); }
    /**
     * Load trees for an ensemble, and return them in order.
     * @param path path to load the model from
     * @param treeAlgo Algorithm for individual trees (which may differ from the ensemble's
     *                 algorithm).
     * @param sc (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.tree.model.DecisionTreeModel[] loadTrees (org.apache.spark.SparkContext sc, java.lang.String path, java.lang.String treeAlgo)  { throw new RuntimeException(); }
  }
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
  protected  scala.Enumeration.Value algo ()  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees ()  { throw new RuntimeException(); }
  protected  double[] treeWeights ()  { throw new RuntimeException(); }
  protected  scala.Enumeration.Value combiningStrategy ()  { throw new RuntimeException(); }
  // not preceding
  public   TreeEnsembleModel (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees, double[] treeWeights, scala.Enumeration.Value combiningStrategy)  { throw new RuntimeException(); }
  /**
   * Predict values for a single data point using the model trained.
   * <p>
   * @param features array representing a single data point
   * @return predicted category from the trained model
   */
  public  double predict (org.apache.spark.mllib.linalg.Vector features)  { throw new RuntimeException(); }
  /**
   * Predict values for the given data set.
   * <p>
   * @param features RDD representing data points to be predicted
   * @return RDD[Double] where each entry contains the corresponding prediction
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> features)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>org.apache.spark.mllib.tree.model.TreeEnsembleModel.predict</code>.
   * @param features (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Double> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> features)  { throw new RuntimeException(); }
  /**
   * Print a summary of the model.
   * @return (undocumented)
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Print the full model to a string.
   * @return (undocumented)
   */
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  /**
   * Get number of trees in ensemble.
   * @return (undocumented)
   */
  public  int numTrees ()  { throw new RuntimeException(); }
  /**
   * Get total number of nodes, summed over all trees in the ensemble.
   * @return (undocumented)
   */
  public  int totalNumNodes ()  { throw new RuntimeException(); }
}
