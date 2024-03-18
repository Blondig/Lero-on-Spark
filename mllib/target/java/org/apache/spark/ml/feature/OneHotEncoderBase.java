package org.apache.spark.ml.feature;
/** Private trait for params and common methods for OneHotEncoder and OneHotEncoderModel */
public  interface OneHotEncoderBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasHandleInvalid, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasOutputCols {
  /**
   * Whether to drop the last category in the encoded vector (default: true)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam dropLast ()  ;
  /** @group getParam */
  public  boolean getDropLast ()  ;
  /** Returns the input and output column names corresponding in pair. */
    scala.Tuple2<java.lang.String[], java.lang.String[]> getInOutCols ()  ;
  /**
   * Param for how to handle invalid data during transform().
   * Options are 'keep' (invalid data presented as an extra categorical feature) or
   * 'error' (throw an error).
   * Note that this Param is only used during transform; during fitting, invalid data
   * will result in an error.
   * Default: "error"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  ;
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean dropLast, boolean keepInvalid)  ;
}
