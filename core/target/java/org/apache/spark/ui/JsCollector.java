package org.apache.spark.ui;
/**
 * A helper class that allows the user to add JavaScript statements which will be executed when the
 * DOM has finished loading.
 */
  class JsCollector {
  public   JsCollector ()  { throw new RuntimeException(); }
  public  void addPreparedStatement (java.lang.String js)  { throw new RuntimeException(); }
  public  void addStatement (java.lang.String js)  { throw new RuntimeException(); }
  /**
   * Return the next unused JavaScript variable name
   * @return (undocumented)
   */
  public  java.lang.String nextVariableName ()  { throw new RuntimeException(); }
  /**
   * Generate a html snippet that will execute all scripts when the DOM has finished loading.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.xml.Node> toHtml ()  { throw new RuntimeException(); }
}
