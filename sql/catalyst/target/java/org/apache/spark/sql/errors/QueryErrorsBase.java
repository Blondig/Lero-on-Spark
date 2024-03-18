package org.apache.spark.sql.errors;
/**
 * The trait exposes util methods for preparing error messages such as quoting of error elements.
 * All classes that extent <code>QueryErrorsBase</code> shall follow the rules:
 * 1. Any values shall be outputted in the SQL standard style by using <code>toSQLValue()</code>.
 *   For example: 'a string value', 1, NULL.
 * 2. SQL types shall be double quoted and outputted in the upper case using <code>toSQLType()</code>.
 *   For example: "INT", "DECIMAL(10,0)".
 * 3. Elements of identifiers shall be wrapped by backticks by using <code>toSQLId()</code>.
 *   For example: <code>namespaceA</code>.<code>funcB</code>, <code>tableC</code>.
 * 4. SQL statements shall be in the upper case prepared by using <code>toSQLStmt</code>.
 *   For example: DESC PARTITION, DROP TEMPORARY FUNCTION.
 * 5. SQL configs and datasource options shall be wrapped by double quotes by using
 *   <code>toSQLConf()</code>/<code>toDSOption()</code>.
 *   For example: "spark.sql.ansi.enabled".
 * 6. Any values of datasource options or SQL configs shall be double quoted.
 *   For example: "true", "CORRECTED".
 * 7. SQL expressions shall be wrapped by double quotes.
 *   For example: "earnings + 1".
 */
public  interface QueryErrorsBase {
  public  java.lang.String quoteByDefault (java.lang.String elem)  ;
  public  java.lang.String toDSOption (java.lang.String option)  ;
  public  java.lang.String toSQLConf (java.lang.String conf)  ;
  public  java.lang.String toSQLExpr (org.apache.spark.sql.catalyst.expressions.Expression e)  ;
  public  java.lang.String toSQLId (scala.collection.Seq<java.lang.String> parts)  ;
  public  java.lang.String toSQLId (java.lang.String parts)  ;
  public  java.lang.String toSQLStmt (java.lang.String text)  ;
  public  java.lang.String toSQLType (org.apache.spark.sql.types.DataType t)  ;
  public  java.lang.String toSQLValue (Object v, org.apache.spark.sql.types.DataType t)  ;
}
