package org.apache.spark.ml.feature;
/**
 * Chi-Squared feature selection, which selects categorical features to use for predicting a
 * categorical label.
 * The selector supports different selection methods: <code>numTopFeatures</code>, <code>percentile</code>, <code>fpr</code>,
 * <code>fdr</code>, <code>fwe</code>.
 *  - <code>numTopFeatures</code> chooses a fixed number of top features according to a chi-squared test.
 *  - <code>percentile</code> is similar but chooses a fraction of all features instead of a fixed number.
 *  - <code>fpr</code> chooses all features whose p-value are below a threshold, thus controlling the false
 *    positive rate of selection.
 *  - <code>fdr</code> uses the [Benjamini-Hochberg procedure]
 *    (https://en.wikipedia.org/wiki/False_discovery_rate#Benjamini.E2.80.93Hochberg_procedure)
 *    to choose all features whose false discovery rate is below a threshold.
 *  - <code>fwe</code> chooses all features whose p-values are below a threshold. The threshold is scaled by
 *    1/numFeatures, thus controlling the family-wise error rate of selection.
 * By default, the selection method is <code>numTopFeatures</code>, with the default number of top features
 * set to 50.
 *
 * @deprecated use UnivariateFeatureSelector instead. Since 3.1.1. 
 */
public final class ChiSqSelector extends org.apache.spark.ml.feature.Selector<org.apache.spark.ml.feature.ChiSqSelectorModel> {
  static public  org.apache.spark.ml.feature.ChiSqSelector load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   ChiSqSelector (java.lang.String uid)  { throw new RuntimeException(); }
  public   ChiSqSelector ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setNumTopFeatures (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setPercentile (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setFpr (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setFdr (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setFwe (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setSelectorType (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * get the SelectionTestResult for every feature against the label
   * @param df (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getSelectionTestResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  /**
   * Create a new instance of concrete SelectorModel.
   * @param indices The indices of the selected features
   * @return A new SelectorModel instance
   * @param uid (undocumented)
   */
  protected  org.apache.spark.ml.feature.ChiSqSelectorModel createSelectorModel (java.lang.String uid, int[] indices)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelectorModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelector copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
