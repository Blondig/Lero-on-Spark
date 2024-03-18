package org.apache.spark.status.api.v1;
/**
 * Main entry point for serving spark application metrics as json, using JAX-RS.
 * <p>
 * Each resource should have endpoints that return **public** classes defined in api.scala.  Mima
 * binary compatibility checks ensure that we don't inadvertently make changes that break the api.
 * The returned objects are automatically converted to json by jackson with JacksonMessageWriter.
 * In addition, there are a number of tests in HistoryServerSuite that compare the json to "golden
 * files".  Any changes and additions should be reflected there as well -- see the notes in
 * HistoryServerSuite.
 */
  class ApiRootResource implements org.apache.spark.status.api.v1.ApiRequestContext {
  static public  org.eclipse.jetty.servlet.ServletContextHandler getServletHandler (org.apache.spark.status.api.v1.UIRoot uiRoot)  { throw new RuntimeException(); }
  protected  javax.servlet.ServletContext servletContext ()  { throw new RuntimeException(); }
  protected  javax.servlet.http.HttpServletRequest httpRequest ()  { throw new RuntimeException(); }
  public   ApiRootResource ()  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.status.api.v1.ApplicationListResource> applicationList ()  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.status.api.v1.OneApplicationResource> application ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.VersionInfo version ()  { throw new RuntimeException(); }
}
