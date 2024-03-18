package org.apache.spark.broadcast;
/**
 * A broadcast variable. Broadcast variables allow the programmer to keep a read-only variable
 * cached on each machine rather than shipping a copy of it with tasks. They can be used, for
 * example, to give every node a copy of a large input dataset in an efficient manner. Spark also
 * attempts to distribute broadcast variables using efficient broadcast algorithms to reduce
 * communication cost.
 * <p>
 * Broadcast variables are created from a variable <code>v</code> by calling
 * {@link org.apache.spark.SparkContext#broadcast}.
 * The broadcast variable is a wrapper around <code>v</code>, and its value can be accessed by calling the
 * <code>value</code> method. The interpreter session below shows this:
 * <p>
 * <pre><code>
 * scala&gt; val broadcastVar = sc.broadcast(Array(1, 2, 3))
 * broadcastVar: org.apache.spark.broadcast.Broadcast[Array[Int} = Broadcast(0)
 *
 * scala&gt; broadcastVar.value
 * res0: Array[Int] = Array(1, 2, 3)
 * </code></pre>
 * <p>
 * After the broadcast variable is created, it should be used instead of the value <code>v</code> in any
 * functions run on the cluster so that <code>v</code> is not shipped to the nodes more than once.
 * In addition, the object <code>v</code> should not be modified after it is broadcast in order to ensure
 * that all nodes get the same value of the broadcast variable (e.g. if the variable is shipped
 * to a new node later).
 * <p>
 * param:  id A unique identifier for the broadcast variable.
 * @param <T>  Type of the data contained in the broadcast variable.
 */
public abstract class Broadcast<T extends java.lang.Object> implements java.io.Serializable, org.apache.spark.internal.Logging {
  // not preceding
  public   Broadcast (long id, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /** Check if this broadcast is valid. If not valid, exception is thrown. */
  protected  void assertValid ()  { throw new RuntimeException(); }
  /**
   * Destroy all data and metadata related to this broadcast variable. Use this with caution;
   * once a broadcast variable has been destroyed, it cannot be used again.
   */
  public  void destroy ()  { throw new RuntimeException(); }
  /**
   * Destroy all data and metadata related to this broadcast variable. Use this with caution;
   * once a broadcast variable has been destroyed, it cannot be used again.
   * @param blocking Whether to block until destroy has completed
   */
    void destroy (boolean blocking)  { throw new RuntimeException(); }
  /**
   * Actually destroy all data and metadata related to this broadcast variable.
   * Implementation of Broadcast class must define their own logic to destroy their own
   * state.
   * @param blocking (undocumented)
   */
  protected abstract  void doDestroy (boolean blocking)  ;
  /**
   * Actually unpersist the broadcasted value on the executors. Concrete implementations of
   * Broadcast class must define their own logic to unpersist their own data.
   * @param blocking (undocumented)
   */
  protected abstract  void doUnpersist (boolean blocking)  ;
  /**
   * Actually get the broadcasted value. Concrete implementations of Broadcast class must
   * define their own way to get the value.
   * @return (undocumented)
   */
  protected abstract  T getValue ()  ;
  public  long id ()  { throw new RuntimeException(); }
  /**
   * Whether this Broadcast is actually usable. This should be false once persisted state is
   * removed from the driver.
   * @return (undocumented)
   */
    boolean isValid ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Asynchronously delete cached copies of this broadcast on the executors.
   * If the broadcast is used after this is called, it will need to be re-sent to each executor.
   */
  public  void unpersist ()  { throw new RuntimeException(); }
  /**
   * Delete cached copies of this broadcast on the executors. If the broadcast is used after
   * this is called, it will need to be re-sent to each executor.
   * @param blocking Whether to block until unpersisting has completed
   */
  public  void unpersist (boolean blocking)  { throw new RuntimeException(); }
  /** Get the broadcasted value. */
  public  T value ()  { throw new RuntimeException(); }
}
