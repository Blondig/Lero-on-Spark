package org.apache.spark.status.api.v1;
/**
 * :: Experimental ::
 * This aims to expose Executor metrics like REST API which is documented in
 * <p>
 *    https://spark.apache.org/docs/3.0.0/monitoring.html#executor-metrics
 * <p>
 * Note that this is based on ExecutorSummary which is different from ExecutorSource.
 */
  class PrometheusResource implements org.apache.spark.status.api.v1.ApiRequestContext {
  static public  org.eclipse.jetty.servlet.ServletContextHandler getServletHandler (org.apache.spark.status.api.v1.UIRoot uiRoot)  { throw new RuntimeException(); }
  protected  javax.servlet.ServletContext servletContext ()  { throw new RuntimeException(); }
  protected  javax.servlet.http.HttpServletRequest httpRequest ()  { throw new RuntimeException(); }
  public   PrometheusResource ()  { throw new RuntimeException(); }
  public  java.lang.String executors ()  { throw new RuntimeException(); }
}
