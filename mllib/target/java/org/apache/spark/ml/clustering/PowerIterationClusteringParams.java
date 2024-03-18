package org.apache.spark.ml.clustering;
/**
 * Common params for PowerIterationClustering
 */
public  interface PowerIterationClusteringParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasWeightCol {
  /**
   * Name of the input column for destination vertex IDs.
   * Default: "dst"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> dstCol ()  ;
  /** @group getParam */
  public  java.lang.String getDstCol ()  ;
  /** @group expertGetParam */
  public  java.lang.String getInitMode ()  ;
  /** @group getParam */
  public  int getK ()  ;
  /** @group getParam */
  public  java.lang.String getSrcCol ()  ;
  /**
   * Param for the initialization algorithm. This can be either "random" to use a random vector
   * as vertex properties, or "degree" to use a normalized sum of similarities with other vertices.
   * Default: random.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> initMode ()  ;
  /**
   * The number of clusters to create (k). Must be &amp;gt; 1. Default: 2.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam k ()  ;
  /**
   * Param for the name of the input column for source vertex IDs.
   * Default: "src"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> srcCol ()  ;
}
