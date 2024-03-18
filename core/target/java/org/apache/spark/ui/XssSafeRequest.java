package org.apache.spark.ui;
public  class XssSafeRequest extends javax.servlet.http.HttpServletRequestWrapper {
  public   XssSafeRequest (javax.servlet.http.HttpServletRequest req, java.lang.String effectiveUser)  { throw new RuntimeException(); }
  public  java.lang.String getParameter (java.lang.String name)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String[]> getParameterMap ()  { throw new RuntimeException(); }
  public  java.util.Enumeration<java.lang.String> getParameterNames ()  { throw new RuntimeException(); }
  public  java.lang.String[] getParameterValues (java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.String getRemoteUser ()  { throw new RuntimeException(); }
}
