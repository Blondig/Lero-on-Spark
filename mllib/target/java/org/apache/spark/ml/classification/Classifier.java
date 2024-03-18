package org.apache.spark.ml.classification;
/**
 * Single-label binary or multiclass classification.
 * Classes are indexed {0, 1, ..., numClasses - 1}.
 * <p>
 * @param <FeaturesType>   Type of input features.  E.g., <code>Vector</code>
 * @param <E>   Concrete Estimator type
 * @param <M>   Concrete Model type
 */
public abstract class Classifier<FeaturesType extends java.lang.Object, E extends org.apache.spark.ml.classification.Classifier<FeaturesType, E, M>, M extends org.apache.spark.ml.classification.ClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.Predictor<FeaturesType, E, M> implements org.apache.spark.ml.classification.ClassifierParams {
  public   Classifier ()  { throw new RuntimeException(); }
  /**
   * Extract {@link labelCol} and {@link featuresCol} from the given dataset,
   * and put it in an RDD with strong types.
   * <p>
   * @param dataset  DataFrame with columns for labels ({@link org.apache.spark.sql.types.NumericType})
   *                 and features (<code>Vector</code>).
   * @param numClasses  Number of classes label can take.  Labels must be integers in the range
   *                    [0, numClasses).
   * @note Throws <code>SparkException</code> if any label is a non-integer or is negative
   * @return (undocumented)
   */
  protected  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> extractLabeledPoints (org.apache.spark.sql.Dataset<?> dataset, int numClasses)  { throw new RuntimeException(); }
  /**
   * Get the number of classes.  This looks in column metadata first, and if that is missing,
   * then this assumes classes are indexed 0,1,...,numClasses-1 and computes numClasses
   * by finding the maximum label value.
   * <p>
   * Label validation (ensuring all labels are integers >= 0) needs to be handled elsewhere,
   * such as in <code>extractLabeledPoints()</code>.
   * <p>
   * @param dataset  Dataset which contains a column {@link labelCol}
   * @param maxNumClasses  Maximum number of classes allowed when inferred from data.  If numClasses
   *                       is specified in the metadata, then maxNumClasses is ignored.
   * @return  number of classes
   * @throws IllegalArgumentException  if metadata does not specify numClasses, and the
   *                                   actual numClasses exceeds maxNumClasses
   */
  protected  int getNumClasses (org.apache.spark.sql.Dataset<?> dataset, int maxNumClasses)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.Classifier), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("E"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ClassificationModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public final  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  E setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Validates the label on the classifier is a valid integer in the range [0, numClasses).
   * <p>
   * @param label The label to validate.
   * @param numClasses Number of classes label can take.  Labels must be integers in the range
   *                  [0, numClasses).
   */
  protected  void validateLabel (double label, int numClasses)  { throw new RuntimeException(); }
  /**
   * Validates that number of classes is greater than zero.
   * <p>
   * @param numClasses Number of classes label can take.
   */
  protected  void validateNumClasses (int numClasses)  { throw new RuntimeException(); }
}
