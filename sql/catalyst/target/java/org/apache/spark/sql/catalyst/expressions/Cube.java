package org.apache.spark.sql.catalyst.expressions;
public  class Cube extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.BaseGroupingSets, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.Cube apply (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> groupingSets)  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<java.lang.Object>> groupingSetIndexes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  // not preceding
  public   Cube (scala.collection.Seq<scala.collection.Seq<java.lang.Object>> groupingSetIndexes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> groupingSets ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> selectedGroupByExprs ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Cube withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
