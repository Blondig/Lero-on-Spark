package org.apache.spark.metrics.sink;
  class MetricsServlet implements org.apache.spark.metrics.sink.Sink {
  // not preceding
  public   MetricsServlet (java.util.Properties property, com.codahale.metrics.MetricRegistry registry)  { throw new RuntimeException(); }
  public  boolean SERVLET_DEFAULT_SAMPLE ()  { throw new RuntimeException(); }
  public  java.lang.String SERVLET_KEY_PATH ()  { throw new RuntimeException(); }
  public  java.lang.String SERVLET_KEY_SAMPLE ()  { throw new RuntimeException(); }
  public  org.eclipse.jetty.servlet.ServletContextHandler[] getHandlers (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  java.lang.String getMetricsSnapshot (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public  com.fasterxml.jackson.databind.ObjectMapper mapper ()  { throw new RuntimeException(); }
  public  java.util.Properties property ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry registry ()  { throw new RuntimeException(); }
  public  void report ()  { throw new RuntimeException(); }
  public  java.lang.String servletPath ()  { throw new RuntimeException(); }
  public  boolean servletShowSample ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
