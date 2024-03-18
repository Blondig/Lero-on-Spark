package org.apache.spark.deploy.history;
/**
 * This is a servlet filter which intercepts HTTP requests on application UIs and
 * triggers checks for updated data.
 * <p>
 * If the application cache indicates that the application has been updated,
 * the filter returns a 302 redirect to the caller, asking them to re-request the web
 * page.
 * <p>
 * Because the application cache will detach and then re-attach the UI, when the caller
 * repeats that request, it will now pick up the newly-updated web application.
 * <p>
 * This does require the caller to handle 302 requests. Because of the ambiguity
 * in how POST and PUT operations are responded to (that is, should a 307 be
 * processed directly), the filter <i>does not</i> filter those requests.
 * As the current web UIs are read-only, this is not an issue. If it were ever to
 * support more HTTP verbs, then some support may be required. Perhaps, rather
 * than sending a redirect, simply updating the value so that the <i>next</i>
 * request will pick it up.
 * <p>
 * Implementation note: there's some abuse of a shared global entry here because
 * the configuration data passed to the servlet is just a string:string map.
 */
  class ApplicationCacheCheckFilter implements javax.servlet.Filter, org.apache.spark.internal.Logging {
  public   ApplicationCacheCheckFilter (org.apache.spark.deploy.history.CacheKey key, org.apache.spark.deploy.history.LoadedAppUI loadedUI, org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
  public  void destroy ()  { throw new RuntimeException(); }
  /**
   * Filter the request.
   * Either the caller is given a 302 redirect to the current URL, or the
   * request is passed on to the SparkUI servlets.
   * <p>
   * @param request HttpServletRequest
   * @param response HttpServletResponse
   * @param chain the rest of the request chain
   */
  public  void doFilter (javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain)  { throw new RuntimeException(); }
  public  void init (javax.servlet.FilterConfig config)  { throw new RuntimeException(); }
}
