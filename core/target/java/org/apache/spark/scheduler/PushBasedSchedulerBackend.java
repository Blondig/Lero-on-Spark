package org.apache.spark.scheduler;
public  class PushBasedSchedulerBackend extends org.apache.spark.scheduler.local.LocalSchedulerBackend {
  public   PushBasedSchedulerBackend (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.TaskSchedulerImpl scheduler, int cores)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getShufflePushMergerLocations (int numPartitions, int resourceProfileId)  { throw new RuntimeException(); }
  public  int maxNumConcurrentTasks (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
}
