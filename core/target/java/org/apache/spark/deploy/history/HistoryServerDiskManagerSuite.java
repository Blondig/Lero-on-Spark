package org.apache.spark.deploy.history;
public abstract class HistoryServerDiskManagerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter {
  public   HistoryServerDiskManagerSuite ()  { throw new RuntimeException(); }
  protected abstract  scala.Enumeration.Value backend ()  ;
  protected  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  protected abstract  java.lang.String extension ()  ;
}
