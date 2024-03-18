package org.apache.spark.sql.catalyst.expressions;
/**
 * A Scala extractor that projects an expression over a given schema. Data types,
 * field indexes and field counts of complex type extractors and attributes
 * are adjusted to fit the schema. All other expressions are left as-is. This
 * class is motivated by columnar nested schema pruning.
 * <p>
 * param:  schema nested column schema
 * param:  output output attributes of the data source relation. They are used to filter out
 *               attributes in the schema that do not belong to the current relation.
 */
public  class ProjectionOverSchema implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet output ()  { throw new RuntimeException(); }
  // not preceding
  public   ProjectionOverSchema (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.catalyst.expressions.AttributeSet output)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> unapply (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
}
