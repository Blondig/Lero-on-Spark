package org.apache.spark.ml.tree;
/**
 * Parameters for Decision Tree-based ensemble classification algorithms.
 */
public  interface TreeEnsembleClassifierParams extends org.apache.spark.ml.tree.TreeEnsembleParams, org.apache.spark.ml.classification.ProbabilisticClassifierParams {
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
