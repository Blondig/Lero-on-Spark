package org.apache.spark.ml.feature;
/**
 * PCA trains a model to project vectors to a lower dimensional space of the top <code>PCA!.k</code>
 * principal components.
 */
public  class PCA extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.PCAModel> implements org.apache.spark.ml.feature.PCAParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.PCA load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   PCA (java.lang.String uid)  { throw new RuntimeException(); }
  public   PCA ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.PCA setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.PCA setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.PCA setK (int value)  { throw new RuntimeException(); }
  /**
   * Computes a {@link PCAModel} that contains the principal components of the input vectors.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.feature.PCAModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PCA copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
