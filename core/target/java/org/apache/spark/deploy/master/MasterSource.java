package org.apache.spark.deploy.master;
  class MasterSource implements org.apache.spark.metrics.source.Source {
  // not preceding
  public   MasterSource (org.apache.spark.deploy.master.Master master)  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.Master master ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
}
