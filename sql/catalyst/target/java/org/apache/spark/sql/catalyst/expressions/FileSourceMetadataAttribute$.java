package org.apache.spark.sql.catalyst.expressions;
/**
 * The internal representation of the FileSourceMetadataAttribute, it sets <code>__metadata_col</code>
 * and <code>__file_source_metadata_col</code> to <code>true</code> in AttributeReference's metadata
 * - apply() will create a file source metadata attribute reference
 * - unapply() will check if an attribute reference is the file source metadata attribute reference
 */
public  class FileSourceMetadataAttribute$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FileSourceMetadataAttribute$ MODULE$ = null;
  public   FileSourceMetadataAttribute$ ()  { throw new RuntimeException(); }
  public  java.lang.String FILE_SOURCE_METADATA_COL_ATTR_KEY ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference apply (java.lang.String name, org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.AttributeReference> unapply (org.apache.spark.sql.catalyst.expressions.AttributeReference attr)  { throw new RuntimeException(); }
  /**
   * Cleanup the internal metadata information of an attribute if it is
   * a {@link FileSourceMetadataAttribute}, it will remove both {@link METADATA_COL_ATTR_KEY} and
   * {@link FILE_SOURCE_METADATA_COL_ATTR_KEY} from the attribute {@link Metadata}
   * @param attr (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Attribute cleanupFileSourceMetadataInformation (org.apache.spark.sql.catalyst.expressions.Attribute attr)  { throw new RuntimeException(); }
}
