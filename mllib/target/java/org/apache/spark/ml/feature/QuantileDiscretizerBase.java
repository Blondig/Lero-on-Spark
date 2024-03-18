package org.apache.spark.ml.feature;
/**
 * Params for {@link QuantileDiscretizer}.
 */
public  interface QuantileDiscretizerBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasHandleInvalid, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCols, org.apache.spark.ml.param.shared.HasRelativeError {
  /** @group getParam */
  public  int getNumBuckets ()  ;
  /** @group getParam */
  public  int[] getNumBucketsArray ()  ;
  /**
   * Param for how to handle invalid entries. Options are 'skip' (filter out rows with
   * invalid values), 'error' (throw an error), or 'keep' (keep invalid values in a special
   * additional bucket). Note that in the multiple columns case, the invalid handling is applied
   * to all columns. That said for 'error' it will throw an error if any invalids are found in
   * any column, for 'skip' it will skip rows with any invalids in any columns, etc.
   * Default: "error"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  ;
  /**
   * Number of buckets (quantiles, or categories) into which data points are grouped. Must
   * be greater than or equal to 2.
   * <p>
   * See also {@link handleInvalid}, which can optionally create an additional bucket for NaN values.
   * <p>
   * default: 2
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numBuckets ()  ;
  /**
   * Array of number of buckets (quantiles, or categories) into which data points are grouped.
   * Each value must be greater than or equal to 2
   * <p>
   * See also {@link handleInvalid}, which can optionally create an additional bucket for NaN values.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntArrayParam numBucketsArray ()  ;
}
