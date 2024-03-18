package org.apache.spark.ml.r;
  class KMeansWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class KMeansWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   KMeansWrapperWriter (org.apache.spark.ml.r.KMeansWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class KMeansWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.KMeansWrapper> {
    public   KMeansWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.KMeansWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.KMeansWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int k, int maxIter, java.lang.String initMode, java.lang.String seed, int initSteps, double tol)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.KMeansWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.KMeansWrapper load (java.lang.String path)  { throw new RuntimeException(); }
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
  // not preceding
  public  int clusterSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> fitted (java.lang.String method)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
