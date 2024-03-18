package org.apache.spark.ml.r;
  class GBTClassifierWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class GBTClassifierWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   GBTClassifierWrapperWriter (org.apache.spark.ml.r.GBTClassifierWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class GBTClassifierWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GBTClassifierWrapper> {
    public   GBTClassifierWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.GBTClassifierWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  static public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.GBTClassifierWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int maxDepth, int maxBins, int maxIter, double stepSize, int minInstancesPerNode, double minInfoGain, int checkpointInterval, java.lang.String lossType, java.lang.String seed, double subsamplingRate, int maxMemoryInMB, boolean cacheNodeIds, java.lang.String handleInvalid)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GBTClassifierWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.GBTClassifierWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String formula ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.linalg.Vector featureImportances ()  { throw new RuntimeException(); }
  // not preceding
  public  int numTrees ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] treeWeights ()  { throw new RuntimeException(); }
  // not preceding
  public  int maxDepth ()  { throw new RuntimeException(); }
  public  java.lang.String summary ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
