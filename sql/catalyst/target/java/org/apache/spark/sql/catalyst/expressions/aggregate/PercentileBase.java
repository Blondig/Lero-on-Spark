package org.apache.spark.sql.catalyst.expressions.aggregate;
public abstract class PercentileBase extends org.apache.spark.sql.catalyst.expressions.aggregate.TypedImperativeAggregate<org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object>> implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public   PercentileBase ()  { throw new RuntimeException(); }
  /**
   * use a binary search to find the index of the position closest to the current value.
   * @param countsArray (undocumented)
   * @param start (undocumented)
   * @param end (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  protected  int binarySearchCount (long[] countsArray, int start, int end, long value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression child ()  ;
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> createAggregationBuffer ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> deserialize (byte[] bytes)  { throw new RuntimeException(); }
  protected abstract  boolean discrete ()  ;
  public  Object eval (org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> buffer)  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression frequencyExpression ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> merge (org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> buffer, org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> other)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression percentageExpression ()  ;
  // not preceding
  protected  double[] percentages ()  { throw new RuntimeException(); }
  public abstract  boolean reverse ()  ;
  public  byte[] serialize (org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> obj)  { throw new RuntimeException(); }
  protected  double toDoubleValue (Object d)  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> update (org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> buffer, org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
}
