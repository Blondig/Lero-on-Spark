package org.apache.spark.storage;
  class HostLocalDirManager implements org.apache.spark.internal.Logging {
  public   HostLocalDirManager (scala.concurrent.ExecutionContext futureExecutionContext, int cacheSize, org.apache.spark.network.shuffle.BlockStoreClient blockStoreClient)  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.String[]> getCachedHostLocalDirs ()  { throw new RuntimeException(); }
    scala.Option<java.lang.String[]> getCachedHostLocalDirsFor (java.lang.String executorId)  { throw new RuntimeException(); }
    void getHostLocalDirs (java.lang.String host, int port, java.lang.String[] executorIds, scala.Function1<scala.util.Try<scala.collection.immutable.Map<java.lang.String, java.lang.String[]>>, scala.runtime.BoxedUnit> callback)  { throw new RuntimeException(); }
}
