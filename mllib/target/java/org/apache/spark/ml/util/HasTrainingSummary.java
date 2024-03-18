package org.apache.spark.ml.util;
/**
 * Trait for models that provides Training summary.
 * <p>
 * @param <T>  Summary instance type
 */
public  interface HasTrainingSummary<T extends java.lang.Object> {
  /** Indicates whether a training summary exists for this model instance. */
  public  boolean hasSummary ()  ;
    org.apache.spark.ml.util.HasTrainingSummary<T> setSummary (scala.Option<T> summary)  ;
  /**
   * Gets summary of model on training set. An exception is
   * thrown if if <code>hasSummary</code> is false.
   * @return (undocumented)
   */
  public  T summary ()  ;
    scala.Option<T> trainingSummary ()  ;
}
