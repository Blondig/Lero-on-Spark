package org.apache.spark.sql.util;
public  class SQLOpenHashSet<T extends java.lang.Object> {
  static public  scala.Function2<org.apache.spark.sql.catalyst.util.ArrayData, java.lang.Object, scala.runtime.BoxedUnit> withNullCheckFunc (org.apache.spark.sql.types.DataType dataType, org.apache.spark.sql.util.SQLOpenHashSet<java.lang.Object> hashSet, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> handleNotNull, scala.Function0<scala.runtime.BoxedUnit> handleNull)  { throw new RuntimeException(); }
  static public  java.lang.String withNullCheckCode (boolean arrayContainsNull, boolean setContainsNull, java.lang.String array, java.lang.String index, java.lang.String hashSet, scala.Function2<java.lang.String, java.lang.String, java.lang.String> handleNotNull, java.lang.String handleNull)  { throw new RuntimeException(); }
  static public  scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> withNaNCheckFunc (org.apache.spark.sql.types.DataType dataType, org.apache.spark.sql.util.SQLOpenHashSet<java.lang.Object> hashSet, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> handleNotNaN, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> handleNaN)  { throw new RuntimeException(); }
  static public  java.lang.String withNaNCheckCode (org.apache.spark.sql.types.DataType dataType, java.lang.String valueName, java.lang.String hashSet, java.lang.String handleNotNaN, scala.Function1<java.lang.String, java.lang.String> handleNaN)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SQLOpenHashSet (int initialCapacity, double loadFactor, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public   SQLOpenHashSet (int initialCapacity, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public   SQLOpenHashSet (scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  public  void addNull ()  { throw new RuntimeException(); }
  public  void addNaN ()  { throw new RuntimeException(); }
  public  void add (T k)  { throw new RuntimeException(); }
  public  boolean contains (T k)  { throw new RuntimeException(); }
  public  boolean containsNull ()  { throw new RuntimeException(); }
  public  boolean containsNaN ()  { throw new RuntimeException(); }
}
