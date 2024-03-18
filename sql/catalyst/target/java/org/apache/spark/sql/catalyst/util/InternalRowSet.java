package org.apache.spark.sql.catalyst.util;
/**
 * A mutable Set with {@link InternalRow} as its element type. It uses Spark's internal murmur hash to
 * compute hash code from an row, and uses {@link RowOrdering} to perform equality checks.
 * <p>
 * param:  dataTypes the data types for the row keys this set holds
 */
public  class InternalRowSet implements scala.collection.mutable.Set<org.apache.spark.sql.catalyst.InternalRow> {
  // not preceding
  public   InternalRowSet (scala.collection.Seq<org.apache.spark.sql.types.DataType> dataTypes)  { throw new RuntimeException(); }
  public  boolean contains (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> dataTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iterator ()  { throw new RuntimeException(); }
}
