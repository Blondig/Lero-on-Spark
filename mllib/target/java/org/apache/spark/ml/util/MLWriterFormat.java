package org.apache.spark.ml.util;
/**
 * Abstract class to be implemented by objects that provide ML exportability.
 * <p>
 * A new instance of this class will be instantiated each time a save call is made.
 * <p>
 * Must have a valid zero argument constructor which will be called to instantiate.
 * <p>
 * @since 2.4.0
 */
public  interface MLWriterFormat {
  /**
   * Function to write the provided pipeline stage out.
   * <p>
   * @param path  The path to write the result out to.
   * @param session  SparkSession associated with the write request.
   * @param optionMap  User provided options stored as strings.
   * @param stage  The pipeline stage to be saved.
   */
  public  void write (java.lang.String path, org.apache.spark.sql.SparkSession session, scala.collection.mutable.Map<java.lang.String, java.lang.String> optionMap, org.apache.spark.ml.PipelineStage stage)  ;
}
