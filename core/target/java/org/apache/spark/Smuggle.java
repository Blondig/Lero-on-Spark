package org.apache.spark;
/**
 * Utility wrapper to "smuggle" objects into tasks while bypassing serialization.
 * This is intended for testing purposes, primarily to make locks, semaphores, and
 * other constructs that would not survive serialization available from within tasks.
 * A Smuggle reference is itself serializable, but after being serialized and
 * deserialized, it still refers to the same underlying "smuggled" object, as long
 * as it was deserialized within the same JVM. This can be useful for tests that
 * depend on the timing of task completion to be deterministic, since one can "smuggle"
 * a lock or semaphore into the task, and then the task can block until the test gives
 * the go-ahead to proceed via the lock.
 */
public  class Smuggle<T extends java.lang.Object> implements scala.Serializable {
  /**
   * Wraps the specified object to be smuggled into a serialized task without
   * being serialized itself.
   * <p>
   * @param smuggledObject
   * @tparam T
   * @return Smuggle wrapper around smuggledObject.
   */
  static public <T extends java.lang.Object> org.apache.spark.Smuggle<T> apply (T smuggledObject)  { throw new RuntimeException(); }
  /**
   * Implicit conversion of a Smuggle wrapper to the object being smuggled.
   * <p>
   * @param smuggle the wrapper to unpack.
   * @tparam T
   * @return the smuggled object represented by the wrapper.
   */
  static public <T extends java.lang.Object> T unpackSmuggledObject (org.apache.spark.Smuggle<T> smuggle)  { throw new RuntimeException(); }
  public  scala.Symbol key ()  { throw new RuntimeException(); }
  public  T smuggledObject ()  { throw new RuntimeException(); }
}
