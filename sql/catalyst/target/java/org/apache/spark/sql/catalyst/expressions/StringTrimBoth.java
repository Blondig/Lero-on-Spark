package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that takes a character string, removes the leading and trailing characters matching
 * with any character in the trim string, returns the new string.
 * trimStr: A character string to be trimmed from the source string, if it has multiple characters,
 * the function searches for each character in the source string, removes the characters from the
 * source string until it encounters the first non-match character.
 */
public  class StringTrimBoth extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, org.apache.spark.sql.catalyst.expressions.InheritAnalysisRules, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression srcStr ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> trimStr ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  // not preceding
  public   StringTrimBoth (org.apache.spark.sql.catalyst.expressions.Expression srcStr, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> trimStr, org.apache.spark.sql.catalyst.expressions.Expression replacement)  { throw new RuntimeException(); }
  public   StringTrimBoth (org.apache.spark.sql.catalyst.expressions.Expression srcStr, org.apache.spark.sql.catalyst.expressions.Expression trimStr)  { throw new RuntimeException(); }
  public   StringTrimBoth (org.apache.spark.sql.catalyst.expressions.Expression srcStr)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> parameters ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.StringTrimBoth withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
