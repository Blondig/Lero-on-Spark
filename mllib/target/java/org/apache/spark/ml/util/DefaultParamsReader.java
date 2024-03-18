package org.apache.spark.ml.util;
/**
 * Default <code>MLReader</code> implementation for transformers and estimators that contain basic
 * (json4s-serializable) params and no data. This will not handle more complex params or types with
 * data (e.g., models with coefficients).
 * <p>
 * @param <T>  ML instance type
 * TODO: Consider adding check for correct class name.
 */
  class DefaultParamsReader<T extends java.lang.Object> extends org.apache.spark.ml.util.MLReader<T> {
  /**
   * All info from metadata file.
   * <p>
   * param:  params  paramMap, as a <code>JValue</code>
   * param:  defaultParams defaultParamMap, as a <code>JValue</code>. For metadata file prior to Spark 2.4,
   *                      this is <code>JNothing</code>.
   * param:  metadata  All metadata, including the other fields
   * param:  metadataJson  Full metadata file String (for debugging)
   */
  static public  class Metadata implements scala.Product, scala.Serializable {
    public  java.lang.String className ()  { throw new RuntimeException(); }
    public  java.lang.String uid ()  { throw new RuntimeException(); }
    public  long timestamp ()  { throw new RuntimeException(); }
    public  java.lang.String sparkVersion ()  { throw new RuntimeException(); }
    public  org.json4s.JsonAST.JValue params ()  { throw new RuntimeException(); }
    public  org.json4s.JsonAST.JValue defaultParams ()  { throw new RuntimeException(); }
    public  org.json4s.JsonAST.JValue metadata ()  { throw new RuntimeException(); }
    public  java.lang.String metadataJson ()  { throw new RuntimeException(); }
    // not preceding
    public   Metadata (java.lang.String className, java.lang.String uid, long timestamp, java.lang.String sparkVersion, org.json4s.JsonAST.JValue params, org.json4s.JsonAST.JValue defaultParams, org.json4s.JsonAST.JValue metadata, java.lang.String metadataJson)  { throw new RuntimeException(); }
    /**
     * Get the JSON value of the {@link org.apache.spark.ml.param.Param} of the given name.
     * This can be useful for getting a Param value before an instance of <code>Params</code>
     * is available. This will look up <code>params</code> first, if not existing then looking up
     * <code>defaultParams</code>.
     * @param paramName (undocumented)
     * @return (undocumented)
     */
    public  org.json4s.JsonAST.JValue getParamValue (java.lang.String paramName)  { throw new RuntimeException(); }
    /**
     * Extract Params from metadata, and set them in the instance.
     * This works if all Params (except params included by <code>skipParams</code> list) implement
     * {@link org.apache.spark.ml.param.Param.jsonDecode()}.
     * <p>
     * @param skipParams The params included in <code>skipParams</code> won't be set. This is useful if some
     *                   params don't implement {@link org.apache.spark.ml.param.Param.jsonDecode()}
     *                   and need special handling.
     * @param instance (undocumented)
     */
    public  void getAndSetParams (org.apache.spark.ml.param.Params instance, scala.Option<scala.collection.immutable.List<java.lang.String>> skipParams)  { throw new RuntimeException(); }
  }
  static public  class Metadata$ extends scala.runtime.AbstractFunction8<java.lang.String, java.lang.String, java.lang.Object, java.lang.String, org.json4s.JsonAST.JValue, org.json4s.JsonAST.JValue, org.json4s.JsonAST.JValue, java.lang.String, org.apache.spark.ml.util.DefaultParamsReader.Metadata> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Metadata$ MODULE$ = null;
    public   Metadata$ ()  { throw new RuntimeException(); }
  }
  /**
   * Load metadata saved using {@link DefaultParamsWriter.saveMetadata()}
   * <p>
   * @param expectedClassName  If non empty, this is checked against the loaded metadata.
   * @throws IllegalArgumentException if expectedClassName is specified and does not match metadata
   * @param path (undocumented)
   * @param sc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.util.DefaultParamsReader.Metadata loadMetadata (java.lang.String path, org.apache.spark.SparkContext sc, java.lang.String expectedClassName)  { throw new RuntimeException(); }
  /**
   * Parse metadata JSON string produced by {@link DefaultParamsWriter.getMetadataToSave()}.
   * This is a helper function for {@link loadMetadata()}.
   * <p>
   * @param metadataStr  JSON string of metadata
   * @param expectedClassName  If non empty, this is checked against the loaded metadata.
   * @throws IllegalArgumentException if expectedClassName is specified and does not match metadata
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.util.DefaultParamsReader.Metadata parseMetadata (java.lang.String metadataStr, java.lang.String expectedClassName)  { throw new RuntimeException(); }
  /**
   * Load a <code>Params</code> instance from the given path, and return it.
   * This assumes the instance implements {@link MLReadable}.
   * @param path (undocumented)
   * @param sc (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> T loadParamsInstance (java.lang.String path, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Load a <code>Params</code> instance reader from the given path, and return it.
   * This assumes the instance implements {@link MLReadable}.
   * @param path (undocumented)
   * @param sc (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> org.apache.spark.ml.util.MLReader<T> loadParamsInstanceReader (java.lang.String path, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   DefaultParamsReader ()  { throw new RuntimeException(); }
  public  T load (java.lang.String path)  { throw new RuntimeException(); }
}
