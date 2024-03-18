package org.apache.spark.ml.r;
  class AFTSurvivalRegressionWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class AFTSurvivalRegressionWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   AFTSurvivalRegressionWrapperWriter (org.apache.spark.ml.r.AFTSurvivalRegressionWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class AFTSurvivalRegressionWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.AFTSurvivalRegressionWrapper> {
    public   AFTSurvivalRegressionWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.AFTSurvivalRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.AFTSurvivalRegressionWrapper fit (java.lang.String formula, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, int aggregationDepth, java.lang.String stringIndexerOrderType)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.AFTSurvivalRegressionWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.AFTSurvivalRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] rCoefficients ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String[] rFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
