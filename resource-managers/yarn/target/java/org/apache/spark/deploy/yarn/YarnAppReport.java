package org.apache.spark.deploy.yarn;
  class YarnAppReport implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.YarnApplicationState appState ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.FinalApplicationStatus finalState ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> diagnostics ()  { throw new RuntimeException(); }
  // not preceding
  public   YarnAppReport (org.apache.hadoop.yarn.api.records.YarnApplicationState appState, org.apache.hadoop.yarn.api.records.FinalApplicationStatus finalState, scala.Option<java.lang.String> diagnostics)  { throw new RuntimeException(); }
}
