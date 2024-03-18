package org.apache.spark.mllib.fpm;
public  class PrefixSpan$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PrefixSpan$ MODULE$ = null;
  public   PrefixSpan$ ()  { throw new RuntimeException(); }
  /**
   * This methods finds all frequent items in a input dataset.
   * <p>
   * @param data Sequences of itemsets.
   * @param minCount The minimal number of sequence an item should be present in to be frequent
   * <p>
   * @return An array of Item containing only frequent items.
   * @param evidence$2 (undocumented)
   */
   <Item extends java.lang.Object> java.lang.Object findFrequentItems (org.apache.spark.rdd.RDD<java.lang.Object[]> data, long minCount, scala.reflect.ClassTag<Item> evidence$2)  { throw new RuntimeException(); }
  /**
   * This methods cleans the input dataset from un-frequent items, and translate it's item
   * to their corresponding Int identifier.
   * <p>
   * @param data Sequences of itemsets.
   * @param itemToInt A map allowing translation of frequent Items to their Int Identifier.
   *                  The map should only contain frequent item.
   * <p>
   * @return The internal repr of the inputted dataset. With properly placed zero delimiter.
   * @param evidence$3 (undocumented)
   */
   <Item extends java.lang.Object> org.apache.spark.rdd.RDD<int[]> toDatabaseInternalRepr (org.apache.spark.rdd.RDD<java.lang.Object[]> data, scala.collection.immutable.Map<Item, java.lang.Object> itemToInt, scala.reflect.ClassTag<Item> evidence$3)  { throw new RuntimeException(); }
  /**
   * Find the complete set of frequent sequential patterns in the input sequences.
   * @param data ordered sequences of itemsets. We represent a sequence internally as Array[Int],
   *             where each itemset is represented by a contiguous sequence of distinct and ordered
   *             positive integers. We use 0 as the delimiter at itemset boundaries, including the
   *             first and the last position.
   * @return an RDD of (frequent sequential pattern, count) pairs,
   * @see Postfix
   * @param minCount (undocumented)
   * @param maxPatternLength (undocumented)
   * @param maxLocalProjDBSize (undocumented)
   */
    org.apache.spark.rdd.RDD<scala.Tuple2<int[], java.lang.Object>> genFreqPatterns (org.apache.spark.rdd.RDD<int[]> data, long minCount, int maxPatternLength, long maxLocalProjDBSize)  { throw new RuntimeException(); }
}
