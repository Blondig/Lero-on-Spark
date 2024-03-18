package org.apache.spark.ml.r;
  class LDAWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class LDAWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   LDAWrapperWriter (org.apache.spark.ml.r.LDAWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class LDAWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LDAWrapper> {
    public   LDAWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.LDAWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  java.lang.String TOKENIZER_COL ()  { throw new RuntimeException(); }
  static public  java.lang.String STOPWORDS_REMOVER_COL ()  { throw new RuntimeException(); }
  static public  java.lang.String COUNT_VECTOR_COL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.LDAWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String features, int k, int maxIter, java.lang.String optimizer, double subsamplingRate, double topicConcentration, double[] docConcentration, java.lang.String[] customizedStopWords, int maxVocabSize)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LDAWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.LDAWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  double logLikelihood ()  { throw new RuntimeException(); }
  public  double logPerplexity ()  { throw new RuntimeException(); }
  public  java.lang.String[] vocabulary ()  { throw new RuntimeException(); }
  // not preceding
  public  double trainingLogLikelihood ()  { throw new RuntimeException(); }
  // not preceding
  public  double logPrior ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> data)  { throw new RuntimeException(); }
  public  double computeLogPerplexity (org.apache.spark.sql.Dataset<?> data)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> topics (int maxTermsPerTopic)  { throw new RuntimeException(); }
  // not preceding
  public  boolean isDistributed ()  { throw new RuntimeException(); }
  // not preceding
  public  int vocabSize ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] docConcentration ()  { throw new RuntimeException(); }
  // not preceding
  public  double topicConcentration ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
