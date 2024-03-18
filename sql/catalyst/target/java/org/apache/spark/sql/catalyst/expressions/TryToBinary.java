package org.apache.spark.sql.catalyst.expressions;
public  class TryToBinary extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, org.apache.spark.sql.catalyst.expressions.InheritAnalysisRules, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression expr ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> format ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  // not preceding
  public   TryToBinary (org.apache.spark.sql.catalyst.expressions.Expression expr, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> format, org.apache.spark.sql.catalyst.expressions.Expression replacement)  { throw new RuntimeException(); }
  public   TryToBinary (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  public   TryToBinary (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.expressions.Expression formatExpression)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> parameters ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
