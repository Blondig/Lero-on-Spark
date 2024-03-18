package org.apache.spark.ml.feature;
/**
 * Limited implementation of R formula parsing. Currently supports: '~', '+', '-', '.', ':',
 * '*', '^'.
 */
public  class RFormulaParser$ implements scala.util.parsing.combinator.RegexParsers {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RFormulaParser$ MODULE$ = null;
  protected  scala.util.matching.Regex whiteSpace ()  { throw new RuntimeException(); }
  public  scala.util.parsing.combinator.Parsers.Success$ Success ()  { throw new RuntimeException(); }
  public  scala.util.parsing.combinator.Parsers.NoSuccess$ NoSuccess ()  { throw new RuntimeException(); }
  public  scala.util.parsing.combinator.Parsers.Failure$ Failure ()  { throw new RuntimeException(); }
  public  scala.util.parsing.combinator.Parsers.Error$ Error ()  { throw new RuntimeException(); }
  public   RFormulaParser$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ParsedRFormula parse (java.lang.String value)  { throw new RuntimeException(); }
}
