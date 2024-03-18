package org.apache.spark.sql.streaming;
public  class SafeJsonSerializer {
  static public  org.json4s.JsonAST.JValue safeDoubleToJValue (double value)  { throw new RuntimeException(); }
  /** Convert map to JValue while handling empty maps. Also, this sorts the keys. */
  static public <T extends java.lang.Object> org.json4s.JsonAST.JValue safeMapToJValue (java.util.Map<java.lang.String, T> map, scala.Function1<T, org.json4s.JsonAST.JValue> valueToJValue)  { throw new RuntimeException(); }
}
