package org.apache.spark.sql.execution.datasources.jdbc.connection;
public abstract class ConnectionProviderBase implements org.apache.spark.internal.Logging {
  public   ConnectionProviderBase ()  { throw new RuntimeException(); }
  public  java.sql.Connection create (java.sql.Driver driver, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.Option<java.lang.String> connectionProviderName)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.jdbc.JdbcConnectionProvider> loadProviders ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.jdbc.JdbcConnectionProvider> providers ()  { throw new RuntimeException(); }
}
