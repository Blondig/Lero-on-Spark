package org.apache.spark.ml.util;
/**
 * ML export formats for should implement this trait so that users can specify a shortname rather
 * than the fully qualified class name of the exporter.
 * <p>
 * A new instance of this class will be instantiated each time a save call is made.
 * <p>
 * @since 2.4.0
 */
public  interface MLFormatRegister extends org.apache.spark.ml.util.MLWriterFormat {
  /**
   * The string that represents the format that this format provider uses. This is, along with
   * stageName, is overridden by children to provide a nice alias for the writer. For example:
   * <p>
   * <pre><code>
   *   override def format(): String =
   *       "pmml"
   * </code></pre>
   * Indicates that this format is capable of saving a pmml model.
   * <p>
   * Must have a valid zero argument constructor which will be called to instantiate.
   * <p>
   * Format discovery is done using a ServiceLoader so make sure to list your format in
   * META-INF/services.
   * @since 2.4.0
   * @return (undocumented)
   */
  public  java.lang.String format ()  ;
    java.lang.String shortName ()  ;
  /**
   * The string that represents the stage type that this writer supports. This is, along with
   * format, is overridden by children to provide a nice alias for the writer. For example:
   * <p>
   * <pre><code>
   *   override def stageName(): String =
   *       "org.apache.spark.ml.regression.LinearRegressionModel"
   * </code></pre>
   * Indicates that this format is capable of saving Spark's own PMML model.
   * <p>
   * Format discovery is done using a ServiceLoader so make sure to list your format in
   * META-INF/services.
   * @since 2.4.0
   * @return (undocumented)
   */
  public  java.lang.String stageName ()  ;
}
