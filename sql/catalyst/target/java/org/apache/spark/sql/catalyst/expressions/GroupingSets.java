package org.apache.spark.sql.catalyst.expressions;
public  class GroupingSets extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.BaseGroupingSets, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.GroupingSets apply (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> groupingSets, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> userGivenGroupByExprs)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.GroupingSets apply (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> groupingSets)  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<java.lang.Object>> groupingSetIndexes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> flatGroupingSets ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> userGivenGroupByExprs ()  { throw new RuntimeException(); }
  // not preceding
  public   GroupingSets (scala.collection.Seq<scala.collection.Seq<java.lang.Object>> groupingSetIndexes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> flatGroupingSets, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> userGivenGroupByExprs)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> groupingSets ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> selectedGroupByExprs ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.GroupingSets withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
