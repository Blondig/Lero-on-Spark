package org.apache.spark.ml.classification;
/**
 * Model produced by a {@link Classifier}.
 * Classes are indexed {0, 1, ..., numClasses - 1}.
 * <p>
 * @param <FeaturesType>   Type of input features.  E.g., <code>Vector</code>
 * @param <M>   Concrete Model type
 */
public abstract class ClassificationModel<FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.classification.ClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.PredictionModel<FeaturesType, M> implements org.apache.spark.ml.classification.ClassifierParams {
  public   ClassificationModel ()  { throw new RuntimeException(); }
  /**
   * If the rawPrediction and prediction columns are set, this method returns the current model,
   * otherwise it generates new columns for them and sets them as columns on a new copy of
   * the current model
   * @return (undocumented)
   */
    scala.Tuple3<org.apache.spark.ml.classification.ClassificationModel<FeaturesType, M>, java.lang.String, java.lang.String> findSummaryModel ()  { throw new RuntimeException(); }
  /** Number of classes (values which the label can take). */
  public abstract  int numClasses ()  ;
  /**
   * Predict label for the given features.
   * This method is used to implement <code>transform()</code> and output {@link predictionCol}.
   * <p>
   * This default implementation for classification predicts the index of the maximum value
   * from <code>predictRaw()</code>.
   * @param features (undocumented)
   * @return (undocumented)
   */
  public  double predict (FeaturesType features)  { throw new RuntimeException(); }
  /**
   * Raw prediction for each possible label.
   * The meaning of a "raw" prediction may vary between algorithms, but it intuitively gives
   * a measure of confidence in each possible label (where larger = more confident).
   * This internal method is used to implement <code>transform()</code> and output {@link rawPredictionCol}.
   * <p>
   * @return  vector where element i is the raw prediction for label i.
   *          This raw prediction may be any real number, where a larger value indicates greater
   *          confidence for that label.
   * @param features (undocumented)
   */
  public abstract  org.apache.spark.ml.linalg.Vector predictRaw (FeaturesType features)  ;
  /**
   * Given a vector of raw predictions, select the predicted label.
   * This may be overridden to support thresholds which favor particular labels.
   * @return  predicted label
   * @param rawPrediction (undocumented)
   */
  protected  double raw2prediction (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ClassificationModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public final  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  M setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Transforms dataset by reading from {@link featuresCol}, and appending new columns as specified by
   * parameters:
   *  - predicted labels as {@link predictionCol} of type <code>Double</code>
   *  - raw predictions (confidences) as {@link rawPredictionCol} of type <code>Vector</code>.
   * <p>
   * @param dataset input dataset
   * @return transformed dataset
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public final  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transformImpl (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
