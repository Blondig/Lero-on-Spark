package org.apache.spark.storage;
public  class BlockInfoWrapper {
  // not preceding
  public   BlockInfoWrapper (org.apache.spark.storage.BlockInfo info, java.util.concurrent.locks.Lock lock, java.util.concurrent.locks.Condition condition)  { throw new RuntimeException(); }
  public   BlockInfoWrapper (org.apache.spark.storage.BlockInfo info, java.util.concurrent.locks.Lock lock)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockInfo info ()  { throw new RuntimeException(); }
  public  void tryLock (scala.Function2<org.apache.spark.storage.BlockInfo, java.util.concurrent.locks.Condition, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T withLock (scala.Function2<org.apache.spark.storage.BlockInfo, java.util.concurrent.locks.Condition, T> f)  { throw new RuntimeException(); }
}
