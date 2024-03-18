package org.apache.spark.ml;
/**
 * Abstraction for prediction problems (regression and classification). It accepts all NumericType
 * labels and will automatically cast it to DoubleType in <code>fit()</code>. If this predictor supports
 * weights, it accepts all NumericType weights, which will be automatically casted to DoubleType
 * in <code>fit()</code>.
 * <p>
 * @param <FeaturesType>   Type of features.
 *                       E.g., <code>VectorUDT</code> for vector features.
 * @param <Learner>   Specialization of this class.  If you subclass this type, use this type
 *                  parameter to specify the concrete type.
 * @param <M>   Specialization of {@link PredictionModel}.  If you subclass this type, use this type
 *            parameter to specify the concrete type for the corresponding model.
 */
public abstract class Predictor<FeaturesType extends java.lang.Object, Learner extends org.apache.spark.ml.Predictor<FeaturesType, Learner, M>, M extends org.apache.spark.ml.PredictionModel<FeaturesType, M>> extends org.apache.spark.ml.Estimator<M> implements org.apache.spark.ml.PredictorParams {
  public   Predictor ()  { throw new RuntimeException(); }
  public abstract  Learner copy (org.apache.spark.ml.param.ParamMap extra)  ;
  /**
   * Extract {@link labelCol} and {@link featuresCol} from the given dataset,
   * and put it in an RDD with strong types.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> extractLabeledPoints (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  /**
   * Returns the SQL DataType corresponding to the FeaturesType type parameter.
   * <p>
   * This is used by <code>validateAndTransformSchema()</code>.
   * This workaround is needed since SQL has different APIs for Scala and Java.
   * <p>
   * The default value is VectorUDT, but it may be overridden if FeaturesType is not Vector.
   * @return (undocumented)
   */
    org.apache.spark.sql.types.DataType featuresDataType ()  { throw new RuntimeException(); }
  public  M fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.Predictor), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("Learner"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.PredictionModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  Learner setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  Learner setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  Learner setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Train a model using the given dataset and parameters.
   * Developers can implement this instead of <code>fit()</code> to avoid dealing with schema validation
   * and copying parameters into the model.
   * <p>
   * @param dataset  Training dataset
   * @return  Fitted model
   */
  protected abstract  M train (org.apache.spark.sql.Dataset<?> dataset)  ;
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
