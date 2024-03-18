package org.apache.spark.sql.util;
public  class SQLOpenHashSet$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SQLOpenHashSet$ MODULE$ = null;
  public   SQLOpenHashSet$ ()  { throw new RuntimeException(); }
  public  scala.Function2<org.apache.spark.sql.catalyst.util.ArrayData, java.lang.Object, scala.runtime.BoxedUnit> withNullCheckFunc (org.apache.spark.sql.types.DataType dataType, org.apache.spark.sql.util.SQLOpenHashSet<java.lang.Object> hashSet, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> handleNotNull, scala.Function0<scala.runtime.BoxedUnit> handleNull)  { throw new RuntimeException(); }
  public  java.lang.String withNullCheckCode (boolean arrayContainsNull, boolean setContainsNull, java.lang.String array, java.lang.String index, java.lang.String hashSet, scala.Function2<java.lang.String, java.lang.String, java.lang.String> handleNotNull, java.lang.String handleNull)  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> withNaNCheckFunc (org.apache.spark.sql.types.DataType dataType, org.apache.spark.sql.util.SQLOpenHashSet<java.lang.Object> hashSet, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> handleNotNaN, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> handleNaN)  { throw new RuntimeException(); }
  public  java.lang.String withNaNCheckCode (org.apache.spark.sql.types.DataType dataType, java.lang.String valueName, java.lang.String hashSet, java.lang.String handleNotNaN, scala.Function1<java.lang.String, java.lang.String> handleNaN)  { throw new RuntimeException(); }
}
