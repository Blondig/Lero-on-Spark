package org.apache.spark.ml.feature;
/**
 * Feature selector based on univariate statistical tests against labels. Currently, Spark
 * supports three Univariate Feature Selectors: chi-squared, ANOVA F-test and F-value.
 * User can choose Univariate Feature Selector by setting <code>featureType</code> and <code>labelType</code>,
 * and Spark will pick the score function based on the specified <code>featureType</code> and <code>labelType</code>.
 * <p>
 * The following combination of <code>featureType</code> and <code>labelType</code> are supported:
 *  - <code>featureType</code> <code>categorical</code> and <code>labelType</code> <code>categorical</code>: Spark uses chi-squared,
 *    i.e. chi2 in sklearn.
 *  - <code>featureType</code> <code>continuous</code> and <code>labelType</code> <code>categorical</code>: Spark uses ANOVA F-test,
 *    i.e. f_classif in sklearn.
 *  - <code>featureType</code> <code>continuous</code> and <code>labelType</code> <code>continuous</code>: Spark uses F-value,
 *    i.e. f_regression in sklearn.
 * <p>
 * The <code>UnivariateFeatureSelector</code> supports different selection modes: <code>numTopFeatures</code>,
 * <code>percentile</code>, <code>fpr</code>, <code>fdr</code>, <code>fwe</code>.
 *  - <code>numTopFeatures</code> chooses a fixed number of top features according to a hypothesis.
 *  - <code>percentile</code> is similar but chooses a fraction of all features instead of a fixed number.
 *  - <code>fpr</code> chooses all features whose p-value are below a threshold, thus controlling the false
 *    positive rate of selection.
 *  - <code>fdr</code> uses the <a href=
 *  "https://en.wikipedia.org/wiki/False_discovery_rate#Benjamini.E2.80.93Hochberg_procedure">
 *  Benjamini-Hochberg procedure</a>
 *    to choose all features whose false discovery rate is below a threshold.
 *  - <code>fwe</code> chooses all features whose p-values are below a threshold. The threshold is scaled by
 *    1/numFeatures, thus controlling the family-wise error rate of selection.
 * <p>
 * By default, the selection mode is <code>numTopFeatures</code>.
 */
public final class UnivariateFeatureSelector extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.UnivariateFeatureSelectorModel> implements org.apache.spark.ml.feature.UnivariateFeatureSelectorParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.UnivariateFeatureSelector load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featureType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> selectionMode ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam selectionThreshold ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   UnivariateFeatureSelector (java.lang.String uid)  { throw new RuntimeException(); }
  public   UnivariateFeatureSelector ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.UnivariateFeatureSelector setSelectionMode (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.UnivariateFeatureSelector setSelectionThreshold (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.UnivariateFeatureSelector setFeatureType (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.UnivariateFeatureSelector setLabelType (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.UnivariateFeatureSelector setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.UnivariateFeatureSelector setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.UnivariateFeatureSelector setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.UnivariateFeatureSelectorModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
    int[] selectIndicesFromPValues (int numFeatures, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> resultDF, java.lang.String selectionMode, double selectionThreshold)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.UnivariateFeatureSelector copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
