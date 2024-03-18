package org.apache.spark.sql.execution.streaming;
/**
 * A trigger executor that runs multiple batches then terminates.
 */
public  class MultiBatchExecutor implements org.apache.spark.sql.execution.streaming.TriggerExecutor, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public   MultiBatchExecutor ()  { throw new RuntimeException(); }
  /**
   * Execute multiple batches using <code>batchRunner</code>
   * @param batchRunner (undocumented)
   */
  public  void execute (scala.Function0<java.lang.Object> batchRunner)  { throw new RuntimeException(); }
}
