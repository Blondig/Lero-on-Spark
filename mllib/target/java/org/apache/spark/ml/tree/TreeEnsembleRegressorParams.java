package org.apache.spark.ml.tree;
/**
 * Parameters for Decision Tree-based ensemble regression algorithms.
 */
public  interface TreeEnsembleRegressorParams extends org.apache.spark.ml.tree.TreeEnsembleParams {
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
