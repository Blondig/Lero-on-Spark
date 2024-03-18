package org.apache.spark.ml.regression;
public  interface FactorizationMachines extends org.apache.spark.ml.regression.FactorizationMachinesParams {
    org.apache.spark.mllib.linalg.Vector initCoefficients (int numFeatures)  ;
    scala.Tuple2<org.apache.spark.ml.linalg.Vector, double[]> trainImpl (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, int numFeatures, java.lang.String loss)  ;
}
