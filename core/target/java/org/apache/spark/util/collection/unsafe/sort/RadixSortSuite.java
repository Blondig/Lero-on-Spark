package org.apache.spark.util.collection.unsafe.sort;
public  class RadixSortSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.internal.Logging {
  /**
   * Describes a type of sort to test, e.g. two's complement descending. Each sort type has
   * a defined reference ordering as well as radix sort parameters that can be used to
   * reproduce the given ordering.
   */
  public  class RadixSortType implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.util.collection.unsafe.sort.PrefixComparator referenceComparator ()  { throw new RuntimeException(); }
    public  int startByteIdx ()  { throw new RuntimeException(); }
    public  int endByteIdx ()  { throw new RuntimeException(); }
    public  boolean descending ()  { throw new RuntimeException(); }
    public  boolean signed ()  { throw new RuntimeException(); }
    public  boolean nullsFirst ()  { throw new RuntimeException(); }
    // not preceding
    public   RadixSortType (java.lang.String name, org.apache.spark.util.collection.unsafe.sort.PrefixComparator referenceComparator, int startByteIdx, int endByteIdx, boolean descending, boolean signed, boolean nullsFirst)  { throw new RuntimeException(); }
  }
  public  class RadixSortType$ extends scala.runtime.AbstractFunction7<java.lang.String, org.apache.spark.util.collection.unsafe.sort.PrefixComparator, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.util.collection.unsafe.sort.RadixSortSuite.RadixSortType> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RadixSortType$ MODULE$ = null;
    public   RadixSortType$ ()  { throw new RuntimeException(); }
  }
  public   RadixSortSuite ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.util.collection.unsafe.sort.RadixSortSuite.RadixSortType> SORT_TYPES_TO_TEST ()  { throw new RuntimeException(); }
  public  long randomBitMask (scala.util.Random rand)  { throw new RuntimeException(); }
}
