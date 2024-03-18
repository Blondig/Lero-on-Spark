package org.apache.spark.ml.param;
public  class ParamsSuite$ extends org.apache.spark.SparkFunSuite {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParamsSuite$ MODULE$ = null;
  public   ParamsSuite$ ()  { throw new RuntimeException(); }
  /**
   * Checks common requirements for <code>Params.params</code>:
   *   - params are ordered by names
   *   - param parent has the same UID as the object's UID
   *   - param name is the same as the param method name
   *   - obj.copy should return the same type as the obj
   * @param obj (undocumented)
   */
  public  void checkParams (org.apache.spark.ml.param.Params obj)  { throw new RuntimeException(); }
  /**
   * Checks that the class throws an exception in case multiple exclusive params are set.
   * The params to be checked are passed as arguments with their value.
   * @param model (undocumented)
   * @param dataset (undocumented)
   * @param paramsAndValues (undocumented)
   */
  public  void testExclusiveParams (org.apache.spark.ml.param.Params model, org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> paramsAndValues)  { throw new RuntimeException(); }
}
