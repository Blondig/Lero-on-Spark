package org.apache.spark.mllib.fpm;
/**
 * A parallel FP-growth algorithm to mine frequent itemsets. The algorithm is described in
 * <a href="https://doi.org/10.1145/1454008.1454027">Li et al., PFP: Parallel FP-Growth for Query
 * Recommendation</a>. PFP distributes computation in such a way that each worker executes an
 * independent group of mining tasks. The FP-Growth algorithm is described in
 * <a href="https://doi.org/10.1145/335191.335372">Han et al., Mining frequent patterns without
 * candidate generation</a>.
 * <p>
 * param:  minSupport the minimal support level of the frequent pattern, any pattern that appears
 *                   more than (minSupport * size-of-the-dataset) times will be output
 * param:  numPartitions number of partitions used by parallel FP-growth
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Association_rule_learning">
 * Association rule learning (Wikipedia)</a>
 * <p>
 */
public  class FPGrowth implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Frequent itemset.
   * param:  items items in this itemset. Java users should call <code>FreqItemset.javaItems</code> instead.
   * param:  freq frequency
   * @param <Item>  item type
   * <p>
   */
  static public  class FreqItemset<Item extends java.lang.Object> implements scala.Serializable {
    // not preceding
    public   FreqItemset (java.lang.Object items, long freq)  { throw new RuntimeException(); }
    public  long freq ()  { throw new RuntimeException(); }
    public  java.lang.Object items ()  { throw new RuntimeException(); }
    /**
     * Returns items in a Java List.
     * <p>
     * @return (undocumented)
     */
    public  java.util.List<Item> javaItems ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
     FPGrowth (double minSupport, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Constructs a default instance with default parameters {minSupport: <code>0.3</code>, numPartitions: same
   * as the input data}.
   * <p>
   */
  public   FPGrowth ()  { throw new RuntimeException(); }
  /**
   * Sets the minimal support level (default: <code>0.3</code>).
   * <p>
   * @param minSupport (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.FPGrowth setMinSupport (double minSupport)  { throw new RuntimeException(); }
  /**
   * Sets the number of partitions used by parallel FP-growth (default: same as input data).
   * <p>
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.FPGrowth setNumPartitions (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Computes an FP-Growth model that contains frequent itemsets.
   * @param data input data set, each element contains a transaction
   * @return an {@link FPGrowthModel}
   * <p>
   * @param evidence$4 (undocumented)
   */
  public <Item extends java.lang.Object> org.apache.spark.mllib.fpm.FPGrowthModel<Item> run (org.apache.spark.rdd.RDD<java.lang.Object> data, scala.reflect.ClassTag<Item> evidence$4)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>run</code>.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public <Item extends java.lang.Object, Basket extends java.lang.Iterable<Item>> org.apache.spark.mllib.fpm.FPGrowthModel<Item> run (org.apache.spark.api.java.JavaRDD<Basket> data)  { throw new RuntimeException(); }
}
