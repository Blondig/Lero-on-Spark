package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * Compute the covariance between two expressions.
 * When applied on empty data (i.e., count is zero), it returns NULL.
 */
public abstract class Covariance extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.trees.BinaryLike<org.apache.spark.sql.catalyst.expressions.Expression> {
  // not preceding
  public   Covariance (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, boolean nullOnDivideByZero)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.AttributeReference ck ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression divideByZeroEvalResult ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> initialValues ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.AttributeReference n ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressionsDef ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.AttributeReference xAvg ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.AttributeReference yAvg ()  { throw new RuntimeException(); }
}
