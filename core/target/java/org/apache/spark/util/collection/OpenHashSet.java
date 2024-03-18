package org.apache.spark.util.collection;
/**
 * A simple, fast hash set optimized for non-null insertion-only use case, where keys are never
 * removed.
 * <p>
 * The underlying implementation uses Scala compiler's specialization to generate optimized
 * storage for four primitive types (Long, Int, Double, and Float). It is much faster than Java's
 * standard HashSet while incurring much less memory overhead. This can serve as building blocks
 * for higher level data structures such as an optimized HashMap.
 * <p>
 * This OpenHashSet is designed to serve as building blocks for higher level data structures
 * such as an optimized hash map. Compared with standard hash set implementations, this class
 * provides its various callbacks interfaces (e.g. allocateFunc, moveFunc) and interfaces to
 * retrieve the position of a key in the underlying array.
 * <p>
 * It uses quadratic probing with a power-of-2 hash table size, which is guaranteed
 * to explore all spaces for each key (see http://en.wikipedia.org/wiki/Quadratic_probing).
 */
public  class OpenHashSet<T extends java.lang.Object> implements scala.Serializable {
  /**
   * A set of specialized hash function implementation to avoid boxing hash code computation
   * in the specialized implementation of OpenHashSet.
   */
  static public  class Hasher<T extends java.lang.Object> implements scala.Serializable {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   Hasher ()  { throw new RuntimeException(); }
    public  int hash (T o)  { throw new RuntimeException(); }
  }
  static public  class LongHasher extends org.apache.spark.util.collection.OpenHashSet.Hasher<java.lang.Object> {
    public   LongHasher ()  { throw new RuntimeException(); }
    public  int hash (long o)  { throw new RuntimeException(); }
  }
  static public  class IntHasher extends org.apache.spark.util.collection.OpenHashSet.Hasher<java.lang.Object> {
    public   IntHasher ()  { throw new RuntimeException(); }
    public  int hash (int o)  { throw new RuntimeException(); }
  }
  static public  class DoubleHasher extends org.apache.spark.util.collection.OpenHashSet.Hasher<java.lang.Object> {
    public   DoubleHasher ()  { throw new RuntimeException(); }
    public  int hash (double o)  { throw new RuntimeException(); }
  }
  static public  class FloatHasher extends org.apache.spark.util.collection.OpenHashSet.Hasher<java.lang.Object> {
    public   FloatHasher ()  { throw new RuntimeException(); }
    public  int hash (float o)  { throw new RuntimeException(); }
  }
  static public  int MAX_CAPACITY ()  { throw new RuntimeException(); }
  static public  int INVALID_POS ()  { throw new RuntimeException(); }
  static public  int NONEXISTENCE_MASK ()  { throw new RuntimeException(); }
  static public  int POSITION_MASK ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   OpenHashSet (int initialCapacity, double loadFactor, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public   OpenHashSet (int initialCapacity, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public   OpenHashSet (scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  protected  org.apache.spark.util.collection.OpenHashSet.Hasher<T> hasher ()  { throw new RuntimeException(); }
  protected  int _capacity ()  { throw new RuntimeException(); }
  protected  int _mask ()  { throw new RuntimeException(); }
  protected  int _size ()  { throw new RuntimeException(); }
  protected  int _growThreshold ()  { throw new RuntimeException(); }
  protected  org.apache.spark.util.collection.BitSet _bitset ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.BitSet getBitSet ()  { throw new RuntimeException(); }
  protected  java.lang.Object _data ()  { throw new RuntimeException(); }
  /** Number of elements in the set. */
  public  int size ()  { throw new RuntimeException(); }
  /** The capacity of the set (i.e. size of the underlying array). */
  public  int capacity ()  { throw new RuntimeException(); }
  /** Return true if this set contains the specified element. */
  public  boolean contains (T k)  { throw new RuntimeException(); }
  /**
   * Add an element to the set. If the set is over capacity after the insertion, grow the set
   * and rehash all elements.
   * @param k (undocumented)
   */
  public  void add (T k)  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashSet<T> union (org.apache.spark.util.collection.OpenHashSet<T> other)  { throw new RuntimeException(); }
  /**
   * Add an element to the set. This one differs from add in that it doesn't trigger rehashing.
   * The caller is responsible for calling rehashIfNeeded.
   * <p>
   * Use (retval &amp; POSITION_MASK) to get the actual position, and
   * (retval &amp; NONEXISTENCE_MASK) == 0 for prior existence.
   * <p>
   * @return The position where the key is placed, plus the highest order bit is set if the key
   *         does not exists previously.
   * @param k (undocumented)
   */
  public  int addWithoutResize (T k)  { throw new RuntimeException(); }
  /**
   * Rehash the set if it is overloaded.
   * @param k A parameter unused in the function, but to force the Scala compiler to specialize
   *          this method.
   * @param allocateFunc Callback invoked when we are allocating a new, larger array.
   * @param moveFunc Callback invoked when we move the key from one position (in the old data array)
   *                 to a new position (in the new data array).
   */
  public  void rehashIfNeeded (T k, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> allocateFunc, scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> moveFunc)  { throw new RuntimeException(); }
  /**
   * Return the position of the element in the underlying array, or INVALID_POS if it is not found.
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  int getPos (T k)  { throw new RuntimeException(); }
  /** Return the value at the specified position. */
  public  T getValue (int pos)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> iterator ()  { throw new RuntimeException(); }
  /** Return the value at the specified position. */
  public  T getValueSafe (int pos)  { throw new RuntimeException(); }
  /**
   * Return the next position with an element stored, starting from the given position inclusively.
   * @param fromPos (undocumented)
   * @return (undocumented)
   */
  public  int nextPos (int fromPos)  { throw new RuntimeException(); }
}
