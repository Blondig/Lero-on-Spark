package org.apache.spark;
  class MapSizesByExecutorId implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> iter ()  { throw new RuntimeException(); }
  public  boolean enableBatchFetch ()  { throw new RuntimeException(); }
  // not preceding
  public   MapSizesByExecutorId (scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> iter, boolean enableBatchFetch)  { throw new RuntimeException(); }
}
