package org.apache.spark.ml.tree;
public  interface DecisionTreeClassifierParams extends org.apache.spark.ml.tree.DecisionTreeParams, org.apache.spark.ml.tree.TreeClassifierParams, org.apache.spark.ml.classification.ProbabilisticClassifierParams {
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
