package org.apache.spark.ui;
  class SparkUICssErrorHandler extends com.gargoylesoftware.htmlunit.DefaultCssErrorHandler {
  public   SparkUICssErrorHandler ()  { throw new RuntimeException(); }
  public  void error (com.gargoylesoftware.css.parser.CSSParseException e)  { throw new RuntimeException(); }
  public  void fatalError (com.gargoylesoftware.css.parser.CSSParseException e)  { throw new RuntimeException(); }
  public  void warning (com.gargoylesoftware.css.parser.CSSParseException e)  { throw new RuntimeException(); }
}
