package org.apache.spark.ml.r;
  class NaiveBayesWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class NaiveBayesWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   NaiveBayesWrapperWriter (org.apache.spark.ml.r.NaiveBayesWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class NaiveBayesWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.NaiveBayesWrapper> {
    public   NaiveBayesWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.NaiveBayesWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  static public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.NaiveBayesWrapper fit (java.lang.String formula, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, double smoothing, java.lang.String handleInvalid)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.NaiveBayesWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.NaiveBayesWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] labels ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] apriori ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] tables ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
