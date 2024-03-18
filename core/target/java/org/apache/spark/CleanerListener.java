package org.apache.spark;
/**
 * Listener class used when any item has been cleaned by the Cleaner class.
 */
public  interface CleanerListener {
  public  void accumCleaned (long accId)  ;
  public  void broadcastCleaned (long broadcastId)  ;
  public  void checkpointCleaned (long rddId)  ;
  public  void rddCleaned (int rddId)  ;
  public  void shuffleCleaned (int shuffleId)  ;
}
