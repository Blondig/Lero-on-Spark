package org.apache.spark.util.collection;
/** SortDataFormat for Array[Int] with reused keys. */
public  class KeyReuseIntArraySortDataFormat extends org.apache.spark.util.collection.AbstractIntArraySortDataFormat<org.apache.spark.util.collection.IntWrapper> {
  public   KeyReuseIntArraySortDataFormat ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.IntWrapper getKey (int[] data, int pos, org.apache.spark.util.collection.IntWrapper reuse)  { throw new RuntimeException(); }
  protected  org.apache.spark.util.collection.IntWrapper getKey (int[] data, int pos)  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.IntWrapper newKey ()  { throw new RuntimeException(); }
}
