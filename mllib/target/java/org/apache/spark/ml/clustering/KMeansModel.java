package org.apache.spark.ml.clustering;
/**
 * Model fitted by KMeans.
 * <p>
 * param:  parentModel a model trained by spark.mllib.clustering.KMeans.
 */
public  class KMeansModel extends org.apache.spark.ml.Model<org.apache.spark.ml.clustering.KMeansModel> implements org.apache.spark.ml.clustering.KMeansParams, org.apache.spark.ml.util.GeneralMLWritable, org.apache.spark.ml.util.HasTrainingSummary<org.apache.spark.ml.clustering.KMeansSummary> {
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.KMeansModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.KMeansModel load (java.lang.String path)  { throw new RuntimeException(); }
   final  scala.Option<org.apache.spark.ml.clustering.KMeansSummary> trainingSummary ()  { throw new RuntimeException(); }
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
    org.apache.spark.mllib.clustering.KMeansModel parentModel ()  { throw new RuntimeException(); }
  // not preceding
     KMeansModel (java.lang.String uid, org.apache.spark.mllib.clustering.KMeansModel parentModel)  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeansModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeansModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeansModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  int predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
  /**
   * Returns a {@link org.apache.spark.ml.util.GeneralMLWriter} instance for this ML instance.
   * <p>
   * For {@link KMeansModel}, this does NOT currently save the training {@link summary}.
   * An option to save {@link summary} may be added in the future.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.GeneralMLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is
   * thrown if <code>hasSummary</code> is false.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.KMeansSummary summary ()  { throw new RuntimeException(); }
}
