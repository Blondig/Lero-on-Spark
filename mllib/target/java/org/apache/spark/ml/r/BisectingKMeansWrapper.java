package org.apache.spark.ml.r;
  class BisectingKMeansWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class BisectingKMeansWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   BisectingKMeansWrapperWriter (org.apache.spark.ml.r.BisectingKMeansWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class BisectingKMeansWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.BisectingKMeansWrapper> {
    public   BisectingKMeansWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.BisectingKMeansWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.BisectingKMeansWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int k, int maxIter, java.lang.String seed, double minDivisibleClusterSize)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.BisectingKMeansWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.BisectingKMeansWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  public  long[] size ()  { throw new RuntimeException(); }
  public  boolean isLoaded ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] coefficients ()  { throw new RuntimeException(); }
  // not preceding
  public  int k ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> cluster ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> fitted (java.lang.String method)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
