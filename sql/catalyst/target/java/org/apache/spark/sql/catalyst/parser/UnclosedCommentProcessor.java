package org.apache.spark.sql.catalyst.parser;
/**
 * The post-processor checks the unclosed bracketed comment.
 */
public  class UnclosedCommentProcessor extends org.apache.spark.sql.catalyst.parser.SqlBaseParserBaseListener implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String command ()  { throw new RuntimeException(); }
  public  org.antlr.v4.runtime.CommonTokenStream tokenStream ()  { throw new RuntimeException(); }
  // not preceding
  public   UnclosedCommentProcessor (java.lang.String command, org.antlr.v4.runtime.CommonTokenStream tokenStream)  { throw new RuntimeException(); }
  public  void exitSingleDataType (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleDataTypeContext ctx)  { throw new RuntimeException(); }
  public  void exitSingleExpression (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleExpressionContext ctx)  { throw new RuntimeException(); }
  public  void exitSingleTableIdentifier (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleTableIdentifierContext ctx)  { throw new RuntimeException(); }
  public  void exitSingleFunctionIdentifier (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleFunctionIdentifierContext ctx)  { throw new RuntimeException(); }
  public  void exitSingleMultipartIdentifier (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleMultipartIdentifierContext ctx)  { throw new RuntimeException(); }
  public  void exitSingleTableSchema (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleTableSchemaContext ctx)  { throw new RuntimeException(); }
  public  void exitQuery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QueryContext ctx)  { throw new RuntimeException(); }
  public  void exitSingleStatement (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleStatementContext ctx)  { throw new RuntimeException(); }
}
