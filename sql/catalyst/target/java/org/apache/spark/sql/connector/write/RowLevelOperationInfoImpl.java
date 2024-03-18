package org.apache.spark.sql.connector.write;
  class RowLevelOperationInfoImpl implements org.apache.spark.sql.connector.write.RowLevelOperationInfo, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.RowLevelOperation.Command command ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.CaseInsensitiveStringMap options ()  { throw new RuntimeException(); }
  // not preceding
  public   RowLevelOperationInfoImpl (org.apache.spark.sql.connector.write.RowLevelOperation.Command command, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
}
