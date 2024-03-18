package org.apache.spark.ml.r;
public  class DecisionTreeClassifierWrapper$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.r.DecisionTreeClassifierWrapper> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeClassifierWrapper$ MODULE$ = null;
  public   DecisionTreeClassifierWrapper$ ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.DecisionTreeClassifierWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int maxDepth, int maxBins, java.lang.String impurity, int minInstancesPerNode, double minInfoGain, int checkpointInterval, java.lang.String seed, int maxMemoryInMB, boolean cacheNodeIds, java.lang.String handleInvalid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.DecisionTreeClassifierWrapper> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.DecisionTreeClassifierWrapper load (java.lang.String path)  { throw new RuntimeException(); }
}
