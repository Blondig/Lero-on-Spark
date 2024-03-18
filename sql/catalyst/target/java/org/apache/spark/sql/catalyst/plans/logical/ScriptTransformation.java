package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Transforms the input by forking and running the specified script.
 * <p>
 * param:  script the command that should be executed.
 * param:  output the attributes that are produced by the script.
 * param:  ioschema the input and output schema applied in the execution of the script.
 */
public  class ScriptTransformation extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  java.lang.String script ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ScriptInputOutputSchema ioschema ()  { throw new RuntimeException(); }
  // not preceding
  public   ScriptTransformation (java.lang.String script, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, org.apache.spark.sql.catalyst.plans.logical.ScriptInputOutputSchema ioschema)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.ScriptTransformation withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
