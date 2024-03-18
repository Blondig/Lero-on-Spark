package org.apache.spark.sql.catalyst.trees;
/**
 * Contexts of TreeNodes, including location, SQL text, object type and object name.
 * The only supported object type is "VIEW" now. In the future, we may support SQL UDF or other
 * objects which contain SQL text.
 */
public  class Origin implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> line ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> startPosition ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> startIndex ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> stopIndex ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> sqlText ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> objectType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> objectName ()  { throw new RuntimeException(); }
  // not preceding
  public   Origin (scala.Option<java.lang.Object> line, scala.Option<java.lang.Object> startPosition, scala.Option<java.lang.Object> startIndex, scala.Option<java.lang.Object> stopIndex, scala.Option<java.lang.String> sqlText, scala.Option<java.lang.String> objectType, scala.Option<java.lang.String> objectName)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String context ()  { throw new RuntimeException(); }
}
