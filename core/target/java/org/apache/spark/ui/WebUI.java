package org.apache.spark.ui;
/**
 * The top level component of the UI hierarchy that contains the server.
 * <p>
 * Each WebUI represents a collection of tabs, each of which in turn represents a collection of
 * pages. The use of tabs is optional, however; a WebUI may choose to include pages directly.
 */
 abstract class WebUI implements org.apache.spark.internal.Logging {
  public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.SSLOptions sslOptions ()  { throw new RuntimeException(); }
  // not preceding
  public   WebUI (org.apache.spark.SecurityManager securityManager, org.apache.spark.SSLOptions sslOptions, int port, org.apache.spark.SparkConf conf, java.lang.String basePath, java.lang.String name, int poolSize)  { throw new RuntimeException(); }
  protected  scala.collection.mutable.ArrayBuffer<org.apache.spark.ui.WebUITab> tabs ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.ArrayBuffer<org.eclipse.jetty.servlet.ServletContextHandler> handlers ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<org.apache.spark.ui.WebUIPage, scala.collection.mutable.ArrayBuffer<org.eclipse.jetty.servlet.ServletContextHandler>> pageToHandlers ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.ui.ServerInfo> serverInfo ()  { throw new RuntimeException(); }
  protected  java.lang.String publicHostName ()  { throw new RuntimeException(); }
  protected  java.lang.String className ()  { throw new RuntimeException(); }
  public  java.lang.String getBasePath ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.WebUITab> getTabs ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.eclipse.jetty.servlet.ServletContextHandler> getHandlers ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.DelegatingServletContextHandler> getDelegatingHandlers ()  { throw new RuntimeException(); }
  /** Attaches a tab to this UI, along with all of its attached pages. */
  public  void attachTab (org.apache.spark.ui.WebUITab tab)  { throw new RuntimeException(); }
  /** Detaches a tab from this UI, along with all of its attached pages. */
  public  void detachTab (org.apache.spark.ui.WebUITab tab)  { throw new RuntimeException(); }
  /** Detaches a page from this UI, along with all of its attached handlers. */
  public  void detachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  /** Attaches a page to this UI. */
  public  void attachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  /** Attaches a handler to this UI. */
  public  void attachHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  /** Attaches a handler to this UI. */
  public  void attachHandler (java.lang.String contextPath, javax.servlet.http.HttpServlet httpServlet, java.lang.String pathSpec)  { throw new RuntimeException(); }
  /** Detaches a handler from this UI. */
  public  void detachHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  /**
   * Detaches the content handler at <code>path</code> URI.
   * <p>
   * @param path Path in UI to unmount.
   */
  public  void detachHandler (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Adds a handler for static content.
   * <p>
   * @param resourceBase Root of where to find resources to serve.
   * @param path Path in UI where to mount the resources.
   */
  public  void addStaticHandler (java.lang.String resourceBase, java.lang.String path)  { throw new RuntimeException(); }
  /** A hook to initialize components of the UI */
  public abstract  void initialize ()  ;
  public  org.apache.spark.ui.ServerInfo initServer ()  { throw new RuntimeException(); }
  /** Binds to the HTTP server behind this web interface. */
  public  void bind ()  { throw new RuntimeException(); }
  /** @return Whether SSL enabled. Only valid after {@link bind}. */
  public  boolean isSecure ()  { throw new RuntimeException(); }
  /** @return The scheme of web interface. Only valid after {@link bind}. */
  public  java.lang.String scheme ()  { throw new RuntimeException(); }
  /** @return The url of web interface. Only valid after {@link bind}. */
  public  java.lang.String webUrl ()  { throw new RuntimeException(); }
  /** @return The actual port to which this server is bound. Only valid after {@link bind}. */
  public  int boundPort ()  { throw new RuntimeException(); }
  /** Stops the server behind this web interface. Only valid after {@link bind}. */
  public  void stop ()  { throw new RuntimeException(); }
}
