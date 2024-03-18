package org.apache.spark.streaming.dstream;
  class ShuffledDStream<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, C>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ShuffledDStream (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> parent, scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiner, org.apache.spark.Partitioner partitioner, boolean mapSideCombine, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<C> evidence$3)  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, C>>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
}
