package org.apache.spark.sql.catalyst.parser;
/**
 * A {@link SparkParserErrorStrategy} extends the {@link DefaultErrorStrategy}, that does special handling
 * on errors.
 * <p>
 * The intention of this class is to provide more information of these errors encountered in
 * ANTLR parser to the downstream consumers, to be able to apply the {@link SparkThrowable} error
 * message framework to these exceptions.
 */
public  class SparkParserErrorStrategy extends org.antlr.v4.runtime.DefaultErrorStrategy {
  public   SparkParserErrorStrategy ()  { throw new RuntimeException(); }
  /** Get the user-facing display of the error token. */
  public  java.lang.String getTokenErrorDisplay (org.antlr.v4.runtime.Token t)  { throw new RuntimeException(); }
  public  void reportInputMismatch (org.antlr.v4.runtime.Parser recognizer, org.antlr.v4.runtime.InputMismatchException e)  { throw new RuntimeException(); }
  public  void reportMissingToken (org.antlr.v4.runtime.Parser recognizer)  { throw new RuntimeException(); }
  public  void reportNoViableAlternative (org.antlr.v4.runtime.Parser recognizer, org.antlr.v4.runtime.NoViableAltException e)  { throw new RuntimeException(); }
  public  void reportUnwantedToken (org.antlr.v4.runtime.Parser recognizer)  { throw new RuntimeException(); }
}
