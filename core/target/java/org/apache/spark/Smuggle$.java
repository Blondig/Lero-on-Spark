package org.apache.spark;
public  class Smuggle$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Smuggle$ MODULE$ = null;
  public   Smuggle$ ()  { throw new RuntimeException(); }
  /**
   * Wraps the specified object to be smuggled into a serialized task without
   * being serialized itself.
   * <p>
   * @param smuggledObject
   * @tparam T
   * @return Smuggle wrapper around smuggledObject.
   */
  public <T extends java.lang.Object> org.apache.spark.Smuggle<T> apply (T smuggledObject)  { throw new RuntimeException(); }
  /**
   * Implicit conversion of a Smuggle wrapper to the object being smuggled.
   * <p>
   * @param smuggle the wrapper to unpack.
   * @tparam T
   * @return the smuggled object represented by the wrapper.
   */
  public <T extends java.lang.Object> T unpackSmuggledObject (org.apache.spark.Smuggle<T> smuggle)  { throw new RuntimeException(); }
}
