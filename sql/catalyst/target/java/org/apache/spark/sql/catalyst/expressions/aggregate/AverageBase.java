package org.apache.spark.sql.catalyst.expressions.aggregate;
public abstract class AverageBase extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.trees.UnaryLike<org.apache.spark.sql.catalyst.expressions.Expression> {
  public   AverageBase ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference count ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> flatArguments ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression getEvaluateExpression (java.lang.String queryContext)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> getMergeExpressions ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> getUpdateExpressions ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> initialValues ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.types.AtomicType resultType ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference sum ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.AtomicType sumDataType ()  { throw new RuntimeException(); }
  public abstract  boolean useAnsiAdd ()  ;
}
