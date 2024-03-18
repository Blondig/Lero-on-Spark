package org.apache.spark.rdd;
/**
 * :: Experimental ::
 * Wraps an RDD in a barrier stage, which forces Spark to launch tasks of this stage together.
 * {@link org.apache.spark.rdd.RDDBarrier} instances are created by
 * {@link org.apache.spark.rdd.RDD#barrier}.
 */
public  class RDDBarrier<T extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
     RDDBarrier (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a new RDD by applying a function to each partition of the wrapped RDD,
   * where tasks are launched together in a barrier stage.
   * The interface is the same as {@link org.apache.spark.rdd.RDD#mapPartitions}.
   * Please see the API doc there.
   * @see org.apache.spark.BarrierTaskContext
   * @param f (undocumented)
   * @param preservesPartitioning (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.rdd.RDD<S> mapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<S>> f, boolean preservesPartitioning, scala.reflect.ClassTag<S> evidence$2)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a new RDD by applying a function to each partition of the wrapped RDD, while tracking
   * the index of the original partition. And all tasks are launched together in a barrier stage.
   * The interface is the same as {@link org.apache.spark.rdd.RDD#mapPartitionsWithIndex}.
   * Please see the API doc there.
   * @see org.apache.spark.BarrierTaskContext
   * @param f (undocumented)
   * @param preservesPartitioning (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.rdd.RDD<S> mapPartitionsWithIndex (scala.Function2<java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<S>> f, boolean preservesPartitioning, scala.reflect.ClassTag<S> evidence$3)  { throw new RuntimeException(); }
}
