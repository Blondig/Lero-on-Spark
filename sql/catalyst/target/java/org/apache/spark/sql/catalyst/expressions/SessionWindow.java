package org.apache.spark.sql.catalyst.expressions;
/**
 * Represent the session window.
 * <p>
 * param:  timeColumn the start time of session window
 * param:  gapDuration the duration of session gap. For static gap duration, meaning the session
 *                    will close if there is no new element appeared within "the last element in
 *                    session + gap". Besides a static gap duration value, users can also provide
 *                    an expression to specify gap duration dynamically based on the input row.
 *                    With dynamic gap duration, the closing of a session window does not depend
 *                    on the latest input anymore. A session window's range is the union of all
 *                    events' ranges which are determined by event start time and evaluated gap
 *                    duration during the query execution. Note that the rows with negative or
 *                    zero gap duration will be filtered out from the aggregation.
 */
public  class SessionWindow extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.Unevaluable, org.apache.spark.sql.catalyst.expressions.NonSQLExpression, scala.Product, scala.Serializable {
  static public  java.lang.String marker ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.SessionWindow apply (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, java.lang.String gapDuration)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression timeColumn ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression gapDuration ()  { throw new RuntimeException(); }
  // not preceding
  public   SessionWindow (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, org.apache.spark.sql.catalyst.expressions.Expression gapDuration)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
