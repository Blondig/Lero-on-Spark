package org.apache.spark.sql.catalyst.expressions;
public abstract class RegExpExtractBase extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.NullIntolerant {
  static public  void checkGroupIndex (int groupCount, int groupIndex)  { throw new RuntimeException(); }
  public   RegExpExtractBase ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression subject ()  ;
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression regexp ()  ;
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression idx ()  ;
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression first ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression second ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression third ()  { throw new RuntimeException(); }
  protected  java.util.regex.Matcher getLastMatcher (Object s, Object p)  { throw new RuntimeException(); }
}
