package org.apache.spark.ml.feature;
/**
 * Utility transformer that rewrites Vector attribute names via prefix replacement. For example,
 * it can rewrite attribute names starting with 'foo_' to start with 'bar_' instead.
 * <p>
 * param:  vectorCol name of the vector column to rewrite.
 * param:  prefixesToRewrite the map of string prefixes to their replacement values. Each attribute
 *                          name defined in vectorCol will be checked against the keys of this
 *                          map. When a key prefixes a name, the matching prefix will be replaced
 *                          by the value in the map.
 */
public  class VectorAttributeRewriter extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link VectorAttributeRewriter} */
  static   class VectorAttributeRewriterWriter extends org.apache.spark.ml.util.MLWriter {
    public   VectorAttributeRewriterWriter (org.apache.spark.ml.feature.VectorAttributeRewriter instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.VectorAttributeRewriter> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorAttributeRewriter load (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  java.lang.String vectorCol ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> prefixesToRewrite ()  { throw new RuntimeException(); }
  // not preceding
  public   VectorAttributeRewriter (java.lang.String uid, java.lang.String vectorCol, scala.collection.immutable.Map<java.lang.String, java.lang.String> prefixesToRewrite)  { throw new RuntimeException(); }
  public   VectorAttributeRewriter (java.lang.String vectorCol, scala.collection.immutable.Map<java.lang.String, java.lang.String> prefixesToRewrite)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorAttributeRewriter copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
