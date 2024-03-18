package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * The shared abstract superclass for <code>MaxBy</code> and <code>MinBy</code> SQL aggregate functions.
 */
public abstract class MaxMinBy extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements org.apache.spark.sql.catalyst.trees.BinaryLike<org.apache.spark.sql.catalyst.expressions.Expression> {
  public   MaxMinBy ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference evaluateExpression ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> initialValues ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression orderingExpr ()  ;
  protected abstract  org.apache.spark.sql.catalyst.expressions.Expression orderingUpdater (org.apache.spark.sql.catalyst.expressions.Expression oldExpr, org.apache.spark.sql.catalyst.expressions.Expression newExpr)  ;
  protected abstract  org.apache.spark.sql.catalyst.expressions.Expression predicate (org.apache.spark.sql.catalyst.expressions.Expression oldExpr, org.apache.spark.sql.catalyst.expressions.Expression newExpr)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression valueExpr ()  ;
}
