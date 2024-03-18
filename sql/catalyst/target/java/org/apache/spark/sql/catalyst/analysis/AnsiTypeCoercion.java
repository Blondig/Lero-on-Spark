package org.apache.spark.sql.catalyst.analysis;
/**
 * In Spark ANSI mode, the type coercion rules are based on the type precedence lists of the input
 * data types.
 * As per the section "Type precedence list determination" of "ISO/IEC 9075-2:2011
 * Information technology - Database languages - SQL - Part 2: Foundation (SQL/Foundation)",
 * the type precedence lists of primitive data types are as following:
 *   * Byte: Byte, Short, Int, Long, Decimal, Float, Double
 *   * Short: Short, Int, Long, Decimal, Float, Double
 *   * Int: Int, Long, Decimal, Float, Double
 *   * Long: Long, Decimal, Float, Double
 *   * Decimal: Float, Double, or any wider Numeric type
 *   * Float: Float, Double
 *   * Double: Double
 *   * String: String
 *   * Date: Date, Timestamp
 *   * Timestamp: Timestamp
 *   * Binary: Binary
 *   * Boolean: Boolean
 *   * Interval: Interval
 * As for complex data types, Spark will determine the precedent list recursively based on their
 * sub-types and nullability.
 * <p>
 * With the definition of type precedent list, the general type coercion rules are as following:
 *   * Data type S is allowed to be implicitly cast as type T iff T is in the precedence list of S
 *   * Comparison is allowed iff the data type precedence list of both sides has at least one common
 *     element. When evaluating the comparison, Spark casts both sides as the tightest common data
 *     type of their precedent lists.
 *   * There should be at least one common data type among all the children's precedence lists for
 *     the following operators. The data type of the operator is the tightest common precedent
 *     data type.
 *       * In
 *       * Except
 *       * Intersect
 *       * Greatest
 *       * Least
 *       * Union
 *       * If
 *       * CaseWhen
 *       * CreateArray
 *       * Array Concat
 *       * Sequence
 *       * MapConcat
 *       * CreateMap
 *   * For complex types (struct, array, map), Spark recursively looks into the element type and
 *     applies the rules above.
 *  Note: this new type coercion system will allow implicit converting String type as other
 *  primitive types, in case of breaking too many existing Spark SQL queries. This is a special
 *  rule and it is not from the ANSI SQL standard.
 */
public  class AnsiTypeCoercion {
  static public  class PromoteStrings$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PromoteStrings$ MODULE$ = null;
    public   PromoteStrings$ ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> transform ()  { throw new RuntimeException(); }
  }
  /**
   * When getting a date field from a Timestamp column, cast the column as date type.
   * <p>
   * This is Spark's hack to make the implementation simple. In the default type coercion rules,
   * the implicit cast rule does the work. However, The ANSI implicit cast rule doesn't allow
   * converting Timestamp type as Date type, so we need to have this additional rule
   * to make sure the date field extraction from Timestamp columns works.
   */
  static public  class GetDateFieldOperations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetDateFieldOperations$ MODULE$ = null;
    public   GetDateFieldOperations$ ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> transform ()  { throw new RuntimeException(); }
  }
  static public  class DateTimeOperations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DateTimeOperations$ MODULE$ = null;
    public   DateTimeOperations$ ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> transform ()  { throw new RuntimeException(); }
  }
  static public  class AnsiCombinedTypeCoercionRule extends org.apache.spark.sql.catalyst.analysis.TypeCoercionBase.CombinedTypeCoercionRule {
    public   AnsiCombinedTypeCoercionRule (scala.collection.Seq<org.apache.spark.sql.catalyst.analysis.TypeCoercionRule> rules)  { throw new RuntimeException(); }
  }
  static public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> typeCoercionRules ()  { throw new RuntimeException(); }
  static public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTightestCommonType ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.DataType> findWiderCommonType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> implicitCast (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.types.AbstractDataType expectedType)  { throw new RuntimeException(); }
  static public  boolean canCast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.spark.sql.types.DataType> findTypeForComplex (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2, scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTypeFunc)  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeForDecimal (org.apache.spark.sql.types.DataType dt1, org.apache.spark.sql.types.DataType dt2)  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotionForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotion (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  static public  boolean haveSameType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression castIfNotSameType (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
}
