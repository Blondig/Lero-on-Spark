package org.apache.spark.sql.catalyst.analysis;
public  interface RewriteRowLevelCommand {
  public  org.apache.spark.sql.connector.write.RowLevelOperationTable buildOperationTable (org.apache.spark.sql.connector.catalog.SupportsRowLevelOperations table, org.apache.spark.sql.connector.write.RowLevelOperation.Command command, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  ;
  public  org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation buildRelationWithAttrs (org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation, org.apache.spark.sql.connector.write.RowLevelOperationTable table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> metadataAttrs)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> dedupAttrs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attrs)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> resolveRequiredMetadataAttrs (org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation, org.apache.spark.sql.connector.write.RowLevelOperation operation)  ;
}
