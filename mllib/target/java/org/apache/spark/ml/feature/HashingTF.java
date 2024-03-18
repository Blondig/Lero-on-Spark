package org.apache.spark.ml.feature;
/**
 * Maps a sequence of terms to their term frequencies using the hashing trick.
 * Currently we use Austin Appleby's MurmurHash 3 algorithm (MurmurHash3_x86_32)
 * to calculate the hash code value for the term object.
 * Since a simple modulo is used to transform the hash function to a column index,
 * it is advisable to use a power of two as the numFeatures parameter;
 * otherwise the features will not be mapped evenly to the columns.
 */
public  class HashingTF extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasNumFeatures, org.apache.spark.ml.util.DefaultParamsWritable {
  static   int SPARK_2_MURMUR3_HASH ()  { throw new RuntimeException(); }
  static   int SPARK_3_MURMUR3_HASH ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.HashingTF> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.HashingTF load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam numFeatures ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int hashFuncVersion ()  { throw new RuntimeException(); }
  // not preceding
     HashingTF (java.lang.String uid, int hashFuncVersion)  { throw new RuntimeException(); }
  public   HashingTF ()  { throw new RuntimeException(); }
  public   HashingTF (java.lang.String uid)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.HashingTF setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.HashingTF setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Binary toggle to control term frequency counts.
   * If true, all non-zero counts are set to 1.  This is useful for discrete probabilistic
   * models that model binary events rather than integer counts.
   * (default = false)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam binary ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.HashingTF setNumFeatures (int value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  boolean getBinary ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.HashingTF setBinary (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Returns the index of the input term.
   * @param term (undocumented)
   * @return (undocumented)
   */
  public  int indexOf (Object term)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.HashingTF copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  void save (java.lang.String path)  { throw new RuntimeException(); }
}
