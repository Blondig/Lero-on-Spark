package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the CREATE INDEX command.
 */
public  class CreateIndex extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  { throw new RuntimeException(); }
  public  java.lang.String indexName ()  { throw new RuntimeException(); }
  public  java.lang.String indexType ()  { throw new RuntimeException(); }
  public  boolean ignoreIfExists ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.analysis.FieldName, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> columns ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateIndex (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table, java.lang.String indexName, java.lang.String indexType, boolean ignoreIfExists, scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.analysis.FieldName, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> columns, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.CreateIndex withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
