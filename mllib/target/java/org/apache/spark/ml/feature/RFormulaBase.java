package org.apache.spark.ml.feature;
/**
 * Base trait for {@link RFormula} and {@link RFormulaModel}.
 */
public  interface RFormulaBase extends org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.param.shared.HasHandleInvalid {
  /**
   * Force to index label whether it is numeric or string type.
   * Usually we index label only when it is string type.
   * If the formula was used by classification algorithms,
   * we can force to index label even it is numeric type by setting this param with true.
   * Default: false.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam forceIndexLabel ()  ;
  /**
   * R formula parameter. The formula is provided in string form.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> formula ()  ;
  /** @group getParam */
  public  boolean getForceIndexLabel ()  ;
  /** @group getParam */
  public  java.lang.String getFormula ()  ;
  /** @group getParam */
  public  java.lang.String getStringIndexerOrderType ()  ;
  /**
   * Param for how to handle invalid data (unseen or NULL values) in features and label column
   * of string type. Options are 'skip' (filter out rows with invalid data),
   * 'error' (throw an error), or 'keep' (put invalid data in a special additional
   * bucket, at index numLabels).
   * Default: "error"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  ;
  public  boolean hasLabelCol (org.apache.spark.sql.types.StructType schema)  ;
  /**
   * Param for how to order categories of a string FEATURE column used by <code>StringIndexer</code>.
   * The last category after ordering is dropped when encoding strings.
   * Supported options: 'frequencyDesc', 'frequencyAsc', 'alphabetDesc', 'alphabetAsc'.
   * The default value is 'frequencyDesc'. When the ordering is set to 'alphabetDesc', <code>RFormula</code>
   * drops the same category as R when encoding strings.
   * <p>
   * The options are explained using an example <code>'b', 'a', 'b', 'a', 'c', 'b'</code>:
   * <pre><code>
   * +-----------------+---------------------------------------+----------------------------------+
   * |      Option     | Category mapped to 0 by StringIndexer |  Category dropped by RFormula    |
   * +-----------------+---------------------------------------+----------------------------------+
   * | 'frequencyDesc' | most frequent category ('b')          | least frequent category ('c')    |
   * | 'frequencyAsc'  | least frequent category ('c')         | most frequent category ('b')     |
   * | 'alphabetDesc'  | last alphabetical category ('c')      | first alphabetical category ('a')|
   * | 'alphabetAsc'   | first alphabetical category ('a')     | last alphabetical category ('c') |
   * +-----------------+---------------------------------------+----------------------------------+
   * </code></pre>
   * Note that this ordering option is NOT used for the label column. When the label column is
   * indexed, it uses the default descending frequency ordering in <code>StringIndexer</code>.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> stringIndexerOrderType ()  ;
}
