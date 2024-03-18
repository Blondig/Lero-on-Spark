package org.apache.spark.storage;
/**
 * A listener to be called at the completion of the ShuffleBlockFetcherIterator
 * param:  data the ShuffleBlockFetcherIterator to process
 */
public  class ShuffleFetchCompletionListener implements org.apache.spark.util.TaskCompletionListener {
  // not preceding
  public   ShuffleFetchCompletionListener (org.apache.spark.storage.ShuffleBlockFetcherIterator data)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.ShuffleBlockFetcherIterator data ()  { throw new RuntimeException(); }
  public  void onComplete (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  void onTaskCompletion (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
