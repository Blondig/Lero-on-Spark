package org.apache.spark.ml.util;
/**
 * A small wrapper that defines a training session for an estimator, some methods to log
 * useful information during this session, and some methods to send
 * {@link org.apache.spark.ml.MLEvent}.
 */
  class Instrumentation implements org.apache.spark.internal.Logging, org.apache.spark.ml.MLEvents {
  static public  class loggerTags$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final loggerTags$ MODULE$ = null;
    public   loggerTags$ ()  { throw new RuntimeException(); }
    public  java.lang.String numFeatures ()  { throw new RuntimeException(); }
    public  java.lang.String numClasses ()  { throw new RuntimeException(); }
    public  java.lang.String numExamples ()  { throw new RuntimeException(); }
    public  java.lang.String meanOfLabels ()  { throw new RuntimeException(); }
    public  java.lang.String varianceOfLabels ()  { throw new RuntimeException(); }
    public  java.lang.String sumOfWeights ()  { throw new RuntimeException(); }
  }
  static public <T extends java.lang.Object> T instrumented (scala.Function1<org.apache.spark.ml.util.Instrumentation, T> body)  { throw new RuntimeException(); }
    java.lang.String prefix ()  { throw new RuntimeException(); }
  /**
   * Log some info about the pipeline stage being fit.
   * @param stage (undocumented)
   */
  public  void logPipelineStage (org.apache.spark.ml.PipelineStage stage)  { throw new RuntimeException(); }
  /**
   * Log some data about the dataset being fit.
   * @param dataset (undocumented)
   */
  public  void logDataset (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Log some data about the dataset being fit.
   * @param dataset (undocumented)
   */
  public  void logDataset (org.apache.spark.rdd.RDD<?> dataset)  { throw new RuntimeException(); }
  /**
   * Logs a debug message with a prefix that uniquely identifies the training session.
   * @param msg (undocumented)
   */
  public  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  /**
   * Logs a warning message with a prefix that uniquely identifies the training session.
   * @param msg (undocumented)
   */
  public  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  /**
   * Logs a error message with a prefix that uniquely identifies the training session.
   * @param msg (undocumented)
   */
  public  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  /**
   * Logs an info message with a prefix that uniquely identifies the training session.
   * @param msg (undocumented)
   */
  public  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  /**
   * Logs the value of the given parameters for the estimator being used in this session.
   * @param hasParams (undocumented)
   * @param params (undocumented)
   */
  public  void logParams (org.apache.spark.ml.param.Params hasParams, scala.collection.Seq<org.apache.spark.ml.param.Param<?>> params)  { throw new RuntimeException(); }
  public  void logNumFeatures (long num)  { throw new RuntimeException(); }
  public  void logNumClasses (long num)  { throw new RuntimeException(); }
  public  void logNumExamples (long num)  { throw new RuntimeException(); }
  public  void logSumOfWeights (double num)  { throw new RuntimeException(); }
  /**
   * Logs the value with customized name field.
   * @param name (undocumented)
   * @param value (undocumented)
   */
  public  void logNamedValue (java.lang.String name, java.lang.String value)  { throw new RuntimeException(); }
  public  void logNamedValue (java.lang.String name, long value)  { throw new RuntimeException(); }
  public  void logNamedValue (java.lang.String name, double value)  { throw new RuntimeException(); }
  public  void logNamedValue (java.lang.String name, java.lang.String[] value)  { throw new RuntimeException(); }
  public  void logNamedValue (java.lang.String name, long[] value)  { throw new RuntimeException(); }
  public  void logNamedValue (java.lang.String name, double[] value)  { throw new RuntimeException(); }
  /**
   * Logs the successful completion of the training session.
   */
  public  void logSuccess ()  { throw new RuntimeException(); }
  /**
   * Logs an exception raised during a training session.
   * @param e (undocumented)
   */
  public  void logFailure (java.lang.Throwable e)  { throw new RuntimeException(); }
}
