package org.apache.spark.sql.catalyst.expressions;
public  class Extract extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, org.apache.spark.sql.catalyst.expressions.InheritAnalysisRules, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.Expression createExpr (java.lang.String funcName, org.apache.spark.sql.catalyst.expressions.Expression field, org.apache.spark.sql.catalyst.expressions.Expression source)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression field ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression source ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  // not preceding
  public   Extract (org.apache.spark.sql.catalyst.expressions.Expression field, org.apache.spark.sql.catalyst.expressions.Expression source, org.apache.spark.sql.catalyst.expressions.Expression replacement)  { throw new RuntimeException(); }
  public   Extract (org.apache.spark.sql.catalyst.expressions.Expression field, org.apache.spark.sql.catalyst.expressions.Expression source)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> parameters ()  { throw new RuntimeException(); }
  public  java.lang.String makeSQLString (scala.collection.Seq<java.lang.String> childrenSQL)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
