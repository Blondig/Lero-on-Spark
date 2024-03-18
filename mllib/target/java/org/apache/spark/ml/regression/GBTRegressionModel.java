package org.apache.spark.ml.regression;
/**
 * <a href="http://en.wikipedia.org/wiki/Gradient_boosting">Gradient-Boosted Trees (GBTs)</a>
 * model for regression.
 * It supports both continuous and categorical features.
 * param:  _trees  Decision trees in the ensemble.
 * param:  _treeWeights  Weights for the decision trees in the ensemble.
 */
public  class GBTRegressionModel extends org.apache.spark.ml.regression.RegressionModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.GBTRegressionModel> implements org.apache.spark.ml.tree.GBTRegressorParams, org.apache.spark.ml.tree.TreeEnsembleModel<org.apache.spark.ml.regression.DecisionTreeRegressionModel>, org.apache.spark.ml.util.MLWritable, scala.Serializable {
  static   class GBTRegressionModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   GBTRegressionModelWriter (org.apache.spark.ml.regression.GBTRegressionModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.GBTRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.GBTRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
  static   org.apache.spark.ml.regression.GBTRegressionModel fromOld (org.apache.spark.mllib.tree.model.GradientBoostedTreesModel oldModel, org.apache.spark.ml.regression.GBTRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures)  { throw new RuntimeException(); }
  public  int totalNumNodes ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> lossType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam validationTol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> validationIndicatorCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam subsamplingRate ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featureSubsetStrategy ()  { throw new RuntimeException(); }
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
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
     GBTRegressionModel (java.lang.String uid, org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees, double[] _treeWeights, int numFeatures)  { throw new RuntimeException(); }
  /**
   * Construct a GBTRegressionModel
   * @param _trees  Decision trees in the ensemble.
   * @param _treeWeights  Weights for the decision trees in the ensemble.
   * @param uid (undocumented)
   */
  public   GBTRegressionModel (java.lang.String uid, org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees, double[] _treeWeights)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressionModel[] trees ()  { throw new RuntimeException(); }
  /**
   * Number of trees in ensemble
   * @return (undocumented)
   */
  public  int getNumTrees ()  { throw new RuntimeException(); }
  public  double[] treeWeights ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.linalg.Vector featureImportances ()  { throw new RuntimeException(); }
  /** (private[ml]) Convert to a model in the old API */
    org.apache.spark.mllib.tree.model.GradientBoostedTreesModel toOld ()  { throw new RuntimeException(); }
  /**
   * Method to compute error or loss for every iteration of gradient boosting.
   * <p>
   * @param dataset Dataset for validation.
   * @param loss The loss function used to compute error. Supported options: squared, absolute
   * @return (undocumented)
   */
  public  double[] evaluateEachIteration (org.apache.spark.sql.Dataset<?> dataset, java.lang.String loss)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
