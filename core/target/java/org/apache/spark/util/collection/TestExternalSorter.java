package org.apache.spark.util.collection;
/**
 * <code>TestExternalSorter</code> used to expand the access scope of the spill method.
 */
public  class TestExternalSorter<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.util.collection.ExternalSorter<K, V, C> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   TestExternalSorter (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  void spill (org.apache.spark.util.collection.WritablePartitionedPairCollection<K, C> collection)  { throw new RuntimeException(); }
}
