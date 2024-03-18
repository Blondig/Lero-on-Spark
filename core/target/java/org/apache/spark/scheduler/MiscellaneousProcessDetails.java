package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * Stores information about an Miscellaneous Process to pass from the scheduler to SparkListeners.
 */
public  class MiscellaneousProcessDetails implements scala.Serializable {
  // not preceding
  public   MiscellaneousProcessDetails (java.lang.String hostPort, int cores, scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlInfo)  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  java.lang.String hostPort ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlInfo ()  { throw new RuntimeException(); }
}
