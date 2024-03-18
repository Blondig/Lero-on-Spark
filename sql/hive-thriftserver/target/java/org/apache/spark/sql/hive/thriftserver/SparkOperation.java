package org.apache.spark.sql.hive.thriftserver;
/**
 * Utils for Spark operations.
 */
public  interface SparkOperation extends org.apache.spark.internal.Logging {
  public  void cleanup ()  ;
  public  void close ()  ;
  public  scala.PartialFunction<java.lang.Throwable, scala.runtime.BoxedUnit> onError ()  ;
  public  void run ()  ;
  public  org.apache.spark.sql.SQLContext sqlContext ()  ;
  public  java.lang.String statementId ()  ;
  public  java.lang.String tableTypeString (org.apache.spark.sql.catalyst.catalog.CatalogTableType tableType)  ;
  public <T extends java.lang.Object> T withLocalProperties (scala.Function0<T> f)  ;
}
