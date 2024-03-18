package org.apache.spark.ml.clustering;
/**
 * K-means clustering with support for k-means|| initialization proposed by Bahmani et al.
 * <p>
 * @see <a href="https://doi.org/10.14778/2180912.2180915">Bahmani et al., Scalable k-means++.</a>
 */
public  class KMeans extends org.apache.spark.ml.Estimator<org.apache.spark.ml.clustering.KMeansModel> implements org.apache.spark.ml.clustering.KMeansParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.clustering.KMeans load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> initMode ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam initSteps ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> distanceMeasure ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   KMeans (java.lang.String uid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeans copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public   KMeans ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeans setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeans setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeans setK (int value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.KMeans setInitMode (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.KMeans setDistanceMeasure (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.KMeans setInitSteps (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeans setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeans setTol (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeans setSeed (long value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.KMeans setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeansModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
