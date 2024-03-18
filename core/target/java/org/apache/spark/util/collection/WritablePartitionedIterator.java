package org.apache.spark.util.collection;
/**
 * Iterator that writes elements to a DiskBlockObjectWriter instead of returning them. Each element
 * has an associated partition.
 */
  class WritablePartitionedIterator<K extends java.lang.Object, V extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   WritablePartitionedIterator (scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, V>> it)  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  int nextPartition ()  { throw new RuntimeException(); }
  public  void writeNext (org.apache.spark.util.collection.PairsWriter writer)  { throw new RuntimeException(); }
}
