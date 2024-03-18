package org.apache.spark.rdd;
  class NewHadoopPartition implements org.apache.spark.Partition {
  // not preceding
  public   NewHadoopPartition (int rddId, int index, org.apache.hadoop.mapreduce.InputSplit rawSplit)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  org.apache.spark.SerializableWritable<org.apache.hadoop.mapreduce.InputSplit> serializableHadoopSplit ()  { throw new RuntimeException(); }
}
