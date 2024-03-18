package org.apache.spark.ml.clustering;
/**
 * A bisecting k-means algorithm based on the paper "A comparison of document clustering techniques"
 * by Steinbach, Karypis, and Kumar, with modification to fit Spark.
 * The algorithm starts from a single cluster that contains all points.
 * Iteratively it finds divisible clusters on the bottom level and bisects each of them using
 * k-means, until there are <code>k</code> leaf clusters in total or no leaf clusters are divisible.
 * The bisecting steps of clusters on the same level are grouped together to increase parallelism.
 * If bisecting all divisible clusters on the bottom level would result more than <code>k</code> leaf clusters,
 * larger clusters get higher priority.
 * <p>
 * @see <a href="http://glaros.dtc.umn.edu/gkhome/fetch/papers/docclusterKDDTMW00.pdf">
 * Steinbach, Karypis, and Kumar, A comparison of document clustering techniques,
 * KDD Workshop on Text Mining, 2000.</a>
 */
public  class BisectingKMeans extends org.apache.spark.ml.Estimator<org.apache.spark.ml.clustering.BisectingKMeansModel> implements org.apache.spark.ml.clustering.BisectingKMeansParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.clustering.BisectingKMeans load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam minDivisibleClusterSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> distanceMeasure ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   BisectingKMeans (java.lang.String uid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.BisectingKMeans copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public   BisectingKMeans ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.BisectingKMeans setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.BisectingKMeans setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.BisectingKMeans setK (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.BisectingKMeans setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.BisectingKMeans setSeed (long value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.BisectingKMeans setMinDivisibleClusterSize (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.BisectingKMeans setDistanceMeasure (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.BisectingKMeans setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.BisectingKMeansModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
