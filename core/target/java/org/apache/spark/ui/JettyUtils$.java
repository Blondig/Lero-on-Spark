package org.apache.spark.ui;
/**
 * Utilities for launching a web server using Jetty's HTTP Server class
 */
public  class JettyUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JettyUtils$ MODULE$ = null;
  public   JettyUtils$ ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_CONNECTOR_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String REDIRECT_CONNECTOR_NAME ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.JettyUtils.ServletParams<org.json4s.JsonAST.JValue> jsonResponderToServlet (scala.Function1<javax.servlet.http.HttpServletRequest, org.json4s.JsonAST.JValue> responder)  { throw new RuntimeException(); }
  public  org.apache.spark.ui.JettyUtils.ServletParams<scala.collection.Seq<scala.xml.Node>> htmlResponderToServlet (scala.Function1<javax.servlet.http.HttpServletRequest, scala.collection.Seq<scala.xml.Node>> responder)  { throw new RuntimeException(); }
  public  org.apache.spark.ui.JettyUtils.ServletParams<java.lang.String> textResponderToServlet (scala.Function1<javax.servlet.http.HttpServletRequest, java.lang.String> responder)  { throw new RuntimeException(); }
  /** Create a context handler that responds to a request with the given path prefix */
  public <T extends java.lang.Object> org.eclipse.jetty.servlet.ServletContextHandler createServletHandler (java.lang.String path, org.apache.spark.ui.JettyUtils.ServletParams<T> servletParams, org.apache.spark.SparkConf conf, java.lang.String basePath)  { throw new RuntimeException(); }
  /** Create a context handler that responds to a request with the given path prefix */
  public  org.eclipse.jetty.servlet.ServletContextHandler createServletHandler (java.lang.String path, javax.servlet.http.HttpServlet servlet, java.lang.String basePath)  { throw new RuntimeException(); }
  /** Create a handler that always redirects the user to the given path */
  public  org.eclipse.jetty.servlet.ServletContextHandler createRedirectHandler (java.lang.String srcPath, java.lang.String destPath, scala.Function1<javax.servlet.http.HttpServletRequest, scala.runtime.BoxedUnit> beforeRedirect, java.lang.String basePath, scala.collection.immutable.Set<java.lang.String> httpMethods)  { throw new RuntimeException(); }
  /** Create a handler for serving files from a static directory */
  public  org.eclipse.jetty.servlet.ServletContextHandler createStaticHandler (java.lang.String resourceBase, java.lang.String path)  { throw new RuntimeException(); }
  /** Create a handler for proxying request to Workers and Application Drivers */
  public  org.eclipse.jetty.servlet.ServletContextHandler createProxyHandler (scala.Function1<java.lang.String, scala.Option<java.lang.String>> idToUiAddress)  { throw new RuntimeException(); }
  /**
   * Attempt to start a Jetty server bound to the supplied hostName:port using the given
   * context handlers.
   * <p>
   * If the desired port number is contended, continues incrementing ports until a free port is
   * found. Return the jetty Server object, the chosen port, and a mutable collection of handlers.
   * @param hostName (undocumented)
   * @param port (undocumented)
   * @param sslOptions (undocumented)
   * @param conf (undocumented)
   * @param serverName (undocumented)
   * @param poolSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ui.ServerInfo startJettyServer (java.lang.String hostName, int port, org.apache.spark.SSLOptions sslOptions, org.apache.spark.SparkConf conf, java.lang.String serverName, int poolSize)  { throw new RuntimeException(); }
  public  java.net.URI createProxyURI (java.lang.String prefix, java.lang.String target, java.lang.String path, java.lang.String query)  { throw new RuntimeException(); }
  public  java.lang.String createProxyLocationHeader (java.lang.String headerValue, javax.servlet.http.HttpServletRequest clientRequest, java.net.URI targetUri)  { throw new RuntimeException(); }
  public  void addFilter (org.eclipse.jetty.servlet.ServletContextHandler handler, java.lang.String filter, scala.collection.immutable.Map<java.lang.String, java.lang.String> params)  { throw new RuntimeException(); }
  public  java.lang.String[] toVirtualHosts (scala.collection.Seq<java.lang.String> connectors)  { throw new RuntimeException(); }
}
