package org.apache.spark.util;
/** CallSite represents a place in user code. It can have a short and a long form. */
  class CallSite implements scala.Product, scala.Serializable {
  static public  java.lang.String SHORT_FORM ()  { throw new RuntimeException(); }
  static public  java.lang.String LONG_FORM ()  { throw new RuntimeException(); }
  static public  org.apache.spark.util.CallSite empty ()  { throw new RuntimeException(); }
  public  java.lang.String shortForm ()  { throw new RuntimeException(); }
  public  java.lang.String longForm ()  { throw new RuntimeException(); }
  // not preceding
  public   CallSite (java.lang.String shortForm, java.lang.String longForm)  { throw new RuntimeException(); }
}
