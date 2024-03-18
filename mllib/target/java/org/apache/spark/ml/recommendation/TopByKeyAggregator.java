package org.apache.spark.ml.recommendation;
/**
 * Works on rows of the form (K1, K2, V) where K1 &amp; K2 are IDs and V is the score value. Finds
 * the top <code>num</code> K2 items based on the given Ordering.
 */
  class TopByKeyAggregator<K1 extends java.lang.Object, K2 extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.sql.expressions.Aggregator<scala.Tuple3<K1, K2, V>, org.apache.spark.util.BoundedPriorityQueue<scala.Tuple2<K2, V>>, scala.Tuple2<K2, V>[]> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   TopByKeyAggregator (int num, scala.math.Ordering<scala.Tuple2<K2, V>> ord, scala.reflect.api.TypeTags.TypeTag<K1> evidence$1, scala.reflect.api.TypeTags.TypeTag<K2> evidence$2, scala.reflect.api.TypeTags.TypeTag<V> evidence$3)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<org.apache.spark.util.BoundedPriorityQueue<scala.Tuple2<K2, V>>> bufferEncoder ()  { throw new RuntimeException(); }
  public  scala.Tuple2<K2, V>[] finish (org.apache.spark.util.BoundedPriorityQueue<scala.Tuple2<K2, V>> r)  { throw new RuntimeException(); }
  public  org.apache.spark.util.BoundedPriorityQueue<scala.Tuple2<K2, V>> merge (org.apache.spark.util.BoundedPriorityQueue<scala.Tuple2<K2, V>> q1, org.apache.spark.util.BoundedPriorityQueue<scala.Tuple2<K2, V>> q2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Tuple2<K2, V>[]> outputEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.BoundedPriorityQueue<scala.Tuple2<K2, V>> reduce (org.apache.spark.util.BoundedPriorityQueue<scala.Tuple2<K2, V>> q, scala.Tuple3<K1, K2, V> a)  { throw new RuntimeException(); }
  public  org.apache.spark.util.BoundedPriorityQueue<scala.Tuple2<K2, V>> zero ()  { throw new RuntimeException(); }
}
