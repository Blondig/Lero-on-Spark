package org.apache.spark.ml.param.shared;
/**
 * Trait to define a level of parallelism for algorithms that are able to use
 * multithreaded execution, and provide a thread-pool based execution context.
 */
public  interface HasParallelism extends org.apache.spark.ml.param.Params {
  /**
   * Create a new execution context with a thread-pool that has a maximum number of threads
   * set to the value of {@link parallelism}. If this param is set to 1, a same-thread executor
   * will be used to run in serial.
   * @return (undocumented)
   */
    scala.concurrent.ExecutionContext getExecutionContext ()  ;
  /** @group expertGetParam */
  public  int getParallelism ()  ;
  /**
   * The number of threads to use when running parallel algorithms.
   * Default is 1 for serial execution
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam parallelism ()  ;
}
