package org.apache.spark.ml.classification;
/**
 * Abstraction for multiclass RandomForestClassification results for a given model.
 */
public  interface RandomForestClassificationSummary extends org.apache.spark.ml.classification.ClassificationSummary {
  /**
   * Convenient method for casting to BinaryRandomForestClassificationSummary.
   * This method will throw an Exception if the summary is not a binary summary.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.BinaryRandomForestClassificationSummary asBinary ()  ;
}
