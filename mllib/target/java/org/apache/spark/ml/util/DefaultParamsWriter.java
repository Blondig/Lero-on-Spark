package org.apache.spark.ml.util;
/**
 * Default <code>MLWriter</code> implementation for transformers and estimators that contain basic
 * (json4s-serializable) params and no data. This will not handle more complex params or types with
 * data (e.g., models with coefficients).
 * <p>
 * param:  instance object to save
 */
  class DefaultParamsWriter extends org.apache.spark.ml.util.MLWriter {
  /**
   * Saves metadata + Params to: path + "/metadata"
   *  - class
   *  - timestamp
   *  - sparkVersion
   *  - uid
   *  - defaultParamMap
   *  - paramMap
   *  - (optionally, extra metadata)
   * <p>
   * @param extraMetadata  Extra metadata to be saved at same level as uid, paramMap, etc.
   * @param paramMap  If given, this is saved in the "paramMap" field.
   *                  Otherwise, all {@link org.apache.spark.ml.param.Param}s are encoded using
   *                  {@link org.apache.spark.ml.param.Param.jsonEncode()}.
   * @param instance (undocumented)
   * @param path (undocumented)
   * @param sc (undocumented)
   */
  static public  void saveMetadata (org.apache.spark.ml.param.Params instance, java.lang.String path, org.apache.spark.SparkContext sc, scala.Option<org.json4s.JsonAST.JObject> extraMetadata, scala.Option<org.json4s.JsonAST.JValue> paramMap)  { throw new RuntimeException(); }
  /**
   * Helper for {@link saveMetadata()} which extracts the JSON to save.
   * This is useful for ensemble models which need to save metadata for many sub-models.
   * <p>
   * @see {@link saveMetadata()} for details on what this includes.
   * @param instance (undocumented)
   * @param sc (undocumented)
   * @param extraMetadata (undocumented)
   * @param paramMap (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getMetadataToSave (org.apache.spark.ml.param.Params instance, org.apache.spark.SparkContext sc, scala.Option<org.json4s.JsonAST.JObject> extraMetadata, scala.Option<org.json4s.JsonAST.JValue> paramMap)  { throw new RuntimeException(); }
  public   DefaultParamsWriter (org.apache.spark.ml.param.Params instance)  { throw new RuntimeException(); }
  protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
}
