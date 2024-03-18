package org.apache.spark.sql.catalyst.expressions;
public  class Nvl2 extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, org.apache.spark.sql.catalyst.expressions.InheritAnalysisRules, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression expr1 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression expr2 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression expr3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  // not preceding
  public   Nvl2 (org.apache.spark.sql.catalyst.expressions.Expression expr1, org.apache.spark.sql.catalyst.expressions.Expression expr2, org.apache.spark.sql.catalyst.expressions.Expression expr3, org.apache.spark.sql.catalyst.expressions.Expression replacement)  { throw new RuntimeException(); }
  public   Nvl2 (org.apache.spark.sql.catalyst.expressions.Expression expr1, org.apache.spark.sql.catalyst.expressions.Expression expr2, org.apache.spark.sql.catalyst.expressions.Expression expr3)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> parameters ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Nvl2 withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
