package org.apache.spark.ml.feature;
public  class FeatureHasher$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.FeatureHasher>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FeatureHasher$ MODULE$ = null;
  public   FeatureHasher$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.FeatureHasher load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Calculate a hash code value for the term object using
   * Austin Appleby's MurmurHash 3 algorithm (MurmurHash3_x86_32).
   * This is the default hash algorithm used from Spark 2.0 onwards.
   * Use hashUnsafeBytes2 to match the original algorithm with the value.
   * See SPARK-23381.
   * @param term (undocumented)
   * @return (undocumented)
   */
    int murmur3Hash (Object term)  { throw new RuntimeException(); }
}
