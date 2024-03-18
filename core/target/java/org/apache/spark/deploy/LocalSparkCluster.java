package org.apache.spark.deploy;
/**
 * Testing class that creates a Spark standalone process in-cluster (that is, running the
 * spark.deploy.master.Master and spark.deploy.worker.Workers in the same JVMs). Executors launched
 * by the Workers still run in separate JVMs. This can be used to test distributed operation and
 * fault recovery without spinning up a lot of processes.
 */
  class LocalSparkCluster implements org.apache.spark.internal.Logging {
  static   scala.Option<org.apache.spark.deploy.LocalSparkCluster> get ()  { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.LocalSparkCluster apply (int numWorkers, int coresPerWorker, int memoryPerWorker, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  int masterWebUIPort ()  { throw new RuntimeException(); }
  public  java.lang.String[] start ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.io.File> workerLogfiles ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
