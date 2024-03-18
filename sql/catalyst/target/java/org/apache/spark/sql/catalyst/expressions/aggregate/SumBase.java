package org.apache.spark.sql.catalyst.expressions.aggregate;
public abstract class SumBase extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.trees.UnaryLike<org.apache.spark.sql.catalyst.expressions.Expression> {
  public   SumBase (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> flatArguments ()  { throw new RuntimeException(); }
  /**
   * If the isEmpty is true, then it means there were no values to begin with or all the values
   * were null, so the result will be null.
   * If the isEmpty is false, then if sum is null that means an overflow has happened.
   * So now, if ansi is enabled, then throw exception, if not then return null.
   * If sum is not null, then return the sum.
   * @param queryContext (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.expressions.Expression getEvaluateExpression (java.lang.String queryContext)  { throw new RuntimeException(); }
  /**
   * When shouldTrackIsEmpty is true:
   * If isEmpty is false and if sum is null, then it means we have had an overflow.
   * <p>
   * update of the sum is as follows:
   * Check if either portion of the left.sum or right.sum has overflowed
   * If it has, then the sum value will remain null.
   * If it did not have overflow, then add the sum.left and sum.right
   * <p>
   * isEmpty:  Set to false if either one of the left or right is set to false. This
   * means we have seen at least a value that was not null.
   * @return (undocumented)
   */
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> getMergeExpressions ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> getUpdateExpressions ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> initialValues ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.types.AtomicType resultType ()  { throw new RuntimeException(); }
  protected abstract  boolean shouldTrackIsEmpty ()  ;
  public abstract  boolean useAnsiAdd ()  ;
}
