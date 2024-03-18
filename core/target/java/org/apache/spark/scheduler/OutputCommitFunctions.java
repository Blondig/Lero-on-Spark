package org.apache.spark.scheduler;
/**
 * Class with methods that can be passed to runJob to test commits with a mock committer.
 */
public  class OutputCommitFunctions implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String tempDirPath ()  { throw new RuntimeException(); }
  // not preceding
  public   OutputCommitFunctions (java.lang.String tempDirPath)  { throw new RuntimeException(); }
  public  void commitSuccessfully (scala.collection.Iterator<java.lang.Object> iter)  { throw new RuntimeException(); }
  public  void failFirstCommitAttempt (scala.collection.Iterator<java.lang.Object> iter)  { throw new RuntimeException(); }
}
