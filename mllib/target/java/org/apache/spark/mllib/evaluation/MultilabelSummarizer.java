package org.apache.spark.mllib.evaluation;
  class MultilabelSummarizer implements scala.Serializable {
  public   MultilabelSummarizer ()  { throw new RuntimeException(); }
  public  double accuracy ()  { throw new RuntimeException(); }
  /**
   * Add a new sample (predictions and labels) to this summarizer, and update
   * the statistical summary.
   * <p>
   * @return This MultilabelSummarizer object.
   * @param predictions (undocumented)
   * @param labels (undocumented)
   */
  public  org.apache.spark.mllib.evaluation.MultilabelSummarizer add (double[] predictions, double[] labels)  { throw new RuntimeException(); }
  public  double f1Measure ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.Object, java.lang.Object> fnPerClass ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.Object, java.lang.Object> fpPerClass ()  { throw new RuntimeException(); }
  public  double hammingLoss ()  { throw new RuntimeException(); }
  /**
   * Merge another MultilabelSummarizer, and update the statistical summary.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other MultilabelSummarizer to be merged.
   * @return This MultilabelSummarizer object.
   */
  public  org.apache.spark.mllib.evaluation.MultilabelSummarizer merge (org.apache.spark.mllib.evaluation.MultilabelSummarizer other)  { throw new RuntimeException(); }
  public  long numDocs ()  { throw new RuntimeException(); }
  public  long numLabels ()  { throw new RuntimeException(); }
  public  double precision ()  { throw new RuntimeException(); }
  public  double recall ()  { throw new RuntimeException(); }
  public  double subsetAccuracy ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.Object, java.lang.Object> tpPerClass ()  { throw new RuntimeException(); }
}
