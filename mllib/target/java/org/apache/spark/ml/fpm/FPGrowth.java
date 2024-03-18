package org.apache.spark.ml.fpm;
/**
 * A parallel FP-growth algorithm to mine frequent itemsets. The algorithm is described in
 * <a href="https://doi.org/10.1145/1454008.1454027">Li et al., PFP: Parallel FP-Growth for Query
 * Recommendation</a>. PFP distributes computation in such a way that each worker executes an
 * independent group of mining tasks. The FP-Growth algorithm is described in
 * <a href="https://doi.org/10.1145/335191.335372">Han et al., Mining frequent patterns without
 * candidate generation</a>. Note null values in the itemsCol column are ignored during fit().
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Association_rule_learning">
 * Association rule learning (Wikipedia)</a>
 */
public  class FPGrowth extends org.apache.spark.ml.Estimator<org.apache.spark.ml.fpm.FPGrowthModel> implements org.apache.spark.ml.fpm.FPGrowthParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.fpm.FPGrowth load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> itemsCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam minSupport ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam numPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam minConfidence ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   FPGrowth (java.lang.String uid)  { throw new RuntimeException(); }
  public   FPGrowth ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowth setMinSupport (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.fpm.FPGrowth setNumPartitions (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowth setMinConfidence (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowth setItemsCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowth setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.fpm.FPGrowthModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.fpm.FPGrowth copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
