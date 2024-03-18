package org.apache.spark.mllib.tree.model;
/**
 * Represents a random forest model.
 * <p>
 * param:  algo algorithm for the ensemble model, either Classification or Regression
 * param:  trees tree ensembles
 */
public  class RandomForestModel extends org.apache.spark.mllib.tree.model.TreeEnsembleModel implements org.apache.spark.mllib.util.Saveable {
  /**
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  static public  org.apache.spark.mllib.tree.model.RandomForestModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  scala.Enumeration.Value algo ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees ()  { throw new RuntimeException(); }
  // not preceding
  public   RandomForestModel (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees)  { throw new RuntimeException(); }
  /**
   * @param sc  Spark context used to save model data.
   * @param path  Path specifying the directory in which to save this model.
   *              If the directory already exists, this method throws an exception.
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
