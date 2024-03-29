package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * A base class for collect_list and collect_set aggregate functions.
 * <p>
 * We have to store all the collected elements in memory, and so notice that too many elements
 * can cause GC paused and eventually OutOfMemory Errors.
 */
public abstract class Collect<T extends scala.collection.generic.Growable<java.lang.Object>> extends org.apache.spark.sql.catalyst.expressions.aggregate.TypedImperativeAggregate<T> implements org.apache.spark.sql.catalyst.trees.UnaryLike<org.apache.spark.sql.catalyst.expressions.Expression> {
  public   Collect ()  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.sql.types.DataType bufferElementType ()  ;
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression child ()  ;
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  protected abstract  Object convertToBufferElement (Object value)  ;
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Literal> defaultResult ()  { throw new RuntimeException(); }
  public  T deserialize (byte[] bytes)  { throw new RuntimeException(); }
  public  T merge (T buffer, T other)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  byte[] serialize (T obj)  { throw new RuntimeException(); }
  public  T update (T buffer, org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
}
