package org.apache.spark.ml.regression;
/**
 * <a href="http://en.wikipedia.org/wiki/Random_forest">Random Forest</a> model for regression.
 * It supports both continuous and categorical features.
 * <p>
 * param:  _trees  Decision trees in the ensemble.
 * param:  numFeatures  Number of features used by this model
 */
public  class RandomForestRegressionModel extends org.apache.spark.ml.regression.RegressionModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.RandomForestRegressionModel> implements org.apache.spark.ml.tree.RandomForestRegressorParams, org.apache.spark.ml.tree.TreeEnsembleModel<org.apache.spark.ml.regression.DecisionTreeRegressionModel>, org.apache.spark.ml.util.MLWritable, scala.Serializable {
  static   class RandomForestRegressionModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   RandomForestRegressionModelWriter (org.apache.spark.ml.regression.RandomForestRegressionModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.RandomForestRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.RandomForestRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
  static   org.apache.spark.ml.regression.RandomForestRegressionModel fromOld (org.apache.spark.mllib.tree.model.RandomForestModel oldModel, org.apache.spark.ml.regression.RandomForestRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures)  { throw new RuntimeException(); }
  public  int totalNumNodes ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam numTrees ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam bootstrap ()  { throw new RuntimeException(); }
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
     RandomForestRegressionModel (java.lang.String uid, org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees, int numFeatures)  { throw new RuntimeException(); }
  /**
   * Construct a random forest regression model, with all trees weighted equally.
   * <p>
   * @param trees  Component trees
   * @param numFeatures (undocumented)
   */
     RandomForestRegressionModel (org.apache.spark.ml.regression.DecisionTreeRegressionModel[] trees, int numFeatures)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressionModel[] trees ()  { throw new RuntimeException(); }
  public  double[] treeWeights ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.linalg.Vector featureImportances ()  { throw new RuntimeException(); }
  /** (private[ml]) Convert to a model in the old API */
    org.apache.spark.mllib.tree.model.RandomForestModel toOld ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
