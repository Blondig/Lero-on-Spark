package org.apache.spark.sql.catalyst.analysis;
public  class UnresolvedFunction extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.analysis.UnresolvedFunction apply (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments, boolean isDistinct)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.analysis.UnresolvedFunction apply (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments, boolean isDistinct)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> nameParts ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments ()  { throw new RuntimeException(); }
  public  boolean isDistinct ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> filter ()  { throw new RuntimeException(); }
  public  boolean ignoreNulls ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedFunction (scala.collection.Seq<java.lang.String> nameParts, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments, boolean isDistinct, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> filter, boolean ignoreNulls)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.analysis.UnresolvedFunction withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}