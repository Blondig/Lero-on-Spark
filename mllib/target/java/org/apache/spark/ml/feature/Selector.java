package org.apache.spark.ml.feature;
/**
 * Super class for feature selectors.
 * 1. Chi-Square Selector
 * This feature selector is for categorical features and categorical labels.
 * The selector supports different selection methods: <code>numTopFeatures</code>, <code>percentile</code>, <code>fpr</code>,
 * <code>fdr</code>, <code>fwe</code>.
 *  - <code>numTopFeatures</code> chooses a fixed number of top features according to a hypothesis.
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
 */
 abstract class Selector<T extends org.apache.spark.ml.feature.SelectorModel<T>> extends org.apache.spark.ml.Estimator<T> implements org.apache.spark.ml.feature.SelectorParams, org.apache.spark.ml.util.DefaultParamsWritable {
  public   Selector ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Selector<T> copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  /**
   * Create a new instance of concrete SelectorModel.
   * @param indices The indices of the selected features
   * @return A new SelectorModel instance
   * @param uid (undocumented)
   */
  protected abstract  T createSelectorModel (java.lang.String uid, int[] indices)  ;
  public final  org.apache.spark.ml.param.DoubleParam fdr ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  T fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam fpr ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam fwe ()  { throw new RuntimeException(); }
  /**
   * get the SelectionTestResult for every feature against the label
   * @param df (undocumented)
   * @return (undocumented)
   */
  protected abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getSelectionTestResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  ;
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.feature.SelectorModel), List(TypeTree().setOriginal(Ident(TypeName("T"))))))))
  public final  org.apache.spark.ml.param.IntParam numTopFeatures ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam percentile ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> selectorType ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Selector<T> setFdr (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Selector<T> setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Selector<T> setFpr (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Selector<T> setFwe (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Selector<T> setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Selector<T> setNumTopFeatures (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Selector<T> setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Selector<T> setPercentile (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Selector<T> setSelectorType (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
