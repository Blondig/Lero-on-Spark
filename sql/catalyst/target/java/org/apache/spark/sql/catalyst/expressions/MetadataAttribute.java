package org.apache.spark.sql.catalyst.expressions;
/**
 * The internal representation of the MetadataAttribute,
 * it sets <code>__metadata_col</code> to <code>true</code> in AttributeReference metadata
 * - apply() will create a metadata attribute reference
 * - unapply() will check if an attribute reference is the metadata attribute reference
 */
public  class MetadataAttribute {
  static public  org.apache.spark.sql.catalyst.expressions.AttributeReference apply (java.lang.String name, org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.AttributeReference> unapply (org.apache.spark.sql.catalyst.expressions.AttributeReference attr)  { throw new RuntimeException(); }
}
