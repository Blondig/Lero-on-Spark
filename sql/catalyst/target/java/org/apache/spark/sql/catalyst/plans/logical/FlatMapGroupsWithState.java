package org.apache.spark.sql.catalyst.plans.logical;
public  class FlatMapGroupsWithState extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.BinaryNode, org.apache.spark.sql.catalyst.plans.logical.ObjectProducer, scala.Product, scala.Serializable {
  // not preceding
  static public <K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, U extends java.lang.Object> org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalGroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> func, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes, org.apache.spark.sql.streaming.OutputMode outputMode, boolean isMapGroupsWithState, org.apache.spark.sql.streaming.GroupStateTimeout timeout, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, org.apache.spark.sql.Encoder<K> evidence$16, org.apache.spark.sql.Encoder<V> evidence$17, org.apache.spark.sql.Encoder<S> evidence$18, org.apache.spark.sql.Encoder<U> evidence$19)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, U extends java.lang.Object> org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalGroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> func, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes, org.apache.spark.sql.streaming.OutputMode outputMode, boolean isMapGroupsWithState, org.apache.spark.sql.streaming.GroupStateTimeout timeout, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateGroupAttrs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateDataAttrs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan initialState, org.apache.spark.sql.Encoder<K> evidence$20, org.apache.spark.sql.Encoder<V> evidence$21, org.apache.spark.sql.Encoder<S> evidence$22, org.apache.spark.sql.Encoder<U> evidence$23)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalGroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> func ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression keyDeserializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression valueDeserializer ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute outputObjAttr ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> stateEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  public  boolean isMapGroupsWithState ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.GroupStateTimeout timeout ()  { throw new RuntimeException(); }
  public  boolean hasInitialState ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateGroupAttrs ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateDataAttrs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression initialStateDeserializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan initialState ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   FlatMapGroupsWithState (scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalGroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> func, org.apache.spark.sql.catalyst.expressions.Expression keyDeserializer, org.apache.spark.sql.catalyst.expressions.Expression valueDeserializer, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes, org.apache.spark.sql.catalyst.expressions.Attribute outputObjAttr, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> stateEncoder, org.apache.spark.sql.streaming.OutputMode outputMode, boolean isMapGroupsWithState, org.apache.spark.sql.streaming.GroupStateTimeout timeout, boolean hasInitialState, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateGroupAttrs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateDataAttrs, org.apache.spark.sql.catalyst.expressions.Expression initialStateDeserializer, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan initialState, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.FlatMapGroupsWithState withNewChildrenInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newLeft, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newRight)  { throw new RuntimeException(); }
}
