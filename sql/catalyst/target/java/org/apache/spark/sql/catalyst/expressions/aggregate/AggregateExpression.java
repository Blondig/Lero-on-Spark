package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class AggregateExpression extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression apply (org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction aggregateFunction, org.apache.spark.sql.catalyst.expressions.aggregate.AggregateMode mode, boolean isDistinct, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> filter)  { throw new RuntimeException(); }
  static public  boolean containsAggregate (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  boolean isAggregate (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction aggregateFunction ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateMode mode ()  { throw new RuntimeException(); }
  public  boolean isDistinct ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> filter ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ExprId resultId ()  { throw new RuntimeException(); }
  // not preceding
  public   AggregateExpression (org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction aggregateFunction, org.apache.spark.sql.catalyst.expressions.aggregate.AggregateMode mode, boolean isDistinct, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> filter, org.apache.spark.sql.catalyst.expressions.ExprId resultId)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Attribute resultAttribute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet filterAttributes ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
