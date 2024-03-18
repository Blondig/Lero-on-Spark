package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param aggregationDepth (default: 2). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasAggregationDepth extends org.apache.spark.ml.param.Params {
  /**
   * Param for suggested depth for treeAggregate (&amp;gt;= 2).
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam aggregationDepth ()  ;
  /** @group expertGetParam */
  public  int getAggregationDepth ()  ;
}
