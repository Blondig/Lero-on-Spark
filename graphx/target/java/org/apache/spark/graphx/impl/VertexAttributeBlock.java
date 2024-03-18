package org.apache.spark.graphx.impl;
/** Stores vertex attributes to ship to an edge partition. */
  class VertexAttributeBlock<VD extends java.lang.Object> implements scala.Serializable {
  // not preceding
  public   VertexAttributeBlock (long[] vids, java.lang.Object attrs, scala.reflect.ClassTag<VD> evidence$1)  { throw new RuntimeException(); }
  public  java.lang.Object attrs ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iterator ()  { throw new RuntimeException(); }
  public  long[] vids ()  { throw new RuntimeException(); }
}
