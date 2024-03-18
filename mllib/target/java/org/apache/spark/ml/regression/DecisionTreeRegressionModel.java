package org.apache.spark.ml.regression;
/**
 * <a href="http://en.wikipedia.org/wiki/Decision_tree_learning">
 * Decision tree (Wikipedia)</a> model for regression.
 * It supports both continuous and categorical features.
 * <p>
 * param:  rootNode  Root of the decision tree
 */
public  class DecisionTreeRegressionModel extends org.apache.spark.ml.regression.RegressionModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.DecisionTreeRegressionModel> implements org.apache.spark.ml.tree.DecisionTreeModel, org.apache.spark.ml.tree.DecisionTreeRegressorParams, org.apache.spark.ml.util.MLWritable, scala.Serializable {
  static   class DecisionTreeRegressionModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   DecisionTreeRegressionModelWriter (org.apache.spark.ml.regression.DecisionTreeRegressionModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.DecisionTreeRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.DecisionTreeRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
  static   org.apache.spark.ml.regression.DecisionTreeRegressionModel fromOld (org.apache.spark.mllib.tree.model.DecisionTreeModel oldModel, org.apache.spark.ml.regression.DecisionTreeRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> varianceCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> leafCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxDepth ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxBins ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam minInstancesPerNode ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam minWeightFractionPerNode ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam minInfoGain ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxMemoryInMB ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam cacheNodeIds ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam checkpointInterval ()  { throw new RuntimeException(); }
  public  int depth ()  { throw new RuntimeException(); }
  protected  int numLeave ()  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.attribute.NominalAttribute leafAttr ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.Node rootNode ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
     DecisionTreeRegressionModel (java.lang.String uid, org.apache.spark.ml.tree.Node rootNode, int numFeatures)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.DecisionTreeRegressionModel setVarianceCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Construct a decision tree regression model.
   * <p>
   * @param rootNode  Root node of tree, with other nodes attached.
   * @param numFeatures (undocumented)
   */
     DecisionTreeRegressionModel (org.apache.spark.ml.tree.Node rootNode, int numFeatures)  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  /** We need to update this function if we ever add other impurity measures. */
  protected  double predictVariance (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.linalg.Vector featureImportances ()  { throw new RuntimeException(); }
  /** Convert to spark.mllib DecisionTreeModel (losing some information) */
    org.apache.spark.mllib.tree.model.DecisionTreeModel toOld ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
