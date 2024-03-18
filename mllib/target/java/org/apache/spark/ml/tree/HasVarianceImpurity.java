package org.apache.spark.ml.tree;
public  interface HasVarianceImpurity extends org.apache.spark.ml.param.Params {
  /**
   * Criterion used for information gain calculation (case-insensitive).
   * This impurity type is used in DecisionTreeRegressor, RandomForestRegressor, GBTRegressor
   * and GBTClassifier (since GBTClassificationModel is internally composed of
   * DecisionTreeRegressionModels).
   * Supported: "variance".
   * (default = variance)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  ;
  /** @group getParam */
  public  java.lang.String getImpurity ()  ;
  /** Convert new impurity to old impurity. */
    org.apache.spark.mllib.tree.impurity.Impurity getOldImpurity ()  ;
}
