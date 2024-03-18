package org.apache.spark.mllib.fpm;
/**
 * Calculate all patterns of a projected database in local mode.
 * <p>
 * param:  minCount minimal count for a frequent pattern
 * param:  maxPatternLength max pattern length for a frequent pattern
 */
  class LocalPrefixSpan implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Represents a prefix stored as a list in reversed order.
   * param:  items items in the prefix in reversed order
   * param:  length length of the prefix, not counting delimiters
   */
  static public  class ReversedPrefix implements scala.Serializable {
    public  scala.collection.immutable.List<java.lang.Object> items ()  { throw new RuntimeException(); }
    public  int length ()  { throw new RuntimeException(); }
    /**
     * Converts this prefix to a sequence.
     * @return (undocumented)
     */
    public  int[] toSequence ()  { throw new RuntimeException(); }
  }
  static public  class ReversedPrefix$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ReversedPrefix$ MODULE$ = null;
    public   ReversedPrefix$ ()  { throw new RuntimeException(); }
    /** An empty prefix. */
    public  org.apache.spark.mllib.fpm.LocalPrefixSpan.ReversedPrefix empty ()  { throw new RuntimeException(); }
  }
  public  long minCount ()  { throw new RuntimeException(); }
  public  int maxPatternLength ()  { throw new RuntimeException(); }
  // not preceding
  public   LocalPrefixSpan (long minCount, int maxPatternLength)  { throw new RuntimeException(); }
  /**
   * Generates frequent patterns on the input array of postfixes.
   * @param postfixes an array of postfixes
   * @return an iterator of (frequent pattern, count)
   */
  public  scala.collection.Iterator<scala.Tuple2<int[], java.lang.Object>> run (org.apache.spark.mllib.fpm.PrefixSpan.Postfix[] postfixes)  { throw new RuntimeException(); }
}
