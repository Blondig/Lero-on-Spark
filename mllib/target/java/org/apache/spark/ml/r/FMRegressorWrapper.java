package org.apache.spark.ml.r;
  class FMRegressorWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class FMRegressorWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   FMRegressorWrapperWriter (org.apache.spark.ml.r.FMRegressorWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class FMRegressorWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.FMRegressorWrapper> {
    public   FMRegressorWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.FMRegressorWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.FMRegressorWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int factorSize, boolean fitLinear, double regParam, double miniBatchFraction, double initStd, int maxIter, double stepSize, double tol, java.lang.String solver, java.lang.String seed, java.lang.String stringIndexerOrderType)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.FMRegressorWrapper> read ()  { throw new RuntimeException(); }
  static public  T load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String[] rFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] rCoefficients ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] rFactors ()  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public  int factorSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
