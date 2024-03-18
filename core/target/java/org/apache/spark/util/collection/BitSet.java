package org.apache.spark.util.collection;
/**
 * A simple, fixed-size bit set implementation. This implementation is fast because it avoids
 * safety/bound checking.
 */
public  class BitSet implements scala.Serializable {
  public   BitSet (int numBits)  { throw new RuntimeException(); }
  /**
   * Compute the difference of the two sets by performing bit-wise AND-NOT returning the
   * result.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.util.collection.BitSet andNot (org.apache.spark.util.collection.BitSet other)  { throw new RuntimeException(); }
  /**
   * Compute the capacity (number of bits) that can be represented
   * by this bitset.
   * @return (undocumented)
   */
  public  int capacity ()  { throw new RuntimeException(); }
  /** Return the number of bits set to true in this BitSet. */
  public  int cardinality ()  { throw new RuntimeException(); }
  /**
   * Clear all set bits.
   */
  public  void clear ()  { throw new RuntimeException(); }
  /**
   * Clear all the bits up to a given index
   * @param bitIndex (undocumented)
   */
  public  void clearUntil (int bitIndex)  { throw new RuntimeException(); }
  /**
   * Return the value of the bit with the specified index. The value is true if the bit with
   * the index is currently set in this BitSet; otherwise, the result is false.
   * <p>
   * @param index the bit index
   * @return the value of the bit with the specified index
   */
  public  boolean get (int index)  { throw new RuntimeException(); }
  /**
   * Get an iterator over the set bits.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<java.lang.Object> iterator ()  { throw new RuntimeException(); }
  /**
   * Returns the index of the first bit that is set to true that occurs on or after the
   * specified starting index. If no such bit exists then -1 is returned.
   * <p>
   * To iterate over the true bits in a BitSet, use the following loop:
   * <p>
   *  for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i+1)) {
   *    // operate on index i here
   *  }
   * <p>
   * @param fromIndex the index to start checking from (inclusive)
   * @return the index of the next set bit, or -1 if there is no such bit
   */
  public  int nextSetBit (int fromIndex)  { throw new RuntimeException(); }
  /**
   * Sets the bit at the specified index to true.
   * @param index the bit index
   */
  public  void set (int index)  { throw new RuntimeException(); }
  /**
   * Set all the bits up to a given index
   * @param bitIndex (undocumented)
   */
  public  void setUntil (int bitIndex)  { throw new RuntimeException(); }
  /**
   * Compute bit-wise union with another BitSet and overwrite bits in this BitSet with the result.
   * @param other (undocumented)
   */
  public  void union (org.apache.spark.util.collection.BitSet other)  { throw new RuntimeException(); }
  public  void unset (int index)  { throw new RuntimeException(); }
}
