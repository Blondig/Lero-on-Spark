package org.apache.spark.examples.sql.jdbc;
public  class ExampleJdbcConnectionProvider extends org.apache.spark.sql.jdbc.JdbcConnectionProvider implements org.apache.spark.internal.Logging {
  public   ExampleJdbcConnectionProvider ()  { throw new RuntimeException(); }
  public  boolean canHandle (java.sql.Driver driver, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  java.sql.Connection getConnection (java.sql.Driver driver, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  boolean modifiesSecurityContext (java.sql.Driver driver, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
