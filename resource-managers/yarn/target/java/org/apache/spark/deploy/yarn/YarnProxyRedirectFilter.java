package org.apache.spark.deploy.yarn;
/**
 * A filter to be used in the Spark History Server for redirecting YARN proxy requests to the
 * main SHS address. This is useful for applications that are using the history server as the
 * tracking URL, since the SHS-generated pages cannot be rendered in that case without extra
 * configuration to set up a proxy base URI (meaning the SHS cannot be ever used directly).
 */
public  class YarnProxyRedirectFilter implements javax.servlet.Filter, org.apache.spark.internal.Logging {
  static public  java.lang.String COOKIE_NAME ()  { throw new RuntimeException(); }
  public   YarnProxyRedirectFilter ()  { throw new RuntimeException(); }
  public  void destroy ()  { throw new RuntimeException(); }
  public  void init (javax.servlet.FilterConfig config)  { throw new RuntimeException(); }
  public  void doFilter (javax.servlet.ServletRequest req, javax.servlet.ServletResponse res, javax.servlet.FilterChain chain)  { throw new RuntimeException(); }
}
