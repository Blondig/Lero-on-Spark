package org.apache.spark.ml.tree;
/**
 * Parameters for Random Forest algorithms.
 */
public  interface RandomForestParams extends org.apache.spark.ml.tree.TreeEnsembleParams {
  /**
   * Whether bootstrap samples are used when building trees.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam bootstrap ()  ;
  /** @group getParam */
  public  boolean getBootstrap ()  ;
  /** @group getParam */
  public  int getNumTrees ()  ;
  /**
   * Number of trees to train (at least 1).
   * If 1, then no bootstrapping is used.  If greater than 1, then bootstrapping is done.
   * TODO: Change to always do bootstrapping (simpler).  SPARK-7130
   * (default = 20)
   * <p>
   * Note: The reason that we cannot add this to both GBT and RF (i.e. in TreeEnsembleParams)
   * is the param <code>maxIter</code> controls how many trees a GBT has. The semantics in the algorithms
   * are a bit different.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numTrees ()  ;
}
