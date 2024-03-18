package org.apache.spark.ml.r;
  class GaussianMixtureWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class GaussianMixtureWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   GaussianMixtureWrapperWriter (org.apache.spark.ml.r.GaussianMixtureWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class GaussianMixtureWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GaussianMixtureWrapper> {
    public   GaussianMixtureWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.GaussianMixtureWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.GaussianMixtureWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int k, int maxIter, double tol)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GaussianMixtureWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.GaussianMixtureWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  int dim ()  { throw new RuntimeException(); }
  public  double logLikelihood ()  { throw new RuntimeException(); }
  public  boolean isLoaded ()  { throw new RuntimeException(); }
  // not preceding
  public  int k ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] lambda ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] mu ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] sigma ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.expressions.UserDefinedFunction vectorToArray ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> posterior ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
