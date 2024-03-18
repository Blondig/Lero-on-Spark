package org.apache.spark.ui.storage;
  class BlockDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.ui.storage.BlockTableRowData> {
  public   BlockDataSource (scala.collection.Seq<org.apache.spark.status.api.v1.RDDPartitionInfo> rddPartitions, int pageSize, java.lang.String sortColumn, boolean desc, scala.collection.immutable.Map<java.lang.String, java.lang.String> executorIdToAddress)  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.storage.BlockTableRowData> sliceData (int from, int to)  { throw new RuntimeException(); }
}
