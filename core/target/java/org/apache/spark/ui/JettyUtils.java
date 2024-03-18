package org.apache.spark.ui;
/**
 * Utilities for launching a web server using Jetty's HTTP Server class
 */
public  class JettyUtils {
  static public  class ServletParams<T extends java.lang.Object> {
    public  scala.Function1<javax.servlet.http.HttpServletRequest, T> responder ()  { throw new RuntimeException(); }
    public  java.lang.String contentType ()  { throw new RuntimeException(); }
    public  scala.Function1<T, java.lang.String> extractFn ()  { throw new RuntimeException(); }
    // not preceding
    public   ServletParams (scala.Function1<javax.servlet.http.HttpServletRequest, T> responder, java.lang.String contentType, scala.Function1<T, java.lang.String> extractFn)  { throw new RuntimeException(); }
  }
  static public  class ServletParams$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ServletParams$ MODULE$ = null;
    public   ServletParams$ ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String SPARK_CONNECTOR_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String REDIRECT_CONNECTOR_NAME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ui.JettyUtils.ServletParams<org.json4s.JsonAST.JValue> jsonResponderToServlet (scala.Function1<javax.servlet.http.HttpServletRequest, org.json4s.JsonAST.JValue> responder)  { throw new RuntimeException(); }
  static public  org.apache.spark.ui.JettyUtils.ServletParams<scala.collection.Seq<scala.xml.Node>> htmlResponderToServlet (scala.Function1<javax.servlet.http.HttpServletRequest, scala.collection.Seq<scala.xml.Node>> responder)  { throw new RuntimeException(); }
  static public  org.apache.spark.ui.JettyUtils.ServletParams<java.lang.String> textResponderToServlet (scala.Function1<javax.servlet.http.HttpServletRequest, java.lang.String> responder)  { throw new RuntimeException(); }
  /** Create a context handler that responds to a request with the given path prefix */
  static public <T extends java.lang.Object> org.eclipse.jetty.servlet.ServletContextHandler createServletHandler (java.lang.String path, org.apache.spark.ui.JettyUtils.ServletParams<T> servletParams, org.apache.spark.SparkConf conf, java.lang.String basePath)  { throw new RuntimeException(); }
  /** Create a context handler that responds to a request with the given path prefix */
  static public  org.eclipse.jetty.servlet.ServletContextHandler createServletHandler (java.lang.String path, javax.servlet.http.HttpServlet servlet, java.lang.String basePath)  { throw new RuntimeException(); }
  /** Create a handler that always redirects the user to the given path */
  static public  org.eclipse.jetty.servlet.ServletContextHandler createRedirectHandler (java.lang.String srcPath, java.lang.String destPath, scala.Function1<javax.servlet.http.HttpServletRequest, scala.runtime.BoxedUnit> beforeRedirect, java.lang.String basePath, scala.collection.immutable.Set<java.lang.String> httpMethods)  { throw new RuntimeException(); }
  /** Create a handler for serving files from a static directory */
  static public  org.eclipse.jetty.servlet.ServletContextHandler createStaticHandler (java.lang.String resourceBase, java.lang.String path)  { throw new RuntimeException(); }
  /** Create a handler for proxying request to Workers and Application Drivers */
  static public  org.eclipse.jetty.servlet.ServletContextHandler createProxyHandler (scala.Function1<java.lang.String, scala.Option<java.lang.String>> idToUiAddress)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.ui.ServerInfo startJettyServer (java.lang.String hostName, int port, org.apache.spark.SSLOptions sslOptions, org.apache.spark.SparkConf conf, java.lang.String serverName, int poolSize)  { throw new RuntimeException(); }
  static public  java.net.URI createProxyURI (java.lang.String prefix, java.lang.String target, java.lang.String path, java.lang.String query)  { throw new RuntimeException(); }
  static public  java.lang.String createProxyLocationHeader (java.lang.String headerValue, javax.servlet.http.HttpServletRequest clientRequest, java.net.URI targetUri)  { throw new RuntimeException(); }
  static public  void addFilter (org.eclipse.jetty.servlet.ServletContextHandler handler, java.lang.String filter, scala.collection.immutable.Map<java.lang.String, java.lang.String> params)  { throw new RuntimeException(); }
  static public  java.lang.String[] toVirtualHosts (scala.collection.Seq<java.lang.String> connectors)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
