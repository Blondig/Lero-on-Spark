package org.apache.spark.ml.r;
  class LogisticRegressionWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class LogisticRegressionWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   LogisticRegressionWrapperWriter (org.apache.spark.ml.r.LogisticRegressionWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class LogisticRegressionWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LogisticRegressionWrapper> {
    public   LogisticRegressionWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.LogisticRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  static public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.LogisticRegressionWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, double regParam, double elasticNetParam, int maxIter, double tol, java.lang.String family, boolean standardization, double[] thresholds, java.lang.String weightCol, int aggregationDepth, int numRowsOfBoundsOnCoefficients, int numColsOfBoundsOnCoefficients, double[] lowerBoundsOnCoefficients, double[] upperBoundsOnCoefficients, double[] lowerBoundsOnIntercepts, double[] upperBoundsOnIntercepts, java.lang.String handleInvalid)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LogisticRegressionWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.LogisticRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  public  java.lang.String[] labels ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String[] rFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] rCoefficients ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
