package org.apache.spark.sql.catalyst.plans.logical;
public  class UpdateAction extends org.apache.spark.sql.catalyst.plans.logical.MergeAction implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.Assignment> assignments ()  { throw new RuntimeException(); }
  // not preceding
  public   UpdateAction (scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.Assignment> assignments)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.UpdateAction withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
