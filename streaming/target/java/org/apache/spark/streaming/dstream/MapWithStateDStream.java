package org.apache.spark.streaming.dstream;
/**
 * DStream representing the stream of data generated by <code>mapWithState</code> operation on a
 * {@link org.apache.spark.streaming.dstream.PairDStreamFunctions pair DStream}.
 * Additionally, it also gives access to the stream of state snapshots, that is, the state data of
 * all keys after a batch has updated them.
 * <p>
 * @param <KeyType>  Class of the key
 * @param <ValueType>  Class of the value
 * @param <StateType>  Class of the state data
 * @param <MappedType>  Class of the mapped data
 */
public abstract class MapWithStateDStream<KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<MappedType> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   MapWithStateDStream (org.apache.spark.streaming.StreamingContext ssc, scala.reflect.ClassTag<MappedType> evidence$1)  { throw new RuntimeException(); }
  /** Return a pair DStream where each RDD is the snapshot of the state of all the keys. */
  public abstract  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<KeyType, StateType>> stateSnapshots ()  ;
}
