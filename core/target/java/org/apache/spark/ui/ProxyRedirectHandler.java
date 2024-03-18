package org.apache.spark.ui;
/**
 * A Jetty handler to handle redirects to a proxy server. It intercepts redirects and rewrites the
 * location to point to the proxy server.
 * <p>
 * The handler needs to be set as the server's handler, because Jetty sometimes generates redirects
 * before invoking any servlet handlers or filters. One of such cases is when asking for the root of
 * a servlet context without the trailing slash (e.g. "/jobs") - Jetty will send a redirect to the
 * same URL, but with a trailing slash.
 */
public  class ProxyRedirectHandler extends org.eclipse.jetty.server.handler.HandlerWrapper {
  public   ProxyRedirectHandler (java.lang.String _proxyUri)  { throw new RuntimeException(); }
  public  void handle (java.lang.String target, org.eclipse.jetty.server.Request baseRequest, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)  { throw new RuntimeException(); }
}
