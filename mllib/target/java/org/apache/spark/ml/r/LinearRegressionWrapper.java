package org.apache.spark.ml.r;
  class LinearRegressionWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class LinearRegressionWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   LinearRegressionWrapperWriter (org.apache.spark.ml.r.LinearRegressionWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class LinearRegressionWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LinearRegressionWrapper> {
    public   LinearRegressionWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.LinearRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.LinearRegressionWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int maxIter, double regParam, double elasticNetParam, double tol, boolean standardization, java.lang.String solver, java.lang.String weightCol, int aggregationDepth, java.lang.String loss, double epsilon, java.lang.String stringIndexerOrderType)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LinearRegressionWrapper> read ()  { throw new RuntimeException(); }
  static public  T load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String[] rFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] rCoefficients ()  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
