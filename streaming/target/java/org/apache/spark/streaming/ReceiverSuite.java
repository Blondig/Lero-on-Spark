package org.apache.spark.streaming;
/** Testsuite for testing the network receiver behavior */
public  class ReceiverSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.TestSuiteBase, org.scalatest.concurrent.TimeLimits, scala.Serializable {
  /**
   * An implementation of BlockGeneratorListener that is used to test the BlockGenerator.
   */
  public  class FakeBlockGeneratorListener implements org.apache.spark.streaming.receiver.BlockGeneratorListener {
    public   FakeBlockGeneratorListener (long pushDelay)  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<scala.collection.mutable.ArrayBuffer<java.lang.Object>> arrayBuffers ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.Throwable> errors ()  { throw new RuntimeException(); }
    public  void onAddData (Object data, Object metadata)  { throw new RuntimeException(); }
    public  void onGenerateBlock (org.apache.spark.storage.StreamBlockId blockId)  { throw new RuntimeException(); }
    public  void onPushBlock (org.apache.spark.storage.StreamBlockId blockId, scala.collection.mutable.ArrayBuffer<?> arrayBuffer)  { throw new RuntimeException(); }
    public  void onError (java.lang.String message, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  }
  public  class FakeBlockGeneratorListener$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FakeBlockGeneratorListener$ MODULE$ = null;
    public   FakeBlockGeneratorListener$ ()  { throw new RuntimeException(); }
  }
  /**
   * An implementation of NetworkReceiverExecutor used for testing a NetworkReceiver.
   * Instead of storing the data in the BlockManager, it stores all the data in a local buffer
   * that can used for verifying that the data has been forwarded correctly.
   */
  public  class FakeReceiverSupervisor extends org.apache.spark.streaming.receiver.ReceiverSupervisor {
    public   FakeReceiverSupervisor (org.apache.spark.streaming.FakeReceiver receiver)  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<scala.collection.mutable.ArrayBuffer<?>> arrayBuffers ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.nio.ByteBuffer> byteBuffers ()  { throw new RuntimeException(); }
    public  org.apache.spark.streaming.MethodsCallRecorder callsRecorder ()  { throw new RuntimeException(); }
    public  org.apache.spark.streaming.receiver.BlockGenerator createBlockGenerator (org.apache.spark.streaming.receiver.BlockGeneratorListener blockGeneratorListener)  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.Throwable> errors ()  { throw new RuntimeException(); }
    /** Check if all data structures are clean */
    public  boolean isAllEmpty ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<scala.collection.Iterator<?>> iterators ()  { throw new RuntimeException(); }
    protected  boolean onReceiverStart ()  { throw new RuntimeException(); }
    protected  void onReceiverStop (java.lang.String message, scala.Option<java.lang.Throwable> error)  { throw new RuntimeException(); }
    public  void pushArrayBuffer (scala.collection.mutable.ArrayBuffer<?> arrayBuffer, scala.Option<java.lang.Object> optionalMetadata, scala.Option<org.apache.spark.storage.StreamBlockId> optionalBlockId)  { throw new RuntimeException(); }
    public  void pushBytes (java.nio.ByteBuffer bytes, scala.Option<java.lang.Object> optionalMetadata, scala.Option<org.apache.spark.storage.StreamBlockId> optionalBlockId)  { throw new RuntimeException(); }
    public  void pushIterator (scala.collection.Iterator<?> iterator, scala.Option<java.lang.Object> optionalMetadata, scala.Option<org.apache.spark.storage.StreamBlockId> optionalBlockId)  { throw new RuntimeException(); }
    public  void pushSingle (Object data)  { throw new RuntimeException(); }
    public  void reportError (java.lang.String message, java.lang.Throwable throwable)  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.Object> singles ()  { throw new RuntimeException(); }
  }
  public   ReceiverSuite ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.PatienceConfiguration.Timeout eventuallyTimeout ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.Signaler signaler ()  { throw new RuntimeException(); }
}
