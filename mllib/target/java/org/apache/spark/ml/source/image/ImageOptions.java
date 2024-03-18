package org.apache.spark.ml.source.image;
  class ImageOptions implements scala.Serializable {
  // not preceding
  public   ImageOptions (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters)  { throw new RuntimeException(); }
  public   ImageOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  /**
   * Whether to drop invalid images. If true, invalid images will be removed, otherwise
   * invalid images will be returned with empty data and all other field filled with <code>-1</code>.
   * @return (undocumented)
   */
  public  boolean dropInvalid ()  { throw new RuntimeException(); }
}
