package org.apache.spark.sql.connector.write;
/**
 * An internal v2 table implementation that wraps the original table and a logical row-level
 * operation for DELETE, UPDATE, MERGE commands that require rewriting data.
 * <p>
 * The purpose of this table is to make the existing scan and write planning rules work
 * with commands that require coordination between the scan and the write (so that the write
 * knows what to replace).
 */
  class RowLevelOperationTable implements org.apache.spark.sql.connector.catalog.Table, org.apache.spark.sql.connector.catalog.SupportsRead, org.apache.spark.sql.connector.catalog.SupportsWrite, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  public  org.apache.spark.sql.connector.catalog.Table table ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.RowLevelOperation operation ()  { throw new RuntimeException(); }
  // not preceding
  public   RowLevelOperationTable (org.apache.spark.sql.connector.catalog.Table table, org.apache.spark.sql.connector.write.RowLevelOperation operation)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.ScanBuilder newScanBuilder (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder (org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
}
