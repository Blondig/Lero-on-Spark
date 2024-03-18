package org.apache.spark.mllib.random;
/**
 * Trait for random data generators that generate i.i.d. data.
 */
public  interface RandomDataGenerator<T extends java.lang.Object> extends org.apache.spark.util.random.Pseudorandom, scala.Serializable {
  /**
   * Returns a copy of the RandomDataGenerator with a new instance of the rng object used in the
   * class when applicable for non-locking concurrent usage.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.random.RandomDataGenerator<T> copy ()  ;
  /**
   * Returns an i.i.d. sample as a generic type from an underlying distribution.
   * @return (undocumented)
   */
  public  T nextValue ()  ;
}
