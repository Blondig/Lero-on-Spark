package org.apache.spark.sql.catalyst.parser;
/**
 * A {@link SparkRecognitionException} extends the {@link RecognitionException} with more information
 * including the error class and parameters for the error message, which align with the interface
 * of {@link SparkThrowableHelper}.
 */
public  class SparkRecognitionException extends org.antlr.v4.runtime.RecognitionException {
  public  scala.Option<java.lang.String> errorClass ()  { throw new RuntimeException(); }
  public  java.lang.String[] messageParameters ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkRecognitionException (java.lang.String message, org.antlr.v4.runtime.Recognizer<?, ?> recognizer, org.antlr.v4.runtime.IntStream input, org.antlr.v4.runtime.ParserRuleContext ctx, scala.Option<java.lang.String> errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  /** Construct from a given {@link RecognitionException}, with additional error information. */
  public   SparkRecognitionException (org.antlr.v4.runtime.RecognitionException recognitionException, java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  /** Construct with pure errorClass and messageParameter information.  */
  public   SparkRecognitionException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
}
