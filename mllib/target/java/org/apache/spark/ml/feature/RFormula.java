package org.apache.spark.ml.feature;
/**
 * Implements the transforms required for fitting a dataset against an R model formula. Currently
 * we support a limited subset of the R operators, including '~', '.', ':', '+', '-', '*' and '^'.
 * Also see the R formula docs here:
 * http://stat.ethz.ch/R-manual/R-patched/library/stats/html/formula.html
 * <p>
 * The basic operators are:
 *  - <code>~</code> separate target and terms
 *  - <code>+</code> concat terms, "+ 0" means removing intercept
 *  - <code>-</code> remove a term, "- 1" means removing intercept
 *  - <code>:</code> interaction (multiplication for numeric values, or binarized categorical values)
 *  - <code>.</code> all columns except target
 *  - <code>*</code> factor crossing, includes the terms and interactions between them
 *  - <code>^</code> factor crossing to a specified degree
 * <p>
 * Suppose <code>a</code> and <code>b</code> are double columns, we use the following simple examples
 * to illustrate the effect of <code>RFormula</code>:
 *  - <code>y ~ a + b</code> means model <code>y ~ w0 + w1 * a + w2 * b</code> where <code>w0</code> is the intercept and <code>w1, w2</code>
 * are coefficients.
 *  - <code>y ~ a + b + a:b - 1</code> means model <code>y ~ w1 * a + w2 * b + w3 * a * b</code> where <code>w1, w2, w3</code>
 * are coefficients.
 *  - <code>y ~ a * b</code> means model <code>y ~ w0 + w1 * a + w2 * b + w3 * a * b</code> where <code>w0</code> is the
 *  intercept and <code>w1, w2, w3</code> are coefficients
 *  - <code>y ~ (a + b)^2</code> means model <code>y ~ w0 + w1 * a + w2 * b + w3 * a * b</code> where <code>w0</code> is the
 *  intercept and <code>w1, w2, w3</code> are coefficients
 * <p>
 * RFormula produces a vector column of features and a double or string column of label.
 * Like when formulas are used in R for linear regression, string input columns will be one-hot
 * encoded, and numeric columns will be cast to doubles.
 * If the label column is of type string, it will be first transformed to double with
 * <code>StringIndexer</code>. If the label column does not exist in the DataFrame, the output label column
 * will be created from the specified response variable in the formula.
 */
public  class RFormula extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.RFormulaModel> implements org.apache.spark.ml.feature.RFormulaBase, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.RFormula load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> formula ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam forceIndexLabel ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> stringIndexerOrderType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RFormula (java.lang.String uid)  { throw new RuntimeException(); }
  public   RFormula ()  { throw new RuntimeException(); }
  /**
   * Sets the formula to use for this transformer. Must be called before use.
   * @group setParam
   * @param value an R formula in string form (e.g. "y ~ x + z")
   * @return (undocumented)
   */
  public  org.apache.spark.ml.feature.RFormula setFormula (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setForceIndexLabel (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setStringIndexerOrderType (java.lang.String value)  { throw new RuntimeException(); }
  /** Whether the formula specifies fitting an intercept. */
    boolean hasIntercept ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormulaModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormula copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
