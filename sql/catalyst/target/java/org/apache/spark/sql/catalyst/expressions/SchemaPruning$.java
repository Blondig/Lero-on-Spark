package org.apache.spark.sql.catalyst.expressions;
public  class SchemaPruning$ implements org.apache.spark.sql.catalyst.SQLConfHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SchemaPruning$ MODULE$ = null;
  public   SchemaPruning$ ()  { throw new RuntimeException(); }
  /**
   * Prunes the nested schema by the requested fields. For example, if the schema is:
   * <code>id int, s struct<a:int, b:int></code>, and given requested field "s.a", the inner field "b"
   * is pruned in the returned schema: <code>id int, s struct<a:int></code>.
   * Note that:
   *   1. The schema field ordering at original schema is still preserved in pruned schema.
   *   2. The top-level fields are not pruned here.
   * @param schema (undocumented)
   * @param requestedRootFields (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType pruneSchema (org.apache.spark.sql.types.StructType schema, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SchemaPruning.RootField> requestedRootFields)  { throw new RuntimeException(); }
  /**
   * Returns the set of fields from projection and filtering predicates that the query plan needs.
   * @param projects (undocumented)
   * @param filters (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SchemaPruning.RootField> identifyRootFields (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  /**
   * Gets the root (aka top-level, no-parent) {@link StructField}s for the given {@link Expression}.
   * When expr is an {@link Attribute}, construct a field around it and indicate that that
   * field was derived from an attribute.
   * @param expr (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SchemaPruning.RootField> getRootFields (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
}
