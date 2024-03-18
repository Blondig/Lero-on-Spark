package org.apache.spark.ml;
/**
 * A small trait that defines some methods to send {@link org.apache.spark.ml.MLEvent}.
 */
public  interface MLEvents extends org.apache.spark.internal.Logging {
  public  org.apache.spark.scheduler.LiveListenerBus listenerBus ()  ;
  /**
   * Log {@link MLEvent} to send. By default, it emits a debug-level log.
   * @param event (undocumented)
   */
  public  void logEvent (org.apache.spark.ml.MLEvent event)  ;
  public <M extends org.apache.spark.ml.Model<M>> M withFitEvent (org.apache.spark.ml.Estimator<M> estimator, org.apache.spark.sql.Dataset<?> dataset, scala.Function0<M> func)  ;
  public <T extends java.lang.Object> T withLoadInstanceEvent (org.apache.spark.ml.util.MLReader<T> reader, java.lang.String path, scala.Function0<T> func)  ;
  public  void withSaveInstanceEvent (org.apache.spark.ml.util.MLWriter writer, java.lang.String path, scala.Function0<scala.runtime.BoxedUnit> func)  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> withTransformEvent (org.apache.spark.ml.Transformer transformer, org.apache.spark.sql.Dataset<?> input, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> func)  ;
}
