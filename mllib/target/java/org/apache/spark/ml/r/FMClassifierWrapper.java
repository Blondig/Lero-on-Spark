package org.apache.spark.ml.r;
  class FMClassifierWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class FMClassifierWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   FMClassifierWrapperWriter (org.apache.spark.ml.r.FMClassifierWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class FMClassifierWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.FMClassifierWrapper> {
    public   FMClassifierWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.FMClassifierWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  static public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.FMClassifierWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int factorSize, boolean fitLinear, double regParam, double miniBatchFraction, double initStd, int maxIter, double stepSize, double tol, java.lang.String solver, java.lang.String seed, double[] thresholds, java.lang.String handleInvalid)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.FMClassifierWrapper> read ()  { throw new RuntimeException(); }
  static public  T load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  public  java.lang.String[] labels ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String[] rFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] rCoefficients ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] rFactors ()  { throw new RuntimeException(); }
  // not preceding
  public  int numClasses ()  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public  int factorSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
