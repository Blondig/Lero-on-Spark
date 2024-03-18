package org.apache.spark.deploy.history;
/**
 * A filter used for auth tests; sets the request's user to the value of the "HTTP_USER" header.
 */
public  class FakeAuthFilter implements javax.servlet.Filter {
  static public  java.lang.String FAKE_HTTP_USER ()  { throw new RuntimeException(); }
  public   FakeAuthFilter ()  { throw new RuntimeException(); }
  public  void destroy ()  { throw new RuntimeException(); }
  public  void init (javax.servlet.FilterConfig config)  { throw new RuntimeException(); }
  public  void doFilter (javax.servlet.ServletRequest req, javax.servlet.ServletResponse res, javax.servlet.FilterChain chain)  { throw new RuntimeException(); }
}
