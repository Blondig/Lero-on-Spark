package org.apache.spark.ml.source.libsvm;
/**
 * Options for the LibSVM data source.
 */
  class LibSVMOptions implements scala.Serializable {
  static public  java.lang.String NUM_FEATURES ()  { throw new RuntimeException(); }
  static public  java.lang.String VECTOR_TYPE ()  { throw new RuntimeException(); }
  static public  java.lang.String DENSE_VECTOR_TYPE ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARSE_VECTOR_TYPE ()  { throw new RuntimeException(); }
  // not preceding
  public   LibSVMOptions (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters)  { throw new RuntimeException(); }
  public   LibSVMOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  /**
   * Number of features. If unspecified or nonpositive, the number of features will be determined
   * automatically at the cost of one additional pass.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> numFeatures ()  { throw new RuntimeException(); }
  public  boolean isSparse ()  { throw new RuntimeException(); }
}
