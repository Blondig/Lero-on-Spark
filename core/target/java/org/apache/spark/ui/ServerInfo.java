package org.apache.spark.ui;
  class ServerInfo implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.eclipse.jetty.server.Server server ()  { throw new RuntimeException(); }
  public  int boundPort ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> securePort ()  { throw new RuntimeException(); }
  // not preceding
  public   ServerInfo (org.eclipse.jetty.server.Server server, int boundPort, scala.Option<java.lang.Object> securePort, org.apache.spark.SparkConf conf, org.eclipse.jetty.server.handler.ContextHandlerCollection rootHandler)  { throw new RuntimeException(); }
  public  void addHandler (org.eclipse.jetty.servlet.ServletContextHandler handler, org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  public  void removeHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
