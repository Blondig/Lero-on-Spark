package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the CREATE VIEW ... command.
 */
public  class CreateView extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.BinaryCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, scala.Option<java.lang.String>>> userSpecifiedColumns ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> comment ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> originalText ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  public  boolean allowExisting ()  { throw new RuntimeException(); }
  public  boolean replace ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateView (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.collection.Seq<scala.Tuple2<java.lang.String, scala.Option<java.lang.String>>> userSpecifiedColumns, scala.Option<java.lang.String> comment, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, scala.Option<java.lang.String> originalText, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, boolean allowExisting, boolean replace)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withNewChildrenInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newLeft, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newRight)  { throw new RuntimeException(); }
}
