package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that throws an exception if 'condition' is not true.
 */
public  class AssertTrue extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, org.apache.spark.sql.catalyst.expressions.InheritAnalysisRules, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.AssertTrue apply (org.apache.spark.sql.catalyst.expressions.Expression left)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  // not preceding
  public   AssertTrue (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, org.apache.spark.sql.catalyst.expressions.Expression replacement)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public   AssertTrue (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
  public   AssertTrue (org.apache.spark.sql.catalyst.expressions.Expression left)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> parameters ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.AssertTrue withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
