package org.apache.spark.ml.tree;
/**
 * Parameters for Decision Tree-based classification algorithms.
 */
public  interface TreeClassifierParams extends org.apache.spark.ml.param.Params {
  /**
   * Criterion used for information gain calculation (case-insensitive).
   * This impurity type is used in DecisionTreeClassifier and RandomForestClassifier,
   * Supported: "entropy" and "gini".
   * (default = gini)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  ;
  /** @group getParam */
  public  java.lang.String getImpurity ()  ;
  /** Convert new impurity to old impurity. */
    org.apache.spark.mllib.tree.impurity.Impurity getOldImpurity ()  ;
}
