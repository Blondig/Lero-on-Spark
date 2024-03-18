package org.apache.spark.shuffle;
/**
 * An opaque handle to a shuffle, used by a ShuffleManager to pass information about it to tasks.
 * <p>
 * param:  shuffleId ID of the shuffle
 */
public abstract class ShuffleHandle implements scala.Serializable {
  // not preceding
  public   ShuffleHandle (int shuffleId)  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
}
