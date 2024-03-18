package org.apache.spark.ml.clustering;
/**
 * Model fitted by BisectingKMeans.
 * <p>
 * param:  parentModel a model trained by {@link org.apache.spark.mllib.clustering.BisectingKMeans}.
 */
public  class BisectingKMeansModel extends org.apache.spark.ml.Model<org.apache.spark.ml.clustering.BisectingKMeansModel> implements org.apache.spark.ml.clustering.BisectingKMeansParams, org.apache.spark.ml.util.MLWritable, org.apache.spark.ml.util.HasTrainingSummary<org.apache.spark.ml.clustering.BisectingKMeansSummary> {
  /** {@link MLWriter} instance for {@link BisectingKMeansModel} */
  static   class BisectingKMeansModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   BisectingKMeansModelWriter (org.apache.spark.ml.clustering.BisectingKMeansModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.BisectingKMeansModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.BisectingKMeansModel load (java.lang.String path)  { throw new RuntimeException(); }
   final  scala.Option<org.apache.spark.ml.clustering.BisectingKMeansSummary> trainingSummary ()  { throw new RuntimeException(); }
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
     BisectingKMeansModel (java.lang.String uid, org.apache.spark.mllib.clustering.BisectingKMeansModel parentModel)  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.BisectingKMeansModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.BisectingKMeansModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.BisectingKMeansModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  int predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
  /**
   * Computes the sum of squared distances between the input points and their corresponding cluster
   * centers.
   * <p>
   * @deprecated This method is deprecated and will be removed in future versions. Use
   *             ClusteringEvaluator instead. You can also get the cost on the training dataset in
   *             the summary.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is
   * thrown if <code>hasSummary</code> is false.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.BisectingKMeansSummary summary ()  { throw new RuntimeException(); }
}
