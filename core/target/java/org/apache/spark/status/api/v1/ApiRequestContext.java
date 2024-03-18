package org.apache.spark.status.api.v1;
public  interface ApiRequestContext {
  public  javax.servlet.http.HttpServletRequest httpRequest ()  ;
  public  javax.servlet.ServletContext servletContext ()  ;
  public  org.apache.spark.status.api.v1.UIRoot uiRoot ()  ;
}
