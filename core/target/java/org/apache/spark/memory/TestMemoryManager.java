package org.apache.spark.memory;
public  class TestMemoryManager extends org.apache.spark.memory.MemoryManager {
  public   TestMemoryManager (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    long acquireExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  boolean acquireStorageMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  boolean acquireUnrollMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
    long getExecutionMemoryUsageForTask (long taskAttemptId)  { throw new RuntimeException(); }
  public  void limit (long avail)  { throw new RuntimeException(); }
  /**
   * Causes the next call to {@link acquireExecutionMemory()} to fail to allocate
   * memory (returning <code>0</code>), simulating low-on-memory / out-of-memory conditions.
   */
  public  void markExecutionAsOutOfMemoryOnce ()  { throw new RuntimeException(); }
  /**
   * Causes the next <code>n</code> calls to {@link acquireExecutionMemory()} to fail to allocate
   * memory (returning <code>0</code>), simulating low-on-memory / out-of-memory conditions.
   * @param n (undocumented)
   */
  public  void markconsequentOOM (int n)  { throw new RuntimeException(); }
  public  long maxOffHeapStorageMemory ()  { throw new RuntimeException(); }
  public  long maxOnHeapStorageMemory ()  { throw new RuntimeException(); }
    long releaseAllExecutionMemoryForTask (long taskAttemptId)  { throw new RuntimeException(); }
    void releaseExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  void releaseStorageMemory (long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  /**
   * Undos the effects of {@link markExecutionAsOutOfMemoryOnce} and {@link markconsequentOOM} and lets
   * calls to {@link acquireExecutionMemory()} (if there is enough memory available).
   */
  public  void resetConsequentOOM ()  { throw new RuntimeException(); }
}
