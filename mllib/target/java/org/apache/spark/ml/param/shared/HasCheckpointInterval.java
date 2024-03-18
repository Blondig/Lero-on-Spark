package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param checkpointInterval. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasCheckpointInterval extends org.apache.spark.ml.param.Params {
  /**
   * Param for set checkpoint interval (&amp;gt;= 1) or disable checkpoint (-1). E.g. 10 means that the cache will get checkpointed every 10 iterations. Note: this setting will be ignored if the checkpoint directory is not set in the SparkContext.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam checkpointInterval ()  ;
  /** @group getParam */
  public  int getCheckpointInterval ()  ;
}
