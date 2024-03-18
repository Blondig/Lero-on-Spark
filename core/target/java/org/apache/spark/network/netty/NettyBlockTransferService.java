package org.apache.spark.network.netty;
/**
 * A BlockTransferService that uses Netty to fetch a set of blocks at time.
 */
  class NettyBlockTransferService extends org.apache.spark.network.BlockTransferService {
  // not preceding
  public  java.lang.String hostName ()  { throw new RuntimeException(); }
  // not preceding
  public   NettyBlockTransferService (org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, java.lang.String bindAddress, java.lang.String hostName, int _port, int numCores, org.apache.spark.rpc.RpcEndpointRef driverEndPointRef)  { throw new RuntimeException(); }
  public  void init (org.apache.spark.network.BlockDataManager blockDataManager)  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricSet shuffleMetrics ()  { throw new RuntimeException(); }
  public  void fetchBlocks (java.lang.String host, int port, java.lang.String execId, java.lang.String[] blockIds, org.apache.spark.network.shuffle.BlockFetchingListener listener, org.apache.spark.network.shuffle.DownloadFileManager tempFileManager)  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  scala.concurrent.Future<scala.runtime.BoxedUnit> uploadBlock (java.lang.String hostname, int port, java.lang.String execId, org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer blockData, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
