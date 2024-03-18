package org.apache.spark.ml.r;
  class DecisionTreeRegressorWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class DecisionTreeRegressorWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   DecisionTreeRegressorWrapperWriter (org.apache.spark.ml.r.DecisionTreeRegressorWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class DecisionTreeRegressorWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.DecisionTreeRegressorWrapper> {
    public   DecisionTreeRegressorWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.DecisionTreeRegressorWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.DecisionTreeRegressorWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int maxDepth, int maxBins, java.lang.String impurity, int minInstancesPerNode, double minInfoGain, int checkpointInterval, java.lang.String seed, int maxMemoryInMB, boolean cacheNodeIds)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.DecisionTreeRegressorWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.DecisionTreeRegressorWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String formula ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.linalg.Vector featureImportances ()  { throw new RuntimeException(); }
  // not preceding
  public  int maxDepth ()  { throw new RuntimeException(); }
  public  java.lang.String summary ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
