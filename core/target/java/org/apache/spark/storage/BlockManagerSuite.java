package org.apache.spark.storage;
public  class BlockManagerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.matchers.must.Matchers, org.scalatest.BeforeAndAfterEach, org.scalatest.PrivateMethodTester, org.apache.spark.LocalSparkContext, org.apache.spark.util.ResetSystemProperties, org.apache.spark.security.EncryptionFunSuite, org.scalatest.concurrent.TimeLimits, org.scalatest.BeforeAndAfterAll {
  public  class MockBlockTransferService extends org.apache.spark.network.BlockTransferService {
    public  int maxFailures ()  { throw new RuntimeException(); }
    public  java.lang.String hostName ()  { throw new RuntimeException(); }
    // not preceding
    public   MockBlockTransferService (int maxFailures, java.lang.String hostName)  { throw new RuntimeException(); }
    public  int numCalls ()  { throw new RuntimeException(); }
    public  org.apache.spark.network.shuffle.DownloadFileManager tempFileManager ()  { throw new RuntimeException(); }
    public  void init (org.apache.spark.network.BlockDataManager blockDataManager)  { throw new RuntimeException(); }
    public  void fetchBlocks (java.lang.String host, int port, java.lang.String execId, java.lang.String[] blockIds, org.apache.spark.network.shuffle.BlockFetchingListener listener, org.apache.spark.network.shuffle.DownloadFileManager tempFileManager)  { throw new RuntimeException(); }
    public  void close ()  { throw new RuntimeException(); }
    public  int port ()  { throw new RuntimeException(); }
    public  scala.concurrent.Future<scala.runtime.BoxedUnit> uploadBlock (java.lang.String hostname, int port, java.lang.String execId, org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer blockData, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  { throw new RuntimeException(); }
    public  org.apache.spark.network.buffer.ManagedBuffer fetchBlockSync (java.lang.String host, int port, java.lang.String execId, java.lang.String blockId, org.apache.spark.network.shuffle.DownloadFileManager tempFileManager)  { throw new RuntimeException(); }
  }
  public  class MockBlockTransferService$ {
    public   MockBlockTransferService$ ()  { throw new RuntimeException(); }
  }
  public  java.util.Properties oldProperties ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.scalatest.PrivateMethodTester.PrivateMethod$ PrivateMethod ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.KeyWord key ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.ValueWord value ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AWord a ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AnWord an ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.TheSameInstanceAsPhrase theSameInstanceAs ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.RegexWord regex ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DecidedWord decided ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DeterminedWord determined ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.TheAfterWord after ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.FullyMatchWord fullyMatch ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.StartWithWord startWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EndWithWord endWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.IncludeWord include ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.HaveWord have ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.BeWord be ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ContainWord contain ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.NotWord not ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.LengthWord length ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SizeWord size ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SortedWord sorted ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.DefinedWord defined ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ExistWord exist ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ReadableWord readable ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.WritableWord writable ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EmptyWord empty ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.CompileWord compile ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.TypeCheckWord typeCheck ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.MatchPatternWord matchPattern ()  { throw new RuntimeException(); }
  public   BlockManagerSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.storage.BlockManager> allStores ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.shuffle.sort.SortShuffleManager> sortShuffleManagers ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerMaster master ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.LiveListenerBus liveListenerBus ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr ()  { throw new RuntimeException(); }
  public  org.apache.spark.broadcast.BroadcastManager bcastManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.MapOutputTrackerMaster mapOutputTracker ()  { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.sort.SortShuffleManager shuffleManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.KryoSerializer serializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId StringToBlockId (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.RDDBlockId rdd (int rddId, int splitId)  { throw new RuntimeException(); }
  public  java.lang.String originalArch ()  { throw new RuntimeException(); }
  public  java.lang.String originalCompressedOops ()  { throw new RuntimeException(); }
  public  void reinitializeSizeEstimator (java.lang.String arch, java.lang.String useCompressedOops)  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void testDiskAndMemoryStorage (org.apache.spark.storage.StorageLevel storageLevel, boolean getAsBytes, org.apache.spark.SparkConf testConf)  { throw new RuntimeException(); }
  public  void testPutBlockDataAsStream (org.apache.spark.storage.BlockManager blockManager, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
}
