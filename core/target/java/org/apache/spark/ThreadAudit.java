package org.apache.spark;
/**
 * Thread audit for test suites.
 */
public  interface ThreadAudit extends org.apache.spark.internal.Logging {
  public  void doThreadPostAudit ()  ;
  public  void doThreadPreAudit ()  ;
  public  scala.collection.immutable.Set<java.lang.String> runningThreadNames ()  ;
  public  scala.collection.immutable.Set<java.lang.Thread> runningThreads ()  ;
  public  scala.collection.immutable.Set<java.lang.String> threadExcludeList ()  ;
}
