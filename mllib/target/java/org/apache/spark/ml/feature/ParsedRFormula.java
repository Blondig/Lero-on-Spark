package org.apache.spark.ml.feature;
/**
 * Represents a parsed R formula.
 */
  class ParsedRFormula implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ColumnRef label ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ml.feature.Term> terms ()  { throw new RuntimeException(); }
  // not preceding
  public   ParsedRFormula (org.apache.spark.ml.feature.ColumnRef label, scala.collection.Seq<org.apache.spark.ml.feature.Term> terms)  { throw new RuntimeException(); }
  /**
   * Resolves formula terms into column names. A schema is necessary for inferring the meaning
   * of the special '.' term. Duplicate terms will be removed during resolution.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.feature.ResolvedRFormula resolve (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /** Whether this formula specifies fitting with response variable. */
  public  boolean hasLabel ()  { throw new RuntimeException(); }
  /** Whether this formula specifies fitting with an intercept term. */
  public  boolean hasIntercept ()  { throw new RuntimeException(); }
}
